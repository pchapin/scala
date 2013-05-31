//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Demonstration program for the SpartanRPC Scalaness library.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm

import java.io._
import java.net._
import edu.uvm.rt._

/**
 * This is a demonstration program to illustrate the SpartanRPC Scalaness library. It generates a remote blink
 * application. It performs all the necessary RT authorization computations in the first stage and burns session keys
 * into the node software.
 */
object Main {

  private def manageKeys(keys: KeyStorage) {
    // Main loop
    var done = false
    while (!done) {
      println("")
      println("0) return to main menu")
      println("1) show keys")
      println("2) add (entity, key) association")
      println("3) remove (entity, key) association")
      println("4) generate public/private key pair")
      print("=> ")
      val command = io.ReadStdin.readLine()

      command.toInt match {
        case 0 => done = true

        case _ =>
          println(s"Invalid or unimplemented command: '$command'")
      }
    }
  }


  private def managePolicy(certificates: CertificateStorage) {
    // Main loop
    var done = false
    while (!done) {
      println("")
      println("0) return to main menu")
      println("1) show policy")
      println("2) add credential")
      println("3) remove credential")
      print("=> ")
      val command = io.ReadStdin.readLine()

      command.toInt match {
        case 0 => done = true

        case _ =>
          println(s"Invalid or unimplemented command: '$command'")
      }
    }
  }


  def main(args: Array[String]) {

    object Mode extends Enumeration {
      val Harvester = Value
      val SensorBox = Value
    }

    if (args.length != 4) {
      println("Usage: Main owning_entity_name \"Harvester\"|\"SensorBox\" authorizer_port peer_port")
      return
    }

    // Extract useful items from the command line.
    // TODO: More comprehensive handling of the command line might be nice.
    val owningEntity   = args(0)
    val mode           = args(1) match {
      case "Harvester" => Mode.Harvester
      case "SensorBox" => Mode.SensorBox
      case _        => println(s"Unknown mode: ${args(0)}, defaulting to 'SensorBox'"); Mode.SensorBox
    }
    val authorizerPort = args(2).toInt
    val peerPort       = args(3).toInt

    // Create the storage objects.
    val keyStorage = new KeyStorageInMemory
    val certificateStorage = new CertificateStorageInMemory
    certificateStorage.linkTo(keyStorage)
    keyStorage.linkTo(certificateStorage)  // Do I really need both?

    // Create the supporting actors/threads.
    val messageServer = new MessageServer
    messageServer.start()

    val authorizer = new ServiceAuthorizer(messageServer, owningEntity, certificateStorage, authorizerPort)
    authorizer.start()

    // Main loop.
    var done = false
    println("Welcome to SnowStorm!")
    while (!done) {
      println("")
      println("0) quit")
      println("1) manage keys")
      println("2) manage policy")
      println("3) send to peer")
      println("4) generate")
      print("=> ")
      val command = io.ReadStdin.readLine()

      command.toInt match {
        case 0 => done = true

        case 1 =>
          manageKeys(keyStorage)

        case 2 =>
          managePolicy(certificateStorage)

        case 3 =>
          val authorizationMessage = new AuthorizationMessage(null, "Hello, World")
          val rawData = new ByteArrayOutputStream()
          val serializer = new ObjectOutputStream(rawData)
          serializer.writeObject(authorizationMessage)
          val rawBytes = rawData.toByteArray
          val localHost = InetAddress.getLocalHost
          val packet = new DatagramPacket(rawBytes, rawBytes.length, localHost, peerPort)
          val socket = new DatagramSocket()
          socket.send(packet)
          socket.close()

        case 4 =>
          messageServer ! s"Generating ${if (mode == Mode.Harvester) "Harvester" else "SensorBox" } application..."
          mode match {
            case Mode.Harvester => harvester.Generator.generate()
            case Mode.SensorBox => sensorbox.Generator.generate()
          }

        case _ =>
          println(s"Invalid or unimplemented command: '$command'")
      }
    }

    authorizer.close()
    messageServer ! 'Die
  }
  
}
