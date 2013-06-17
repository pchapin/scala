//-----------------------------------------------------------------------
// FILE    : Generator.scala
// SUBJECT : An object that coordinates the generation of the Harvester application.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm.harvester

import edu.uvm.scalaness.ModuleType
import edu.uvm.snowstorm.ServiceAuthorizer

object Generator {

  @ModuleType("""{}
     <;>
     { send     (buffer    : Array[UInt8]): Void,
       set_key  (aes_key   : Array[UInt8]): Int16,
       put_plain(plain_text: Array[UInt8]): Int16;

       change_neighbor(
         new_value: PointerTo[
                    commandTAG { mote_id     : UInt8,
                                 command_name: UInt8,
                                 val         : UInt16,
                                 nonce       : UInt8 } ] ): Void,
       set_key_done( ): Void,
       get_cipher(cipher_text: Array[UInt8]): Void }""")
  private def createStub(authorizer: ServiceAuthorizer) = {
    @ModuleType("""{}
       <; key: Array[UInt8]>
       { send     (buffer    : Array[UInt8]): Void,
         set_key  (aes_key   : Array[UInt8]): Int16,
         put_plain(plain_text: Array[UInt8]): Int16;

         change_neighbor(
           new_value: PointerTo[
                      commandTAG { mote_id     : UInt8,
                                   command_name: UInt8,
                                   val         : UInt16,
                                   nonce       : UInt8 } ] ): Void,
         set_key_done( ): Void,
         get_cipher(cipher_text: Array[UInt8]): Void }""")
    val rawStub = new ANMStub
    rawStub.instantiate(authorizer.sessionKey)
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
      ApplicationIC +> disseminator +> createStub(authorizer) +> ApplicationEC

    composedComponents.image()
  }

}
