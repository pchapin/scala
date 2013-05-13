//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Demonstration program for the SpartanRPC Scalaness library.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import java.io._
import java.net._

/**
 * This is a demonstration program to illustrate the SpartanRPC Scalaness library. It generates a remote blink
 * application. It performs all the necessary RT authorization computations in the first stage and burns session keys
 * into the node software.
 */
object Main {
  
  def main(args: Array[String]) {

    // We require a command line argument specifying the owning entity of this generator.
    // TODO: More comprehensive handling of the command line might be nice.
    if (args.length != 3)
      println("Usage: Main owning_entity_name authorizer_port peer_port")
    else {
      val owningEntity   = args(0)
      val authorizerPort = args(1).toInt
      val peerPort       = args(2).toInt

      val messageServer = new MessageServer
      messageServer.start()

      val authorizer = new ServiceAuthorizer(messageServer, owningEntity, authorizerPort)
      authorizer.start()

      println("Welcome to BlinkBuilder!")

      var done = false
      while (!done) {
        println("0) quit")
        println("1) send to peer")
        println("2) generate")
        print("\n=> ")
        val command = io.ReadStdin.readLine()

        command.toInt match {
          case 0 => done = true

          case 1 =>
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

          case 2 =>
            messageServer ! "Generating Blink..."
            BlinkClient.image()
            BlinkServer.image()
        }
      }

      authorizer.close()
      messageServer ! 'Die
    }
  }
  
}
