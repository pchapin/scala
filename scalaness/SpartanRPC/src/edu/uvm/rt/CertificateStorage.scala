//-----------------------------------------------------------------------
// FILE    : CertificateStorage.scala
// SUBJECT : Interface to classes that hold RT_0 credentials along with their minimum model.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.{ECPublicKey, ECPrivateKey}


/**
 * Describes the interface to all RT_0 certificate storage objects. Objects that implement this trait can be used to
 * hold certificates along with the minimum model implied by those certificates. Currently this trait is very limited in
 * that it does not provide a way to iterate over certificates or remove certificates. These limitations may be lifted
 * in the future.
 */
trait CertificateStorage extends Traversable[Certificate] {

  /**
   * Add a credential to the certificate storage. It is unspecified if the minimum model is computed or updated
   * immediately or if that computation is deferred until authorize is called. In any case the effect of adding this
   * credential is "immediately" visible in any following calls to authorize.
   *
   * The credential is immediately signed by the current entity and stored in the generated certificate.
   *
   * @param incomingCredential The credential to add. If the credential is already present in this storage object there
   * is no effect.
   * @throws MissingPrivateKeyException if there is no current entity, if there is no linked key storage, or if the
   * current entity does not have a private key in the linked key storage.
   */
  def addCredential(incomingCredential: Credential)

  /**
   * Compute authorization. It is unspecified if the minimum model of the stored credentials is computed at this time
   * or if it was computed earlier as part of the addCredential method.
   *
   * @param governingKey The key that controls the resource being accessed.
   * @param governingRole The role associated with the resource being accessed.
   * @param queryKey The key that desires access to the resource.
   *
   * @return True if the query key is a member of the governing role; false otherwise.
   */
  def authorize(
    governingKey : ECPublicKey,
    governingRole: String,
    queryKey     : ECPublicKey): Boolean


  // Helper methods used by subclasses
  // ---------------------------------

  /**
   * Converts a credential in abstract form into raw binary data.
   * @param credential The credential to convert.
   * @return The binary formatted version of the credential.
   */
  protected def toRawCredential(credential: Credential) : Array[Byte] = {
  
    val rawBinary = credential match {
      case CredentialMembership(
             definingKey,
             targetRole,
             memberKey) => RTCertificateCreator.createMembershipCertificate(definingKey, targetRole, memberKey)
      
      case CredentialInclusion(
             definingKey,
             targetRole,
             sourceKey,
             sourceRole) => RTCertificateCreator.createInclusionCertificate(definingKey, targetRole, sourceKey, sourceRole)
      
      case CredentialLinked(
             definingKey,
             targetRole,
             indirectKey,
             indirectRole,
             sourceRole) => RTCertificateCreator.createLinkedCertificate(definingKey, targetRole, indirectKey, indirectRole, sourceRole)
      
      case CredentialIntersection(
             definingKey,
             targetRole,
             sourceKey1,
             sourceRole1,
             sourceKey2,
             sourceRole2) => RTCertificateCreator.createIntersectionCertificate(definingKey, targetRole, sourceKey1, sourceRole1, sourceKey2, sourceRole2)
             
      case _ => throw new Exception("Unable to match Credential Type in method toRawCredential.")
    }
  
    rawBinary
  }

  /**
   * Computes the ECDSA signature of a given credential in raw binary form.
   * @param rawCredential The binary formatted credential to sign.
   * @return The signature.
   */
  protected def signCredential(rawCredential: Array[Byte], kStorage: KeyStorage) : Array[Byte] = {
    val privateKey = edu.uvm.rtadmin.Database.lookupPrivateKey("name") // No idea what name should be calling this and where this method should be
    RTCertificateCreator.createSignature(rawCredential, privateKey)
  }
}


/**
 * The companion object holds exceptions used by the trait.
 */
object CertificateStorage {
  class MissingPrivateKeyException(message: String) extends Exception(message)
}
