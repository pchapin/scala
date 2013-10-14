//-----------------------------------------------------------------------
// FILE    : InterfaceDatabaseLocator.scala
// SUBJECT : Locates nesT interfaces in a programmer supplied database.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

/**
 * Locates nesT interfaces in a programmer supplied database.
 */
class InterfaceDatabaseLocator(databaseName: String) extends InterfaceLocator {
  import CommandDirectionality._
  import InterfaceDirectionality._
  import InterfaceLocator.InterfaceNotFoundException
  import parser.NesTLexer
  
  // ==============
  // BEGIN DATABASE
  // 
  // For now just use a hard coded database. The directions assume each interface is USED.
  // TODO: Read interface database from an external file.
  
  private val ledsSet = Set(
    CommandInformation(
      IMPORT,
      "led0Toggle",
      // You're joking, right? Obviously we need to get this from the parser at some point.
      ASTNode(NesTLexer.DECLARATION, "",
              List(ASTNode(NesTLexer.VOID, "void", List(), None, None),
                   ASTNode(NesTLexer.DECLARATOR_LIST, "",
                           List(ASTNode(NesTLexer.INIT_DECLARATOR, "",
                                        List(ASTNode(NesTLexer.DECLARATOR, "",
                                                     List(ASTNode(NesTLexer.IDENTIFIER_PATH, "",
                                                                  List(ASTNode(NesTLexer.RAW_IDENTIFIER, "led0Toggle", List(), None, None)), None, None),
                                                          ASTNode(NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER, "",
                                                                  List(ASTNode(NesTLexer.PARAMETER_LIST, "", List(), None, None)), None, None)), None, None)), None, None)), None, None)), None, None))
      /*
      CommandInformation(
      IMPORT,
      "led1Toggle",
      // You're joking, right? Obviously we need to get this from the parser at some point.
      ASTNode(NesTLexer.DECLARATION, "",
              List(ASTNode(NesTLexer.VOID, "void", List(), None, None),
                   ASTNode(NesTLexer.DECLARATOR_LIST, "",
                           List(ASTNode(NesTLexer.INIT_DECLARATOR, "",
                                        List(ASTNode(NesTLexer.DECLARATOR, "",
                                                     List(ASTNode(NesTLexer.IDENTIFIER_PATH, "",
                                                                  List(ASTNode(NesTLexer.RAW_IDENTIFIER, "led1Toggle", List(), None, None)), None, None),
                                                          ASTNode(NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER, "",
                                                                  List(ASTNode(NesTLexer.PARAMETER_LIST, "", List(), None, None)), None, None)), None, None)), None, None)), None, None)), None, None)),
      CommandInformation(
      IMPORT,
      "led2Toggle",
      // You're joking, right? Obviously we need to get this from the parser at some point.
      ASTNode(NesTLexer.DECLARATION, "",
              List(ASTNode(NesTLexer.VOID, "void", List(), None, None),
                   ASTNode(NesTLexer.DECLARATOR_LIST, "",
                           List(ASTNode(NesTLexer.INIT_DECLARATOR, "",
                                        List(ASTNode(NesTLexer.DECLARATOR, "",
                                                     List(ASTNode(NesTLexer.IDENTIFIER_PATH, "",
                                                                  List(ASTNode(NesTLexer.RAW_IDENTIFIER, "led2Toggle", List(), None, None)), None, None),
                                                          ASTNode(NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER, "",
                                                                  List(ASTNode(NesTLexer.PARAMETER_LIST, "", List(), None, None)), None, None)), None, None)), None, None)), None, None)), None, None)) */
  )
  private val bootSet = Set(
    CommandInformation(
      IMPORT,
      "led0Toggle",
      // You're joking, right? Obviously we need to get this from the parser at some point.
      ASTNode(NesTLexer.DECLARATION, "",
              List(ASTNode(NesTLexer.VOID, "void", List(), None, None),
                   ASTNode(NesTLexer.DECLARATOR_LIST, "",
                           List(ASTNode(NesTLexer.INIT_DECLARATOR, "",
                                        List(ASTNode(NesTLexer.DECLARATOR, "",
                                                     List(ASTNode(NesTLexer.IDENTIFIER_PATH, "",
                                                                  List(ASTNode(NesTLexer.RAW_IDENTIFIER, "led9Toggle", List(), None, None)), None, None),
                                                          ASTNode(NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER, "",
                                                                  List(ASTNode(NesTLexer.PARAMETER_LIST, "", List(), None, None)), None, None)), None, None)), None, None)), None, None)), None, None)))
  
  
  private def parentPatcher(node: ASTNode) {
    val ASTNode(_, _, children, _, _) = node
    for (child <- children) {
      child.parent = Some(node)
    }
    children map parentPatcher
  }
  
  
  // Fix up the parent references in the database. Note: parent references are mutable.
  {
    for (ledsCommand <- ledsSet) {
      val CommandInformation(_, _, declaration) = ledsCommand
      parentPatcher(declaration)
    }
  }
  private val database = Map("Leds" -> new InterfaceDefinition(ledsSet), "Boot" -> new InterfaceDefinition(bootSet))
  
  //
  // END DATABASE
  // ==============

  
  def locate(
    interfaceName: String,
    direction    : InterfaceDirectionality.Value): InterfaceDefinition = {
  
    val canonicalInterface =
      database.get(interfaceName)
              .getOrElse( throw new InterfaceNotFoundException(interfaceName))
    direction match {
      case USES => canonicalInterface
      case PROVIDES => canonicalInterface.reverseDirection
    }
  }

}
