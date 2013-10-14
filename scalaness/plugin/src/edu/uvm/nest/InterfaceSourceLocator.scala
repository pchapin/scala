//-----------------------------------------------------------------------
// FILE    : InterfaceSourceLocator.scala
// SUBJECT : Locates nesT interfaces by reading a repository of source code.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import java.io.File
import org.antlr.runtime._
import org.antlr.runtime.tree.CommonTree
import parser.{NesTLexer, NesTParser, ParserSymbolsManager}
import edu.uvm.nest.InterfaceLocator.InterfaceInternalException

class InterfaceSourceLocator(sourceFolders: List[String]) extends InterfaceLocator {
  import InterfaceLocator.InterfaceNotFoundException
  import InterfaceLocator.InterfaceMultiplyDefinedException
  
  // TODO: Check that the folders in sourceFolders are valid and accessible.
  
  /**
   * Search the source folders looking for the file containing the source code of the given interface.
   * 
   * @param interfaceName The name of the interface to locate.
   * @return The name of the source file defining that interface.
   * @throws InterfaceNotFoundException if no source file could be located.
   * @throws InterfaceMultiplyDefinedException if the interface is in multiple source files.
   */
  private def locateSourceFile(interfaceName: String) = {
    val fileNames = for (sourceFolder <- sourceFolders) yield {
      val tentativeName = sourceFolder + File.separator + interfaceName + ".nc"
      val tentativeFile = new File(tentativeName)
      if (tentativeFile.exists) tentativeName else ""
    }
    val validNames = fileNames filter { _.length > 0 }
    
    // It might be better, in the case where the interface is found in more than one source file, to return the first
    // one found for some reasonable definition of "first." However, having two different definitions of the same
    // interface is likely to be an error so for now let's treat it as such.
    // 
    validNames.length match {
      case 0 =>
        throw new InterfaceNotFoundException("Interface " + interfaceName + " not found")
      case 1 =>
        validNames(0)
      case _ =>
        throw new InterfaceMultiplyDefinedException("Interface " + interfaceName + " multiply defined")  }
  }

  /**
   * Locate the source code of the given interface and parse it to obtain its definition. This method assumes that
   * interface I is stored in a source file I.nc in one of the previously provided source folders. This method currently
   * reparses the interface each time it is called. There is no attempt to cache previously parsed interfaces.
   */
  def locate(
    interfaceName: String,
    direction    : InterfaceDirectionality.Value): InterfaceDefinition = {
    
    def getCommandDirection(specifier: ASTNode) = {
      specifier match {
        case ASTNode(NesTLexer.COMMAND, _, _, _, _) =>
          direction match {
            case InterfaceDirectionality.USES     => CommandDirectionality.IMPORT
            case InterfaceDirectionality.PROVIDES => CommandDirectionality.EXPORT
          }
        case ASTNode(NesTLexer.EVENT, _, _, _, _) =>
          direction match {
            case InterfaceDirectionality.USES     => CommandDirectionality.EXPORT
            case InterfaceDirectionality.PROVIDES => CommandDirectionality.IMPORT
          }
        case _ =>
          throw new InterfaceInternalException("Invalid interface specifier (syntax error in source file?)")
      }      
    }
    
    def getCommandName(declaratorList: ASTNode) = {
      // Be aware! Match failures here cause JVM stack overflow exceptions! (Scala 2.9.1) The problem appears to be in
      // the printing of the ASTNodes. Could there be a problem with the AST (maybe a cycle?)

      // TODO: Handle case where there are multiple init declarators in a declarator list.
      val ASTNode(
        NesTLexer.DECLARATOR_LIST,
        _,
        List(ASTNode(NesTLexer.INIT_DECLARATOR, _, List(declarator), _, _)),
        _,
        _) = declaratorList
      
      // TODO: Handle the case where a pointer modifier appears before the name.
      val ASTNode(
        NesTLexer.DECLARATOR,
        _,
        ASTNode(NesTLexer.IDENTIFIER_PATH, _, List(identifier), _, _) :: _,
        _,
        _) = declarator
      
      val ASTNode(NesTLexer.RAW_IDENTIFIER, name, _, _, _) = identifier
      name
    }
    
  
    val fileName = locateSourceFile(interfaceName)
    
    // See the sample Main.scala in this package for more information.
    // TODO: Cache parsed interfaces?
    val globalSymbols = new ParserSymbolsManager()   
    val globalTypes = Array("bool", "error_t", "message_t")
    for (typeName <- globalTypes) {
        globalSymbols.addType(typeName)
    }

    val lex = new NesTLexer(new ANTLRFileStream(fileName))
    val tokens = new CommonTokenStream(lex)
    val parser = new NesTParser(tokens)
    parser.setSymbols(globalSymbols)
    val result: NesTParser.nest_file_return = parser.nest_file()
    val ANTLRAbstractSyntax = result.getTree.asInstanceOf[CommonTree]
    val ASTNode(topToken, _, topChildren, _, _) = TreeConverter.ANTLRToScala(ANTLRAbstractSyntax)
    
    // Check to be sure we just parsed the intended interface definition.
    if (topToken != NesTLexer.FILE || topChildren.length == 0)
      throw new InterfaceNotFoundException("Internal Error: Malformed AST returned from parser")
    val ASTNode(token, _, children, _, _) = topChildren(topChildren.length - 1)
    
    if (token != NesTLexer.INTERFACE || children(0).text != interfaceName)
      throw new InterfaceNotFoundException(fileName + " does not contain interface " + interfaceName)
    
    // Extract the command information from the interface. I'm going to assume that all the declarations in the
    // interface are command/event declarations with no objects or typedefs. I'm also going to assume that the first
    // "declaration specifier" in each declaration is either "command" or "event."
    
    var commands = Set[CommandInformation]()
    for (declaration <- children.slice(1, children.length)) {
      val ASTNode(NesTLexer.DECLARATION, _, declarationComponents, _, _) = declaration
      val commandDirection = getCommandDirection(declarationComponents(0))
      val rawDeclaration = ASTNode(
        NesTLexer.DECLARATION,
        "DECLARATION",
        declarationComponents.slice(1, declarationComponents.length),
        None,
        None)
      val Some(declaratorList) =
        declarationComponents find { _.tokenType == NesTLexer.DECLARATOR_LIST }
      
      val commandName = getCommandName(declaratorList)
      
      commands = commands + new CommandInformation(commandDirection, commandName, rawDeclaration)
    }
    new InterfaceDefinition(commands)
  }

}
