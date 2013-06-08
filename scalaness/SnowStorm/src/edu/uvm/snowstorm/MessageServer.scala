//-----------------------------------------------------------------------
// FILE    : MessageServer.scala
// SUBJECT : Class that synchronizes messages sent to the console.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.snowstorm

import actors.Actor

class MessageServer extends Actor {

  def act() {

    var done = false
    while (!done) {
      receive {
        case message: String => println(message)
        case 'Die => done = true
      }
    }

  }

}
