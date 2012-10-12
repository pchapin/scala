//-----------------------------------------------------------------------
// FILE    : Database.scala
// SUBJECT : Object that controls access to the RT credential database.
// AUTHOR  : (C) Copyright 2011 by Simone Willett <sgwillet@uvm.edu>
//                and Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rtadmin

import java.io._
import java.math.BigInteger
import java.security.{KeyPair, KeyPairGenerator, KeyStore, SecureRandom}
import java.security.cert.{Certificate, CertificateFactory, X509Certificate}
import java.security.interfaces.{ECPrivateKey, ECPublicKey}
import java.util.Date
import org.bouncycastle.jce.{ECNamedCurveTable, X509Principal}
import org.bouncycastle.jce.spec.ECParameterSpec
import org.bouncycastle.x509.X509V3CertificateGenerator

/**
 * Object to manage the RT credential database. Ideally all access to keys, roles, and credentials would be through this
 * object. This object can be used to abstract the storage mechanism used for such entities.
 */
object Database {
  // TODO: Make the file names private and clean up the clients accordingly.
  // TODO: Make this object a class (or better a trait + class).
  val keyFile  = "keys.dat"
  val roleFile = "roles.txt"
  val certFile = "certs.dat"
  val credentialReadableFile = "credReadable.txt"

  /**
   * Create keys for the given entity. The generated keys are stored in the database. This method generates both public
   * and private keys for the given entity.
   * 
   * @param who The name of the entity for which keys are to be generated.
   */
  def createKeys(who: String) {
    try {
      val password = "".toCharArray // No password yet, can add in later.
      // var myKeys = ("".asInstanceOf[ECPublicKey],"".asInstanceOf[ECPrivateKey])
      val fis = new FileInputStream(new File(keyFile))
      val store = KeyStore.getInstance("BKS","BC")
      store.load(fis, password)

      if (!store.containsAlias(who)) {
        val storeSize = store.size()
        val ecSpec: ECParameterSpec = ECNamedCurveTable.getParameterSpec("secp160k1")
        val generator = KeyPairGenerator.getInstance("ECDSA", "BC")
        generator.initialize(ecSpec, new SecureRandom())

        //Generate ECC key pair
        val pair: KeyPair = generator.generateKeyPair()

        //get and convert
        val publicKey: ECPublicKey = pair.getPublic.asInstanceOf[ECPublicKey]
        val privateKey: ECPrivateKey = pair.getPrivate.asInstanceOf[ECPrivateKey]

        // Save to KeyStore
        val startDate:  Date = new Date(System.currentTimeMillis() - 500000) // Time from which certificate is valid
        val expiryDate: Date = new Date(System.currentTimeMillis() + 500000) // Time from which certificate is not valid

        // CN=commonName, OU=organizationUnit, O=organizationName, L=localityName, S=stateName, C=country Signer's name.
        val issuer = "C=US, O=The University of Vermont, OU=Sprocket Primary Certificate, CN=" + who

        // Subject's name - the same as we are self signed.
        val subject = "C=US, O=The University of Vermont, OU=Sprocket Primary Certificate,CN=" + who

        val certGen = new X509V3CertificateGenerator()
        val serialNumber = new BigInteger((storeSize + 1).toString)

        // Below are mandatory fields to generate certificate.
        certGen.setSerialNumber(serialNumber)
        certGen.setIssuerDN(new X509Principal(issuer))
        certGen.setNotBefore(startDate)
        certGen.setNotAfter(expiryDate)
        certGen.setSubjectDN(new X509Principal(subject))
        certGen.setPublicKey(pair.getPublic)
        certGen.setSignatureAlgorithm("ECDSAwithSHA1")

        var cert = certGen.generate(privateKey)
        cert.checkValidity(new Date())
        cert.verify(publicKey)
        val bIn = new ByteArrayInputStream(cert.getEncoded)
        val fact = CertificateFactory.getInstance("X.509","BC")
        cert = fact.generateCertificate(bIn).asInstanceOf[X509Certificate]
        
        // Load certificate chain (its an array of all the certificates we have)
        val certStream = new FileOutputStream(new File(certFile))
        val inStream = new FileInputStream(new File(certFile))

        val c = fact.generateCertificates(inStream)
        val chain = new Array[Certificate](c.toArray.length+1)
        chain(chain.length-1) = cert
        certStream.write(cert.getEncoded)

        store.setKeyEntry(who, privateKey, password, chain)

        println(who + " (private key   ) = " + privateKey.getS.toString(16))
        println(who + " (public  key: X) = " + publicKey.getW.getAffineX.toString(16))
        println(who + " (public  key: Y) = " + publicKey.getW.getAffineY.toString(16))

        // Verify certificate
        // val cert = store.getCertificateChain(who)(0)
        // cert.verify(publicKey)
        fis.close()

        // Save the new key store contents
        val out = new FileOutputStream(keyFile)
        store.store(out, password)
        out.close()
      }
    }
    catch {
      case e: FileNotFoundException => println("Initalizing key store")
      initKeyStore()
      createKeys(who)
    }
  }

  
  /**
   * Create the role, if it does not yet exist, and add it to the database.
   * 
   * @param myRole The name of the role to create. If the role already exists in the database there is no effect.
   */
  def createRole(myRole: String) {
    if(!entityThere(myRole, roleFile)) {
      var counter = 1
      val inFile = new File(roleFile) // Create file just in case there isn't one already.
      if (inFile.exists) {
        val lines = scala.io.Source.fromFile(roleFile).mkString
        counter = lines.count(p => p.isDigit) + 1
      }
      val fw = new FileWriter(inFile, true) // Write to end of file.
      fw.write(myRole + " "+ (counter) + "\n")
      fw.close()
    }
  }

  
  /**
   * Delete the keys corresponding to the given entity.
   * 
   * @param who The name of the entity for which the keys are to be removed.
   * 
   * TODO: What happens to the credentials that mention this entity?
   */
  def deleteKeys(who: String) {
    val password = "".toCharArray // No password yet, can add in later.
    val fis = new FileInputStream(new File(keyFile))
    val store = KeyStore.getInstance("BKS","BC")
    store.load(fis, password)
    if (store.containsAlias(who)) {
      store.deleteEntry(who)
      // Save the new key store contents.
      val out = new FileOutputStream(keyFile)
      store.store(out,password)
      out.close()
    }
    else
      println("There is no entity " + who)

    fis.close()
  }

  
  /*
   * Check to see if there is an entity with that name already in the file
   *
   */
  private def entityThere(who: String, myFile: String): Boolean = {
    // make sure incoming name is not already there.
    try {
      val lines = scala.io.Source.fromFile(myFile).mkString
      val people = lines.split("\\s+")
      for (a <- people) {
        if (a == who) {
          return true
        }
      }
      false
    }
    catch {
      case e: Exception => false
    }
  }

  
  /**
   * Initializes the database.
   */
  def initKeyStore() {
    val store = KeyStore.getInstance("BKS","BC")
    store.load(null, null) // Null means new in memory store!

    // Open an output stream to the new key store's location
    val fos = new FileOutputStream(new File(keyFile))

    // Probably would prompt user for this value;
    val password = "".toCharArray
    // Write the key store to the file system.
    store.store(fos, password) // No password for now
    fos.close()
  }

  
  /**
   * Looks up the private key for the given entity.
   * 
   * @param myKey The name of the entity for which the private key is desired.
   *
   */
  def lookupPrivateKey(myKey: String): ECPrivateKey = {
    val password = "".toCharArray // No password yet, can add in later.
    val fis = new FileInputStream(new File(keyFile))
    val store = KeyStore.getInstance("BKS","BC")
    store.load(fis, password)
    val privateKey = store.getKey(myKey, password).asInstanceOf[ECPrivateKey]
    privateKey
  }

  
  /**
   * Looks up the public key for the given entity.
   * 
   * @param myKey The name of the entity for which the public key is desired.
   */
  def lookupPublicKey(myKey: String): ECPublicKey = {
    val password = "".toCharArray // No password yet, can add in later.
    val fis = new FileInputStream(new File(keyFile))
    val store = KeyStore.getInstance("BKS","BC")
    store.load(fis, password)
    val cert = store.getCertificate(myKey)
    val publicKey = cert.getPublicKey.asInstanceOf[ECPublicKey]
    publicKey
  }

  
  /**
   * Looks up the role ID associated with a particular role name.
   *  
   * @param myRole The name of the role for which the ID is desired.
   */
  def lookupRoleID(myRole: String): Int = {
    if (entityThere(myRole, roleFile)) {
      val inFile = new File(roleFile)
      val br = new BufferedReader(new FileReader(inFile))

      var strLine = br.readLine()
      while(strLine != null) {
        if (strLine.contains(myRole)) {
          val num = strLine.split("\\s+")
          br.close()
          return num(1).toInt
        }
        strLine = br.readLine()
      }
    }
    else {
      println("There is no role " + myRole)
    }
    0
  }

  
  /**
   * Saves the text form of a credential to the database. If the credential is already in the database it is not added a
   * second time.
   * 
   * @param theCredential The textual credential to save. This method does not check the validity of the credential.
   */
  def saveCredential(theCredential: String) {
    if (!entityThere(theCredential, Database.credentialReadableFile)) {
      val outFile = new File(Database.credentialReadableFile)
      val fw = new FileWriter(outFile, true) // Write to end of file.
      println("Saving credential: "+ theCredential)
      fw.write(theCredential + "\n")
      fw.close()
    }
  }

}
