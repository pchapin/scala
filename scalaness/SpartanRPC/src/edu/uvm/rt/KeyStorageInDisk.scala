//-----------------------------------------------------------------------
// FILE    : KeyStorageInDisk.scala
// SUBJECT : Holds keys on disk space.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.io._
import java.util._
import java.math.BigInteger
import java.security.{KeyPair, KeyPairGenerator, KeyStore, SecureRandom}
import java.security.cert.{Certificate, CertificateFactory, X509Certificate}
import java.security.interfaces.{ECPrivateKey, ECPublicKey}
import java.util.Date
import org.bouncycastle.jce.{ECNamedCurveTable, X509Principal}
import org.bouncycastle.jce.spec.ECParameterSpec
import org.bouncycastle.x509.X509V3CertificateGenerator
import collection.mutable


class KeyStorageInDisk(fileName : String) {  // extends KeyStorage {

  def generateEntity(name: String) {
  
    try {

      val ecSpec: ECParameterSpec = ECNamedCurveTable.getParameterSpec("secp160k1")
      val generator = KeyPairGenerator.getInstance("ECDSA", "BC")
      generator.initialize(ecSpec, new SecureRandom())

      //Generate ECC key pair
      val pair: KeyPair = generator.generateKeyPair()

      //get and convert
      val publicKey: ECPublicKey = pair.getPublic.asInstanceOf[ECPublicKey]
      val privateKey: ECPrivateKey = pair.getPrivate.asInstanceOf[ECPrivateKey]

      val newAssociation : KeyAssociation = (Some(name), publicKey, Some(privateKey))
      val keyTriple = new KeyTriple(newAssociation)
      
      val file = new FileOutputStream(fileName)
      val buffer = new BufferedOutputStream(file)
      val output = new ObjectOutputStream(buffer)
      
      try {
        output.writeObject(keyTriple)
      }
      finally {
        output.close()
      }

    }
    catch {
      case e: FileNotFoundException => println("Unable to open file.")
    }
  }
  
  def addKey(key: ECPublicKey) {
    val newAssociation : KeyAssociation = (None, key, None)
    val keyTriple = new KeyTriple(newAssociation)
    
    val file = new FileOutputStream(fileName)
    val buffer = new BufferedOutputStream(file)
    val output = new ObjectOutputStream(buffer)
    
    try {
      output.writeObject(keyTriple)
    }
    finally {
      output.close()
    }
    
  }
  
  def addNamedKey(name: String, key: ECPublicKey) {
    val newAssociation : KeyAssociation = (Some(name), key, None)
    val keyTriple = new KeyTriple(newAssociation)
    
    val file = new FileOutputStream(fileName)
    val buffer = new BufferedOutputStream(file)
    val output = new ObjectOutputStream(buffer)
    
    try {
      output.writeObject(keyTriple)
    }
    finally {
      output.close()
    }
    
  }
  
  def lookupEntryByKey(thisKey : ECPublicKey) : KeyTriple =  {
    val file = new FileInputStream(fileName)
    val buffer = new BufferedInputStream(file)
    val input = new ObjectInputStream(buffer)
    
    var foundTriple : KeyTriple = null
    var currentObject : Object = null
    
    while ((currentObject = (input.readObject()))  != null) {
      val currTriple = currentObject match {
        case co : KeyTriple => co
        case _ => throw new Exception("Expected Key Triple")
      }
      val currAssoc = currTriple.getTriple();
      
      currAssoc match {
        case (_, thisKey, _) => foundTriple = currTriple
        case _ => 
      }
      
    }
    input.close()
    
    foundTriple
    
  }
  
  def lookupEntryByName(thisName : String) : KeyTriple =  {
    val file = new FileInputStream(fileName)
    val buffer = new BufferedInputStream(file)
    val input = new ObjectInputStream(buffer)
    
    var foundTriple : KeyTriple = null
    var currentObject : Object = null
    
    while ((currentObject = (input.readObject()))  != null) {
      val currTriple = currentObject match {
        case co : KeyTriple => co
        case _ => throw new Exception("Expected Key Triple")
      }
      val currAssoc = currTriple.getTriple()
      
      currAssoc match {
        case (thisName, _, _) => foundTriple = currTriple
        case _ => 
      }
      
    }
    input.close()
    
    foundTriple
    
  }
  
  def removeKey(name: String) {
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
      val currTriple = currentObject match {
        case co : KeyTriple => co
        case _ => throw new Exception("Expected Key Triple")
      }
      val currAssoc = currTriple.getTriple()
      
      currAssoc match {
        case (name, _, _) => println("Entry Removed")
        case _ => output.writeObject(currTriple)
      }
      
    }
    
    output.close()
    input.close()
    
    if (!(outputFile.renameTo(inputFile)))
      println("Unable to rename file.")
    
  }
  
  def removeKey(key: ECPublicKey) {
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
      val currTriple = currentObject match {
        case co : KeyTriple => co
        case _ => throw new Exception("Expected Key Triple")
      }
      val currAssoc = currTriple.getTriple()
      
      currAssoc match {
        case (_, key, _) => println("Entry Removed")
        case _ => output.writeObject(currTriple)
      }
      
    }
    
    output.close()
    input.close()
    
    if (!(outputFile.renameTo(inputFile)))
      println("Unable to rename file.")
    
  }
  
  


}