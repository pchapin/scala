//-----------------------------------------------------------------------
// FILE    : Specialize.scala
// SUBJECT : Module that does the heavy lifting of specializing Mininess code.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
package edu.uvm.scalaness

import edu.uvm.mininess.ASTNode
import edu.uvm.mininess.parser.MininessLexer

/**
 * Module that does the heavy lifting of specializing Mininess code.
 */
object Specialize {
  
  /**
   * Replace occurrences of an identifier with its value. This editor does a simple in-place
   * substitution. Values of array type are ignored (the given node is returned at once). The
   * specialization of arrays can't be done by way of a simple substitution.
   * 
   * @param node The root of the AST over which to make the replacement.
   * @param identifier The identifier to replace.
   * @param value The value to use in place of the identifier.
   */
  def substitutionEditor[A](
    node      : ASTNode,
    identifier: String,
    value     : A): ASTNode = {
    
    // TODO: The substitution editor should respect scopes but it currently does not.
    // TODO: If 'A' is an array type, just return at once with node (no substitution).

    def isNumeric(value: A) = {
      val textRepresentation = value.toString
      textRepresentation.forall( ch => (ch >= '0' && ch <= '9') )
    }
    
    node match {
      // Check raw identifiers.
      case ASTNode(MininessLexer.RAW_IDENTIFIER, text, children, parent, symbolTable) =>
        if (identifier != text)
          node
        else {
          if (isNumeric(value))
            ASTNode(MininessLexer.CONSTANT, value.toString, children, parent, symbolTable)
          else
            ASTNode(MininessLexer.RAW_IDENTIFIER, value.toString, children, parent, symbolTable)
        }
        
      // Recursively process all other node types.
      case ASTNode(token, text, children, parent, symbolTable) =>
        val newChildren = children map { child => substitutionEditor(child, identifier, value) }
        val newNode = ASTNode(token, text, newChildren, parent, symbolTable)
        for (child <- newChildren) {
          child.parent = Some(newNode)
        }
        newNode.line = node.line
        newNode.positionInLine = node.positionInLine
        newNode
    }
  }

  /**
   * For values with Array type, this editor adds a global declaration of the array to the AST.
   * No other changes are done. For values with some other type, the given node is returned at
   * once.
   * 
   * @param node The root of the AST over which to make the replacement.
   * @param identifier The identifier that will name the array.
   * @param value The value to use in the array's initialization.
   */
  def arrayEditor[A](
    node      : ASTNode,
    identifier: String,
    value     : A): ASTNode = {

    node
  }
}
