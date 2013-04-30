//-----------------------------------------------------------------------
// FILE    : Certificate.scala
// SUBJECT : Class that represents a signed credential.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

/**
 * Instances of this class associate a digital signature with a particular credential. The credential is given in two
 * forms: abstract and raw. The raw form is the binary representation of the abstract credential. The signature applies
 * to the raw form.
 *
 * Note that this class does not (currently) provide any way to validate its components. This is presumably done else-
 * where. In the future this class may provide methods for verifying that the raw credential is a proper representation
 * of the credential and that the signature is a valid signature over the raw credential.
 *
 * @param credential The credential wrapped by this certificate.
 * @param rawCredential The binary representation of the credential.
 * @param signature The ECDSA signature of the raw credential.
 */
case class Certificate(credential: Credential, rawCredential: Array[Byte], signature: Array[Byte])
