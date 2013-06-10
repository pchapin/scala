//-----------------------------------------------------------------------
// FILE    : NetworkMessage.scala
// SUBJECT : A class that represents messages sent between instances of this program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm

import java.security.interfaces.ECPublicKey
import edu.uvm.rt.Certificate

/**
 * The root type of classes that are used to communicate between SnowStorm instances.
 */
abstract sealed class NetworkMessage extends Serializable


/**
 * Used when requesting all public keys.
 */
class KeyRequestMessage extends NetworkMessage


/**
 * Contains a list of all public keys known to the sender. Used in reply to a KeyRequestMessage.
 *
 * @param keys All public keys known to the sender.
 */
case class KeyReplyMessage(keys: List[ECPublicKey]) extends NetworkMessage


/**
 * Used when requesting all certificates.
 */
class CertificateRequestMessage extends NetworkMessage


/**
 * Contains a list of all certificates known to the sender. Used in reply to a CertificateRequestMessage.
 * @param certificates All certificates known to the sender.
 */
case class CertificateReplyMessage(certificates: List[Certificate]) extends NetworkMessage


/**
 * Used when requesting access to a role.
 *
 * @param queryKey The key that wishes access.
 * @param roleName The role to be accessed. The governing key is assumed to be the owning entity of the peer.
 */
case class AuthorizationQueryMessage(queryKey: ECPublicKey, roleName: String) extends NetworkMessage


/**
 * Response to an authorization request.
 *
 * @param authorized A flag to indicate if access is granted or not.
 * @param governingKey The public key of the owning entity of the peer.
 */
case class AuthorizationReplyMessage(authorized: Boolean, governingKey: ECPublicKey) extends NetworkMessage
