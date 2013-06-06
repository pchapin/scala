//-----------------------------------------------------------------------
// FILE    : RTCredential.scala
// SUBJECT : Classes that represent RT credentials in the abstract.
// AUTHOR  : (C) Copyright 2013 by Simone Willett <sgwillet@uvm.edu>
//                and Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

/**
 * Case class hierarchy that encapsulates human readable RT credentials. These differ from the hierarchy root at
 * Credential in that the other hierarchy uses keys instead of strings to identify entities. Thus the Credential
 * case classes are suitable for exchange whereas these classes are only suitable for local display.
 */
sealed abstract class RTCredential {

  /**
   * Converts this human readable credential into a transferable credential by replace entity names with their
   * corresponding keys.
   *
   * @param keyStorage The key storage area used for finding keys corresponding to entity names.
   * @return The transferable credential.
   */
  def toCredential(keyStorage: KeyStorage): Credential
}

case class RTMembershipCredential(
  target: (String, String),
  sourceEntity: String) extends RTCredential {

  def toCredential(keyStorage: KeyStorage) = {
    val (targetName, targetRole) = target
    val Some(KeyAssociation(_, definingKey, _)) = keyStorage.lookupEntryByName(targetName)
    val Some(KeyAssociation(_, memberKey,   _)) = keyStorage.lookupEntryByName(sourceEntity)
    CredentialMembership(definingKey, targetRole, memberKey)
  }
}

case class RTInclusionCredential(
  target: (String, String),
  source: (String, String)) extends RTCredential {

  def toCredential(keyStorage: KeyStorage) = {
    val (targetName, targetRole) = target
    val (sourceName, sourceRole) = source
    val Some(KeyAssociation(_, definingKey, _)) = keyStorage.lookupEntryByName(targetName)
    val Some(KeyAssociation(_, sourceKey,   _)) = keyStorage.lookupEntryByName(sourceName)
    CredentialInclusion(definingKey, targetRole, sourceKey, sourceRole)
  }
}

case class RTLinkedCredential(
  target: (String, String),
  source: (String, String),
  sourceRole2: String) extends RTCredential {

  def toCredential(keyStorage: KeyStorage) = {
    val (targetName, targetRole ) = target
    val (sourceName, sourceRole1) = source
    val Some(KeyAssociation(_, definingKey, _)) = keyStorage.lookupEntryByName(targetName)
    val Some(KeyAssociation(_, sourceKey,   _)) = keyStorage.lookupEntryByName(sourceName)
    CredentialLinked(definingKey, targetRole, sourceKey, sourceRole1, sourceRole2)
  }
}

case class RTIntersectionCredential(
  target : (String, String),
  source1: (String, String),
  source2: (String, String)) extends RTCredential {

  def toCredential(keyStorage: KeyStorage) = {
    val (targetName , targetRole ) = target
    val (sourceName1, sourceRole1) = source1
    val (sourceName2, sourceRole2) = source2
    val Some(KeyAssociation(_, definingKey, _)) = keyStorage.lookupEntryByName(targetName )
    val Some(KeyAssociation(_, sourceKey1 , _)) = keyStorage.lookupEntryByName(sourceName1)
    val Some(KeyAssociation(_, sourceKey2 , _)) = keyStorage.lookupEntryByName(sourceName2)
    CredentialIntersection(definingKey, targetRole, sourceKey1, sourceRole1, sourceKey2, sourceRole2)
  }
}
