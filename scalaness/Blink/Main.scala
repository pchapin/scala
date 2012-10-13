//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : The main object for the Scalaness Blink sample.
// AUTHOR  : (C) Copyright 2012 by Peter Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------

object Main {

  import edu.uvm.mininess._
  import edu.uvm.scalaness._
  import LiftableTypes._


  /**
   * This Mininess module provides commands that return the values of various program-wide
   * global constants.
   *
   * @param flashCountType The type used to represent flash counts.
   * @param blinkCount The number of times the LED should be flashed. Intended to have type
   * flashCountType.
   */
  class InitialConstantsC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsFlashCountType: MetaType[Int32] = null
    private var sclnsBlinkCount    : Int32 = null

    def instantiate(flashCountType: MetaType[Int32], blinkCount: Int32) = {
      val result = new InitialConstantsC
      result.sclnsFlashCountType = flashCountType
      result.sclnsBlinkCount     = blinkCount
      result
    }

    private val abstractSyntax = Parser.reparse("InitialConstantsC.nc", List("flashCountType"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "InitialConstantsC",   // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("flashCountType"), // TODO: Obtain from class MetaType parameters.
        valueParameters = Set("blinkCount"),     // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("flashCountType" -> sclnsFlashCountType)
    def getValueMap = Map("blinkCount" -> sclnsBlinkCount)
    ////////
    // END of Scalaness generated code.
    //////// 
           
    
    "InitialConstantsC.nc"
  }
 

  /**
   * This Mininess module flashes an LED with the given period. It flashes the LED only for the
   * number of times indicated by the constants module to which it is wired.
   *  
   * @param flashCountType The type used to represent flash counts.
   * @param periodType The type used to represent period values.
   * @param period The period of the flashing (in some suitable units). Intended to have type
   * periodType.
   */
  class BlinkC extends MininessComponent {

    /////////
    // Code generated by the Scalaness compiler.
    /////////
    private var sclnsFlashCountType: MetaType[Int32] = null
    private var sclnsPeriodType: MetaType[Int32] = null
    private var sclnsPeriod: Int16 = null

    def instantiate(
      flashCountType: MetaType[Int32],
      periodType    : MetaType[Int16],
      period        : Int16) = {

      val result = new BlinkC
      result.sclnsFlashCountType = flashCountType
      result.sclnsPeriodType     = periodType
      result.sclnsPeriod         = period
      result
    }

    private val abstractSyntax  =
      Parser.reparse("BlinkC.nc", List("flashCountType", "periodType"))
    
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "BlinkC",
        enclosingObject = this,
        typeParameters  = Set("flashCountType", "periodType"),
        valueParameters = Set("period"),
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("flashCountType" -> sclnsFlashCountType,
                          "periodType"     -> sclnsPeriodType)
    def getValueMap = Map("period" -> sclnsPeriod)
    ////////
    // END of Scalaness generated code.
    ////////
         
    "BlinkC.nc"
  }
 
    
  /**    
   * @param args The command line arguments
   */ 
  def main(args: Array[String]) {
    val desiredType: MetaType[Int32] = Integer.parseInt(args(0)) match {
      case 1 => 
        println("Selecting Int8")   
        new MetaType[Int32](MininessTypes.Int8)
        
      case 2 =>
        println("Selecting Int16") 
        new MetaType[Int32](MininessTypes.Int16)
    }
    
    val count = new Int8(10)

    @ModuleType("""{flashCountType <: Int32}<;>
                     { ; get_initial_count(): flashCountType}""")
    val constantModule = (new InitialConstantsC).instantiate(desiredType, count)

    @ModuleType("""{flashCountType <: Int32, periodType <: Int16}<;>
                     { startPeriodic(dt: Int32): Void, get_initial_count(): flashCountType;
                       fired(): Void }""")
    val blinkModule =
      (new BlinkC).instantiate(
          desiredType,
          new MetaType[Int16](MininessTypes.Int8),
          new Int8(100))

    @ModuleType("""{flashCountType <: Int32, periodType <: Int16}<;>
                     { startPeriodic(dt: Int32): Void;
                       fired(): Void }""")
    val resultModule = blinkModule +> constantModule
    resultModule.validate()
  }
    
}       