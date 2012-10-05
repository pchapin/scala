//-----------------------------------------------------------------------
// FILE    : CommandInformation.scala
// SUBJECT : Wrapper for information about individual commands in an interface.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

case class CommandInformation(
  directionality    : CommandDirectionality.Value,
  name              : String,
  commandDeclaration: ASTNode)
