//-----------------------------------------------------------------------
// FILE    : ModuleType.scala
// SUBJECT : An annotation to hold nesT module type information in a Scalaness program.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import scala.annotation._

class ModuleType(value: String) extends ClassfileAnnotation
