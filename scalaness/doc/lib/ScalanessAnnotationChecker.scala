//-----------------------------------------------------------------------
// FILE    : ScalanessAnnotationChecker.scala
// SUBJECT : Place holder annotation checker for the Scalaness plugin.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.vtc.scalaness

import scala.tools.nsc.Global

abstract class ScalanessAnnotationChecker {
  val global: Global
  import global._

  object checker extends AnnotationChecker {
    def annotationsConform(tpe1: Type, tpe2: Type): Boolean = {
      // println("checking: "+ tpe1 +" <: "+ tpe2)
      true
    }

    override def addAnnotations(tree: Tree, tpe: Type): Type = {
      // println("adding annotation to "+ tree.symbol)
      tpe
    }
  }
}
