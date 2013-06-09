//-----------------------------------------------------------------------
// FILE    : ServiceAuthorizer.scala
// SUBJECT : Class that listens to the network for messages from other security domains.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm

import actors.Actor
import java.io._
import java.net.{DatagramPacket, DatagramSocket, SocketException}
import edu.uvm.rt.{CertificateStorage, KeyAssociation, KeyStorage}

class ServiceAuthorizer(
  messageServer     : MessageServer,
  owningEntity      : String,
  keyStorage        : KeyStorage,
  certificateStorage: CertificateStorage,
  authorizerPort    : Int,
  peerPort          : Int) extends Actor {

  private val authorizerSocket = new DatagramSocket(authorizerPort)
  
  def act() {
    val incomingMessage = new Array[Byte](8192)  // TODO: Big enough? Probably not in general.
    val packet = new DatagramPacket(incomingMessage, incomingMessage.length)

    def sendReply(reply: NetworkMessage) {
      val outgoingStream = new ByteArrayOutputStream()
      val serializer = new ObjectOutputStream(outgoingStream)
      serializer.writeObject(reply)
      val outgoingData = outgoingStream.toByteArray
      packet.setData(outgoingData)
      packet.setPort(peerPort)
      authorizerSocket.send(packet)
    }
    
    try {
      while (true) {
        // Receive a NetworkMessage.
        packet.setData(incomingMessage)
        authorizerSocket.receive(packet)
        val rawData = new ByteArrayInputStream(incomingMessage, 0, packet.getLength)
        val deserializer = new ObjectInputStream(rawData)
        val authorizationMessage = deserializer.readObject().asInstanceOf[NetworkMessage]

        // Process each message as appropriate for its type.
        authorizationMessage match {
          case _: KeyRequestMessage =>
            val keyList = (for (KeyAssociation(name, publicKey, privateKey) <- keyStorage) yield publicKey).toList
            val reply = KeyReplyMessage(keyList)
            sendReply(reply)

          case KeyReplyMessage(keys) =>
            for (key <- keys) keyStorage.addKey(key)

          case _: CertificateRequestMessage =>
            val certificateList = certificateStorage.toList
            val reply = CertificateReplyMessage(certificateList)
            sendReply(reply)

          case CertificateReplyMessage(certificates) =>
            for (certificate <- certificates) certificateStorage.addCertificate(certificate)

          case _ => messageServer ! "Unknown message type received by the Service Authorizer; ignoring"
        }

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
    authorizerSocket.close()
  }
}
