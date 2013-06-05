//-----------------------------------------------------------------------
// FILE    : CertificateStorageInDisk.scala
// SUBJECT : Holds credentials on disk space.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.io._
import java.security.interfaces.ECPublicKey
import collection.mutable

class CertificateStorageInDisk(kStorage: KeyStorage, fileName: String) extends CertificateStorage {

  readIntoMemory()

  def addCredential(incomingCredential: Credential) {
    val rawCredential = toRawCredential(incomingCredential)
    val issuer = incomingCredential.getIssuer
    val (_, _, Some(privateKey)) = kStorage.lookupEntryByPublicKey(issuer)
    val signature = signCredential(rawCredential, privateKey)
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

  /**
   *  Deserializes the Disk file and reads the certificate set into memory 
   */
  private def readIntoMemory() {
    try {
      val file = new FileInputStream(fileName)
      val buffer = new BufferedInputStream(file)
      val input = new ObjectInputStream(buffer)
    
      var currentObject: Object = null
    
      while ( {currentObject = input.readObject(); currentObject != null} ) {
        val currCertificate = currentObject match {
          case co : Certificate => co
          case _ => throw new Exception("Expected Certificate")
        }
       certificateSet.add(currCertificate)
      }
      input.close()
    }
    catch {
      case ex: FileNotFoundException => // Do nothing. A missing certificate file is not an error.
    }
  }  
  

  def printEntries() {
    val file = new FileInputStream(fileName)
    val buffer = new BufferedInputStream(file)
    val input = new ObjectInputStream(buffer)
    
    var currentObject : Object = null
    
    while ( {currentObject = input.readObject(); currentObject != null} ) {
      val currCertificate = currentObject match {
        case co : Certificate => co
        case _ => throw new Exception(s"Unexpected content found in $fileName")
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
    
    while ( {currentObject = input.readObject(); currentObject != null} ) {
      val currCertificate = currentObject match {
        case co : Certificate => co
        case _ => throw new Exception(s"Unexpected content found in $fileName")
      }
      
      currCertificate match {
        case Certificate(`cred`, _, _) => println("Certificate Removed")
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