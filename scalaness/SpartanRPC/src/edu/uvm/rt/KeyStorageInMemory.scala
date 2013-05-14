//-----------------------------------------------------------------------
// FILE    : KeyStorageInMemory.scala
// SUBJECT : Holds keys entirely in memory.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.ECPublicKey

class KeyStorageInMemory extends KeyStorage {

  def foreach[U](f: (KeyAssociation => U)) {

  }

  def linkTo(credentials: CertificateStorage) {

  }

  def generateEntity(name: String) {

  }

  def addKey(key: ECPublicKey) {

  }

  def removeKey(name: String) {

  }

  def removeKey(key: ECPublicKey) {

  }

}
