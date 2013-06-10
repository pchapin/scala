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
import java.security.MessageDigest
import java.security.interfaces.{ECPrivateKey, ECPublicKey}
import javax.crypto.KeyAgreement
import edu.uvm.rt.{CertificateStorage, KeyAssociation, KeyStorage}
import edu.uvm.scalaness.LiftableTypes.UInt8

class ServiceAuthorizer(
  messageServer     : MessageServer,
  owningEntity      : String,
  keyStorage        : KeyStorage,
  certificateStorage: CertificateStorage,
  authorizerPort    : Int,
  peerPort          : Int) extends Actor {

  // This is horribly hackish.
  var sessionKey = new Array[UInt8](16)

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

    def doDiffieHellman(myPrivateKey: ECPrivateKey, theirPublicKey: ECPublicKey) {
      val keyAgree = KeyAgreement.getInstance("ECDH", "BC")
      keyAgree.init(myPrivateKey)
      keyAgree.doPhase(theirPublicKey, true)
      val hasher = MessageDigest.getInstance("SHA1", "BC")
      val secret = hasher.digest(keyAgree.generateSecret())
      val newSessionKey = new Array[UInt8](16)
      for (i <- 0 to 15) newSessionKey(i) = UInt8(if (secret(i) < 0) secret(i) + 256 else secret(i))
      sessionKey = newSessionKey
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

          case AuthorizationQueryMessage(queryKey: ECPublicKey, roleName: String) =>
            val Some(KeyAssociation(_, myPublicKey, Some(myPrivateKey))) = keyStorage.lookupEntryByName(owningEntity)
            messageServer ! s"Authorization query. From: $queryKey for role $roleName"
            val authorized = certificateStorage.authorize(myPublicKey, roleName, queryKey)
            if (!authorized) {
              messageServer ! "*** NOT authorized"
              val reply = AuthorizationReplyMessage(false, null)
              sendReply(reply)
            }
            else {
              messageServer ! "*** Authorized"
              val reply = AuthorizationReplyMessage(true, myPublicKey)
              sendReply(reply)
              doDiffieHellman(myPrivateKey, queryKey)
            }

          case AuthorizationReplyMessage(authorized, governingKey) =>
            val Some(KeyAssociation(_, _, Some(myPrivateKey))) = keyStorage.lookupEntryByName(owningEntity)
            doDiffieHellman(myPrivateKey, governingKey)

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
