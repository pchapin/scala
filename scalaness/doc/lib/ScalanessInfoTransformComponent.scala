//-----------------------------------------------------------------------
// FILE    : ScalanessInfoTransformComponent.scala
// SUBJECT : Place holder for an info transform component for the Scalaness plugin.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.vtc.scalaness

import scala.tools.nsc._
import scala.tools.nsc.plugins.PluginComponent
import scala.tools.nsc.transform.InfoTransform
// import scala.tools.nsc.transform.TypingTransformers

/**
 * This class implements a plugin component using tree transformers and InfoTransformer. An
 * InfoTransformer will be automatically created and registered in
 * <code>SymbolTable.infoTransformers</code>. If a <code>Typer</code> is needed during
 * transformation, the component should mix in <code>TypingTransformers</code>. This provides a
 * local variable <code>localTyper: Typer</code> that is always updated to the current context.
 */
class ScalanessInfoTransformComponent(val global: Global)
  extends PluginComponent with InfoTransform {

  import global._
  import global.definitions._

  val runsAfter = List[String]("refchecks")

  /**
   * The phase name of the compiler plugin.
   */
  val phaseName = "scalanessinfotransform"

  def transformInfo(sym: Symbol, tp: Type): Type = infoTransformer.mapOver(tp)

  def newTransformer(unit: CompilationUnit) = new ScalanessTransformer

  /**
   * The type transformation applied by this component. The trait InfoTransform will create an
   * instance of InfoTransformer applying this TypeMap. The type map will be applied when
   * computing a symbol's type in all phases <em>after</em> "scalanessinfotransform".
   */
  private val infoTransformer = new TypeMap {
    def apply(tp: Type): Type = tp match {
      case MethodType(pts, rt) =>
          // println("methodType (_, _, ..) => " + rt)
          tp
      case _ => mapOver(tp)
    }
  }

  /**
   * The tree transformer that implements the behavior of this component. Change the superclass
   * to <code>TypingTransformer</code> to make a local typechecker <code>localTyper</code>
   * available.
   */
  class ScalanessTransformer extends Transformer {
    /**
     * When using <code>preTransform</code>, each node is visited before its children.
     */
    def preTransform(tree: Tree): Tree = tree match {
      case ValDef(_, name, _, _) =>
        // println("pre-info-transforming valdef " + name)
        tree
      case _ => tree
    }

    /**
     * When using <code>postTransform</code>, each node is visited after its children.
     */
    def postTransform(tree: Tree): Tree = tree match {
      case _ => tree
    }

    override def transform(tree: Tree): Tree = {
      postTransform(super.transform(preTransform(tree)))
    }
  }
}
