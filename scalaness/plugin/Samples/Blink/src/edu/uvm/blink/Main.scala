//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : The main object for the Scalaness Blink sample.
// AUTHOR  : (C) Copyright 2011 by Peter Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.blink

object Main {

  import edu.uvm.nest._
  import edu.uvm.scalaness.{LiftableTypes, MetaType}
  import edu.uvm.scalaness.runtime.{NamedProgramComponent, NesTComponent, Parser, ProgramComponentWrapper}
  import LiftableTypes._


  /**
   * This Mininess module provides commands that return the values of various program-wide global constants.
   *
   * @param flashCountType The type used to represent flash counts.
   * @param blinkCount The number of times the LED should be flashed. Intended to have type flashCountType.
   */
  class InitialConstantsC(flashCountType: MetaType[Int32], blinkCount: Int32) extends NesTComponent {
    /////////
    // Code generated by the Scalaness compiler.
    /////////
    // private val abstractSyntax = Parser.reparse("/InitialConstantsC.nc", List("flashCountType"))
      
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "InitialConstantsC",   // TODO: Extract from AST.
        enclosingObject = this,
        typeParameters  = Set("flashCountType"), // TODO: Obtain from class MetaType parameters.
        valueParameters = Set("blinkCount"),     // TODO: Obtain from class value parameters.
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("flashCountType" -> flashCountType)
    def getValueMap = Map("blinkCount" -> blinkCount)
    ////////
    // END of Scalaness generated code.
    //////// 

    "InitialConstantsC.nc"
  }
 

  /**
   * This Mininess module flashes an LED with the given period. It flashes the LED only for the number of times
   * indicated by the constants module to which it is wired.
   *  
   * @param flashCountType The type used to represent flash counts.
   * @param periodType The type used to represent period values.
   * @param period The period of the flashing (in some suitable units). Intended to have type periodType.
   */
  class BlinkC(flashCountType: MetaType[Int32], periodType: MetaType[Int16], period: Int16) extends NesTComponent {
    /////////
    // Code generated by the Scalaness compiler.
    /////////
    // private val abstractSyntax  = Parser.reparse("/BlinkC.nc", List("flashCountType", "periodType"))
    
    val configuration =
      new ProgramComponentWrapper(new NamedProgramComponent(
        name            = "BlinkC",
        enclosingObject = this,
        typeParameters  = Set("flashCountType", "periodType"),
        valueParameters = Set("period"),
        imports         = Declarations.extractImports(abstractSyntax),
        exports         = Declarations.extractExports(abstractSyntax),
        abstractSyntax  = abstractSyntax), "generated")
    
    def getTypeMap  = Map("flashCountType" -> flashCountType, "periodType" -> periodType)
    def getValueMap = Map("period" -> period)
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
        new MetaType[Int32](NesTTypes.Int8)
        
      case 2 =>
        println("Selecting Int16") 
        new MetaType[Int32](NesTTypes.Int16)
    }
    
    val count = new Int8(10)
    val constantModule = new InitialConstantsC(desiredType, count)
    val blinkModule = new BlinkC(desiredType, new MetaType[Int16](NesTTypes.Int8), new Int8(100))
    val resultModule = constantModule +> blinkModule
    resultModule.makeImage()
  }
    
}       