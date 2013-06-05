//-----------------------------------------------------------------------
// FILE    : KeyTriple
// SUBJECT : Object to be stored in KeyStorage.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu> && Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

/**
 * Wraps a key association in a serializable class.
 * @param association The wrapped association.
 */
case class KeyTriple(association: KeyAssociation) extends Serializable