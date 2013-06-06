//-----------------------------------------------------------------------
// FILE    : CredentialStorageInMemory.scala
// SUBJECT : Holds credentials entirely in memory.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import collection.mutable

/**
 * Class that stores RT_0 certificates in memory. Unlike other possible implementations of the CertificateStorage trait,
 * this class makes no use of disk files or external database systems.
 */
class CertificateStorageInMemory(kStorage: KeyStorage) extends CertificateStorage {

  protected var certificateSet = mutable.Set[Certificate]()

  def addCredential(incomingCredential: Credential) {
    val rawCredential = toRawCredential(incomingCredential)
    val issuer = incomingCredential.getIssuer
    val Some(Tuple3(_, _, Some(privateKey))) = kStorage.lookupEntryByPublicKey(issuer)
    val signature = signCredential(rawCredential, privateKey)
    certificateSet.add(Certificate(incomingCredential, rawCredential, signature))
    modelAccurate = false
  }


}
