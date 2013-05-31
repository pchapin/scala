//-----------------------------------------------------------------------
// FILE    : ServiceAuthorizer.scala
// SUBJECT : Class that listens to the network for authorization requests.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm

import actors.Actor
import java.io._
import java.net.{DatagramPacket, DatagramSocket, SocketException}
import edu.uvm.rt.CertificateStorageInMemory

class ServiceAuthorizer(
  messageServer     : MessageServer,
  owningEntity      : String,
  certificateStorage: CertificateStorageInMemory,
  port              : Int) extends Actor {

  private val listeningSocket = new DatagramSocket(port)
  
  def act() {
    val message = new Array[Byte](1024)
    val packet = new DatagramPacket(message, message.length)
    
    try {
      while (true) {
        listeningSocket.receive(packet)
        val rawData = new ByteArrayInputStream(message, 0, packet.getLength)
        val deserializer = new ObjectInputStream(rawData)
        val authorizationMessage = deserializer.readObject().asInstanceOf[AuthorizationMessage]
        messageServer ! "Received : " + authorizationMessage.requestRole + " from the network"
      
        // TODO: Process authorization request from remote client.
      }
    }
    catch {
      case _: SocketException =>
        messageServer ! "Socket exception in ServiceAuthorizer; shutting down"
    }
  }

  /**
   * Shuts down this ServiceAuthorizer.
   */
  def close() {
    listeningSocket.close()
  }
}
