//-----------------------------------------------------------------------
// FILE    : Generator.scala
// SUBJECT : An object that coordinates the generation of the Harvester application.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm.harvester

import edu.uvm.scalaness.ModuleType
import edu.uvm.scalaness.LiftableTypes.UInt8

object Generator {

  @ModuleType("""{}
     <;>
     { send(buffer: Array[UInt8]): Void;
       change_neighbor(
         new_value: PointerTo[
                    commandTAG { mote_id     : UInt8,
                                 command_name: UInt8,
                                 val         : UInt16,
                                 nonce       : UInt8 } ] ): Void }""")
  private def createStub = {
    @ModuleType("""{}
     <; key: Array[UInt8] >
     { send(buffer: Array[UInt8]): Void;
       change_neighbor(
         new_value: PointerTo[
                    commandTAG { mote_id     : UInt8,
                                 command_name: UInt8,
                                 val         : UInt16,
                                 nonce       : UInt8 } ] ): Void }""")
    val rawStub = new ANMStub
    val key = Array(UInt8(0), UInt8(1), UInt8(2))
    rawStub.instantiate(key)
  }


  def generate() {
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
    val rawDisseminator = new DisseminatorBC

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
    val disseminator = rawDisseminator.instantiate

    @ModuleType("""{}<;>{ ; }""")
    val composedComponents =
      ApplicationIC +> disseminator +> createStub +> ApplicationEC

    composedComponents.image()
  }

}
