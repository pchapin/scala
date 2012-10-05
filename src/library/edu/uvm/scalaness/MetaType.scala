//-----------------------------------------------------------------------
// FILE    : MetaType.scala
// SUBJECT : Instances of MetaType represent Mininess types.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import edu.uvm.mininess.MininessTypes

/**
 * Instances of this class represent Mininess types that are bounded by Tau. They are used to represent Mininess types
 * that are constructed (or "selected") during the execution of the first stage program. In that sense MetaType
 * instances are holders for a range of Mininess types that are bounded by Tau.
 *
 * Notice that the type argument is the Scala side representation of a Mininess type but the value argument is the
 * AST of a Mininess type.
 *
 * @param wrappedType The AST of a specific Mininess type wrapped by the MetaType instance.
 */
class MetaType[+Tau <: LiftableTypes.Liftable](val wrappedType: MininessTypes.Representation)
  extends LiftableTypes.Liftable {

  /**
   * Allows one to initialize one MetaType instance using another. In that case the wrapped Mininess type is copied to
   * the new instance.
   *
   * @param other The MetaType instance to copy into the new object.
   */
  def this(other: MetaType[Tau]) = this(other.wrappedType)
}
