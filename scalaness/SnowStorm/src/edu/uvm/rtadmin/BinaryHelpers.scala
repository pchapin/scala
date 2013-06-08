//-----------------------------------------------------------------------
// FILE    : BinaryHelpers.scala
// SUBJECT : Various helper methods to simplify the manipulation of binary data.
// AUTHOR  : (C) Copyright 2011 by Simone Willett <sgwillet@uvm.edu> and Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rtadmin

import java.io.Writer

/**
 * This object encapsulates various helper methods that simplify the manipulation of raw binary data. Some of these
 * methods may already be available in some library somewhere. However, some of them are quite specialized to the needs
 * of Sprocket.
 */
object BinaryHelpers {

  class UnexpectedSignatureFormatException(message: String) extends Exception(message)

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
  def copyInto(target: Array[Byte], atOffset: Int, from: Array[Byte]) {
    var index = atOffset
    for (byte <- from) {
      target(index) = byte
      index += 1
    }
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
  def normalizeKeyValue(keyValue: Array[Byte]) = {
    val originalLength = keyValue.length
    originalLength match {
      case 21 => keyValue slice (1, originalLength)
      case 20 => keyValue

      // The only other possibility is for the originalLength to be less than 20.
      case  _ => (new Array[Byte](20 - originalLength) ++ keyValue)
    }
  }


  /**
   * Normalizes a signature value.
   *
   * @param signatureValue The original signature in ASN.1's DER encoding.
   * @return the signature as a 42 byte array consisting of r and s as two 21 byte integers in big endian form.
   */
  def normalizeSignatureValue(signatureValue: Array[Byte]) = {

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


  /**
   * Prints the given byte array as a C-style array initializer with enclosing curly braces. The data is printed in big
   * endian order one byte at a time.
   *
   * @param data The byte array to print.
   */
  def printAsCInitializerBEB(output: Writer, data: Array[Byte]) {

    def printByte(byte: Int) {
      val hexDigits = "0123456789ABCDEF"
      val Nibble1 = (byte & 0x000000F0) >>> 4
      val Nibble0 = (byte & 0x0000000F)
      output.write("0x" + hexDigits(Nibble1).toString + hexDigits(Nibble0).toString)
    }

    var rowCounter  = 0
    val indentation = "    "

    output.write("{\n")
    output.write(indentation)
    for (index <- 0 until data.length) {
      printByte(data(index))
      output.write(if (index != data.length - 1) ", " else "")
      rowCounter += 1
      if (rowCounter == 8) {
        output.write("\n")
        output.write(indentation)
        rowCounter = 0
      }
    }
    output.write("\n};\n")
  }

  /**
   * Prints the given byte array as a C-style array initializer without enclosing curly braces. The data is printed in
   * little endian order one 16 bit word at a time. An extra zero is printed at the end so the overall size of the
   * array is 11 words (16 bits each). This corresponds to the expectations of the TinyECC library.
   *
   * @param data The byte array to print.
   */
  def printAsCInitializerLEW(output: Writer, data: Array[Byte]) {

    def printWord(word: Int) {
      val hexDigits = "0123456789ABCDEF"
      val Nibble3 = (word & 0x0000F000) >>> 12
      val Nibble2 = (word & 0x00000F00) >>>  8
      val Nibble1 = (word & 0x000000F0) >>>  4
      val Nibble0 = (word & 0x0000000F)
      output.write("0x" +
        hexDigits(Nibble3).toString +
        hexDigits(Nibble2).toString +
        hexDigits(Nibble1).toString +
        hexDigits(Nibble0).toString)
    }

    var rowCounter     = 0
    val indentation    = "        "
    val zeroByte: Byte = 0      // For the sake of getting the types right in the following expression.
    val extendedData   = zeroByte +: zeroByte +: data

    output.write(indentation)
    for (index <- extendedData.length - 2 to 0 by -2) {
      // The type Byte is signed which is a bit awkward. I need the corresponding unsigned value.
      val MSB = {
        val rawValue = extendedData(index)
        if (rawValue < 0) rawValue + 256 else rawValue
      }
      val LSB = {
        val rawValue = extendedData(index + 1)
        if (rawValue < 0) rawValue + 256 else rawValue
      }
      printWord(256 * MSB + LSB)
      output.write(if (index != 0) ", " else "")
      rowCounter += 1
      if (rowCounter == 8) {
        output.write("\n")
        output.write(indentation)
        rowCounter = 0
      }
    }
    output.write("\n")
  }
}
