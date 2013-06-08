//-----------------------------------------------------------------------
// FILE    : KeyAssociation.scala
// SUBJECT : A case class that wraps information we need to store about a entity-name/key pair.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.{ECPublicKey, ECPrivateKey}

/**
 * The shape of entries in key storage objects.
 */
case class KeyAssociation(name: Option[String], publicKey: ECPublicKey, privateKey: Option[ECPrivateKey])
