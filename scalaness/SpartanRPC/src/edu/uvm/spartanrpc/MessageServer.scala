//-----------------------------------------------------------------------
// FILE    : MessageServer.scala
// SUBJECT : Class that synchronizes messages sent to the console.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import actors.Actor

object MessageServer extends Actor {

  def act() {
    while (true) {
      receive {
        case message: String => println(message)
      }
    }
  }
}
