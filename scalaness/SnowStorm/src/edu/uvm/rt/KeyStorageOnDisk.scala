//-----------------------------------------------------------------------
// FILE    : KeyStorageOnDisk.scala
// SUBJECT : Holds keys on disk space.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.io._
import java.security.{KeyPair, KeyPairGenerator, SecureRandom}
import java.security.interfaces.{ECPrivateKey, ECPublicKey}
import collection.mutable
import org.bouncycastle.jce.ECNamedCurveTable
import org.bouncycastle.jce.spec.ECParameterSpec


class KeyStorageOnDisk(fileName: String) extends KeyStorage {

  private var keySet = readIntoMemory()

  def foreach[U](f: KeyAssociation => U) {
    keySet.foreach(f)
  }

  /**
   *  Reads the disk file and loads the key data into memory
   */
  private def readIntoMemory() = {
    var keySet = mutable.Set[KeyAssociation]()
    try {
      val input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))
      val size = input.readInt()

      for (i <- 1 to size) {
        val currentObject = input.readObject()
        val currentAssociation = currentObject match {
          case co: KeyAssociation => co
          case _ => throw new Exception(s"Unexpected content found in key file $fileName")
        }
        keySet += currentAssociation
      }
      input.close()
    }
    catch {
      case ex: FileNotFoundException => // Do nothing. A missing key file is not an error.
    }
    keySet
  }


  private def writeOntoDisk() {
    // TODO: Deal with exceptions more gracefully?
    val output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))
    output.writeInt(keySet.size)
    for (association <- keySet) {
      output.writeObject(association)
    }
    output.close()
  }


  def generateEntity(name: String) {
    val ecSpec: ECParameterSpec = ECNamedCurveTable.getParameterSpec("secp160k1")
    val generator = KeyPairGenerator.getInstance("ECDSA", "BC")
    generator.initialize(ecSpec, new SecureRandom())

    // Generate ECC key pair.
    val pair: KeyPair = generator.generateKeyPair()

    // Get and convert.
    val publicKey: ECPublicKey = pair.getPublic.asInstanceOf[ECPublicKey]
    val privateKey: ECPrivateKey = pair.getPrivate.asInstanceOf[ECPrivateKey]

    val newAssociation: KeyAssociation = KeyAssociation(Some(name), publicKey, Some(privateKey))
    keySet += newAssociation
    writeOntoDisk()
  }

  
  def addKey(key: ECPublicKey) {
    // TODO: Only add the key if it doesn't already exist.
    keySet += KeyAssociation(None, key, None)
    writeOntoDisk()
  }


  def addKey(association: KeyAssociation) {
    // TODO: Only add the key if it doesn't already exist.
    keySet += association
    writeOntoDisk()
  }


  def addNamedKey(name: String, key: ECPublicKey) {
    // TODO: Only add the key if it doesn't already exist.
    keySet += KeyAssociation(Some(name), key, None)
    writeOntoDisk()
  }
  
  def lookupEntryByPublicKey(thisKey : ECPublicKey) = {
    val matchingAssociations = keySet filter { association =>
      val KeyAssociation(_, key, _) = association
      key == thisKey
    }
    if (matchingAssociations.size < 1) None else Some(matchingAssociations.toSeq(0))
  }


  def lookupEntryByPrivateKey(thisKey : ECPrivateKey) = {
    val matchingAssociations = keySet filter { association =>
      val KeyAssociation(_, _, maybeKey) = association
      maybeKey match {
        case None => false
        case Some(key) => key == thisKey
      }
    }
    if (matchingAssociations.size < 1) None else Some(matchingAssociations.toSeq(0))
  }


  def lookupEntryByName(thisName : String) = {
    val matchingAssociations = keySet filter { association =>
      val KeyAssociation(maybeName, _, _) = association
      maybeName match {
        case None => false
        case Some(name) => name == thisName
      }
    }
    if (matchingAssociations.size < 1) None else Some(matchingAssociations.toSeq(0))
  }

  
  def removeKey(thisName: String) {
    keySet = keySet filter { association =>
      val KeyAssociation(maybeName, _, _) = association
      maybeName match {
        case None => true
        case Some(name) => name != thisName
      }
    }
    writeOntoDisk()
  }


  def removeKey(thisKey: ECPublicKey) {
    keySet = keySet filter { association =>
      val KeyAssociation(_, key, _) = association
      key != thisKey
    }
    writeOntoDisk()
  }

}
