//-----------------------------------------------------------------------
// FILE    : TypeASTNode.scala
// SUBJECT : Class representing nodes the Module type abstract syntax tree.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

/**
 * Class representing nodes in the AST of a nesT module type.
 */
sealed case class TypeASTNode(
  tokenType      : Int,               // Token identifier as defined by ANTLR
  val text       : String,            // The actual text of the token.
  val children   : List[TypeASTNode]) // The parent node or None for the root node.
