//-----------------------------------------------------------------------
// FILE    : ApplicationEC.scala
// SUBJECT : This object represents exports from the nesC part of the application.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm.sensorbox

import edu.uvm.scalaness.{ProgramComponentWrapper, MininessComponent, ModuleType, NamedProgramComponent, Parser}
import edu.uvm.mininess.Declarations
import java.io.File

// The Scalaness representation of the nesC Library's exports.
@ModuleType("""{}
               <;>
               { ; changed( ): Void,
                   send(buffer: Array[UInt8]): Void}""")
object ApplicationEC extends MininessComponent {
  /////////
  // Code generated by the Scalaness compiler.
  /////////
  val configuration =
    new ProgramComponentWrapper(new NamedProgramComponent(
      name            = "ApplicationEC",  // TODO: Extract from AST.
      enclosingObject = this,
      typeParameters  = Set(),            // TODO: Obtain from class MetaType parameters.
      valueParameters = Set(),            // TODO: Obtain from class value parameters.
      imports         = Set(),
      exports         = Set("changed", "send"),
      abstractSyntax  = null), "generated" + File.separator + "SensorBox")
    
  def getTypeMap  = Map()
  def getValueMap = Map()
  ////////
  // END of Scalaness generated code.
  //////// 

  external("SensorBox/ApplicationEC.nc")
}
