//-----------------------------------------------------------------------
// FILE    : Specialize.scala
// SUBJECT : Module that does the heavy lifting of specializing nesT code.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
package edu.uvm.scalaness.runtime

import edu.uvm.nest.ASTNode
import edu.uvm.nest.parser.NesTLexer

/**
 * Module that does the heavy lifting of specializing nesT code.
 */
object Specialize {
  
  /**
   * Replace occurrences of an identifier with its value.
   * 
   * @param node The root of the AST over which to make the replacement.
   * @param identifier The identifier to replace.
   * @param value The value to use in place of the identifier.
   */
  def editor[A](
    node      : ASTNode,
    identifier: String,
    value     : A): ASTNode = {
    
    // TODO: The editor should respect scopes but it currently does not.
    
    node match {
      // Check raw identifiers.
      case ASTNode(NesTLexer.RAW_IDENTIFIER, text, children, parent, symbolTable) =>
        if (identifier == text)
          ASTNode(NesTLexer.RAW_IDENTIFIER, value.toString, children, parent, symbolTable)
        else
          node
        
      // Recursively process all other node types.
      case ASTNode(token, text, children, parent, symbolTable) =>
        val newChildren = children map { child => editor(child, identifier, value) }
        ASTNode(token, text, newChildren, parent, symbolTable)
    }
  }

}
