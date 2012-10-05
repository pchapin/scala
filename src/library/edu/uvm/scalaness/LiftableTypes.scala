//-----------------------------------------------------------------------
// FILE    : LiftableTypes.scala
// SUBJECT : Module that introduces types that can be used in a Scalaness program to represent types in Mininess.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

object LiftableTypes {
  
  /**
   * Marker trait so that types that can exist in the second stage are indicated as such. Certain aspects of the runtime
   * system are intended to process any possible Mininess type, but not types that are only known to Scala.
   */
  trait Liftable

  /** Represents the Mininess type void */
  class Uninit extends Liftable

  // Note that case classes can't be used because "case-to-case" inheritance is buggy and "unlikely to be fixed." Since
  // I don't care about pattern matching I will introduce explicit companion objects with an apply method. This
  // simplifies the construction of primitive values.
  
  // TODO: Is this a situation with Scala 2.10 value classes would be useful?

  /** Represents the Mininess type char */
  class Char(private val value: scala.Char) extends Liftable {
    def toChar = value
    override def toString = value.toString
  }
  
  object Char { def apply(value: scala.Char) = new Char(value) }

  // There is a compile-time type safety problem with the unsigned types. Since Scala does not have any unsigned types
  // natively a signed type with sufficient range must be used as a substitute. Thus expressions like UInt8(1000) can't
  // be ruled out at compile time. Instead the value is checked at run time. This is a form of overflow checking.
  // 
  // The signed types (below) don't have this problem because they can take advantage of Scala's build in handling of
  // types Byte, Short, and Int. However, no overflow checking is done for these types during computations.

  /**
   * Exception thrown when an value is constructed with an overly large initializer.
   */
  class ValueOutOfRangeException(message: String) extends Exception(message)
  
  /** Represents the Mininess type uint32_t */
  class UInt32(private val value: Long) extends Liftable {
    if (value < 0 || value >= 4294967296L)
      throw new ValueOutOfRangeException("Invalid UInt32 constructed: " + value)
    
    def toLong = value
    def +(other: UInt32) = UInt32(value + other.value)
    def -(other: UInt32) = UInt32(value - other.value)
    def *(other: UInt32) = UInt32(value * other.value)
    def /(other: UInt32) = UInt32(value / other.value)
    override def toString = value.toString
  }

  /** Represents the Mininess type uint16_t */
  class UInt16(private val value: Long) extends UInt32(value) {
    if (value < 0 || value >= 32768)
      throw new ValueOutOfRangeException("Invalid UInt16 constructed: " + value)

    def +(other: UInt16) = UInt16(value + other.value)
    def -(other: UInt16) = UInt16(value - other.value)
    def *(other: UInt16) = UInt16(value * other.value)
    def /(other: UInt16) = UInt16(value / other.value)
    override def toString = value.toString
  }
 
  /** Represents the Mininess type uint8_t */
  class UInt8 (private val value: Long) extends UInt16(value) {
    if (value < 0 || value >= 128)
      throw new ValueOutOfRangeException("Invalid UInt8 constructed: " + value)

    def +(other: UInt8 ) = UInt8 (value + other.value)
    def -(other: UInt8 ) = UInt8 (value - other.value)
    def *(other: UInt8 ) = UInt8 (value * other.value)
    def /(other: UInt8 ) = UInt8 (value / other.value)
    override def toString = value.toString
  }

  object UInt32 { def apply(value: Long) = new UInt32(value) }
  object UInt16 { def apply(value: Long) = new UInt16(value) }
  object UInt8  { def apply(value: Long) = new UInt8 (value) }
  
  
  /** Represents the Mininess type int32_t */
  class Int32(private val value: Int) extends Liftable {
    def toInt = value
    def +(other: Int32) = Int32(value + other.value)
    def -(other: Int32) = Int32(value - other.value)
    def *(other: Int32) = Int32(value * other.value)
    def /(other: Int32) = Int32(value / other.value)
    override def toString = value.toString
  }
  
  /** Represents the Mininess type int16_t */
  class Int16(private val value: Short) extends Int32(value) {
    def toShort = value
    def +(other: Int16) = Int16((value + other.value).toShort)
    def -(other: Int16) = Int16((value - other.value).toShort)
    def *(other: Int16) = Int16((value * other.value).toShort)
    def /(other: Int16) = Int16((value / other.value).toShort)
    override def toString = value.toString
  }

  /** Represents the Mininess type int8_t */
  class Int8 (private val value: Byte) extends Int16(value) {
    def toByte = value
    def +(other: Int8 ) = Int8 ((value + other.value).toByte)
    def -(other: Int8 ) = Int8 ((value - other.value).toByte)
    def *(other: Int8 ) = Int8 ((value * other.value).toByte)
    def /(other: Int8 ) = Int8 ((value / other.value).toByte)
    override def toString = value.toString
  }
  
  object Int32 { def apply(value: Int  ) = new Int32(value) }
  object Int16 { def apply(value: Short) = new Int16(value) }
  object Int8  { def apply(value: Byte ) = new Int8 (value) }
}
