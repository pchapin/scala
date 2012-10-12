//-----------------------------------------------------------------------
// FILE    : ServiceAuthorizer.scala
// SUBJECT : Class that listens to the network for authorization requests.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import actors.Actor
import java.net.{DatagramPacket, DatagramSocket}

class ServiceAuthorizer(private val port: Int) extends Actor {
  private val listeningSocket = new DatagramSocket(port)
  
  def act() {
    val message = new Array[Byte](512)
    val packet = new DatagramPacket(message, message.length)
    
    // TODO: The ServiceAuthorizer should accept some kind of poison pill message and terminate.
    while (true) {
      listeningSocket.receive(packet)
      
      // TODO: Process authorization request from remote client.
    }
  }

  /**
   * Shuts down this ServiceAuthorizer.
   */
  def close() {
    listeningSocket.close()
  }
}
