//-----------------------------------------------------------------------
// FILE    : TypeAbbr.scala
// SUBJECT : An annotation to hold type abbreviation information in a Scalaness program.
// AUTHOR  : (C) Copyright 2013 by Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import scala.annotation._

class TypeAbbr(value: Any) extends StaticAnnotation