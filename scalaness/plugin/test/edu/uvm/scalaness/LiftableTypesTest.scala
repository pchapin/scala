//-----------------------------------------------------------------------
// FILE    : LiftableTypesTest.scala
// SUBJECT : Tests exercising the Scalaness side of Liftable types.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import org.junit.Assert._
import org.junit.{After, Before, Test}

class LiftableTypesTest {
  import LiftableTypes._

  @Test
  def testPrimitiveIntegers() {
    val ux: UInt8  = UInt8 (1) + UInt8 (2)
    val uy: UInt16 = UInt8 (1) + UInt8 (2)
    val uz: UInt32 = UInt16(1) + UInt16(2)
    
    val ix: Int8  = Int8 (-1) + Int8 (2)
    val iy: Int16 = Int8 (-1) + Int8 (2)
    val iz: Int32 = Int16(-1) + Int16(2)

    assertEquals(ux.toLong, 3)
    assertEquals(uy.toLong, 3)
    assertEquals(uz.toLong, 3)

    assertEquals(ix.toInt, 1)
    assertEquals(iy.toInt, 1)
    assertEquals(iz.toInt, 1)
  }

}
