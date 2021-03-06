//-----------------------------------------------------------------------
// FILE    : NameGenerator.scala
// SUBJECT : Object to generate temporary names for nesT code.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

object NameGenerator {
  var currentIndex = 0

  def get = {
    currentIndex = currentIndex + 1
    "_sc_" + currentIndex
  }

}
