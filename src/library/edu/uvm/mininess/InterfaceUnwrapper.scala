//-----------------------------------------------------------------------
// FILE    : InterfaceUnwrapper.scala
// SUBJECT : An object that knows how to unwrap full nesC interfaces in Mininess code.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import parser.MininessLexer
import MininessTypes._

class InterfaceUnwrapper(private val interfaceFolders: List[String]) {
  
  private val locator: InterfaceLocator = new InterfaceSourceLocator(interfaceFolders)
  private var interfaceNames = List[String]()
  private var specificationChildren = List[ASTNode]()

  /**
   * Unwraps interfaces used and provided by a Mininess component. This method processes a Mininess abstract syntax tree
   * and expands "uses/provides interface ..." lines with a sequence of uses/provides for individual commands. In
   * addition it also removes references to the expanded interfaces in, for example, call expressions. For example
   * "call I.c()" becomes just "call c()."
   * 
   * @param node The root of the Mininess abstract syntax tree to process.
   * @return A new Mininess abstract syntax tree with the necessary modifications.
   */
  def unwrapInterface(node: ASTNode): ASTNode = {
    node match {
      
      case ASTNode(MininessLexer.SPECIFICATION, text, children, parent, symbolTable) => {
        for (i <-0 until children.length) {
          if (children(i).tokenType == MininessLexer.USES) {
            if (children(i).children(0).tokenType == MininessLexer.INTERFACE) {
              val interfaceName = children(i).children(0).children(0).text
              interfaceNames ::= interfaceName
              val currInterface = locator.locate(interfaceName, InterfaceDirectionality.USES)
              val commandNameList = currInterface.getCommandNames
              var importNameList = List[String]()
              var exportNameList = List[String]()
              for (currCommandName <- commandNameList) {
                if (currInterface.getCommandDirection(currCommandName) == CommandDirectionality.IMPORT)
                  importNameList ::= currCommandName
                else
                  exportNameList ::= currCommandName
              }
              val providesNode = ASTNode(MininessLexer.PROVIDES, "provides", List(), Some(node), symbolTable)
              val usesNode = ASTNode(MininessLexer.USES, "uses", List(), Some(node), symbolTable)
              val nullUsesNode = ASTNode(MininessLexer.NULL, "null", List(), Some(children(i)), symbolTable)
              val nullProvidesNode = ASTNode(MininessLexer.NULL, "null", List(), Some(providesNode), symbolTable)
              val importDecList =
                for (currImportName <- importNameList) yield {
                  val commandDeclaration = currInterface.getCommandDeclaration(currImportName)
                  val newCommandNode = ASTNode(MininessLexer.COMMAND, "command", List(), Some(commandDeclaration), symbolTable)
                  commandDeclaration.children = newCommandNode::commandDeclaration.children
                  commandDeclaration.parent = Some(nullUsesNode)
                  commandDeclaration
                }
              val exportDecList =
                for (currExportName <- exportNameList) yield {
                  val commandDeclaration = currInterface.getCommandDeclaration(currExportName)
                  val newCommandNode = ASTNode(MininessLexer.COMMAND, "command", List(), Some(commandDeclaration), symbolTable)
                  commandDeclaration.children = newCommandNode::commandDeclaration.children
                  commandDeclaration.parent = Some(nullProvidesNode)
                  commandDeclaration
                }
              nullUsesNode.children = importDecList
              nullProvidesNode.children = exportDecList
              usesNode.children = List(nullUsesNode)
              providesNode.children = List(nullProvidesNode)
              if (providesNode.children(0).children.length != 0)
                specificationChildren ::= providesNode  
              if (usesNode.children(0).children.length != 0)
                specificationChildren ::= usesNode              
            }
            else if (children(i).children(0).tokenType == MininessLexer.DECLARATION) {
              specificationChildren ::= children(i)
            }
          }
          else if (children(i).tokenType == MininessLexer.PROVIDES) {
            if (children(i).children(0).tokenType == MininessLexer.INTERFACE) {
              val interfaceName = children(i).children(0).children(0).text
              interfaceNames ::= interfaceName
              val currInterface = locator.locate(interfaceName, InterfaceDirectionality.USES)
              val commandNameList = currInterface.getCommandNames
              var importNameList = List[String]()
              var exportNameList = List[String]()
              for (currCommandName <- commandNameList) {
                if (currInterface.getCommandDirection(currCommandName) == CommandDirectionality.IMPORT)
                  importNameList ::= currCommandName
                else
                  exportNameList ::= currCommandName
              }
              val providesNode = ASTNode(MininessLexer.PROVIDES, "provides", List(), Some(node), symbolTable)
              val usesNode = ASTNode(MininessLexer.USES, "uses", List(), Some(node), symbolTable)
              val nullUsesNode = ASTNode(MininessLexer.NULL, "null", List(), Some(children(i)), symbolTable)
              val nullProvidesNode = ASTNode(MininessLexer.NULL, "null", List(), Some(providesNode), symbolTable)
              val importDecList =
                for (currImportName <- importNameList) yield {
                  val commandDeclaration = currInterface.getCommandDeclaration(currImportName)
                  val newCommandNode = ASTNode(MininessLexer.COMMAND, "command", List(), Some(commandDeclaration), symbolTable)
                  commandDeclaration.children = newCommandNode::commandDeclaration.children
                  commandDeclaration.parent = Some(nullProvidesNode)
                  commandDeclaration
                }
              val exportDecList =
                for (currExportName <- exportNameList) yield {
                  val commandDeclaration = currInterface.getCommandDeclaration(currExportName)
                  val newCommandNode = ASTNode(MininessLexer.COMMAND, "command", List(), Some(commandDeclaration), symbolTable)
                  commandDeclaration.children = newCommandNode::commandDeclaration.children
                  commandDeclaration.parent = Some(nullUsesNode)
                  commandDeclaration
                }
              nullProvidesNode.children = importDecList
              nullUsesNode.children = exportDecList
              usesNode.children = List(nullUsesNode)
              providesNode.children = List(nullProvidesNode)
              if (providesNode.children(0).children.length != 0)
                specificationChildren ::= providesNode  
              if (usesNode.children(0).children.length != 0)
                specificationChildren ::= usesNode              
            }            
            else if (children(i).children(0).tokenType == MininessLexer.DECLARATION) {
              specificationChildren ::= children(i)
            }
          }
        }
        node.children = specificationChildren
        node
      } 
        
      // Checks all Dot cases to see if the name on the left side is a interface that has been unwrapped. If so, removes
      // the interface name and leaves only the command. This may need to become more generic, change children(x) to the
      // named node, but should work with all cases now
      case ASTNode(MininessLexer.POSTFIX_EXPRESSION, text, children, parent, symbolTable) => {
        if (existsChild(node, MininessLexer.DOT)) {
          val dotNode = findChild(node, MininessLexer.DOT)
          for (i <- 0 until interfaceNames.length) {
            if (interfaceNames(i).equals(children(1).text)) {
              node.children = List(children(0),dotNode.children(0),children(3))
            }
          }
        }
        node
      }
      
      // Finds any instances of an interface functon within the implementation and eliminates the interface name
      // Additionally, if the command is an event, it is switched to a command to coincide with the unwrapping
      case ASTNode(MininessLexer.FUNCTION_DEFINITION, text, children, parent, symbolTable) => {
        var interfaceRemoved = false
        val declaratorNode = findChild(node, MininessLexer.DECLARATOR)
        val idPathNode = findChild(declaratorNode, MininessLexer.IDENTIFIER_PATH)
        if (idPathNode.children.length > 1) {
          for (i <- 0 until interfaceNames.length) {
            if (interfaceNames(i).equals(idPathNode.children(0).text)) {
              interfaceRemoved = true
              idPathNode.children = List(idPathNode.children(1))
            }
          }
        }
        if (interfaceRemoved) {
          var eventID = -1
          for (i <- 0 until children.length) {
            if (children(i).tokenType == MininessLexer.EVENT)
              eventID = i
          }
          if (eventID >= 0) {
            val newChildren = for (i <-0 until children.length) yield {
              if (i == eventID)
                ASTNode(MininessLexer.COMMAND, "command", List(), Some(node), symbolTable)
              else
                children(i)
            }
            node.children = newChildren.toList
          }
        }
        node
      }
      
      // All other cases, return the result of unwrapping the child nodes. Be careful with vars.
      case ASTNode(tokenType, text, children, parent, symbolTable) =>
        val newChildren = children map unwrapInterface
        val newNode = ASTNode(tokenType, text, newChildren, parent, symbolTable)
        for (child <- newChildren) {
          child.parent = Some(newNode)
        }
        newNode.line = node.line
        newNode.positionInLine = node.positionInLine
        newNode
      }

  }
  
}
