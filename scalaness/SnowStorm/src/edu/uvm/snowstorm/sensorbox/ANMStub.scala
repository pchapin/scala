//-----------------------------------------------------------------------
// FILE    : Stub.scala
// SUBJECT : Class that represents a SprocketRT stub.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// The strange name of this class is a hack to work around a build issue. This class must be compiled before its use
// or else the compiler doesn't "see" the nesT module type annotation. In that case the compiler produces error messages
// about nesT module type mismatches, etc. Ant apparently builds files in alphabetical order so by using a name here
// that starts with 'A' the issue is avoided.
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm.sensorbox

import edu.uvm.nest.Declarations
import edu.uvm.scalaness.LiftableTypes.UInt8
import edu.uvm.scalaness.{ProgramComponentWrapper, NamedProgramComponent, NesTComponent, ModuleType, Parser}
import java.io.File

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
class ANMStub extends NesTComponent {
 
  /////////
  // Code generated by the Scalaness compiler.
  /////////
  private var sclnsKey: Array[UInt8] = null

  def instantiate(key: Array[UInt8]) = {
    val result = new ANMStub
    result.sclnsKey = key
    result
  }

  // private val abstractSyntax = Parser.reparse("./StubC.nc", List())
    
  val configuration =
    new ProgramComponentWrapper(new NamedProgramComponent(
      name            = "StubC",
      enclosingObject = this,
      typeParameters  = Set(),
      valueParameters = Set("key"),
      imports         = Declarations.extractImports(abstractSyntax),
      exports         = Declarations.extractExports(abstractSyntax),
      abstractSyntax  = abstractSyntax), "generated" + File.separator + "SensorBox")
  
  def getTypeMap  = Map()
  def getValueMap = Map("key" -> sclnsKey)
  ////////
  // END of Scalaness generated code.
  ////////

  "SensorBox/StubC.nc"
}
