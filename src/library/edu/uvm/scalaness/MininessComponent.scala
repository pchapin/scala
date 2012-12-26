//-----------------------------------------------------------------------
// FILE    : MininessComponent.scala
// SUBJECT : Trait to mark classes that represent second stage components.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.{BufferedInputStream, BufferedOutputStream, FileInputStream, FileOutputStream}

/**
 * Marker trait so that Scala types that are intended to represent nesC components are indicated
 * as such. Note that this trait is used to mark both modules and configurations. A module is
 * represented as a "trivial" configuration consisting of a single component.
 */
trait MininessComponent {
  
  // The compiler has to analyze the object/class that extends this trait and fill in this val
  // as appropriate. It's only needed to support the image() method in this trait which, in
  // turn, is only needed to allow imaging of "uncomposed" Mininess modules (which should be
  // very rare in real programs).
  //
  val configuration: ProgramComponent

  /**
   * This method is used by the Scalaness programmer to compose two declared Mininess modules.
   * 
   * @param other The other component to compose with 'this' component.
   */
  def +>(other: MininessComponent) = this.configuration wireTo other.configuration
  
  /**
   * This method is used by the Scalaness programmer to compose a declared Mininess module with
   * another program component (presumably the result of other compositions).
   * 
   * @param other The program component to compose with 'this' component.
   */
  def +>(other: ProgramComponent) = this.configuration wireTo other

  /**
   * Returns a map of type parameter names to their current values. This is used during the
   * specialization process.
   */
  def getTypeMap: Map[String, MetaType[LiftableTypes.Liftable]]
  
  /**
   * Returns a map of value parameter names to their current values. This is used during the
   * specialization process.
   */
  def getValueMap: Map[String, Any]

  /**
   * Images the configuration by deferring to the validate method of the program component
   * supporting this trait.
   */
  def image() {
    configuration.makeImage()
  }

  /**
   * Marker method for external library components. A class invokes this method at the end of
   * its constructor that class is intended to be the Scalaness representation of an "external
   * nesC library." This method can also serve as a runtime hook for any action needed to
   * support such libraries. In particular it copies the named shim component into the generated
   * folder.
   * 
   * @param fileName The name of the file containing the external library component. How this
   * file is located is not specified here.
   */
  def external(fileName: String) = {
    // TODO: Improve behavior during exceptions.
    // TODO: The name of the output folder should be configurable.
    // TODO: Is there a file copy method by chance? That would be better.
    val input  = new BufferedInputStream(new FileInputStream(fileName))
    val output = new BufferedOutputStream(new FileOutputStream("generated/" + fileName))
    var ch = 0
    while ({ ch = input.read(); ch != -1 }) output.write(ch)
    output.close()
    input.close()
  }
}


object MininessComponent {
  implicit def toProgramComponent(mc: MininessComponent) = mc.configuration
}
