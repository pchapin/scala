//-----------------------------------------------------------------------
// FILE    : Credential.scala
// SUBJECT : Case classes for the various RT_0 credential forms.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.ECPublicKey

sealed abstract class Credential {

  /**
   * @return The public key of the issuer of this credential.
   */
  def getIssuer: ECPublicKey

  /**
   * @return A low level (byte) representation of this credential. This uses a special "low overhead" form.
   */
  def toRawCredential: Array[Byte]
}

case class CredentialMembership(
  definingKey: ECPublicKey,
  targetRole : String,
  memberKey  : ECPublicKey) extends Credential {

  def getIssuer = definingKey

  def toRawCredential = {
    var targetOffset = 0
    val rawBinary = new Array[Byte](82)

    rawBinary(targetOffset) = 1.toByte    // Certificate form identifier.
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, definingKey)
    rawBinary(targetOffset) = targetRole.toByte
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, memberKey)

    rawBinary
  }
}

case class CredentialInclusion(
  definingKey: ECPublicKey,
  targetRole : String,
  sourceKey  : ECPublicKey,
  sourceRole : String) extends Credential {

  def getIssuer = definingKey

  def toRawCredential = {
    var targetOffset = 0
    val rawBinary = new Array[Byte](83)

    rawBinary(targetOffset) = 2.toByte    // Certificate form identifier.
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, definingKey)
    rawBinary(targetOffset) = targetRole.toByte
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, sourceKey)
    rawBinary(targetOffset) = sourceRole.toByte
    targetOffset += 1

    rawBinary
  }
}

case class CredentialLinked(
  definingKey : ECPublicKey,
  targetRole  : String,
  indirectKey : ECPublicKey,
  indirectRole: String,
  sourceRole  : String) extends Credential {

  def getIssuer = definingKey

  def toRawCredential = {
    var targetOffset = 0
    val rawBinary = new Array[Byte](84)

    rawBinary(targetOffset) = 3.toByte    // Certificate form identifier.
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, definingKey)
    rawBinary(targetOffset) = targetRole.toByte
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, indirectKey)
    rawBinary(targetOffset + 0) = indirectRole.toByte
    rawBinary(targetOffset + 1) = sourceRole.toByte
    targetOffset += 2

    rawBinary
  }
}

case class CredentialIntersection(
  definingKey: ECPublicKey,
  targetRole : String,
  sourceKey1 : ECPublicKey,
  sourceRole1: String,
  sourceKey2 : ECPublicKey,
  sourceRole2: String) extends Credential {

  def getIssuer = definingKey

  def toRawCredential = {
    var targetOffset = 0
    val rawBinary = new Array[Byte](124)

    rawBinary(targetOffset) = 4.toByte    // Certificate form identifier.
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, definingKey)
    rawBinary(targetOffset) = targetRole.toByte
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, sourceKey1)
    rawBinary(targetOffset) = sourceRole1.toByte
    targetOffset += 1
    targetOffset += Credential.installPublicKey(rawBinary, targetOffset, sourceKey2)
    rawBinary(targetOffset) = sourceRole2.toByte
    targetOffset += 1

    rawBinary
  }

}


object Credential {

  /**
   * Copies one byte array into another at a specified location. Bytes in the target array that are not explicitly
   * overwritten by this method are unchanged.
   *
   * @param target The byte array that will receive the data.
   *
   * @param atOffset The first index into the target byte array where the data will be copied. All following bytes are
   * copied into successive locations of the target array.
   *
   * @param from The byte array from which the data is copied. The entire source array is copied. If there is
   * insufficient space in the target array an exception will be thrown.
   */
  private def copyInto(target: Array[Byte], atOffset: Int, from: Array[Byte]) {
    var index = atOffset
    for (byte <- from) {
      target(index) = byte
      index += 1
    }
  }


  /**
   * Installs a public key into the raw array. Uncompressed public keys consume exactly 40 bytes.
   *
   * @param rawBinary The array into which the key bytes are to be placed.
   * @param targetOffset The location in the array where the first key byte is placed.
   * @param key The public key to install in the array. Only 160 bit keys are supported.
   */
  private[rt] def installPublicKey(
    rawBinary   : Array[Byte],
    targetOffset: Int,
    key         : ECPublicKey) = {

    copyInto(target   = rawBinary,
      atOffset = targetOffset,
      from     = normalizeKeyValue(key.getW.getAffineX.toByteArray))

    copyInto(target   = rawBinary,
      atOffset = targetOffset + 20,
      from     = normalizeKeyValue(key.getW.getAffineY.toByteArray))

    40
  }


  /**
   * Normalizes a key value so that it consumes exactly 20 bytes. The BigInteger.toByteArray method might return an
   * array with an extra zero byte in the case when the most significant bit of the number is 1 (so that the byte array
   * represents a positive value). In addition if the number is too small and has a large number of leading zero bits,
   * it is possible that the byte array will not be the full 20 bytes long.
   *
   * @param keyValue The original key information.
   * @return The same keyValue in a byte array of exactly 20 bytes in big endian form.
   */
  private def normalizeKeyValue(keyValue: Array[Byte]) = {
    val originalLength = keyValue.length
    originalLength match {
      case 21 => keyValue slice (1, originalLength)
      case 20 => keyValue

      // The only other possibility is for the originalLength to be less than 20.
      case  _ => (new Array[Byte](20 - originalLength) ++ keyValue)
    }
  }

}