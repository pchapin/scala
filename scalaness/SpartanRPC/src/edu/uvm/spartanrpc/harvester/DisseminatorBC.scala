//-----------------------------------------------------------------------
// FILE    : DisseminatorBC.scala
// SUBJECT : Instances of this class represent disseminator modules.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc.harvester

import edu.uvm.scalaness.{ProgramComponentWrapper, MininessComponent, ModuleType, NamedProgramComponent, Parser}
import edu.uvm.mininess.Declarations
import java.io.File

// One can see the desirability of being able to define nominal types in these annotations!
@ModuleType("""{}
               <;>{ changed( ): Void,
                    change_neighbor(
                      new_value: PointerTo[
                                 commandTAG { mote_id     : UInt8,
                                              command_name: UInt8,
                                              val         : UInt16,
                                              nonce       : UInt8 } ] ): Void;

                    change(
                      new_value: PointerTo[
                                 commandTAG { mote_id     : UInt8,
                                              command_name: UInt8,
                                              val         : UInt16,
                                              nonce       : UInt8 } ] ): Void,
                    set(
                      new_value: PointerTo[
                                 commandTAG { mote_id     : UInt8,
                                              command_name: UInt8,
                                              val         : UInt16,
                                              nonce       : UInt8 } ] ): Void,
                    get( )     : PointerTo[
                                 commandTAG { mote_id     : UInt8,
                                              command_name: UInt8,
                                              val         : UInt16,
                                              nonce       : UInt8 } ] }""")
class DisseminatorBC extends MininessComponent {
  /////////
  // Code generated by the Scalaness compiler.
  /////////
  def instantiate = new DisseminatorBC

  // private val abstractSyntax = Parser.reparse("./SensorBox/DisseminatorBC.nc", List())
  val configuration =
    new ProgramComponentWrapper(new NamedProgramComponent(
      name            = "DisseminatorBC",
      enclosingObject = this,
      typeParameters  = Set(),
      valueParameters = Set(),
      imports         = Declarations.extractImports(abstractSyntax),
      exports         = Declarations.extractExports(abstractSyntax),
      abstractSyntax  = abstractSyntax), "generated" + File.separator + "Harvester")

  def getTypeMap  = Map()
  def getValueMap = Map()
  ////////
  // END of Scalaness generated code.
  ////////

  "Harvester/DisseminatorBC.nc"
}
