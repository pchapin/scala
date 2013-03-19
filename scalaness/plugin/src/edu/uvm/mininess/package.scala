//-----------------------------------------------------------------------
// FILE    : package.scala
// SUBJECT : mininess package object.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm

package object mininess {

  object InterfaceDirectionality extends Enumeration {
    val USES, PROVIDES = Value
  }

  object CommandDirectionality extends Enumeration {
    val IMPORT, EXPORT = Value
  }  

}
