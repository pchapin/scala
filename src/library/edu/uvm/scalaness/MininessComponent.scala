//-----------------------------------------------------------------------
// FILE    : MininessComponent.scala
// SUBJECT : Trait to mark classes that represent second stage components.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

/**
 * Marker trait so that Scala types that are intended to represent nesC components are indicated
 * as such. Note that this trait is used to mark both modules and configurations. A module is
 * represented as a "trivial" configuration consisting of a single component.
 */
trait MininessComponent {
  
  // The compiler has to analyze the object/class that extends this trait and fill in this val
  // as appropriate. It's only needed to support the validate() method in this trait which, in
  // turn, is only needed to allow validation of "uncomposed" Mininess modules (which should be
  // very rare in real programs).
  //
  val configuration: ProgramComponent

  /**
   * This method is used by the Scalaness programmer to compose two declared Mininess modules.
   * 
   * @param other The other component to compose with 'this' component.
   */
  def +>(other: MininessComponent) = this.configuration + other.configuration
  
  /**
   * This method is used by the Scalaness programmer to compose a declared Mininess module with
   * another program component (presumably the result of other compositions).
   * 
   * @param other The program component to compose with 'this' component.
   */
  def +>(other: ProgramComponent) = this.configuration + other

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
   * Validates the configuration by deferring to the validate method of the program component
   * supporting this trait.
   */
  def validate() {
    configuration.validate()
  }

  /**
   * Marker method for external library components. A class invokes this method at the end of
   * its constructor that class is intended to be the Scalaness representation of an "external
   * nesC library." This method can also serve as a runtime hook for any action needed to
   * support such libraries.
   * 
   * @param fileName The name of the file containing the external library component. How this
   * file is located is not specified here.
   */
  def external(fileName: String) = ()
}
