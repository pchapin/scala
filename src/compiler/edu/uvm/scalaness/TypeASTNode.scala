//-----------------------------------------------------------------------
// FILE    : TypeASTNode.scala
// SUBJECT : Class representing nodes the Module type abstract syntax tree.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import edu.uvm.scalaness.parser.ModuleTypeLexer
import edu.uvm.mininess.MininessTypes._

/**
 * Class representing nodes in the AST of a nesT module type.
 */
sealed case class TypeASTNode(
  tokenType      : Int,               // Token identifier as defined by ANTLR
  val text       : String,            // The actual text of the token.
  val children   : List[TypeASTNode]) // The parent node or None for the root node.

  
/**
 * Companion object contains some service methods.  
 */
object TypeASTNode {
  
  private val typeNameConversion = Map(
      ModuleTypeLexer.VOID   -> Uninit,
      ModuleTypeLexer.INT8   -> Int8,
      ModuleTypeLexer.INT16  -> Int16,
      ModuleTypeLexer.INT32  -> Int32,
      ModuleTypeLexer.UINT8  -> UInt8,
      ModuleTypeLexer.UINT16 -> UInt16,
      ModuleTypeLexer.UINT32 -> UInt32,
      ModuleTypeLexer.ERRORT -> ErrorT)

  private def getGeneralizedTypeName(node: TypeASTNode) = {      
      if (node.tokenType == ModuleTypeLexer.IDENTIFIER)
        TypeVariable(node.text)
      else
        typeNameConversion(node.tokenType)
  }
  
  private def processCoercionList(nodes: List[TypeASTNode]): List[(TypeVariable, Representation)] = {
    for (node <- nodes) yield {
      val TypeASTNode(ModuleTypeLexer.SUBTYPE, _, children) = node
      (TypeVariable(children(0).text), typeNameConversion(children(1).tokenType))
    }
  }
  
  private def processType(typeNode: TypeASTNode): Representation = {
    typeNode.tokenType match {
      case ModuleTypeLexer.POINTER_TO =>
        Pointer(processType(typeNode.children(0)))
      case ModuleTypeLexer.ARRAY =>
        if (typeNode.children.length > 1)
          Array(processType(typeNode.children(0)), typeNode.children(1).text)
        else
          Array(processType(typeNode.children(0)), "")  // Array of unspecified size.
      case ModuleTypeLexer.STRUCTURE =>
        Structure(typeNode.children(0).text, processSimpleDeclarationList(typeNode.children.tail))
      case _ =>
        getGeneralizedTypeName(typeNode)
    }
  }
  
  private def processSimpleDeclarationList(nodes: List[TypeASTNode]): List[(String, Representation)] = {
    for (node <- nodes) yield {
      val TypeASTNode(ModuleTypeLexer.COLON, _, children) = node
      (children(0).text, processType(children(1)))
    }
  }

  private def processFunctionList(nodes: List[TypeASTNode]): List[(String, Representation)] = {
    for (node <- nodes) yield {
      val TypeASTNode(ModuleTypeLexer.FUNCTION_DECLARATION, _, children) = node
      val parameters = processSimpleDeclarationList(children.drop(2)) map { _._2 }
      (children(0).text, Function(processType(children(1)), parameters ))
    }
  }
  
  private def getExistentials(node: TypeASTNode) = {
    val TypeASTNode(ModuleTypeLexer.EXISTENTIAL_LIST, _, children) = node
    processCoercionList(children).toMap
  }
  
  private def getTypeParameters(node: TypeASTNode) = {
    val TypeASTNode(ModuleTypeLexer.TYPE_PARAMETER_LIST, _, children) = node
    processCoercionList(children)
  }
  
  private def getValueParameters(node: TypeASTNode) = {
    val TypeASTNode(ModuleTypeLexer.VALUE_PARAMETER_LIST, _, children) = node
    processSimpleDeclarationList(children)
  }
  
  private def getImports(node: TypeASTNode) = {
    val TypeASTNode(ModuleTypeLexer.IMPORT_LIST, _, children) = node
    processFunctionList(children)
  }
  
  private def getExports(node: TypeASTNode) = {
    val TypeASTNode(ModuleTypeLexer.EXPORT_LIST, _, children) = node
    processFunctionList(children)
  }
  
  /**
   * Convert a parsed Mininess module type (from the ModuleType annotations) into the
   * appropriate internal representation for the rules to handle.
   */
  def toMininessModule(node: TypeASTNode): (Map[TypeVariable, Representation], Module) = {
    val TypeASTNode(ModuleTypeLexer.MODULE_TYPE, _, children) = node
    ( getExistentials(children(0)),
         Module(
             getTypeParameters (children(1)),
             getValueParameters(children(2)),
             getImports        (children(3)),
             getExports        (children(4))) )
  }
  
}
