//-----------------------------------------------------------------------
// FILE    : KeyStorage.scala
// SUBJECT : Interface to classes that hold key material for RT trust management systems.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.ECPublicKey

/**
 * Describes the interface to all key storage objects. Such objects provide methods for managing a database of public
 * and private keys used in RT trust management operations. The precise manner in which key information is stored is
 * not specified here.
 *
 * Conceptually a KeyStorage is a bidirectional mapping between entity names and (public, private) key pairs. The entity
 * names have local significance only; they exist for the convenience of the application's user. Entity names are never
 * embedded in credentials. Formally entities are completely specified by their public keys.
 *
 * The private key is optional.
 */
trait KeyStorage extends Traversable[KeyAssociation] {

  /**
   * Associates this key storage object with a particular certificate storage object. This link is necessary because
   * certain operations on the key storage will impact or need to synchronize with the linked certificate storage. When
   * the link is first established the certificate storage is scanned and any keys mentioned in certificates there that
   * are not already in the key storage are copied to key storage as well.
   *
   * It is permitted to change the link. No keys are removed from key storage by doing so.
   *
   * @param credentials The object to which we are linking.
   */
  def linkTo(credentials: CertificateStorage)

  /**
   * Creates a fresh public/private key pair and associates the given name to the new entity.
   *
   * @param name The name to use for the freshly created entity.
   * @throws InvalidNameException if the name is already in use. In that case no entity is created.
   */
  def generateEntity(name: String)

  /**
   * Adds a new key to this key storage object. If the key already exists in the object there is no effect.
   *
   * @param key The key to add.
   */
  def addKey(key: ECPublicKey)

  /**
   * Removes the key associated with the given name. The name is also removed. If there is a linked certificate storage
   * the removal is not allowed if some certificate is using the specified key.
   *
   * @param name The name of the key to remove.
   * @throws KeyInUseException if the name is associated with a key that is used by the linked certificate storage.
   */
  def removeKey(name: String)

  /**
   * Removes the specified key. Any name associated with the key is also removed. If there is a linked certificate
   * storage the removal is not allowed if some certificate is using the specified key.
   *
   * @param key The key to remove.
   * @throws KeyInUseException if the key is used by the linked certificate storage.
   */
  def removeKey(key: ECPublicKey)

}


/**
 * The companion object holds exceptions used by the trait.
 */
object KeyStorage {
  class InvalidNameException(message: String) extends Exception(message)
  class KeyInUseException(message: String) extends Exception(message)
}