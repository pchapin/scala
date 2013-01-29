//-----------------------------------------------------------------------
// FILE    : BlinkClient.scala
// SUBJECT : Main module of the client side.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
// Much of the code in this object is automatically generated by the Scalaness compiler. When that starts actually
// happening the amount of code here will shrink dramatically and the definition of this object can probably be made
// local to the scope where it is used.
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import edu.uvm.scalaness.{ProgramComponentWrapper, MininessComponent, ModuleType, NamedProgramComponent, Parser}
import edu.uvm.mininess.Declarations
import java.io.File

@ModuleType("""{}
               <;>{ ; }""")
object BlinkClient extends MininessComponent {
  /////////
  // Code generated by the Scalaness compiler.
  /////////
  private val abstractSyntax = Parser.reparse("./BlinkClientC.nc", List())

  val configuration =
    new ProgramComponentWrapper(new NamedProgramComponent(
      name            = "BlinkClientC",
      enclosingObject = this,
      typeParameters  = Set(),
      valueParameters = Set(),
      imports         = Declarations.extractImports(abstractSyntax),
      exports         = Declarations.extractExports(abstractSyntax),
      abstractSyntax  = abstractSyntax), "generated" + File.separator + "BlinkClient")

  def getTypeMap  = Map()
  def getValueMap = Map()
  ////////
  // END of Scalaness generated code.
  ////////

  "BlinkClientC.nc"
}
