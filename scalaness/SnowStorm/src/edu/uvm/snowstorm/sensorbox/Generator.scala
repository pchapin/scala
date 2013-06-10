//-----------------------------------------------------------------------
// FILE    : Generator.scala
// SUBJECT : An object that coordinates the generation of the SensorBox application.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm.sensorbox

import edu.uvm.scalaness.ModuleType
import edu.uvm.snowstorm.ServiceAuthorizer

object Generator {

  @ModuleType("""{}
     <;>{ send(buffer: Array[UInt8]): Void;
          change_neighbor(
            new_value: PointerTo[
                       commandTAG { mote_id     : UInt8,
                                    command_name: UInt8,
                                    val         : UInt16,
                                    nonce       : UInt8 } ] ): Void }""")
  private def createStub(authorizer: ServiceAuthorizer) = {
    @ModuleType("""{}
     <;>{ send(buffer: Array[UInt8]): Void;
          change_neighbor(
            new_value: PointerTo[
                       commandTAG { mote_id     : UInt8,
                                    command_name: UInt8,
                                    val         : UInt16,
                                    nonce       : UInt8 } ] ): Void }""")
    val rawStub = new ANMStub
    rawStub.instantiate
  }


  @ModuleType("""{}
     <;>{ change(
            new_value: PointerTo[
                       commandTAG { mote_id     : UInt8,
                                    command_name: UInt8,
                                    val         : UInt16,
                                    nonce       : UInt8 } ] ): Void;
          receive(buffer: Array[UInt8]): Void }""")
  private def createSkeleton(authorizer: ServiceAuthorizer) = {
    @ModuleType("""{}
     <;>{ change(
            new_value: PointerTo[
                       commandTAG { mote_id     : UInt8,
                                    command_name: UInt8,
                                    val         : UInt16,
                                    nonce       : UInt8 } ] ): Void;
          receive(buffer: Array[UInt8]): Void }""")
    val rawSkeleton = new ANMSkeleton
    rawSkeleton.instantiate
  }


  def generate(authorizer: ServiceAuthorizer) {
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
      ApplicationIC +> createSkeleton(authorizer) +> disseminator +> createStub(authorizer) +> ApplicationEC

    composedComponents.image()
  }

}
