//-----------------------------------------------------------------------
// FILE    : CredentialStorage.scala
// SUBJECT : Interface to classes that hold RT_0 credentials along with their minimum model.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.ECPublicKey

/**
 * Describes the interface to all RT_0 credential storage objects. Objects that implement this trait can be used to hold
 * credentials along with the minimum model implied by those credentials. Currently this trait is very limited in that
 * it does not provide a way to iterate over credentials or remove credentials. These limitations may be lifted in the
 * future.
 */
trait CredentialStorage {

  /**
   * Add a credential to the credential storage. It is unspecified if the minimum model is computed or updated
   * immediately or if that computation is deferred until authorize is called. In any case the effect of adding this
   * credential is "immediately" visible in any following calls to authorize.
   *
   * @param incomingCredential The credential to add. If the credential is already present in this storage object there
   * is no effect.
   */
  def addCredential(incomingCredential: Credential)

  /**
   * Compute authorization. It is unspecified if the minimum model of the stored credentials is computed at this time
   * or if it was computed earlier as part of the addCredential method.
   *
   * @param governingKey The key that controls the resource being accessed.
   * @param governingRole The role associated with the resource being accessed.
   * @param queryKey The key that desires access to the resource.
   *
   * @return True if the query key is a member of the governing role; false otherwise.
   */
  def authorize(
    governingKey : ECPublicKey,
    governingRole: String,
    queryKey     : ECPublicKey): Boolean
}
