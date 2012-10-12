//-----------------------------------------------------------------------
// FILE    : CredentialStorageInMemory.scala
// SUBJECT : Holds credentials entirely in memory.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.ECPublicKey
import collection.mutable.Set

/**
 * Class that stores RT_0 credentials in memory. Unlike other possible implementations of the CredentialStorage trait,
 * this class makes no use of disk files or external database systems.
 */
class CredentialStorageInMemory extends CredentialStorage {
  private val credentialSet = Set[Credential]()

  private class ModelTuple(
    val targetKey : ECPublicKey,
    val targetRole: String,
    val memberKey : ECPublicKey)

  private val modelSet = Set[ModelTuple]()
  private var modelAccurate = true

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

      for (currentCredential <- credentialSet) {
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


  def addCredential(incomingCredential: Credential) {
    credentialSet.add(incomingCredential)
    modelAccurate = false
  }


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
