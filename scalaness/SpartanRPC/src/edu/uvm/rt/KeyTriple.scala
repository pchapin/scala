//-----------------------------------------------------------------------
// FILE    : KeyTriple
// SUBJECT : Object to be stored in KeyStorage.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu> && Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------

package edu.uvm.rt

import java.security.interfaces.{ECPublicKey, ECPrivateKey}

class KeyTriple(triple: KeyAssociation) extends Serializable{

  def getTriple(): KeyAssociation = {
    triple
  }
  
  
}