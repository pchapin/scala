//-----------------------------------------------------------------------
// FILE    : Certificate.scala
// SUBJECT : Class that represents a signed credential.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import java.security.interfaces.{ECPublicKey, ECPrivateKey}
import java.security.Signature

/**
 * Instances of this class associate a digital signature with a particular credential. The signature is intended to
 * apply to the result of credential.toRawCredential.
 *
 * Note that this class does not (currently) provide any way to validate its components. This is presumably done else-
 * where. In the future this class may provide methods for verifying that the raw credential is a proper representation
 * of the credential and that the signature is a valid signature over the raw credential.
 *
 * @param credential The credential wrapped by this certificate.
 * @param signature The ECDSA signature of the raw credential.
 */
case class Certificate(credential: Credential, signature: Array[Byte])

object Certificate {

  class UnexpectedSignatureFormatException(message: String) extends Exception(message)

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

    normalizeSignatureValue(signature)
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


  /**
   * Normalizes a signature value.
   *
   * @param signatureValue The original signature in ASN.1's DER encoding.
   * @return the signature as a 42 byte array consisting of r and s as two 21 byte integers in big endian form.
   */
  private def normalizeSignatureValue(signatureValue: Array[Byte]) = {

    // Check overall size and the DER sequence header.
    if (signatureValue.length < 46 || signatureValue.length > 48)
      throw new UnexpectedSignatureFormatException("Unexpected signature length")
    if (signatureValue(0) != 0x30)
      throw new UnexpectedSignatureFormatException("Signature not a DER sequence")
    if (signatureValue(1) != signatureValue.length - 2)
      throw new UnexpectedSignatureFormatException("Signature sequence size inconsistent")

    // Extract a 21 byte array from the signature, checking its DER format.
    def getValue(valueName: String, valueIndex: Int) = {
      if (signatureValue(valueIndex - 2) != 0x02)
        throw new UnexpectedSignatureFormatException("Signature " + valueName + " value not an integer")
      val valueLength = signatureValue(valueIndex - 1)
      val value = valueLength match {
        case 20 => new Array[Byte](1) ++ (signatureValue slice (valueIndex, valueIndex + 20))
        case 21 => signatureValue slice (valueIndex, valueIndex + 21)
        case  _ =>
          throw new UnexpectedSignatureFormatException("Signature " + valueName + " value has unexpected size")
      }
      value
    }

    // Extract the raw (r, s) pair from the signature as an array of exactly 42 bytes.
    val rBaseIndex = 4
    val rValue = getValue("r", rBaseIndex)

    val sBaseIndex = rBaseIndex + signatureValue(rBaseIndex - 1) + 2
    val sValue = getValue("s", sBaseIndex)

    rValue ++ sValue
  }

}