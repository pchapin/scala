//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : The main object for the Scalaness Checksum sample.
// AUTHOR  : (C) Copyright 2012 by Peter Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

object Main {

  import edu.uvm.mininess._
  import edu.uvm.scalaness._
  import LiftableTypes._

  // The Scalaness representation of the nesC Library.
  @ModuleType("""{}
                 <;>
                 { booted(): Void,
                   fired(): Void;
                   startPeriodic(period: UInt32): Void }""")
  object LibraryC extends MininessComponent {
    external("LibraryC.nc")
  }

  // A component for computing checksums.
  class ChecksumC extends MininessComponent {

    def instantiate(size: UInt16, checksumType: MetaType[UInt32])
    "ChecksumC.nc"
  }
 

  // A component for creating messages.
  class MessageFormatterC extends MininessComponent {

    def instantiate(size: UInt16, checksumType: MetaType[UInt32])
    "MessageFormatterC.nc"
  }


  /**
   * The following method returns a fully instantiated nesT component for computing checksums.
   * The precise component created depends on runtime information.
   *
   * @param size The size of the data block the component will process.
   * @checksumType The type used for the final checksum.
   */
  @ModuleType("""{ checksumType <: UInt32 }
                 <;>
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
  def getChecksummer(size: UInt16, checksumType: MetaType[UInt32]) = {
    // Arbitrary computation...
    (new ChecksumC).instantiate(size, checksumType)
  }

    
  /**
   * The main method obtains configuration information from the command line and composes the
   * final program accordingly.
   * 
   * @param args The command line arguments
   */ 
  def main(args: Array[String]) {

    def getChecksumType(args: Array[String]) = {
      args(0).toInt match {
        case  8 => 
          println("Selecting 8 bit checksums")   
          new MetaType[UInt32](MininessTypes.UInt8)
        
        case 16 =>
          println("Selecting 16 bit checksums") 
          new MetaType[UInt32](MininessTypes.UInt16)

        case 32 =>
          println("Selecting 32 bit checksums")
          new MetaType[UInt32](MininessTypes.UInt32)
      }
    }

    def getSize(args: Array[String]) = {
      val size = args(1).toInt
      println(s"Selecting $size byte message blocks")
      new UInt16(size)
    }

    if (args.length != 2) println("Usage: Main checksum_bit_length block_size")
    else {
      val desiredChecksumType = getChecksumType(args)
      val desiredSize = getSize(args)

      @ModuleType("""{ checksumType <: UInt32 }
                     <;>
                     { compute_checksum(data: Array[UInt8]): checksumType,
                       startPeriodic(period: UInt32): Void;
                       booted(): Void,
                       fired(): Void }""")
      val formattingModule =
        (new MessageFormatterC).instantiate(desiredSize, desiredChecksumType)

      @ModuleType("""{ checksumType <: UInt32 }
                     <;>
                     { ; }""")
      val resultModule =
        LibraryC +> formattingModule +> getChecksummer(desiredSize, desiredChecksumType)

      resultModule.image()
    }
  }
    
}       
