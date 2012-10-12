//-----------------------------------------------------------------------
// FILE    : Stub.scala
// SUBJECT : Class that represents a SprocketRT stub.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import edu.uvm.mininess.Declarations
import edu.uvm.scalaness.runtime.{ProgramComponentWrapper, NamedProgramComponent, MininessComponent, Parser}
import java.io.File

class Skeleton extends MininessComponent {
  
  /////////
  // Code generated by the Scalaness compiler.
  /////////
  private val abstractSyntax = Parser.reparse("/SkeletonC.nc", List())
    
  val configuration =
    new ProgramComponentWrapper(new NamedProgramComponent(
      name            = "SkeletonC",
      enclosingObject = this,
      typeParameters  = Set(),
      valueParameters = Set(),
      imports         = Declarations.extractImports(abstractSyntax),
      exports         = Declarations.extractExports(abstractSyntax),
      abstractSyntax  = abstractSyntax), "generated" + File.separator + "BlinkServer")
  
  def getTypeMap  = Map()
  def getValueMap = Map()
  ////////
  // END of Scalaness generated code.
  ////////

  "SkeletonC.nc"
}
