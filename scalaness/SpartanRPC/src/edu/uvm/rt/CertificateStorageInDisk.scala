//-----------------------------------------------------------------------
// FILE    : CertificateStorageInDisk.scala
// SUBJECT : Holds credentials on disk space.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.security.interfaces.ECPublicKey
import collection.mutable

class CertificateStorageInDisk(keyStore: KeyStorage, fileName: String) { //extends CertificateStorage {

  private val certificateSet = mutable.Set[Certificate]()

  private class ModelTuple(
    val targetKey : ECPublicKey,
    val targetRole: String,
    val memberKey : ECPublicKey)

  private val modelSet = mutable.Set[ModelTuple]()
  private var modelAccurate = true

  private def addTuple(newTuple: ModelTuple) = {
    if (modelSet.contains(newTuple)) false
    else {
      modelSet.add(newTuple)
      true
    }
  }
}