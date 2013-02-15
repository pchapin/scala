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
  
  
  /**
   * Writes the abstract syntax tree to the indicated PrintStream as serialized nesC source code.
   * This method is used during the output of the specialized nesC templates.
   * 
   * @param out The object where the source will be written.
   * @param root The root of the tree to dump.
   */
  def dumpNesCSource(out: java.io.PrintStream, root: ASTNode) {
    val abstractViewer = new SyntaxViewer(out, root)
    abstractViewer.rewrite()
  }


  /**
   * Processes a Mininess AST and adds additional parameters to function declarations and calls
   * to provide array size information.
   *
   * @param root The root of the AST to process.
   * @return A new AST with all function declarations and calls adjusted as necessary.
   */
  def rewriteArrayParameters(root: ASTNode): Unit = {
    // if (root.parent == None) dumpAST(root)
    root match {
      case ASTNode(PARAMETER, text, children, parent, symbolTable) =>
        for (child <- children if child.tokenType == DECLARATOR) {
          val ASTNode(_, _, declaratorComponents, _, _) = child
          val declaredIdentifier = declaratorComponents(0).children(0)
          if (declaratorComponents.length > 1) {
            declaratorComponents(1) match {
              case ASTNode(DECLARATOR_ARRAY_MODIFIER, _, _, _, _) =>
                val parameter = Mini(PARAMETER)
                parameter ~~> Mini(UINT16_T, "uint16_t")
                parameter ~~>
                  Mini(DECLARATOR) ~~>
                    Mini(IDENTIFIER_PATH) ~~>
                      Mini(RAW_IDENTIFIER, "_sc__" + declaredIdentifier.text + "_SIZE")

                val Some(parameterListNode) = root.parent
                parameter.node.parent = Some(parameterListNode)
                parameterListNode.children = parameterListNode.children ::: List(parameter.node)

              case _ =>
                // Do nothing. We are only interested in array parameters.
            }
          }
        }

      case ASTNode(ARGUMENT_LIST, text, children, parent, symbolTable) =>
        val rootNode = Mini(root)
        for (child <- children
             if child.children.length > 0 && child.children(0).tokenType == RAW_IDENTIFIER) {
          val argumentName = child.children(0).text
          val argumentType = Symbols.lookupVariable(root, argumentName)
          argumentType match {
            case MininessTypes.Array(_, arraySize) =>
              if (arraySize == "") {
                val sizeVariable = "_sc__" + argumentName + "_SIZE"
                rootNode ~~> Mini(RAW_IDENTIFIER, sizeVariable)
              }
              else {
                rootNode ~~> Mini(CONSTANT, arraySize)
              }
            case _ =>
              // Do nothing. We are only interested in array parameters.
          }
        }

      case ASTNode(tokenType, text, children, parent, symbolTable) =>
        children foreach rewriteArrayParameters
    }
  }


  /**
   * Processes a Mininess AST and replaces cast operations with calls to an appropriate
   * conversion command.
   *
   * @param root The root of the AST to process.
   * @return A new AST with all cast operations replaced.
   */
  def replaceCastOperations(root: ASTNode): ASTNode = {
    // if (root.parent == None) dumpAST(root)
    root match {
      
      case ASTNode(CAST, text, children, parent, symbolTable) => {

        // Here we look up the cast target's type and the cast type and build a method string
        // based on these names. This method name format is up to us how we want the programmer
        // to provide it, so it can change if neccessary
        //
        val castTarget    = children(0).children(0).text
        val isStructCast  = (children(1).text == "struct") 
        val castType      = if (isStructCast) children(1).children(0).text else children(1).text
        val valueType     = Symbols.lookupVariable(root,castTarget)
        val valTypeString = valueType match {
          case MininessTypes.Structure(structName,structFields) => structName
          case typeName => typeName
        }
        val castMethodString = valTypeString + "_" + castType
        
        
        val newNode =
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), parent, symbolTable)
        val newNode2 =
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(newNode), symbolTable)
        newNode.children = List(newNode2)

        val callNode =
          ASTNode(CALL, "call", List(), Some(newNode2), symbolTable)
        val functionNode =
          ASTNode(RAW_IDENTIFIER, castMethodString, List(), Some(newNode2), symbolTable)
        val argListNode =
          ASTNode(ARGUMENT_LIST, "ARGUMENT_LIST", List(), Some(newNode2), symbolTable)
        newNode2.children = List(callNode, functionNode, argListNode)

        val newNode3 =
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(argListNode), symbolTable)
        argListNode.children = List(newNode3)

        val argumentNode =
          ASTNode(RAW_IDENTIFIER, castTarget, List(), Some(newNode3), symbolTable)
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
      case ASTNode(ARRAY_ELEMENT_SELECTION, text, children, parent, symbolTable) => {
        val parentNode = parent match {
          case Some(pNode) => pNode
          case None => root // Should throw an error
        }
        val arrayStructMember = (parentNode.children.length > 2)
        val arrayNode    = parentNode.children(0)
        val arrayPFENode = root.children(0)
        val accessNode   = arrayPFENode.children(0)
        val isIdentifier = (accessNode.tokenType == RAW_IDENTIFIER)
        val arrayName    = arrayNode.text
        val tempVarName =  NameGenerator.get
        val arrayType    = if (!(arrayStructMember)) Symbols.lookupVariable(root,arrayName)
                           else {
                             val structName = arrayName
                             val fieldName = parentNode.children(1).children(0).text
                             getStructMemberType(Symbols.lookupVariable(root,structName),fieldName)
                           }
        val arraySize = arrayType match {
          case MininessTypes.Array(_, aSize) => aSize
          case _ => throw new Exception("Unable to locate array size")
        }
        val isConstant =
          try { val test = arraySize.toInt; true } catch { case e: Exception => false }
        
        val arrayStatementNode = getStatementNode(root)
        val (firstHalf, secondHalf) = getTwoNumbers(arrayStatementNode)
        // This will be where we pass in the arrayStatementNode, get its parent, split its
        // parents children into two lists (with it heading the second list) and return two
        // lists. The two lists then can later be merged together with the inclusion of the
        // constructed if statement between them
                
        val statementParentNode = arrayStatementNode.parent match {
          case Some(pNode) => pNode
          case _           => throw new Exception("Unable to locate parent node")
        }
        
        val ifNode =
          ASTNode(IF, "if", List(), Some(statementParentNode), symbolTable)
        val LENode =
          ASTNode(GREATEREQUAL, ">=", List(), Some(ifNode), symbolTable)
        val newNode =
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(LENode), symbolTable)
        val newNode2 =
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(LENode), symbolTable)
        LENode.children = List(newNode, newNode2)

        val decNode =
          ASTNode(DECLARATION, "DECLARATION", List(), Some(statementParentNode), symbolTable)
        val intNode =
          ASTNode(INT, "int", List(), Some(decNode), symbolTable)
        val decListNode =
          ASTNode(DECLARATOR_LIST, "DECLARATOR_LIST", List(), Some(decNode), symbolTable)
        decNode.children = List(intNode,decListNode)
        val initDecNode = 
          ASTNode(INIT_DECLARATOR, "INIT_DECLARATOR", List(), Some(decListNode), symbolTable)
        decListNode.children = List(initDecNode)
        val decrNode =
          ASTNode(DECLARATOR, "DECLARATOR", List(), Some(initDecNode), symbolTable)
        val dPFENode = 
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(initDecNode), symbolTable)
        initDecNode.children = List(decrNode, dPFENode)
        val idPathNode = 
          ASTNode(IDENTIFIER_PATH, "IDENTIFIER_PATH", List(), Some(decrNode), symbolTable)
        decrNode.children = List(idPathNode)
        val newVarNode = 
          ASTNode(RAW_IDENTIFIER, tempVarName, List(), Some(idPathNode), symbolTable)
        idPathNode.children = List(newVarNode)
        val oldVarNode = if (isIdentifier)
          ASTNode(RAW_IDENTIFIER, accessNode.text, List(), Some(dPFENode), symbolTable)
        else
          ASTNode(CONSTANT, accessNode.text, List(), Some(dPFENode), symbolTable)
        dPFENode.children = List(oldVarNode)

        val accessorNode = ASTNode(RAW_IDENTIFIER, tempVarName, List(), Some(newNode), symbolTable)
        newNode.children = List(accessorNode)
        accessNode.text = tempVarName
        
        val sizeNode = if (isConstant) {
          ASTNode(CONSTANT, arraySize, List(), Some(newNode2), symbolTable)
        }
        else {
          if (arraySize == "") {
            val sizeVariable = "_sc__" + arrayName + "_SIZE"
            ASTNode(RAW_IDENTIFIER, sizeVariable, List(), Some(newNode2), symbolTable)
          }
          else {
            val sizeType = Symbols.lookupVariable(root, arraySize)
            if (!(MininessTypes.areSubtypes(sizeType, MininessTypes.Int32) || 
                  MininessTypes.areSubtypes(sizeType, MininessTypes.UInt32)))
              throw new Exception("Array size must be integer type")
            ASTNode(RAW_IDENTIFIER, arraySize, List(), Some(newNode2), symbolTable)
          }
        }
        newNode2.children = List(sizeNode)

        val statementNode =
          ASTNode(STATEMENT, "STATEMENT", List(), Some(ifNode), symbolTable)
        val statementPFENode =
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(statementNode), symbolTable)
        statementNode.children = List(statementPFENode)

        val callNode =
          ASTNode(CALL, "call", List(), Some(statementPFENode), symbolTable)
        val functionNode =
          ASTNode(RAW_IDENTIFIER, "boundsCheckFailed", List(), Some(statementPFENode), symbolTable)
        val argListNode =
          ASTNode(ARGUMENT_LIST, "ARGUMENT_LIST", List(), Some(statementPFENode), symbolTable)
        statementPFENode.children = List(callNode, functionNode, argListNode)
        ifNode.children = List(LENode, statementNode)
        val newSecondHalf = ifNode::secondHalf
        val finalSecondHalf = decNode::newSecondHalf
        val newChildren = firstHalf:::finalSecondHalf
        statementParentNode.children = newChildren
        root
      }

      // It is necessary to add "uses command void boundsCheckFailed()" to the specification.
      case ASTNode(SPECIFICATION, text, children, parent, symbolTable) =>
        val usesNode = 
          ASTNode(USES, "uses", List(), Some(root), symbolTable)
        val decNode =
          ASTNode(DECLARATION, "DECLARATION", List(), Some(usesNode), symbolTable)
        usesNode.children = List(decNode)
        val cmdNode =
          ASTNode(COMMAND, "command", List(), Some(decNode), symbolTable)
        val voidNode =
          ASTNode(VOID, "void", List(), Some(decNode), symbolTable)
        val decListNode =
          ASTNode(DECLARATOR_LIST, "DECLARATOR_LIST", List(), Some(decNode), symbolTable)
        decNode.children = List(cmdNode,voidNode,decListNode)
        val initDecNode = 
          ASTNode(INIT_DECLARATOR, "INIT_DECLARATOR", List(), Some(decListNode), symbolTable)
        decListNode.children = List(initDecNode)
        val decrNode =
          ASTNode(DECLARATOR, "DECLARATOR", List(), Some(initDecNode), symbolTable)
        initDecNode.children = List(decrNode)
        val idPathNode = 
          ASTNode(IDENTIFIER_PATH, "IDENTIFIER_PATH", List(), Some(decrNode), symbolTable)
        val dplmNode = 
          ASTNode(DECLARATOR_PARAMETER_LIST_MODIFIER, "DECLARATOR_PARAMETER_LIST_MODIFIER", List(), Some(decrNode), symbolTable)
        decrNode.children = List(idPathNode, dplmNode)
        val pListNode = 
          ASTNode(PARAMETER_LIST, "PARAMETER_LIST", List(), Some(dplmNode), symbolTable)
        dplmNode.children = List(pListNode)
        val newMthNode = 
          ASTNode(RAW_IDENTIFIER, "boundsCheckFailed", List(), Some(idPathNode), symbolTable)
        idPathNode.children = List(newMthNode)
        val currChildren = root.children
        val newChildren = currChildren:::List(usesNode)
        root.children = newChildren
        root
      
      // All other token types are handled here.
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
        case ASTNode(DECLARATION,_,_,_,_) => node
        case ASTNode(STATEMENT,_,_,_,_)   => node
        case ASTNode(RETURN,_,_,_,_)      => node
        case ASTNode(_,_,_,_,_)                         => getStatementNode(parentNode)
        case _ => throw new Exception("Unable to locate parent node")
      }
      statementNode
    }
    
    // Test to see how returning a pair works, we need to pass it an ASTNode, grab the parent,
    // and use its ID to split the children up. We just have to be careful to make sure that we
    // split at right spot, just checking for "declaration" doesn't guarantee the right one, it
    // has to be exact. This may take some thought to find a way to make sure it is the exact
    // child.
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

    
    def getStructMemberType(
      structType: MininessTypes.Representation,
      memberName: String): MininessTypes.Representation = {

      var returnType = structType
      var found = false
      val memberList = structType match {
        case MininessTypes.Structure(_, mList) => mList
        case _ => throw new Exception("Expected structure type.")
      }
      for (i <- 0 until memberList.size) {
        memberList(i) match {
          case (memberName, mType) => {
            returnType = mType
            found = true
          }
          case _ => 
        }
      }
      if (found) returnType else throw new Exception("Unable to locate struct member.")
    }
    root
  }
  
}
