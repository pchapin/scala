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
    /////////
    // Code generated by the Scalaness compiler.
    /////////
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "LibraryC",    // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set(),         // TODO: Obtain from class MetaType parameters.
        valueParameters = Set(),         // TODO: Obtain from class value parameters.
        imports         = Set("booted", "fired"),
        exports         = Set("startPeriodic"),
        abstractSyntax  = null), "generated")
    
    def getTypeMap  = Map()
    def getValueMap = Map()
    ////////
    // END of Scalaness generated code.
    //////// 

    external("LibraryC.nc")
  }

  // A component for computing checksums.
  @ModuleType("""{}
                 < checksumType <: UInt32; size: UInt16 >
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
  class ChecksumC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsSize: UInt16 = null
    private var sclnsChecksumType: MetaType[UInt32] = null

    def instantiate(size: UInt16, checksumType: MetaType[UInt32]) = {
      val result = new ChecksumC
      result.sclnsSize = size
      result.sclnsChecksumType = checksumType
      result
    }

    private val abstractSyntax = Parser.reparse("ChecksumC.nc", List("checksumType"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "ChecksumC",           // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("checksumType"),   // TODO: Obtain from class MetaType parameters.
        valueParameters = Set("size"),           // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("checksumType" -> sclnsChecksumType)
    def getValueMap = Map("size" -> sclnsSize)
    ////////
    // END of Scalaness generated code.
    //////// 
           
    "ChecksumC.nc"
  }
 

  // A component for creating messages.
  @ModuleType("""{}
                 < checksumType <: UInt32; size: UInt16 >
                 { startPeriodic(period: UInt32): Void,
                   compute_checksum(data: Array[UInt8]): checksumType;
                   fired(): Void,
                   booted(): Void }""")
  class MessageFormatterC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsSize: UInt16 = null
    private var sclnsChecksumType: MetaType[UInt32] = null

    def instantiate(size: UInt16, checksumType: MetaType[UInt32]) = {
      val result = new MessageFormatterC
      result.sclnsSize = size
      result.sclnsChecksumType = checksumType
      result
    }

    private val abstractSyntax  =
      Parser.reparse("MessageFormatterC.nc", List("checksumType"))
    
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "MessageFormatterC",
        enclosingObject = this,
        typeParameters  = Set("checksumType"),
        valueParameters = Set("size"),
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("checksumType" -> sclnsChecksumType)
    def getValueMap = Map("size" -> sclnsSize)
    ////////
    // END of Scalaness generated code.
    ////////
         
    "MessageFormatterC.nc"
  }


  /**
   * The following method returns a fully instantiated nesT component for computing checksums.
   * The precise component created depends on runtime information.
   *
   * @param size The size of the data block the component will process.
   * @checksumType The type used for the final checksum.
   */
   
/* ********************************
  @ModuleType("""{ checksumType <: UInt32 }
                 <;>
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
  def getChecksummer(size: UInt16, checksumType: MetaType[UInt32]) = {
    // Arbitrary computation...
    (new ChecksumC).instantiate(size, checksumType)
  }
*********************************** */


  /* @ModuleType("""{ checksumType <: UInt32 }
                 <;>
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""") */
                 
  def getChecksummer(size: UInt16, checksumType: MetaType[UInt32]) = {
    @ModuleType("""{}
                 < checksumType <: UInt32; size: UInt16 >
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
    val CheckSumModule = new ChecksumC
    
    @ModuleType("""{ checksumType <: UInt32 }
                 <;>
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
    val ModuleInst = CheckSumModule.instantiate(size, checksumType)
    
    
    //(new ChecksumC).instantiate(size, checksumType)
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
          new MetaType[UInt8](MininessTypes.UInt8)
        
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
      
      @ModuleType("""{}
                 < checksumType <: UInt32; size: UInt16 >
                 { startPeriodic(period: UInt32): Void,
                   compute_checksum(data: Array[UInt8]): checksumType;
                   fired(): Void,
                   booted(): Void }""")
      val MessageFormatter = new MessageFormatterC

      @ModuleType("""{}
                 < checksumType <: UInt32; size: UInt16 >
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
      val CheckSummer = new ChecksumC
     
      @ModuleType("""{ checksumType <: UInt32 }
                     <;>
                     { compute_checksum(data: Array[UInt8]): checksumType,
                       startPeriodic(period: UInt32): Void;
                       booted(): Void,
                       fired(): Void }""")
      val formattingModule = MessageFormatter.instantiate(desiredSize, desiredChecksumType)
      
      @ModuleType("""{ checksumType <: UInt32 }
                 <;>
                 { ; compute_checksum(data: Array[UInt8]): checksumType }""")
      val checkingModule = CheckSummer.instantiate(desiredSize, desiredChecksumType)
      
      
      formattingModule.image()
      checkingModule.image()
      
      @ModuleType("""{ checksumType <: UInt32 }
                     <;>
                     { startPeriodic(period: UInt32): Void;
                       booted(): Void,
                       fired(): Void }""")
      val wiredModule = formattingModule +> checkingModule
      
      @ModuleType("""{ checksumType <: UInt32 }
                     <;>
                     { startPeriodic(period: UInt32): Void,
                       compute_checksum(data: Array[UInt8]): checksumType;
                       startPeriodic(period: UInt32): Void }""")
      val testLibraryWire = LibraryC +> formattingModule      
      
      // Needs annotation
      val testThreeWire = LibraryC +> formattingModule +> LibraryC      
      
      /*
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
        LibraryC +>
          formattingModule +>
            getChecksummer(desiredSize, desiredChecksumType) +>
              LibraryC 

      resultModule.image()
      */
    }
  }
    
}       
