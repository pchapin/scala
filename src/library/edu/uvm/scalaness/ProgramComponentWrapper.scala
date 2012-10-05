//-----------------------------------------------------------------------
// FILE    : ProgramComponentWrapper.scala
// SUBJECT : Class representing components of the generated Mininess program.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import language.postfixOps

/**
 * Defines a ProgramComponent that wraps a named program component with a trivial configuration. Named program components
 * by themselves are not useful for composition because they don't have any associated configuration information.
 *
 * @param component The NamedProgramComponent to wrap.
 */
class ProgramComponentWrapper(val component: NamedProgramComponent, val targetFolder: String) extends ProgramComponent(
  typeParameters  = component.typeParameters,
  valueParameters = component.valueParameters,
  imports         = component.imports map { (_, List(component)) } toMap,
  exports         = component.exports map { (_, component) } toMap,
  configuration   = new ProgramConfiguration(Set(component), List()),
  targetFolder    = targetFolder
)
