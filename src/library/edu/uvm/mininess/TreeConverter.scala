//-----------------------------------------------------------------------
// FILE    : TreeConverter.scala
// SUBJECT : Object to convert ANTLR CommonTrees into SyntaxTrees.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import org.antlr.runtime.CommonToken
import org.antlr.runtime.tree._
import parser.MininessLexer
import MininessLexer._

/**
 * This object has methods for handling abstract syntax tree conversions and other high level AST
 * preparations. Since Scala can only do pattern matching on "case classes" one service provided
 * by this object is conversion to/from the trees produced by ANTLR to instances of a suitably
 * defined case class (ASTNode). Some additional high level methods are also provided.
 */
object TreeConverter {

  /**
   * Convert an ANTLR-style abstract syntax tree into an ASTNode case class instance. Note that
   * some of the information contained inside the ANTLR produced tree is not preserved in the
   * case class instance. Currently that is information not needed.
   * 
   * @param t The ANTLR-style abstract syntax tree to be converted.
   * @return An ASTNode instance that represents the tree. The parent of the returned node is
   * None. The symbol tables attached to the returned node and its children are all None.
   */
  def ANTLRToScala(t: Tree): ASTNode = {
    var childList = List[ASTNode]()
    for (i <- 0 until t.getChildCount) {
      // I'm thinking there is probably a better way to do this.
      childList = childList ::: List(ANTLRToScala(t.getChild(i)))
    }    
    val newNode = ASTNode(t.getType, t.getText, childList, None, None)
    
    // The Scala compiler's source positioning is zero based. ANTLR uses one based positions for
    // line numbers and zero based positions for column numbers.
    // 
    newNode.line = t.getLine - 1
    newNode.positionInLine = t.getCharPositionInLine

    // Update the parent reference in each child to link that child to this parent.
    for (child <- childList) {
      child.parent = Some(newNode)
    }
    newNode
  }


  /**
   * Convert an ASTNode case class instance into an ANTLR-style abstract syntax tree. This is
   * done so the modified trees created by Scalaness can be passed back to Java for final output.
   * The ANTLR-style abstract syntax tree returned does not contain all the information about
   * tokens that would normally be present.
   * 
   * @param root The ASTNode instance to convert.
   * @return An ANTLR-style abstract syntax tree.
   */ 
  def scalaToANTLR(root: ASTNode): CommonTree = {

    def processChildren(tree: CommonTree, children: List[ASTNode]): CommonTree = {
      children foreach ( child => tree addChild processSubtree(child) )
      tree
    }


    def processSubtree(node: ASTNode): CommonTree = {
      node match {
        case ASTNode(myType, myText, myChildren, _, _) => {
          val freshToken = new CommonToken(myType, myText)
          val freshTree = new CommonTree(freshToken)
          processChildren(freshTree, myChildren)
        }
      }
    }

    processSubtree(root)
  }


  /**
   * Writes the abstract syntax tree to standard output. Each level of the tree is indented
   * relative to the level above it. This method is useful for debugging.
   *
   * @param root The root of the tree to dump.
   */
  def dumpAST(root: ASTNode) {
    var indentationLevel = 0

    def processSubtree(node: ASTNode) {
      for (i <- 0 until indentationLevel) print("  ")

      // Is there a better way to extract the components of a single ASTNode?
      node match {
        case ASTNode(tokenType, text, children, _, _) => {
          println(text + " (" + tokenType + ")")
          indentationLevel = indentationLevel + 1
          children map processSubtree
          indentationLevel = indentationLevel - 1
        }
      }
    }

    processSubtree(root)
  }
    
}
