//-----------------------------------------------------------------------
// FILE    : ScalanessException.scala
// SUBJECT : A superclass for all exceptions produced by the Scalaness compiler proper.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

/**
 * Superclass of all exceptions raised by the Scalaness plugin itself. Additional exception
 * types are defined by the Mininess handling code and by the ANTLR parser.
 *
 * @param message The message associated with the exception.
 */
class ScalanessException(message: String) extends Exception(message)
