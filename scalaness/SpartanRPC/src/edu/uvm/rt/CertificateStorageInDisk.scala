//-----------------------------------------------------------------------
// FILE    : CertificateStorageInDisk.scala
// SUBJECT : Holds credentials on disk space.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu> & Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.io._
import collection.mutable

class CertificateStorageInDisk(kStorage: KeyStorage, fileName: String) extends CertificateStorage {

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
    val rawCredential = toRawCredential(incomingCredential)
    val issuer = incomingCredential.getIssuer
    val Some(Tuple3(_, _, Some(privateKey))) = kStorage.lookupEntryByPublicKey(issuer)
    val signature = signCredential(rawCredential, privateKey)
    val newCertificate = Certificate(incomingCredential, rawCredential, signature)
    certificateSet.add(newCertificate)
    modelAccurate = false
    writeOntoDisk()
  }

}