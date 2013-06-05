//-----------------------------------------------------------------------
// FILE    : CertificateStorage.scala
// SUBJECT : Interface to classes that hold RT_0 credentials along with their minimum model.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.{ECPublicKey, ECPrivateKey}
import scala.collection.mutable


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


  def foreach[U](f : Certificate => U) {
    certificateSet.foreach(f)
  }

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
  protected def signCredential(rawCredential: Array[Byte], privateKey: ECPrivateKey) : Array[Byte] = {
    RTCertificateCreator.createSignature(rawCredential, privateKey)
  }


  // Methods and supporting material for computing authorization
  // -----------------------------------------------------------

  protected val certificateSet = mutable.Set[Certificate]()

  private class ModelTuple(
    val targetKey : ECPublicKey,
    val targetRole: String,
    val memberKey : ECPublicKey)

  private   val modelSet = mutable.Set[ModelTuple]()
  protected var modelAccurate = true

  private def addTuple(newTuple: ModelTuple) = {
    if (modelSet.contains(newTuple)) false
    else {
      modelSet.add(newTuple)
      true
    }
  }


  private def computeMinimumModel() {

    def processMembership(cred: CredentialMembership) = {
      val CredentialMembership(definingKey, targetRole, memberKey) = cred
      val newTuple = new ModelTuple(definingKey, targetRole, memberKey)
      addTuple(newTuple)
    }

    def processInclusion(cred: CredentialInclusion) = {
      val CredentialInclusion(definingKey, targetRole, sourceKey, sourceRole) = cred
      var tupleAdded = false
      for (currentTuple <- modelSet) {
        if (currentTuple.targetKey  == sourceKey &&
          currentTuple.targetRole == sourceRole) {

          val newTuple = new ModelTuple(definingKey, targetRole, currentTuple.memberKey)
          tupleAdded = addTuple(newTuple) || tupleAdded
        }
      }
      tupleAdded
    }

    def processLinked(cred: CredentialLinked) = {
      val CredentialLinked(
      definingKey, targetRole, indirectKey, indirectRole, sourceRole) = cred
      var tupleAdded = false

      for (outerCurrentTuple <- modelSet) {
        if (outerCurrentTuple.targetKey  == indirectKey &&
          outerCurrentTuple.targetRole == indirectRole) {

          for (innerCurrentTuple <- modelSet) {
            if (innerCurrentTuple.targetKey  == outerCurrentTuple.memberKey &&
              innerCurrentTuple.targetRole == sourceRole) {

              val newTuple = new ModelTuple(definingKey, targetRole, innerCurrentTuple.memberKey)
              tupleAdded = addTuple(newTuple) || tupleAdded
            }
          }
        }
      }
      tupleAdded
    }

    def processIntersection(cred: CredentialIntersection) = {
      val CredentialIntersection(
      definingKey, targetRole, sourceKey1, sourceRole1, sourceKey2, sourceRole2) = cred
      var tupleAdded = false

      for (outerCurrentTuple <- modelSet) {
        if (outerCurrentTuple.targetKey  == sourceKey1 &&
          outerCurrentTuple.targetRole == sourceRole1) {

          for (innerCurrentTuple <- modelSet) {
            if (innerCurrentTuple.targetKey  == sourceKey2 &&
              innerCurrentTuple.targetRole == sourceRole2 &&
              innerCurrentTuple.memberKey  == outerCurrentTuple.memberKey) {

              val newTuple = new ModelTuple(definingKey, targetRole, outerCurrentTuple.memberKey)
              tupleAdded = addTuple(newTuple) || tupleAdded
            }
          }
        }
      }
      tupleAdded
    }

    var tupleAdded = true
    while (tupleAdded) {
      tupleAdded = false

      for (Certificate(currentCredential, _, _) <- certificateSet) {
        tupleAdded = (currentCredential match {
          case cred: CredentialMembership   => processMembership(cred)
          case cred: CredentialInclusion    => processInclusion(cred)
          case cred: CredentialLinked       => processLinked(cred)
          case cred: CredentialIntersection => processIntersection(cred)
        }) || tupleAdded
      }
    }
    modelAccurate = true
  }

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
                 queryKey     : ECPublicKey) = {

    // Dump and recalculate the minimum model if necessary.
    if (!modelAccurate) {
      modelSet.clear()
      computeMinimumModel()
    }

    // Search the model for the right tuple. Is this simple O(n) search fast enough?
    var result = false
    for (currentTuple <- modelSet) {
      if (currentTuple.targetKey  == governingKey  &&
        currentTuple.targetRole == governingRole &&
        currentTuple.memberKey  == queryKey) result = true
    }
    result
  }

}


/**
 * The companion object holds exceptions used by the trait.
 */
object CertificateStorage {
  class MissingPrivateKeyException(message: String) extends Exception(message)
}
