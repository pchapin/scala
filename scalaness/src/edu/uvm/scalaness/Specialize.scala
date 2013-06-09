//-----------------------------------------------------------------------
// FILE    : Specialize.scala
// SUBJECT : Module that does the heavy lifting of specializing Mininess code.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//------------------------------------------------------------------------
package edu.uvm.scalaness

import reflect.runtime.universe._
import edu.uvm.mininess.ASTNode
import edu.uvm.mininess.Mini
import edu.uvm.mininess.parser.MininessLexer._

/**
 * Module that does the heavy lifting of specializing Mininess code.
 */
object Specialize {

  val primitiveMap = Map(
    "Int8"   -> ASTNode(INT8_T  , "int8_t"  , List(), None, None),
    "Int16"  -> ASTNode(INT16_T , "int16_t" , List(), None, None),
    "Int32"  -> ASTNode(INT32_T , "int32_t" , List(), None, None),
    "UInt8"  -> ASTNode(UINT8_T , "uint8_t" , List(), None, None),
    "UInt16" -> ASTNode(UINT16_T, "uint16_t", List(), None, None),
    "UInt32" -> ASTNode(UINT32_T, "uint32_t", List(), None, None))


  /**
   * Returns true if the given type is an array type. This method is very hackish. Can
   * reflection be used to improve this? See the ReflectionTest program in the notes folder.
   * Strangely that code behaves differently when used here.
   */
  private def isArray(item: Any) = {
    // TODO: Improve this method so that it detects array types properly.
    val className = item.getClass.toString
    className.contains("class [L")

    // val mirror = runtimeMirror(this.getClass.getClassLoader)
    // val typeName = mirror.classSymbol(item.getClass).toType.toString
    // typeName.contains("Array")
  }


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

    def isNumeric(value: A) = {
      val textRepresentation = value.toString
      textRepresentation.forall( ch => (ch >= '0' && ch <= '9') )
    }

    // Really this test is only needed on the first invocation that calls the recursive method.
    if (isArray(value))
      node
    else {
      node match {
        // Check raw identifiers.
        case ASTNode(RAW_IDENTIFIER, text, children, parent, symbolTable) =>
          if (identifier != text)
            node
          else {
            if (isNumeric(value))
              ASTNode(CONSTANT, value.toString, children, parent, symbolTable)
            else
              ASTNode(RAW_IDENTIFIER, value.toString, children, parent, symbolTable)
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

    def getElementTypeNode(arrayValue: Array[Any]) = {
      val className = arrayValue.getClass.toString
      val dollarIndex = className.lastIndexOf('$')
      val elementTypeName = className.substring(dollarIndex + 1, className.length - 1)
      primitiveMap(elementTypeName)
    }

    // Really this test is only needed on the first invocation that calls the recursive method.
    if (!isArray(value))
      node
    else {
      node match {

        // Stop the recursion. What I'm looking for will never be beneath SPECIFICATION.
        case ASTNode(SPECIFICATION, _, _, _, _) =>
          node

        // Create a suitable initialized declaration for the array.
        case ASTNode(IMPLEMENTATION, text, children, parent, symbolTable) =>
          val arrayValue = value.asInstanceOf[Array[Any]]

          val declarator = Mini(DECLARATOR, "DECLARATOR")
          declarator ~~>
            Mini(IDENTIFIER_PATH, "IDENTIFIER_PATH") ~~>
              Mini(RAW_IDENTIFIER, identifier)
          declarator ~~>
            Mini(DECLARATOR_ARRAY_MODIFIER, "DECLARATOR_ARRAY_MODIFIER") ~~>
              Mini(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION") ~~>
                Mini(CONSTANT, arrayValue.length.toString)

          val initializerList = Mini(INITIALIZER_LIST, "INITIALIZER_LIST")
          for (item <- arrayValue) {
            initializerList ~~>
              Mini(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION") ~~>
                Mini(CONSTANT, item.toString)
          }

          val initDeclarator = Mini(INIT_DECLARATOR, "INIT_DECLARATOR")
          initDeclarator ~~>
            declarator
          initDeclarator ~~>
            initializerList

          val declarationNode = Mini(DECLARATION, "DECLARATION")
          declarationNode ~~> Mini(getElementTypeNode(arrayValue))
          declarationNode ~~>
            Mini(DECLARATOR_LIST, "DECLARATOR_LIST") ~~>
              initDeclarator

          declarationNode.node.parent = Some(node)
          node.children = declarationNode.node :: node.children
          node

        // Recursively process all other node types.
        case ASTNode(token, text, children, parent, symbolTable) =>
          val newChildren = children map { child => arrayEditor(child, identifier, value) }
          val newNode = ASTNode(token, text, newChildren, parent, symbolTable)
          for (child <- newChildren) {
            child.parent = Some(newNode)
          }
          newNode.line = node.line
          newNode.positionInLine = node.positionInLine
          newNode
      }
    }
  }

}
