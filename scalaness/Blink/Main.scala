//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : The main object for the Scalaness Blink sample.
// AUTHOR  : (C) Copyright 2013 by Peter Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

object Main {

  import edu.uvm.nest._
  import edu.uvm.scalaness._
  import LiftableTypes._


  // The Scalaness representation of the nesC Library's imports.
  @ModuleType("""{}
                 <;>
                 { booted(): Void, fired(): Void; }""")
  object LibraryIC extends NesTComponent {
    /////////
    // Code generated by the Scalaness compiler.
    /////////
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "LibraryIC",   // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set(),         // TODO: Obtain from class MetaType parameters.
        valueParameters = Set(),         // TODO: Obtain from class value parameters.
        imports         = Set("booted", "fired"),
        exports         = Set(),
        abstractSyntax  = null), "generated")
    
    def getTypeMap  = Map()
    def getValueMap = Map()
    ////////
    // END of Scalaness generated code.
    //////// 

    external("LibraryIC.nc")
  }


  // The Scalaness representation of the nesC Library's exports.
  @ModuleType("""{}
                 <;>
                 { ; led0Toggle(): Void, startPeriodic(dt: Int32): Void }""")
  object LibraryEC extends NesTComponent {
    /////////
    // Code generated by the Scalaness compiler.
    /////////
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "LibraryEC",   // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set(),         // TODO: Obtain from class MetaType parameters.
        valueParameters = Set(),         // TODO: Obtain from class value parameters.
        imports         = Set(),
        exports         = Set("led0Toggle", "startPeriodic"),
        abstractSyntax  = null), "generated")
    
    def getTypeMap  = Map()
    def getValueMap = Map()
    ////////
    // END of Scalaness generated code.
    //////// 

    external("LibraryEC.nc")
  }


  /**
   * This nesT module provides commands that return the values of various program-wide
   * global constants.
   *
   * @param flashCountType The type used to represent flash counts.
   * @param blinkCount The number of times the LED should be flashed. Intended to have type
   * flashCountType.
   */
  @ModuleType("""{}
                 < flashCountType <: Int32; blinkCount: Int32>
                 { ; get_initial_count(): flashCountType }""")
  class InitialConstantsC extends NesTComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    //private var sc_flashCountType: MetaType[Int32] = null
    //private var sc_blinkCount    : Int32 = null

    def instantiate(flashCountType: MetaType[Int32], blinkCount: Int32) = {
      val result = new InitialConstantsC
      result.sc_flashCountType = flashCountType
      result.sc_blinkCount     = blinkCount
      result
    }

    //private val abstractSyntax = Parser.reparse("InitialConstantsC.i", List("flashCountType"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "InitialConstantsC",   // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("flashCountType"), // TODO: Obtain from class MetaType parameters.
        valueParameters = Set("blinkCount"),     // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map( ("flashCountType", sc_flashCountType) )
    def getValueMap = Map( ("blinkCount", sc_blinkCount) )
    ////////
    // END of Scalaness generated code.
    //////// 
           
    
    "InitialConstantsC.nt"
  }
 

  /**
   * This nesT module flashes an LED with the given period. It flashes the LED only for the
   * number of times indicated by the constants module to which it is wired.
   *  
   * @param flashCountType The type used to represent flash counts.
   * @param periodType The type used to represent period values.
   * @param period The period of the flashing (in some suitable units). Intended to have type
   * periodType.
   */
  @ModuleType("""{}
                 < flashCountType <: Int32, periodType <: Int32; period: Int16 >
                 { led0Toggle()            : Void,
                   startPeriodic(dt: Int32): Void,
                   get_initial_count()     : flashCountType;

                   booted(): Void,
                   fired() : Void }""")
  class BlinkC extends NesTComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    //private var sc_flashCountType: MetaType[Int32] = null
    //private var sc_periodType: MetaType[Int32] = null
    //private var sc_period: Int16 = null

    def instantiate(
      flashCountType: MetaType[Int32],
      periodType    : MetaType[Int32],
      period        : Int16) = {

      val result = new BlinkC
      result.sc_flashCountType = flashCountType
      result.sc_periodType     = periodType
      result.sc_period         = period
      result
    }

    //private val abstractSyntax  =
    //  Parser.reparse("BlinkC.i", List("flashCountType", "periodType"))
    
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "BlinkC",
        enclosingObject = this,
        typeParameters  = Set("flashCountType", "periodType"),
        valueParameters = Set("period"),
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map( ("flashCountType", sc_flashCountType),
                           ("periodType", sc_periodType) )
    def getValueMap = Map( ("period", sc_period) )
    ////////
    // END of Scalaness generated code.
    ////////
         
    "BlinkC.nt"
  }
 

  /**    
   * @param args The command line arguments
   */ 
  def main(args: Array[String]) {
    val desiredType: MetaType[Int32] = Integer.parseInt(args(0)) match {
      case 1 => 
        println("Selecting Int8")   
        new MetaType[Int32](NesTTypes.Int8)
        
      case 2 =>
        println("Selecting Int16") 
        new MetaType[Int32](NesTTypes.Int16)
    }
    
    val count = new Int8(10)

    @ModuleType("""{flashCountType <: Int32}
                   <;>
                   { ; get_initial_count(): flashCountType}""")
    val constantModule = (new InitialConstantsC).instantiate(desiredType, count)

    @ModuleType("""{flashCountType <: Int32, periodType <: Int32}
                   <;>
                   { led0Toggle()            : Void,
                     startPeriodic(dt: Int32): Void,
                     get_initial_count()     : flashCountType;

                     booted(): Void,
                     fired() : Void }""")
    val blinkModule =
      (new BlinkC).instantiate(
          desiredType,
          new MetaType[Int16](NesTTypes.Int8),
          new Int8(100))

    @ModuleType("""{flashCountType <: Int32, periodType <: Int32}
                   <;>
                   { ; }""")
    val resultModule = LibraryIC +> blinkModule +> constantModule +> LibraryEC
    resultModule.image()
  }
    
}       
