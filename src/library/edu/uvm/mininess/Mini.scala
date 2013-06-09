//-----------------------------------------------------------------------
// FILE    : Mini.scala
// SUBJECT : A DSL for manipulating Mininess AST nodes.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

class Mini(val node: ASTNode) {
  def this(tokenType: Int, text: String) = this(ASTNode(tokenType, text, List(), None, None))

  /**
   * Composes two Mini objects. For example A ~~> B mutates A and B so that B is added to A's
   * list of children.
   */
  def ~~>(child: Mini): Mini = {
    node.children = (node.children ::: List(child.node))
    child.node.parent = Some(this.node)
    child
  }
}

object Mini {
  def apply(node: ASTNode) = new Mini(node)
  def apply(tokenType: Int, text: String = "") = new Mini(tokenType, text)
}
