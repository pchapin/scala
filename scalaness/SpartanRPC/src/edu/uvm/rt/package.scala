//-----------------------------------------------------------------------
// FILE    : package.scala
// SUBJECT : Package object for edu.uvm.rt contains some helper types and methods.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm

import java.security.interfaces.{ECPublicKey, ECPrivateKey}

package object rt {

  /**
   * The shape of entries in key storage objects.
   */
  type KeyAssociation = (Option[String], ECPublicKey, Option[ECPrivateKey])

}
