//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Demonstration program for the SpartanRPC Scalaness library.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import akka.actor.{ActorSystem, Props}
import edu.uvm.rt.CertificateStorageInMemory

/**
 * This is a demonstration program to illustrate the SpartanRPC Scalaness library. It generates a remote blink
 * application. It performs all the necessary RT authorization computations in the first stage and burns session keys
 * into the node software.
 */
object Main {
  
  def main(args: Array[String]) {

    // We require a command line argument specifying the owning entity of this generator.
    // TODO: More comprehensive handling of the command line might be nice.
    if (args.length != 1)
      println("Owning entity name expected on the command line.")
    else {
      val owningEntity = args(0)
      val certificateStore = new CertificateStorageInMemory

      val system = ActorSystem("SpartanRPC")
      val messageServer = system.actorOf(Props[MessageServer], "message server")
      // val authorizer = system.actorOf(Props(new ServiceAuthorizer(9000)), "authorizer")
      messageServer ! "Welcome to BlinkBuilder!"
      
      while (true) {
        Thread.sleep(10000)
        messageServer ! "Generating Blink..."
        // Generate blink application using current information.
        BlinkClient.image()
        BlinkServer.image()
      }
    }
  }
  
}
