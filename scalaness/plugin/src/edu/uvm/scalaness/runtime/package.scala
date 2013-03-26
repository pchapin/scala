//-----------------------------------------------------------------------
// FILE    : package.scala
// SUBJECT : Scalaness runtime package object.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

package object runtime {

  // TODO: Document these types. See ProgramComponent for more information.
  type ImportsType = Map[String, List[NamedProgramComponent]]
  type ExportsType = Map[String, NamedProgramComponent]
  type WireType    = (String, NamedProgramComponent, NamedProgramComponent)

}
