//-----------------------------------------------------------------------
// FILE    : LiftableTypes.scala
// SUBJECT : Types that can be used in a Scalaness program to represent types in nesT.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

object LiftableTypes {
  
  /**
   * Marker trait so that types that can exist in the second stage are indicated as such.
   * Certain aspects of the runtime system are intended to process any possible nesT type,
   * but not types that are only known to Scala.
   */
  trait Liftable

  /** Represents the nesT type void */
  class Uninit extends Liftable

  // Note that case classes can't be used because "case-to-case" inheritance is buggy and
  // "unlikely to be fixed." Since I don't care about pattern matching I will introduce explicit
  // companion objects with an apply method. This simplifies the construction of primitive
  // values.
  
  // TODO: Is this a situation with Scala 2.10 value classes would be useful?

  /** Represents the nesT type char */
  class Char(private val value: scala.Char) extends Liftable {
    def toChar = value
    override def toString = value.toString
  }
  
  object Char { def apply(value: scala.Char) = new Char(value) }

  // There is a compile-time type safety problem with the unsigned types. Since Scala does not
  // have any unsigned types natively a signed type with sufficient range must be used as a
  // substitute. Thus expressions like UInt8(1000) can't be ruled out at compile time. Instead
  // the value is checked at run time. This is a form of overflow checking.
  // 
  // The signed types (below) don't have this problem because they can take advantage of Scala's
  // build in handling of types Byte, Short, and Int. However, no overflow checking is done for
  // these types during computations.

  /**
   * Exception thrown when an value is constructed with an overly large initializer.
   */
  class ValueOutOfRangeException(message: String) extends Exception(message)
  
  /** Represents the nesT type uint32_t */
  class UInt32(private[LiftableTypes] val value: Long) extends Liftable with Ordered[UInt32] {
    if (value < 0 || value > 4294967295L)
      throw new ValueOutOfRangeException("Invalid UInt32 constructed: " + value)
    
    def toLong = value
    def +(other: UInt32) = UInt32(value + other.value)
    def -(other: UInt32) = UInt32(value - other.value)
    def *(other: UInt32) = UInt32(value * other.value)
    def /(other: UInt32) = UInt32(value / other.value)
    override def toString = value.toString
    
    def compare(that: UInt32) = {
      if (this.value < that.value) -1
        else if (this.value == that.value) 0
          else 1
    }
  }
  
  class UInt32IsNumeric extends Numeric[UInt32] {
    def compare (x: UInt32, y: UInt32) = x compare y
    def fromInt (x: Int)               = UInt32(x)
    def minus   (x: UInt32, y: UInt32) = x - y
    def negate  (x: UInt32)            = UInt32(-x.value)
    def plus    (x: UInt32, y: UInt32) = x + y
    def times   (x: UInt32, y: UInt32) = x * y
    def toDouble(x: UInt32)            = x.value.toDouble
    def toFloat (x: UInt32)            = x.value.toFloat
    def toInt   (x: UInt32)            = x.value.toInt
    def toLong  (x: UInt32)            = x.value
  }
  
  object UInt32 {
    def apply(value: Long) = new UInt32(value)
    implicit val uint32Numeric = new UInt32IsNumeric
  }

  /** Represents the nesT type uint16_t */
  class UInt16(override private[LiftableTypes] val value: Long) extends UInt32(value) {
    if (value < 0 || value > 65535)
      throw new ValueOutOfRangeException("Invalid UInt16 constructed: " + value)

    def +(other: UInt16) = UInt16(value + other.value)
    def -(other: UInt16) = UInt16(value - other.value)
    def *(other: UInt16) = UInt16(value * other.value)
    def /(other: UInt16) = UInt16(value / other.value)
    override def toString = value.toString
    
    def compare(that: UInt16) = {
      if (this.value < that.value) -1
        else if (this.value == that.value) 0
          else 1
    }
  }
 
  class UInt16IsNumeric extends Numeric[UInt16] {
    def compare (x: UInt16, y: UInt16) = x compare y
    def fromInt (x: Int)               = UInt16(x)
    def minus   (x: UInt16, y: UInt16) = x - y
    def negate  (x: UInt16)            = UInt16(-x.value)
    def plus    (x: UInt16, y: UInt16) = x + y
    def times   (x: UInt16, y: UInt16) = x * y
    def toDouble(x: UInt16)            = x.value.toDouble
    def toFloat (x: UInt16)            = x.value.toFloat
    def toInt   (x: UInt16)            = x.value.toInt
    def toLong  (x: UInt16)            = x.value
  }
  
  object UInt16 {
    def apply(value: Long) = new UInt16(value)
    implicit val uint16Numeric = new UInt16IsNumeric
  }

  /** Represents the nesT type uint8_t */
  class UInt8 (override private[LiftableTypes] val value: Long) extends UInt16(value) {
    if (value < 0 || value > 255)
      throw new ValueOutOfRangeException("Invalid UInt8 constructed: " + value)

    def +(other: UInt8 ) = UInt8 (value + other.value)
    def -(other: UInt8 ) = UInt8 (value - other.value)
    def *(other: UInt8 ) = UInt8 (value * other.value)
    def /(other: UInt8 ) = UInt8 (value / other.value)
    override def toString = value.toString
    
    def compare(that: UInt8) = {
      if (this.value < that.value) -1
        else if (this.value == that.value) 0
          else 1
    }
  }

  class UInt8IsNumeric extends Numeric[UInt8] {
    def compare (x: UInt8, y: UInt8) = x compare y
    def fromInt (x: Int)               = UInt8(x)
    def minus   (x: UInt8, y: UInt8) = x - y
    def negate  (x: UInt8)            = UInt8(-x.value)
    def plus    (x: UInt8, y: UInt8) = x + y
    def times   (x: UInt8, y: UInt8) = x * y
    def toDouble(x: UInt8)            = x.value.toDouble
    def toFloat (x: UInt8)            = x.value.toFloat
    def toInt   (x: UInt8)            = x.value.toInt
    def toLong  (x: UInt8)            = x.value
  }
  
  object UInt8 {
    def apply(value: Long) = new UInt8 (value)
    implicit val uint8Numeric = new UInt8IsNumeric
  }
  
  
  /** Represents the nesT type int32_t */
  class Int32(private[LiftableTypes] val value: Int) extends Liftable with Ordered[Int32]{
    def toInt = value
    def +(other: Int32) = Int32(value + other.value)
    def -(other: Int32) = Int32(value - other.value)
    def *(other: Int32) = Int32(value * other.value)
    def /(other: Int32) = Int32(value / other.value)
    override def toString = value.toString
    
    def compare(that: Int32) = {
      if (this.value < that.value) -1
        else if (this.value == that.value) 0
          else 1
    }
  }
  
  class Int32IsNumeric extends Numeric[Int32] {
    def compare (x: Int32, y: Int32) = x compare y
    def fromInt (x: Int)             = Int32(x)
    def minus   (x: Int32, y: Int32) = x - y
    def negate  (x: Int32)           = Int32(-x.value)
    def plus    (x: Int32, y: Int32) = x + y
    def times   (x: Int32, y: Int32) = x * y
    def toDouble(x: Int32)            = x.value.toDouble
    def toFloat (x: Int32)            = x.value.toFloat
    def toInt   (x: Int32)            = x.value.toInt
    def toLong  (x: Int32)            = x.value
  }
  
  object Int32 {
    def apply(value: Int) = new Int32(value)
    implicit val int32Numeric = new Int32IsNumeric
  }

  /** Represents the nesT type int16_t */
  class Int16(override private[LiftableTypes] val value: Int) extends Int32(value) {
    if (value < -32768 || value > 32767)
      throw new ValueOutOfRangeException("Invalid Int16 constructed: " + value)

    def toShort = value
    def +(other: Int16) = Int16(value + other.value)
    def -(other: Int16) = Int16(value - other.value)
    def *(other: Int16) = Int16(value * other.value)
    def /(other: Int16) = Int16(value / other.value)
    override def toString = value.toString
    
    def compare(that: Int16) = {
      if (this.value < that.value) -1
        else if (this.value == that.value) 0
          else 1
    }
  }

  class Int16IsNumeric extends Numeric[Int16] {
    def compare (x: Int16, y: Int16) = x compare y
    def fromInt (x: Int)             = Int16(x)
    def minus   (x: Int16, y: Int16) = x - y
    def negate  (x: Int16)           = Int16(-x.value)
    def plus    (x: Int16, y: Int16) = x + y
    def times   (x: Int16, y: Int16) = x * y
    def toDouble(x: Int16)            = x.value.toDouble
    def toFloat (x: Int16)            = x.value.toFloat
    def toInt   (x: Int16)            = x.value.toInt
    def toLong  (x: Int16)            = x.value
  }
  
  object Int16 {
    def apply(value: Int) = new Int16(value)
    implicit val int16Numeric = new Int16IsNumeric
  }

  /** Represents the nesT type int8_t */
  class Int8(override private[LiftableTypes] val value: Int) extends Int16(value) {
    if (value < -128 || value > 127)
      throw new ValueOutOfRangeException("Invalid Int8 constructed: " + value)

    def toByte = value
    def +(other: Int8 ) = Int8(value + other.value)
    def -(other: Int8 ) = Int8(value - other.value)
    def *(other: Int8 ) = Int8(value * other.value)
    def /(other: Int8 ) = Int8(value / other.value)
    override def toString = value.toString

    def compare(that: Int8) = {
      if (this.value < that.value) -1
        else if (this.value == that.value) 0
          else 1
    }
  }
  
  class Int8IsNumeric extends Numeric[Int8] {
    def compare (x: Int8, y: Int8) = x compare y
    def fromInt (x: Int)           = Int8(x)
    def minus   (x: Int8, y: Int8) = x - y
    def negate  (x: Int8)          = Int8(-x.value)
    def plus    (x: Int8, y: Int8) = x + y
    def times   (x: Int8, y: Int8) = x * y
    def toDouble(x: Int8)            = x.value.toDouble
    def toFloat (x: Int8)            = x.value.toFloat
    def toInt   (x: Int8)            = x.value.toInt
    def toLong  (x: Int8)            = x.value
  }

  object Int8 {
    def apply(value: Int) = new Int8 (value)
    implicit val int8Numeric = new Int8IsNumeric
  }
}
