//-----------------------------------------------------------------------
// FILE    : AuthorizationMessage.scala
// SUBJECT : A class that represents messages sent between instances of this program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import java.security.interfaces.ECPublicKey

@SerialVersionUID(1)
class AuthorizationMessage(val requestKey: ECPublicKey, val requestRole: String) extends Serializable
