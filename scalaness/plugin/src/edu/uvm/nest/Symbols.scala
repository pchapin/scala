//-----------------------------------------------------------------------
// FILE    : Symbols.scala
// SUBJECT : Class representing a symbol table in a single scope.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import parser.NesTLexer

/**
 * Class to store symbol information for symbols declared in the same scope.
 */
case class Symbols(
  structureNames: Map[String, NesTTypes.Representation],
  typeNames     : Map[String, NesTTypes.Representation],
  variableNames : Map[String, NesTTypes.Representation]
)

object Symbols {
  
  /**
   * Exception thrown when a symbol is redefined in the same scope.
   */
  class SymbolRedefinitionException(message: String) extends Exception(message)
  
  /**
   * Look in the symbol table of the current node and its parents for the type associated with a variable name. This
   * method returns NesTTypes.Uninit in cases where the symbol is not found. Are those cases ruled out by the parser?
   * Should an exception be thrown instead?
   * 
   * @param node The ASTNode where the search begins.
   * 
   * @param name The name of the variable to locate.
   * 
   * @return The type representation of the specified variable. If the variable is not declared in the scope of the
   *         given node, the parent scope will be searched recursively to the top level. If the symbol is not found
   *         NesTTypes.Uninit is returned.
   */
  def lookupVariable(node: ASTNode, name: String): NesTTypes.Representation = {
    val ASTNode(_, _, _, parent, symbols) = node
    
    (parent, symbols) match {
      // No symbols and nowhere else to search.
      case (None, None) => NesTTypes.Uninit
        
      // We are at the top level symbol table. If it's not here there is nowhere else to search.
      case (None, Some(symbolTable)) =>
        symbolTable.variableNames.get(name) match {
          case None               => NesTTypes.Uninit
          case Some(variableType) => variableType
        }
        
      // No scope defined for this node. Search parent.
      case (Some(parentNode), None) => lookupVariable(parentNode, name)
        
      // Search this node and then search the parent if symbol is not found here.
      case (Some(parentNode), Some(symbolTable)) =>
         symbolTable.variableNames.get(name) match {
          case None               => lookupVariable(parentNode, name)
          case Some(variableType) => variableType
        }       
    }
  }
  
  def lookupTypeVariable(node: ASTNode, name: String): NesTTypes.Representation = {
    val ASTNode(_, _, _, parent, symbols) = node
    
    (parent, symbols) match {
      // No symbols and nowhere else to search.
      case (None, None) => NesTTypes.Uninit
        
      // We are at the top level symbol table. If it's not here there is nowhere else to search.
      case (None, Some(symbolTable)) =>
        symbolTable.typeNames.get(name) match {
          case None               => NesTTypes.Uninit
          case Some(typeName) => typeName
        }
        
      // No scope defined for this node. Search parent.
      case (Some(parentNode), None) => lookupTypeVariable(parentNode, name)
        
      // Search this node and then search the parent if symbol is not found here.
      case (Some(parentNode), Some(symbolTable)) =>
         symbolTable.typeNames.get(name) match {
          case None               => lookupTypeVariable(parentNode, name)
          case Some(typeName) => typeName
        }       
    }
  }
  
  def lookupStructVariable(node: ASTNode, name: String): NesTTypes.Representation = {
    val ASTNode(_, _, _, parent, symbols) = node
    
    (parent, symbols) match {
      // No symbols and nowhere else to search.
      case (None, None) => NesTTypes.Uninit
        
      // We are at the top level symbol table. If it's not here there is nowhere else to search.
      case (None, Some(symbolTable)) =>
        symbolTable.structureNames.get(name) match {
          case None               => NesTTypes.Uninit
          case Some(structureName) => structureName
        }
        
      // No scope defined for this node. Search parent.
      case (Some(parentNode), None) => lookupStructVariable(parentNode, name)
        
      // Search this node and then search the parent if symbol is not found here.
      case (Some(parentNode), Some(symbolTable)) =>
         symbolTable.structureNames.get(name) match {
          case None               => lookupStructVariable(parentNode, name)
          case Some(structureName) => structureName
        }       
    }
  }
  
  /**
   * Process all declarations in a given AST and create appropriate symbol tables for them. This method has side
   * effects. When it returns the AST rooted at the given node will have symbol table information installed related to
   * the declarations embedded in the AST.
   * 
   * @param node The AST to be decorated.
   */
  def decorateAST(node: ASTNode) {
    node match {
      case ASTNode(NesTLexer.DECLARATION, text, children, parent, symbolTable) =>
        val (structList, symbolList) = Declarations.extractDeclaredNames(node)
        val symbolMap = symbolList.toMap
        val structMap = structList.toMap
         
        // The following assumes the source file was syntactically correct.
        val Some(firstNode) = parent
        val Some(parentNode) =
          if (firstNode.tokenType == NesTLexer.NULL) {
            val Some(nullNode) = parent
            nullNode.parent
          }
          else {
            parent
          }
        val targetNode =
          if (parentNode.tokenType == NesTLexer.USES ||
              parentNode.tokenType == NesTLexer.PROVIDES) {
            val Some(specificationNode) = parentNode.parent
            val Some(moduleNode) = specificationNode.parent
            moduleNode
          }
          else {
            parentNode
          }
        
        targetNode.symbolTable match {
          case None =>
            targetNode.symbolTable = Some(
              Symbols(Map[String, NesTTypes.Representation](), Map[String, NesTTypes.Representation](), symbolMap) )
          case Some( Symbols(structSymbols, typeSymbols, termSymbols) ) =>
            // Do any of the declared symbols redefine an existing symbol in this scope?
            for ((symbolName, symbolType) <- symbolMap) {
              if (termSymbols.exists( existingSymbolInfo => existingSymbolInfo._1 == symbolName)) {
                throw new SymbolRedefinitionException("bSymbol " + symbolName + "already declared")
              }
            }
            
            // All incoming symbols are unique. Add them to the symbol table.
            targetNode.symbolTable = Some(
              Symbols(structSymbols, typeSymbols, termSymbols ++ symbolMap))
        }
        // Repeat this logic again for StructMap
        targetNode.symbolTable match {
          case None =>
            targetNode.symbolTable = Some(
              Symbols(structMap, Map[String, NesTTypes.Representation](), Map[String, NesTTypes.Representation]()) )
          case Some( Symbols(structSymbols, typeSymbols, termSymbols) ) =>
            // Do any of the declared symbols redefine an existing symbol in this scope?
            for ((structName, structType) <- structMap) {
              if (structSymbols.exists( existingSymbolInfo => existingSymbolInfo._1 == structName)) {
                throw new SymbolRedefinitionException("cSymbol " + structName + "already declared")
              }
            }
            
            // All incoming symbols are unique. Add them to the symbol table.
            targetNode.symbolTable = Some(
              Symbols(structSymbols ++ structMap, typeSymbols, termSymbols)) // Add Structure Stuff here
        }
        for (child <- children) decorateAST(child)
       
      case ASTNode(NesTLexer.PARAMETER, text, children, parent, symbolTable) =>
        val (structList, symbolList) = Declarations.extractDeclaredNames(node)
        val symbolMap = symbolList.toMap
        val structMap = structList.toMap
        
        val Some(parameterListNode) = parent
        val Some(dplmNode) = parameterListNode.parent
        val Some(declaratorNode) = dplmNode.parent
        val Some(functionDefNode) = declaratorNode.parent
        val targetNode = functionDefNode
        
        targetNode.symbolTable match {
          case None =>
            targetNode.symbolTable = Some(
              Symbols(structMap, Map[String, NesTTypes.Representation](), symbolMap) )
          case Some( Symbols(structSymbols, typeSymbols, termSymbols) ) =>
            // Do any of the declared symbols redefine an existing symbol in this scope?
            for ((symbolName, symbolType) <- symbolMap) {
              if (termSymbols.exists( existingSymbolInfo => existingSymbolInfo._1 == symbolName)) {
                throw new SymbolRedefinitionException("dSymbol " + symbolName + "already declared")
              }
            }
            
            // All incoming symbols are unique. Add them to the symbol table.
            targetNode.symbolTable = Some(
              Symbols(structSymbols, typeSymbols, termSymbols ++ symbolMap))
        }
        for (child <- children) decorateAST(child)
        
      case ASTNode(_, _, children, _, _) =>
        for (child <- children) decorateAST(child)
    }
  }
  
}
