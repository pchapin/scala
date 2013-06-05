//-----------------------------------------------------------------------
// FILE    : Credential.scala
// SUBJECT : Case classes for the various RT_0 credential forms.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.ECPublicKey

abstract sealed class Credential {
  def getIssuer: ECPublicKey
}

case class CredentialMembership(
  definingKey: ECPublicKey,
  targetRole : String,
  memberKey  : ECPublicKey) extends Credential {

  def getIssuer = definingKey
}

case class CredentialInclusion(
  definingKey: ECPublicKey,
  targetRole : String,
  sourceKey  : ECPublicKey,
  sourceRole : String) extends Credential {

  def getIssuer = definingKey
}

case class CredentialLinked(
  definingKey : ECPublicKey,
  targetRole  : String,
  indirectKey : ECPublicKey,
  indirectRole: String,
  sourceRole  : String) extends Credential {

  def getIssuer = definingKey
}

case class CredentialIntersection(
  definingKey: ECPublicKey,
  targetRole : String,
  sourceKey1 : ECPublicKey,
  sourceRole1: String,
  sourceKey2 : ECPublicKey,
  sourceRole2: String) extends Credential {

  def getIssuer = definingKey
}
