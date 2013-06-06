//-----------------------------------------------------------------------
// FILE    : CertificateCreator.scala
// SUBJECT : This object wraps the grunt methods that crank out the certificates themselves.
// AUTHOR  : (C) Copyright 2011 by Simone Willett <sgwillet@uvm.edu>
//                and Peter Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.Signature
import java.security.interfaces.{ECPrivateKey, ECPublicKey}
import edu.uvm.rtadmin.BinaryHelpers._
import edu.uvm.rtadmin.Database._

/**
 * Object to wrap the low level certificate creation methods. Certificates generated by this system are in a special,
 * low overhead format defined here.
 */
object RTCertificateCreator {
  
  /**
   * Installs a public key into the raw array. Uncompressed public keys consume exactly 40 bytes. If compression is
   * requested only 21 bytes are used. The last byte is zero or one as appropriate to represent the Y coordinate of the
   * key. This format is not standard; the receiver must know what to expect. It does save two bytes in the uncompressed
   * case.
   * 
   * @param rawBinary The array into which the key bytes are to be placed.
   * @param targetOffset The location in the array where the first key byte is placed.
   * @param key The public key to install in the array. Only 160 bit keys are supported.
   * @param useCompressedKeys True if public key compression is in effect.
   */
  private def installPublicKey(
    rawBinary:         Array[Byte],
    targetOffset:      Int,
    key:               ECPublicKey,
    useCompressedKeys: Boolean) = {
    
    copyInto(target   = rawBinary,
             atOffset = targetOffset,
             from     = normalizeKeyValue(key.getW.getAffineX.toByteArray))
    
    val offsetAdvance = if (useCompressedKeys) {
      val keyY = key.getW.getAffineY
      rawBinary(targetOffset + 20) = if (keyY.testBit(0)) 1 else 0
      1
    }
    else {
      copyInto(target   = rawBinary,
               atOffset = targetOffset + 20,
               from     = normalizeKeyValue(key.getW.getAffineY.toByteArray))
      20
    }
    
    offsetAdvance + 20
  }
  
  /**
   * Create a certificate for a membership credential. The public and private keys of the defining entity must be
   * present in the database. The public key of the source entity and the role identifier must also be present in the
   * database.
   * 
   * @param definingEntity The name of the entity issuing this certificate.
   * @param definingRoleName The name of the role being specified by the issuing entity.
   * @param sourceEntity The name of the entity being added to the specified role.
   * @param useCompressedKeys True if the public keys should be output in compressed form.
   */
  def createMembershipCertificate(
    definingPublicKey:    ECPublicKey,
    definingRole:         String,
    sourcePublicKey:      ECPublicKey,
    useCompressedKeys:    Boolean = false) = {
    
    var targetOffset = 0

    val rawBinary = new Array[Byte](if (useCompressedKeys) 44 else 82)

    rawBinary(targetOffset) = 1    // Certificate form identifier.
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, definingPublicKey, useCompressedKeys)
    rawBinary(targetOffset) = definingRole.toByte
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, sourcePublicKey, useCompressedKeys)

    rawBinary
  }

  
  /**
   * Create a certificate for an inclusion credential. The public and private keys of the defining entity must be
   * present in the database. The public key of the source entity and the role identifiers must also be present in the
   * database.
   * 
   * @param definingEntity The name of the entity issuing this certificate.
   * @param definingRoleName The name of the role being specified by the issuing entity.
   * @param sourceEntity The name of the entity controlling the source role.
   * @param sourceRoleName The name of the source role.
   * @param useCompressedKeys True if the public keys should be output in compressed form.
   */
  def createInclusionCertificate(
    definingPublicKey:    ECPublicKey,
    definingRole:         String,
    sourcePublicKey:      ECPublicKey,
    sourceRole:           String,
    useCompressedKeys: Boolean = false) = {
    
    var targetOffset = 0

    val rawBinary = new Array[Byte](if (useCompressedKeys) 45 else 83)

    rawBinary(targetOffset) = 2    // Certificate form identifier.
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, definingPublicKey, useCompressedKeys)
    rawBinary(targetOffset) = definingRole.toByte
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, sourcePublicKey, useCompressedKeys)
    rawBinary(targetOffset) = sourceRole.toByte
    targetOffset += 1

    rawBinary
  }

  
  /**
   * Create a certificate for linked credentials. The public and private keys of the defining entity must be present in
   * the database. The public key of the source entity and the role identifiers must also be present in the database.
   * 
   * @param definingEntity The name of the entity issuing this certificate.
   * @param definingRoleName The name of the role being specified by the issuing entity.
   * @param sourceEntity The name of the entity controlling the indirect role.
   * @param sourceRole1Name The name of the indirect role.
   * @param sourceRole2Name The name of the role from which new members are taken.
   * @param useCompressedKeys True if the public keys should be output in compressed form.
   */
  def createLinkedCertificate(
    definingPublicKey:    ECPublicKey,
    definingRole:         String,
    sourcePublicKey:      ECPublicKey,
    sourceRole1:          String,
    sourceRole2:          String,
    useCompressedKeys: Boolean = false) = {
    
    var targetOffset = 0
    
    val rawBinary = new Array[Byte](if (useCompressedKeys) 46 else 84)

    rawBinary(targetOffset) = 3    // Certificate form identifier.
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, definingPublicKey, useCompressedKeys)
    rawBinary(targetOffset) = definingRole.toByte
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, sourcePublicKey, useCompressedKeys)
    rawBinary(targetOffset + 0) = sourceRole1.toByte
    rawBinary(targetOffset + 1) = sourceRole2.toByte
    targetOffset += 2
    
    rawBinary
  }

  
  /**
   * Create a certificate an intersection credential. The public and private keys of the defining entity must be present
   * in the database. The public keys of the source entities and the role identifiers must also be present in the
   * database.
   * 
   * @param definingEntity The name of the entity issuing this certificate.
   * @param definingRoleName The name of the role being specified by the issuing entity.
   * @param sourceEntity1 The name of the first entity in the intersection.
   * @param sourceRole1Name The name of entity 1's role.
   * @param sourceEntity2 The name of the second entity in the intersection.
   * @param sourceRole2Name The name of entity 2's role.
   * @param useCompressedKeys True if the public keys should be output in compressed form.
   */
  def createIntersectionCertificate(
    definingPublicKey:     ECPublicKey,
    definingRole:          String,
    sourcePublicKey1:      ECPublicKey,
    sourceRole1:           String,
    sourcePublicKey2:      ECPublicKey,
    sourceRole2:           String,
    useCompressedKeys: Boolean = false) = {
    
    var targetOffset = 0


    val rawBinary = new Array[Byte](if (useCompressedKeys) 67 else 124)

    rawBinary(targetOffset) = 4    // Certificate form identifier.
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, definingPublicKey, useCompressedKeys)
    rawBinary(targetOffset) = definingRole.toByte
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, sourcePublicKey1, useCompressedKeys)
    rawBinary(targetOffset) = sourceRole1.toByte
    targetOffset += 1
    targetOffset += installPublicKey(rawBinary, targetOffset, sourcePublicKey2, useCompressedKeys)
    rawBinary(targetOffset) = sourceRole2.toByte
    targetOffset += 1
    
    rawBinary
  }

  
  /**
   * Sign a message. The signatures returned by this method are in a special low overhead form with zero "extra" bytes.
   * Such signatures do not conform to any published standard but they do save space in memory constrained systems such
   * as wireless sensor networks.
   * 
   * @param message The message to sign. The message can be arbitrary binary data.
   * @param privateKey The key used to make the signature.
   * @return The signature for the message. The message itself is not returned.
   */
  def createSignature(message: Array[Byte], privateKey: ECPrivateKey): Array[Byte] = {
    val ECDSASignature = Signature.getInstance("ECDSA", "BC")
    ECDSASignature.initSign(privateKey)

    // The call to update() processes the data that is passed in. Nothing is output until the call to sign().
    ECDSASignature.update(message)

    // Return the resulting signature.
    val signature = ECDSASignature.sign()

    edu.uvm.rtadmin.BinaryHelpers.normalizeSignatureValue(signature)
  }
   
  
  /**
   * Verify the signature on a message.
   * 
   * TODO: It is likely that the signature expected by this method is a "regular" standard format signature and not the
   * special low overhead signatures created by createSignature.
   * 
   * @param message The message to verify.
   * @param signature The signature associated with the message.
   * @param publicKey The public key corresponding to the private key used to make the signature.
   * 
   * @throws Exception if the signature failed to verify, otherwise return normally.
   */
  def verifySignature(message: Array[Byte], signature: Array[Byte], publicKey: ECPublicKey) {
    val ECDSAVerifier = Signature.getInstance("ECDSA","BC")
    ECDSAVerifier.initVerify(publicKey)

    // Pass the message to be verified.
    ECDSAVerifier.update(message, 0, message.length)

    // Pass the signature.
    val verified = ECDSAVerifier.verify(signature)

    if (!verified) {
      throw new Exception("Failure Signature was not verified")
    }
    println("Test Successful!")
  }
  
}
