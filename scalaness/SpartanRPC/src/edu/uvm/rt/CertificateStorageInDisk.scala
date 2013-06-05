//-----------------------------------------------------------------------
// FILE    : CertificateStorageInDisk.scala
// SUBJECT : Holds credentials on disk space.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.io._
import java.util._
import java.security.interfaces.ECPublicKey
import collection.mutable

class CertificateStorageInDisk(kStorage: KeyStorage, fileName: String) extends CertificateStorage {

  private val certificateSet = mutable.Set[Certificate]()
  readIntoMemory()
  
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
  
  def addCredential(incomingCredential: Credential) {
    val rawCredential = toRawCredential(incomingCredential)
    val signature = signCredential(rawCredential, kStorage)
    val newCertificate = Certificate(incomingCredential, rawCredential, signature)
    certificateSet.add(newCertificate)
    modelAccurate = false
    
    val file = new FileOutputStream(fileName)
    val buffer = new BufferedOutputStream(file)
    val output = new ObjectOutputStream(buffer)
    
    try {
      output.writeObject(newCertificate)
    }
    finally {
      output.close()
    }
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
  
  def foreach[U](f : Certificate => U) {
    certificateSet.foreach(f)
  }  
  
  /**
   *  Deserializes the Disk file and reads the certificate set into memory 
   */
  private def readIntoMemory() {
    val file = new FileInputStream(fileName)
    val buffer = new BufferedInputStream(file)
    val input = new ObjectInputStream(buffer)
    
    var currentObject : Object = null
    
    while ((currentObject = (input.readObject()))  != null) {
      val currCertificate = currentObject match {
        case co : Certificate => co
        case _ => throw new Exception("Expected Certificate")
      }
     certificateSet.add(currCertificate)      
    }
    input.close()
  }  
  
  /**
   * Computes the minimum model for the given certificate set
   */
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
  
  def printEntries() {
  
    val file = new FileInputStream(fileName)
    val buffer = new BufferedInputStream(file)
    val input = new ObjectInputStream(buffer)
    
    var currentObject : Object = null
    
    while ((currentObject = (input.readObject()))  != null) {
      val currCertificate = currentObject match {
        case co : Certificate => co
        case _ => throw new Exception("Expected Key Triple")
      }
      
      println(currCertificate)
      
    }
    input.close()
    
  }
  
  def removeCertificate(cred: Credential) {
    val inputFile = new File(fileName)
    val outputFile = new File("tempFile.txt")
  
    val iFile = new FileInputStream(inputFile)
    val iBuffer = new BufferedInputStream(iFile)
    val input = new ObjectInputStream(iBuffer)
    
    val oFile = new FileOutputStream(outputFile)
    val oBuffer = new BufferedOutputStream(oFile)
    val output = new ObjectOutputStream(oBuffer)
    
    var currentObject : Object = null
    
    while ((currentObject = (input.readObject()))  != null) {
      val currCertificate = currentObject match {
        case co : Certificate => co
        case _ => throw new Exception("Expected Key Triple")
      }
      
      currCertificate match {
        case Certificate(cred, _, _) => println("Certificate Removed")
        case _ => output.writeObject(currCertificate)
      }
      
    }
    
    output.close()
    input.close()
    
    modelAccurate = false
    
    if (!(outputFile.renameTo(inputFile)))
      println("Unable to rename file.")
    
  }
}