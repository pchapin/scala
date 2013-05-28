//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Main program of the RT certificate administration tool.
// AUTHOR  : (C) Copyright 2011 by Simone Willett <sgwillet@uvm.edu>
//                and Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rtadmin

import java.io._
import java.security.{KeyStore, Security}
import java.security.interfaces.{ECPrivateKey, ECPublicKey}
import org.bouncycastle.jce.provider.BouncyCastleProvider


object Main {
  Security.addProvider(new BouncyCastleProvider)
  
  // Used for dealing with key compression.
  object CompressionType extends Enumeration {
    val On, Off = Value
  }  
  var compressionMode = CompressionType.Off

  // Maps commands to the methods that implement them.
  // If this map is changed, be sure to change helpCommand appropriately.
  //
  val commandMap = Map(
    "create"            -> createCommand _,
    "delete"            -> deleteCommand _,
    "remove"            -> deleteCommand _,
    "help"              -> helpCommand _,
    "keycompression"    -> keyCompressionCommand _,
    "printcertificates" -> printCertificatesCommand _,
    "printcredentials"  -> printCredentialsCommand _,
    "listcredentials"   -> printCredentialsCommand _,
    "showcredentials"   -> printCredentialsCommand _,
    "printkeys"         -> printKeysCommand _,
    "listkeys"          -> printKeysCommand _,
    "showkeys"          -> printKeysCommand _,
    "printprivatekey"   -> printPrivateKeyCommand _,
    "printpublickey"    -> printPublicKeyCommand _,
    "printrole"         -> printRoleCommand _,
    "showrole"          -> printRoleCommand _,
    "printroles"        -> printRolesCommand _,
    "listroles"         -> printRolesCommand _,
    "showroles"         -> printRolesCommand _,
    "quit"              -> quitCommand _,
    "role"              -> roleCommand _,
    "savecredential"    -> saveCredentialCommand _,
    "sign"              -> signCommand _,
    "verify"            -> verifyCommand _
  )

  // Main method
  // -----------

  def main(args: Array[String]) {
    var line = ""

    println("Use 'help' command for help")
    while (true) {
      print("RTAdmin => ")
      line = io.ReadStdin.readLine()
      val args = line.split("\\s+")
      if (commandMap.contains(args(0))) {
        commandMap(args(0))(args)
      }
      else {
        if (args(0).contains("."))
          saveCredentialCommand(args)
        else
          println("Invalid command. Type 'help' for usage information")
      }
    }
  }

  // Command methods (alphabetical order)
  // ------------------------------------

  def createCommand(args: Array[String]) {
    try{
      Database.createKeys(args(1))
    }
    catch {
      case e: ArrayIndexOutOfBoundsException => {
        println(e.toString)
        println("Need a entity for the key name. Example: create Alice ")
      }
      case e: FileNotFoundException => {
        println(e.toString)
        println("Please Initalize the file (there is not one created) ")
      }
      case e: Exception => println(e.toString)
    }
  }

  
  def deleteCommand(args: Array[String]) {
    try {
      Database.deleteKeys(args(1))
    }
    catch {
      case e: Exception => println("Need a entity for the key name. Example: delete Alice")
    }
  }

  
  def helpCommand(args: Array[String]) {
    val helpText = List(
      ("help", "Prints command summary"),
      ("quit", "Quits program"),
      ("create Alice", "Print Alice's public and private keys and save them to " + Database.keyFile),
      ("delete Bob | remove Bob", "Remove Bob's key from " + Database.keyFile),
      ("printkeys | listkeys | showkeys", "Print alias names and public keys associated with those names"),
      ("sign message Alice", "Sign message with Alice's private key"),
      ("verify message signature Alice", "Verify the signature of message with Alice's public key"),
      ("role r", "Create role r and add this role to " + Database.roleFile),
      ("printroles | showroles | listroles", "Print contents of " + Database.roleFile),
      ("printrole r | showrole r", "Look up identifier for role r"),
      ("printprivatekey Alice", "Print the private key of Alice"),
      ("printpublickey Alice", "Print the public key of Alice"),
      ("savecredential A.r<-E | A.r<-E", "Save human readable credential to " + Database.credentialReadableFile),
      ("printcredentials | showcredentials | listcredentials", "Print all credentials"),
      ("keycompression on|off", "Enables or disables public key compression (default off)"),
      ("printcertificates", "Print signed certificates based on saved credentials")
    )
    for ((commands, summary) <- helpText) {
      println(commands)
      println("    " + summary)
      println("")
    }
  }
  
  
  /**
   * Enables or disables the use of public key compression in the certificates.
   */
  def keyCompressionCommand(args: Array[String]) = {
    args(1) match {
      case "On"  | "on"  | "ON"  => compressionMode = CompressionType.On
      case "Off" | "off" | "OFF" => compressionMode = CompressionType.Off
      case _ => println("Unknown compression mode. Try 'on' or 'off'")
    }
  }

  
  /*
   * Displays all known credentials as certificates using C-style array initialization syntax. This method is just a
   * wrapper around printCertificates that directs all I/O to standard output.
   */
  def printCertificatesCommand(args: Array[String]) {
    val temporaryWriter = new OutputStreamWriter(System.out)
    printCertificates(temporaryWriter)
    temporaryWriter.flush()
  }

  
  // This method is also called directly by the main Sprocket tool.
  def printCertificates(output: Writer) {
    try {
      var certificateCounter = 0
      val useCompressedKeys = if (compressionMode == CompressionType.On) true else false

      try {
        // Output certificates in the form of initialized C (or nesC) arrays.
        for (credential <- io.Source.fromFile(Database.credentialReadableFile).getLines) {
          certificateCounter += 1
          output.write("// " + credential + "\n") // For user feedback and debugging.

          val RTparser = new CredentialParser
          val certificate = RTparser.parseCredential(credential) match {
            // A.r <- E
            case RTMembershipCredential((a, r), e) =>
              CertificateCreator.createMembershipCertificate(a, r, e, useCompressedKeys)

            // A.r <- B.s
            case RTInclusionCredential((a, r), (b, s)) =>
              CertificateCreator.createInclusionCertificate(a, r, b, s, useCompressedKeys)

            // A.r <- B.s.t
            case RTLinkedCredential((a, r), (b, s), t) =>
              CertificateCreator.createLinkedCertificate(a, r, b, s, t, useCompressedKeys)

            // A.r <- B.s ^ C.t
            case RTIntersectionCredential((a, r), (b, s), (c, t)) =>
              CertificateCreator.createIntersectionCertificate(a, r, b, s, c, t, useCompressedKeys)
          }

          output.write("const octet_t certificate_" + certificateCounter + "[] = ")
          BinaryHelpers.printAsCInitializerBEB(output, certificate)
        }
      }
      catch {
        // If the credential file doesn't exist, just ignore that.
        case e: java.io.FileNotFoundException => ()
      }

      // Display the table of certificate information at the end of the certificate list.
      output.write("const struct StoredCertificate certificates[] = {\n")
      for (i <- 1 to certificateCounter) {
        val certificateName = "certificate_" + i
        output.write("    { " + certificateName + ", sizeof( " + certificateName + " ) }")
        output.write(if (i != certificateCounter) ",\n" else "\n")
      }
      output.write("};\n")
    }
    catch {
      case e: Exception => println("Try again: " + e)
    }
  }
  

  
  def printCredentialsCommand(args: Array[String]) {
    try {
      val inFile = new File(Database.credentialReadableFile)
      val br = new BufferedReader(new FileReader(inFile))

      var strLine = br.readLine()
      while(strLine != null) {
        println(strLine)
        strLine = br.readLine()
      }
    }
    catch {
      case e: FileNotFoundException =>
        val inFile = new File(Database.credentialReadableFile)
        val fw = new FileWriter(inFile) //get new file
        fw.write("")
        fw.close()

      case e: Exception => println(e.toString)
    }
  }

  
  def printKeysCommand(args: Array[String]) {
    try {
      val password = "".toCharArray // No password yet, can add in later.
      val fis = new FileInputStream(new File(Database.keyFile))
      val store = KeyStore.getInstance("BKS","BC")
      store.load(fis, password)

      val alias = store.aliases
      while(alias.hasMoreElements) {
        val next = alias.nextElement // get alias
        print(next + " = ")          // print alias name
        printPublicKey(next)         // print public keys
      }
    }
    catch {
      case e: Exception => println(e.toString)
    }
  }

  
  def printPrivateKeyCommand(args: Array[String]) {
    try {
      printPrivateKey(args(1))
    }
    catch {
      case e: Exception => println("Error")
    }
  }

  
  def printPublicKeyCommand(args: Array[String]) {
    try {
      printPublicKey(args(1))
    }
    catch {
      case e: Exception => println("There is no entity " + args(1) + e.toString)
    }
  }

  
  def printRoleCommand(args: Array[String]) {
    try {
      printRoleID(args(1))
    }
    catch {
      case e: Exception => println("Error")
    }

  }

  
  def printRolesCommand(args: Array[String]) {
    try {
      val lines = scala.io.Source.fromFile(Database.roleFile).mkString
      for (a <- lines)
        print(a)
    }
    catch {
      case e: Exception => println("No file created")
    }
  }

  
  def quitCommand(args: Array[String]) {
    System.exit(0)
  }

  
  def roleCommand(args: Array[String]) {
    try {
      Database.createRole(args(1))
    }
    catch {
      case e: Exception => println("Need to add role")
    }
  }

  
  def saveCredentialCommand(args: Array[String]) {
    try {
      // Sometimes this method is called with 'savecredential' as the first element in args.
      val credentialElements =
        if (args(0).contains(".")) args else args slice (1, args.length)

      // Combine all arguments into a single string and throw away the spurious leading space.
      val completeCredential = ("" /: credentialElements)(_ + " " + _).trim

      // Attempt to parse the credential to check its form. If successful, save the credential.
      val RTparser = new CredentialParser
      RTparser.parseCredential(completeCredential)
      Database.saveCredential(completeCredential)
    }
    catch {
      case e: Exception => println("Bad format")
    }
  }

  
  def signCommand(args: Array[String]) {
    try {
      val message = args(1).asInstanceOf[Array[Byte]]
      val privateKey = args(2).asInstanceOf[ECPrivateKey]
      val signed = CertificateCreator.createSignature(message, privateKey)
      println(signed)
    }
    catch {
      case e: Exception => println("Need message and private key")
    }
  }

  
  def verifyCommand(args: Array[String]) {
    try {
      val message = args(1).asInstanceOf[Array[Byte]]
      val signature = args(2).asInstanceOf[Array[Byte]]
      val publicKey = args(3).asInstanceOf[ECPublicKey]
      CertificateCreator.verifySignature(message, signature, publicKey)
    }
    catch {
      case e: Exception => println("Need to supply the message, signature and public key")
    }
  }

  // Supporting methods
  // ------------------

  /*
   * The message format must be an Array of Bytes so you can write your message in string and this will convert it to
   * Array[Byte]
   */
  def createMessage(myString: String): Array[Byte] = {
    // The message to sign.
    val message:Array[Byte] = myString.getBytes
    println("My message =" + message + "\n")
    message
  }


  def printRoleID(myRole: String) {
    val roleID = Database.lookupRoleID(myRole)
    println(roleID)
  }

  
  /*
   * Print out the public key because it is longer than the private key
   */
  def printPublicKey(myKey: String) {
    val publicKey = Database.lookupPublicKey(myKey)
    print(publicKey.getW.getAffineX.toString(16) + " " + publicKey.getW.getAffineY.toString(16) + "\n")
  }

  
  /*
   * Print out the private key because it is longer than the private key
   */
  def printPrivateKey(myKey: String) {
    val privateKey = Database.lookupPrivateKey(myKey)
    println(privateKey.getS.toString(16))
  }

}
