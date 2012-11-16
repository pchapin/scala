//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Demonstration program for the SpartanRPC Scalaness library.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import edu.uvm.rt.CredentialStorageInMemory

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
      MessageServer.start()
      MessageServer ! "Welcome to BlinkBuilder!"
      val owningEntity = args(0)
      val credentialStore = new CredentialStorageInMemory
      // val authorizer = new ServiceAuthorizer(9000)
      // authorizer.start()
      
      while (true) {
        Thread.sleep(10000)
        MessageServer ! "Generating Blink..."
        // Generate blink application using current information.
        BlinkClient.image()
        BlinkServer.image()
      }
    }
  }
  
}
