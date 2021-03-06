//-----------------------------------------------------------------------
// FILE    : TreeTransformer.scala
// SUBJECT : Object to manipulate nesT ASTs
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import org.antlr.runtime.CommonToken
import org.antlr.runtime.tree._
import parser.NesTLexer
import NesTLexer._

/**
 * This object has methods for handling abstract syntax tree conversions and other high level AST
 * preparations. Since Scala can only do pattern matching on "case classes" one service provided
 * by this object is conversion to/from the trees produced by ANTLR to instances of a suitably
 * defined case class (ASTNode). Some additional high level methods are also provided.
 */
object TreeTransformer {

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
   * Processes a nesT AST and adds additional parameters to function declarations and calls
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

          // The value identifierIndex indicates which child of DECLARATOR is the identifier.
          // The simple logic below handles simple declarations and declarations like 'int *p'.
          // However it should be extended to handle multiple pointer qualifiers and also the
          // use of const in cases like 'int *const p[]' (for example).
          //
          // TODO: Generalize the calculation of identifierIndex.
          val identifierIndex =
            if (declaratorComponents(0).tokenType != POINTER_QUALIFIER) 0 else 1
          val declaredIdentifier = declaratorComponents(identifierIndex).children(0)
          if (declaratorComponents.length > 1) {
            declaratorComponents(1) match {
              case ASTNode(DECLARATOR_ARRAY_MODIFIER, _, _, _, _) =>
                val parameter = Mini(PARAMETER)
                parameter ~~> Mini(UINT16_T, "uint16_t")
                parameter ~~>
                  Mini(DECLARATOR) ~~>
                    Mini(IDENTIFIER_PATH) ~~>
                      Mini(RAW_IDENTIFIER, "_sc_" + declaredIdentifier.text + "_SIZE")

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
            case NesTTypes.Array(_, arraySize) =>
              if (arraySize == "") {
                val sizeVariable = "_sc_" + argumentName + "_SIZE"
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
   * Processes a nesT AST and replaces cast operations with calls to an appropriate
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
          case NesTTypes.Structure(structName,structFields) => structName
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
   * Processes a nesT AST and adds runtime array bounds checks were necessary.
   *
   * @param root The root of the AST to process.
   * @return A new AST with all the checks added.
   */
  def addArrayBoundsChecks(root: ASTNode): ASTNode = {

    def getStatementNode(node: ASTNode): ASTNode = {
      val parentNode = node.parent match {
        case Some(pNode) => pNode
        case _           => throw new Exception("Unable to locate parent node")
      }
      
      val statementNode = node match {
        case ASTNode(DECLARATION,_,_,_,_) => node
        case ASTNode(STATEMENT,_,_,_,_)   => node
        case ASTNode(RETURN,_,_,_,_)      => node
        case ASTNode(IF,_,_,_,_)          => node
        case ASTNode(WHILE,_,_,_,_)       => node
        case ASTNode(SWITCH,_,_,_,_)      => node
        case ASTNode(FOR,_,_,_,_)         => node
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
      val secondList = for (i <- (nodeIdent + 1) until siblingList.length) yield {
        siblingList(i)
      }
      (firstList.toList,secondList.toList)
    }

    def getStructMemberType(
      structType: NesTTypes.Representation,
      memberName: String): NesTTypes.Representation = {

      var returnType = structType
      var found = false
      val memberList = structType match {
        case NesTTypes.Structure(_, mList) => mList
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

    // if (root.parent == None) TreeConverter.dumpAST(root)
    root match {
      case ASTNode(ARRAY_ELEMENT_SELECTION, text, children, parent, symbolTable) =>
        val parentNode = parent match {
          case Some(pNode) => pNode
          case None => root // Should throw an error
        }
        val arrayStructMember = (parentNode.children.length > 2)
        val arrayNode    = parentNode.children(0)
        val arrayPFENode = root.children(0)
        
        val isExpression = (arrayPFENode.tokenType != POSTFIX_EXPRESSION)
        val accessNode   = if (isExpression) root else arrayPFENode.children(0)
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
          case NesTTypes.Array(_, aSize) => aSize
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
        
        val spnParentNode = statementParentNode.parent match {
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
        val dPFENode = if (!(isExpression))
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(initDecNode), symbolTable)
        else
          ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", accessNode.children, Some(initDecNode), symbolTable)
        if (isExpression) {
          for (i <- 0 until dPFENode.children.length) {
            dPFENode.children(i).parent = Some(dPFENode)
          }
        } // All the children that used to belong to the Array_Element_Selection are severed and now children of the declaration PFE node
        initDecNode.children = List(decrNode, dPFENode)
        val idPathNode = 
          ASTNode(IDENTIFIER_PATH, "IDENTIFIER_PATH", List(), Some(decrNode), symbolTable)
        decrNode.children = List(idPathNode)
        val newVarNode = 
          ASTNode(RAW_IDENTIFIER, tempVarName, List(), Some(idPathNode), symbolTable)
        idPathNode.children = List(newVarNode)
        if (!(isExpression)) {
            val oldVarNode = if (isIdentifier)
              ASTNode(RAW_IDENTIFIER, accessNode.text, List(), Some(dPFENode), symbolTable)
            else
              ASTNode(CONSTANT, accessNode.text, List(), Some(dPFENode), symbolTable)
            dPFENode.children = List(oldVarNode)
        }
        val accessorNode = ASTNode(RAW_IDENTIFIER, tempVarName, List(), Some(newNode), symbolTable)
        newNode.children = List(accessorNode)
        if (!(isExpression))
          accessNode.text = tempVarName // Does this need to be a new node?
        else {
          val newPFENode =
            ASTNode(POSTFIX_EXPRESSION, "POSTFIX_EXPRESSION", List(), Some(root), symbolTable)
          val newVarNode =
            ASTNode(RAW_IDENTIFIER, tempVarName, List(), Some(newPFENode), symbolTable)
          newPFENode.children = List(newVarNode)
          root.children = List(newPFENode)          
        }
        
        val sizeNode = if (isConstant) {
          ASTNode(CONSTANT, arraySize, List(), Some(newNode2), symbolTable)
        }
        else {
          if (arraySize == "") {
            val sizeVariable = "_sc_" + arrayName + "_SIZE"
            ASTNode(RAW_IDENTIFIER, sizeVariable, List(), Some(newNode2), symbolTable)
          }
          else {
            val sizeType = Symbols.lookupVariable(root, arraySize)
            if (!(NesTTypes.areSubtypes(Map[String,edu.uvm.nest.NesTTypes.Representation](),sizeType, NesTTypes.Int32) || 
                  NesTTypes.areSubtypes(Map[String,edu.uvm.nest.NesTTypes.Representation](),sizeType, NesTTypes.UInt32)))
              throw new Exception("Array size must be integer type")
            ASTNode(RAW_IDENTIFIER, arraySize, List(), Some(newNode2), symbolTable)
          }
        }
        newNode2.children = List(sizeNode)
        
        // Come back to this ---
        // val cmpdStatementNode = 
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
        
        val compoundStatementNode =
          ASTNode(COMPOUND_STATEMENT, "COMPOUND_STATEMENT", List(decNode, ifNode, arrayStatementNode), Some(statementParentNode), symbolTable)
        arrayStatementNode.parent = Some(compoundStatementNode)
        
        // val newSecondHalf = ifNode::secondHalf
        // val finalSecondHalf = decNode::newSecondHalf
        // val newChildren = firstHalf:::finalSecondHalf
        val newSecondHalf = compoundStatementNode::secondHalf
        val newChildren = firstHalf:::newSecondHalf
        
        statementParentNode.children = newChildren
        
        /*
        // Wraps all of the parent of all of the new stuff in a compound statement
        // If this is weird.. maybe its better to instead wrap ifNode, decNode, and the statementNode in a compound statement, and have this..
        val compoundStatementNode = 
          ASTNode(COMPOUND_STATEMENT, "COMPOUND_STATEMENT", List(statementParentNode), Some(spnParentNode), symbolTable)
        val spnParentChildren = spnParentNode.children
        val newSpnParentchildren = for (i <- 0 until spnParentChildren.length) yield {
          if (spnParentChildren(i) == statementParentNode)
            compoundStatementNode
          else
            spnParentChildren(i)
        }
        
        spnParentNode.children = newSpnParentChildren
        */
        root

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
      case ASTNode(tokenType, text, children, parent, symbolTable) =>
        val newChildren = children map addArrayBoundsChecks
        val newNode = ASTNode(tokenType, text, newChildren, parent, symbolTable)
        for (child <- newChildren) {
          child.parent = Some(newNode)
        }
        newNode.line = root.line
        newNode.positionInLine = root.positionInLine
        newNode
    }
    root
  }
  
}
