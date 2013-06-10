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
    val issuerKey = incomingCredential.getIssuer
    val Some(KeyAssociation(_, _, Some(privateKey))) = kStorage.lookupEntryByPublicKey(issuerKey)
    val signature = Certificate.createSignature(incomingCredential.toRawCredential, privateKey)
    certificateSet.add(Certificate(incomingCredential, signature))
    modelAccurate = false
  }


  def addCertificate(incomingCertificate: Certificate) {
    val issuerKey = incomingCertificate.credential.getIssuer
    if (Certificate.verifySignature(
          incomingCertificate.credential.toRawCredential, issuerKey, incomingCertificate.signature)) {

      certificateSet.add(incomingCertificate)
      modelAccurate = false
    }
  }

}
