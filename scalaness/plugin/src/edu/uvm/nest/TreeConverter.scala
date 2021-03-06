//-----------------------------------------------------------------------
// FILE    : TreeConverter.scala
// SUBJECT : Object to convert ANTLR CommonTrees into SyntaxTrees.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import org.antlr.runtime.CommonToken
import org.antlr.runtime.tree._
import parser.NesTLexer

/**
 * This object has methods for handling abstract syntax tree conversions and other high level AST preparations. Since
 * Scala can only do pattern matching on "case classes" one service provided by this object is conversion to/from the
 * trees produced by ANTLR to instances of a suitably defined case class (ASTNode). Some additional high level methods
 * are also provided.
 */
object TreeConverter {

  /**
   * Convert an ANTLR-style abstract syntax tree into an ASTNode case class instance. Note that some of the information
   * contained inside the ANTLR produced tree is not preserved in the case class instance. Currently that is information
   * not needed.
   * 
   * @param t The ANTLR-style abstract syntax tree to be converted.
   * @return An ASTNode instance that represents the tree. The parent of the returned node is None. The symbol tables
   *         attached to the returned node and its children are all None.
   */
  def ANTLRToScala(t: Tree): ASTNode = {
    var childList = List[ASTNode]()
    for (i <- 0 until t.getChildCount) {
      // I'm thinking there is probably a better way to do this.
      childList = childList ::: List(ANTLRToScala(t.getChild(i)))
    }    
    val newNode = ASTNode(t.getType, t.getText, childList, None, None)
    
    // The Scala compiler's source positioning is zero based. ANTLR uses one based positions for line numbers and zero
    // based positions for column numbers.
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
   * Convert an ASTNode case class instance into an ANTLR-style abstract syntax tree. This is done so the modified trees
   * created by Scalaness can be passed back to Java for final output. The ANTLR-style abstract syntax tree returned
   * does not contain all the information about tokens that would normally be present.
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
   * Writes the abstract syntax tree to standard output. Each level of the tree is indented relative to the level above
   * it. This method is useful for debugging.
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
  
  
  /**
   * Writes the abstract syntax tree to the indicated PrintStream as serialized nesC source code. This method is used
   * during the output of the specialized nesC templates.
   * 
   * @param out The object where the source will be written.
   * @param root The root of the tree to dump.
   */
  def dumpNesCSource(out: java.io.PrintStream, root: ASTNode) {
    val abstractViewer = new SyntaxViewer(out, root)
    abstractViewer.rewrite()
  }


  /**
   * Processes a nesT AST and replaces cast operations with calls to an appropriate conversion command.
   *
   * @param root The root of the AST to process.
   * @return A new AST with all cast operations replaced.
   */
  def replaceCastOperations(root: ASTNode): ASTNode = {
   // if (root.parent == None) dumpAST(root)
    root match {
      
      case ASTNode(NesTLexer.CAST, text, children, parent, symbolTable) => {

        // Here we look up the cast target's type and the cast type and build a method string based on these names
        // This method name format is up to us how we want the programmer to provide it, so it can change if neccessary
        val castTarget = children(0).children(0).text
        val isStructCast = if (children(1).text == "struct") 
                             true 
                           else 
                             false
                           
        val castType = if (isStructCast) 
                         children(1).children(0).text
                       else
                         children(1).text
        val valueType = Symbols.lookupVariable(root,castTarget)
        val valTypeString = valueType match {
          case NesTTypes.Structure(structName,structFields) => structName
          case typeName => typeName
        }
        val castMethodString = valTypeString+"_"+castType
        
        
        val newNode = ASTNode(NesTLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), parent, symbolTable)
        val newNode2 = ASTNode(NesTLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(newNode), symbolTable)
        newNode.children = List(newNode2)
        val callNode = ASTNode(NesTLexer.CALL, "call", List(), Some(newNode2), symbolTable)
        val functionNode = ASTNode(NesTLexer.RAW_IDENTIFIER, castMethodString, List(), Some(newNode2), symbolTable)
        val argListNode = ASTNode(NesTLexer.ARGUMENT_LIST, "ARGUMENT_LIST", List(), Some(newNode2), symbolTable)
        newNode2.children = List(callNode, functionNode, argListNode)
        val newNode3 = ASTNode(NesTLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(argListNode), symbolTable)
        argListNode.children = List(newNode3)
        val argumentNode = ASTNode(NesTLexer.RAW_IDENTIFIER, castTarget, List(), Some(newNode3), symbolTable)
        newNode3.children = List(argumentNode)
        val parentNode = parent match {
          case Some(ptNode) => ptNode
          case _ => throw new Exception("Unable to locate parent node")
        }
        
        parentNode.children = List(newNode)
     
        newNode
      }
    
      case ASTNode(tokenType, text, children, parent, symbolTable) => {
        val newChildren = children map replaceCastOperations
        val newNode = ASTNode(tokenType, text, newChildren, parent, symbolTable)
        for (child <- newChildren) {
          child.parent = Some(newNode)
        }
        newNode.line = root.line
        newNode.positionInLine = root.positionInLine
        newNode
      }
    }
    root
  }


  /**
   * Processes a Mininess AST and adds runtime array bounds checks were necessary.
   *
   * @param root The root of the AST to process.
   * @return A new AST with all the checks added.
   */
  def addArrayBoundsChecks(root: ASTNode): ASTNode = {
    // if (root.parent == None) dumpAST(root)

    root match {
      
      case ASTNode(NesTLexer.ARRAY_ELEMENT_SELECTION, text, children, parent, symbolTable) => {
        
        val access = 5
        val parentNode = parent match {
          case Some(pNode) => pNode
          case None => root // Should throw an error
        }
        val arrayNode = parentNode.children(0)
        val arrayPFENode = root.children(0)
        val accessNode = arrayPFENode.children(0)
        val isIdentifier = accessNode.tokenType match {
          case NesTLexer.RAW_IDENTIFIER => true
          case _ => false
        }
        val arrayName = arrayNode.text
        val arrayType = Symbols.lookupVariable(root,arrayName)
        val arraySize = arrayType match {
          case NesTTypes.Array(_, aSize) => aSize
          case _ => throw new Exception("Unable to locate array size")
        }
        val isConstant = try {
                           val test = arraySize.toInt
                           true
                         } catch { 
                           case e: Exception => false
                         }
        
        val arrayStatementNode = getStatementNode(root)
        val (firstHalf,secondHalf) = getTwoNumbers(arrayStatementNode)
        // This will be where we pass in the arrayStatementNode, get its parent, split its parents children into two lists (with it heading the second list)
        // and return two lists.  The two lists then can later be merged together with the inclusion of the constructed if statement between them
                
        val statementParentNode = arrayStatementNode.parent match {
          case Some(pNode) => pNode
          case _           => throw new Exception("Unable to locate parent node")
        }
        
        val ifNode = ASTNode(NesTLexer.IF, "if", List(), Some(statementParentNode), symbolTable)
        val LENode = ASTNode(NesTLexer.GREATEREQUAL, ">=", List(), Some(ifNode), symbolTable)
        val newNode = ASTNode(NesTLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(LENode), symbolTable)
        val newNode2 = ASTNode(NesTLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(LENode), symbolTable)
        LENode.children = List(newNode, newNode2)
        if (isIdentifier) {
          val accessorNode = ASTNode(NesTLexer.RAW_IDENTIFIER, accessNode.text, List(), Some(newNode), symbolTable)
          newNode.children = List(accessorNode)
        } else {
          val accessorNode = ASTNode(NesTLexer.CONSTANT, accessNode.text, List(), Some(newNode), symbolTable)
          newNode.children = List(accessorNode)
        }
        if (isConstant) {
          val sizeNode = ASTNode(NesTLexer.CONSTANT, arraySize, List(), Some(newNode2), symbolTable)
          newNode2.children = List(sizeNode)
        } else {
          val sizeType = Symbols.lookupVariable(root, arraySize)
          if (!(NesTTypes.areSubtypes(sizeType, NesTTypes.Int32) || 
                NesTTypes.areSubtypes(sizeType, NesTTypes.UInt32)))
            throw new Exception("Array size must be integer type")
          val sizeNode = ASTNode(NesTLexer.RAW_IDENTIFIER, arraySize, List(), Some(newNode2), symbolTable)
          newNode2.children = List(sizeNode)
        }
        val statementNode = ASTNode(NesTLexer.STATEMENT, "STATEMENT", List(), Some(ifNode), symbolTable)
        val statementPFENode = ASTNode(NesTLexer.POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(statementNode), symbolTable)
        statementNode.children = List(statementPFENode)
        val callNode = ASTNode(NesTLexer.CALL, "call", List(), Some(statementPFENode), symbolTable)
        val functionNode = ASTNode(NesTLexer.RAW_IDENTIFIER, "restartNode", List(), Some(statementPFENode), symbolTable)
        val argListNode = ASTNode(NesTLexer.ARGUMENT_LIST, "ARGUMENT_LIST", List(), Some(statementPFENode), symbolTable)
        statementPFENode.children = List(callNode, functionNode, argListNode)
        ifNode.children = List(LENode, statementNode)
        val newSecondHalf = ifNode::secondHalf
        val newChildren = firstHalf:::newSecondHalf
        statementParentNode.children = newChildren
        root
      }
    
      case ASTNode(tokenType, text, children, parent, symbolTable) => {
        val newChildren = children map addArrayBoundsChecks
        val newNode = ASTNode(tokenType, text, newChildren, parent, symbolTable)
        for (child <- newChildren) {
          child.parent = Some(newNode)
        }
        newNode.line = root.line
        newNode.positionInLine = root.positionInLine
        newNode
      }
    }
    
    def getStatementNode(node: ASTNode): ASTNode = {
    
      val parentNode = node.parent match {
        case Some(pNode) => pNode
        case _           => throw new Exception("Unable to locate parent node")
      }
      
      val statementNode = node match {
        case ASTNode(NesTLexer.DECLARATION,_,_,_,_) => node
        case ASTNode(NesTLexer.STATEMENT,_,_,_,_)       => node
        case ASTNode(NesTLexer.RETURN,_,_,_,_)          => node
        case ASTNode(_,_,_,_,_)                         => getStatementNode(parentNode)
        case _ => throw new Exception("Unable to locate parent node")
      }
      statementNode
    }
    
    // Test to see how returning a pair works, we need to pass it an ASTNode, grab the parent, and use its ID to split
    // the children up. We just have to be careful to make sure that we split at right spot, just checking for
    // "declaration" doesn't guarantee the right one, it has to be exact. This may take some thought to find a way to
    // make sure it is the exact child.
    //
    def getTwoNumbers(node: ASTNode): (List[ASTNode], List[ASTNode]) ={
      val parentNode = node.parent match {
        case Some(pNode) => pNode
        case _           => throw new Exception("Unable to locate parent node")
      }
      val myText = node.text
      node.text = "FLAG"
      val siblingList = parentNode.children
      var nodeIdent = -1
      for (i <- 0 until siblingList.length) {
        if (siblingList(i).text == "FLAG")
          nodeIdent = i
      }
      node.text = myText
      val firstList = for (i <- 0 until nodeIdent) yield {
        siblingList(i)
      }
      val secondList = for (i <- nodeIdent until siblingList.length) yield {
        siblingList(i)
      }
      (firstList.toList,secondList.toList)
    }
   
    
    root
  }
  
}
