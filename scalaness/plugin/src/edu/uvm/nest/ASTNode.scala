//-----------------------------------------------------------------------
// FILE    : ASTNode.scala
// SUBJECT : Class representing nodes the nesT abstract syntax tree.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

/**
 * Class representing nodes in the AST of a nesT program. Either the field children or the field parent must be a
 * var so that mutually referential ASTNode instances can be built.
 */
sealed case class ASTNode(
  tokenType      : Int,             // Token identifier as defined by ANTLR
  var text           : String,          // The actual text of the token.
  var children   : List[ASTNode],   // The child nodes in the AST.
  var parent     : Option[ASTNode], // The parent node or None for the root node.
  var symbolTable: Option[Symbols]) // The symbol table associated with this node, if any.
{
  // I don't really want to match on these and the class's parameter list is already too long. Thus I'm making these
  // class members. They need to be vars so they can be set during tree conversion. They should never be modified after
  // that, however.
  // 
  var line = 0
  var positionInLine = 0
}
