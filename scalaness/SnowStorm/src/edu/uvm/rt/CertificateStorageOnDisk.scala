//-----------------------------------------------------------------------
// FILE    : CertificateStorageOnDisk.scala
// SUBJECT : Holds credentials on disk space.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.io._
import collection.mutable

class CertificateStorageOnDisk(kStorage: KeyStorage, fileName: String) extends CertificateStorage {

  protected var certificateSet = readIntoMemory()

  /**
   *  Reads the disk file and loads the certificate data into memory
   */
  private def readIntoMemory() = {
    var certificateSet = mutable.Set[Certificate]()
    try {
      val input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))
      val size = input.readInt()

      for (i <- 1 to size) {
        val currentObject = input.readObject()
        val currentCertificate = currentObject match {
          case co: Certificate => co
          case _ => throw new Exception(s"Unexpected content found in certificate file $fileName")
        }
        certificateSet += currentCertificate
      }
      input.close()
    }
    catch {
      case ex: FileNotFoundException => // Do nothing. A missing certificate file is not an error.
    }
    certificateSet
  }


  private def writeOntoDisk() {
    // TODO: Deal with exceptions more gracefully?
    val output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))
    output.writeInt(certificateSet.size)
    for (certificate <- certificateSet) {
      output.writeObject(certificate)
    }
    output.close()
  }


  def addCredential(incomingCredential: Credential) {
    val issuer = incomingCredential.getIssuer
    val Some(KeyAssociation(_, _, Some(privateKey))) = kStorage.lookupEntryByPublicKey(issuer)
    val signature = Certificate.createSignature(incomingCredential.toRawCredential, privateKey)
    val newCertificate = Certificate(incomingCredential, signature)
    certificateSet.add(newCertificate)
    modelAccurate = false
    writeOntoDisk()
  }

}