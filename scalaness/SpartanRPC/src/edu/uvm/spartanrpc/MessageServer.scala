//-----------------------------------------------------------------------
// FILE    : MessageServer.scala
// SUBJECT : Class that synchronizes messages sent to the console.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.spartanrpc

import akka.actor.Actor

class MessageServer extends Actor {

  def receive = {
    case message: String => println(message)
  }

}
