//-----------------------------------------------------------------------
// FILE    : Generator.scala
// SUBJECT : An object that coordinates the generation of the Harvester application.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc.harvester

import edu.uvm.scalaness.ModuleType

object Generator {

  @ModuleType("""{}
     <;>{ ;
          change_neighbor(
          new_value: PointerTo[
                     commandTAG { mote_id     : UInt8,
                                  command_name: UInt8,
                                  val         : UInt16,
                                  nonce       : UInt8 } ] ): Void }""")
  private def createStub = {
    @ModuleType("""{}
     <;>{ ;
          change_neighbor(
          new_value: PointerTo[
                     commandTAG { mote_id     : UInt8,
                                  command_name: UInt8,
                                  val         : UInt16,
                                  nonce       : UInt8 } ] ): Void }""")
    val rawStub = new Stub
    rawStub.instantiate
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
