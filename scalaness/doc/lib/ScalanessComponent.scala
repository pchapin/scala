//-----------------------------------------------------------------------
// FILE    : ScalanessComponent.scala
// SUBJECT : Place holder for a general plugin component for the Scalaness plugin.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.vtc.scalaness

import scala.tools.nsc._
import scala.tools.nsc.plugins.PluginComponent

/**
 * This class shows how to implement a compiler component that can be used in a compiler plugin.
 * If the plugin uses a tree transformer and / or an InfoTransformer, look at the two classes
 * <code>ScalanessTransformComponent</code> and <code>ScalanessInfoTransformComponent</code>.
 */
class ScalanessComponent(val global: Global) extends PluginComponent {
  import global._

  val runsAfter = List[String]("refchecks")

  /**
   * The name of this plugin phase
   */
  val phaseName = "scalaness"

  def newPhase(prev: Phase) = new Phase(prev) {
    def name = phaseName

    /**
     * The implementation of this Phase's behavior
     */
    def run {
      // println("Hello from phase " + name)
    }
  }
}
