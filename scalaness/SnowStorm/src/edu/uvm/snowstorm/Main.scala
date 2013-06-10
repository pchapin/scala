//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Demonstration program for the SpartanRPC Scalaness library.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm

import java.io._
import java.net._
import java.security.Security
import org.bouncycastle.jce.provider.BouncyCastleProvider
import edu.uvm.rt._

/**
 * This is a demonstration program to illustrate the SpartanRPC Scalaness library. It generates a remote blink
 * application. It performs all the necessary RT authorization computations in the first stage and burns session keys
 * into the node software.
 */
object Main {

  private def sendRequest(request: NetworkMessage, peerPort: Int) {
    val outgoingStream = new ByteArrayOutputStream()
    val serializer = new ObjectOutputStream(outgoingStream)
    serializer.writeObject(request)
    val outgoingData = outgoingStream.toByteArray
    val localHost = InetAddress.getLocalHost
    val packet = new DatagramPacket(outgoingData, outgoingData.length, localHost, peerPort)
    val socket = new DatagramSocket()
    socket.send(packet)
    socket.close()
  }

  private def manageKeys(keys: KeyStorage, peerPort: Int) {
    // Main loop
    var done = false
    while (!done) {
      println("")
      println("0) Return to main menu")
      println("1) Generate public/private key pair")
      println("2) Show keys")
      println("3) Add (entity, key) association")
      println("4) Remove (entity, key) association")
      println("5) Get keys from peer")
      println("6) Name key")
      print("=> ")
      val command = io.ReadStdin.readLine()

      try {
        command.toInt match {
          case 0 => done = true

          case 1 =>
            print("Name: ")
            val name = io.ReadStdin.readLine()
            keys.generateEntity(name)

          case 2 =>
            println("Key Database")
            var keyIndex = 1
            println("------------")
            for (key <- keys) {
              print(s"#$keyIndex: ")
              println(key)
              keyIndex = keyIndex + 1
            }

          case 4 =>
            print("Name: ")
            val name = io.ReadStdin.readLine()
            keys.removeKey(name)

          case 5 =>
            sendRequest(new KeyRequestMessage, peerPort)
            println("Key request message sent asynchronously")

          case 6 =>
            print("Key #: ")
            val number = io.ReadStdin.readLine().toInt
            print("Name: ")
            val name = io.ReadStdin.readLine()

            var oldKey: KeyAssociation = null
            var keyIndex = 1
            for (key <- keys) {
              if (keyIndex == number) {
                oldKey = key
              }
              keyIndex = keyIndex + 1
            }
            val KeyAssociation(_, oldPublicKey, oldPrivateKey) = oldKey
            keys.removeKey(oldPublicKey)
            keys.addKey(KeyAssociation(Some(name), oldPublicKey, oldPrivateKey))


          case _ =>
            println(s"Invalid or unimplemented command: '$command'")
        }
      }
      catch {
        case _: NumberFormatException =>
          println("Bad input")
      }
    }
  }


  private def managePolicy(keyStorage: KeyStorage, certificates: CertificateStorage, peerPort: Int) {
    // Main loop
    var done = false
    while (!done) {
      println("")
      println("0) Return to main menu")
      println("1) Show policy")
      println("2) Add credential")
      println("3) Remove credential")
      println("4) Get certificates from peer")
      print("=> ")
      val command = io.ReadStdin.readLine()

      try {
        command.toInt match {
          case 0 => done = true

          case 1 =>
            println("Policy Database")
            println("---------------")
            for (certificate <- certificates) {
              val Certificate(credential, _) = certificate
              println(credential)
            }

          case 2 =>
            print("Credential: ")
            val credentialString = io.ReadStdin.readLine()
            val parser = new RTCredentialParser
            val credential = parser.parseCredential(credentialString).toCredential(keyStorage)
            certificates.addCredential(credential)

          case 4 =>
            sendRequest(new CertificateRequestMessage, peerPort)
            println("Certificate request message sent asynchronously")

          case _ =>
            println(s"Invalid or unimplemented command: '$command'")
        }
      }
      catch {
        case _: NumberFormatException =>
          println("Bad input")
      }
    }
  }


  def main(args: Array[String]) {

    object Mode extends Enumeration {
      val Harvester = Value
      val SensorBox = Value
    }

    if (args.length != 3) {
      println("Usage: Main owning_entity authorizer_port peer_port")
      return
    }

    Security.addProvider(new BouncyCastleProvider)

    // Extract useful items from the command line.
    // TODO: More comprehensive handling of the command line might be nice.
    val owningEntity = args(0)
    val mode = args(0) match {
      case "H" => Mode.Harvester
      case "S" => Mode.SensorBox
      case _   => println(s"Unknown mode: ${args(0)}, defaulting to 'SensorBox'"); Mode.SensorBox
    }
    val authorizerPort = args(1).toInt
    val peerPort       = args(2).toInt

    // Create the storage objects.
    val keyStorage = new KeyStorageOnDisk(s"keys-$owningEntity.dat")
    val certificateStorage = new CertificateStorageOnDisk(keyStorage, s"certificates-$owningEntity.dat")

    // Create the supporting actors/threads.
    val messageServer = new MessageServer
    messageServer.start()

    val authorizer = new ServiceAuthorizer(
      messageServer, owningEntity, keyStorage, certificateStorage, authorizerPort, peerPort)
    authorizer.start()

    // Main loop.
    var done = false
    println("Welcome to SnowStorm!")
    while (!done) {
      println("")
      println("0) Quit")
      println("1) Manage keys")
      println("2) Manage policy")
      println("3) Request authorization")
      println("4) Generate")
      print("=> ")
      val command = io.ReadStdin.readLine()

      try {
        command.toInt match {
          case 0 => done = true

          case 1 =>
            manageKeys(keyStorage, peerPort)

          case 2 =>
            managePolicy(keyStorage, certificateStorage, peerPort)

          case 3 =>
            print("Role name: ")
            val roleName = io.ReadStdin.readLine()
            val Some(KeyAssociation(_, myPublicKey, _)) = keyStorage.lookupEntryByName(owningEntity)
            sendRequest(AuthorizationQueryMessage(myPublicKey, roleName), peerPort)
            println("Authorization query message sent asynchronously")

          case 4 =>
            messageServer ! s"Generating ${if (mode == Mode.Harvester) "Harvester" else "SensorBox" } application..."
            mode match {
              case Mode.Harvester => harvester.Generator.generate(authorizer)
              case Mode.SensorBox => sensorbox.Generator.generate(authorizer)
            }

          case _ =>
            println(s"Invalid or unimplemented command: '$command'")
        }
      }
      catch {
        case _: NumberFormatException =>
          println("Bad input")
      }
    }

    authorizer.close()
    messageServer ! 'Die
  }
  
}
