//-----------------------------------------------------------------------
// FILE    : ModuleTypeParser.scala
// SUBJECT : Parsing and processing nesT module types in Scalaness code.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import org.antlr.runtime._
import org.antlr.runtime.tree.{Tree, CommonTree}
import scala.tools.nsc.typechecker.Analyzer
import edu.uvm.scalaness.parser._

trait ModuleTypeParser {
  self: Analyzer =>
  import global._
  import ModuleTypeParser._
  
  def parseScalanessAnnotation(associations: List[(Name, ClassfileAnnotArg)]) = {
    // TODO: Check that we only process the "value" association. Deal with other associations.
    val parsedTypes = for ((name, value) <- associations) yield {
      try {
        val lexer  = new ModuleTypeLexer(new ANTLRStringStream(value.toString))
        val tokens = new CommonTokenStream(lexer)
        val parser = new edu.uvm.scalaness.parser.ModuleTypeParser(tokens)
       
        // Annotate the ugly result type for future reference (for now).
        val result: edu.uvm.scalaness.parser.ModuleTypeParser.module_type_return = parser.module_type()
        ANTLRToScala(t = result.getTree.asInstanceOf[CommonTree])
      }
      catch {
        case ex: org.antlr.runtime.RecognitionException =>
          reporter.error(null, "parse error in ModuleType annotation: " + ex.getClass.getName)

          // If there's a ModuleType annotation parse error, hand back an empty module type.
          TypeASTNode(
            ModuleTypeLexer.MODULE_TYPE,
            "",
            List(TypeASTNode(ModuleTypeLexer.EXISTENTIAL_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.TYPE_PARAMETER_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.VALUE_PARAMETER_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.IMPORT_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.EXPORT_LIST, "", List())));
      }
    }
    // TODO: We currently only handle one type (and we assume it is there).
    parsedTypes(0)
  }
  
  def parseScalanessAbbrvAnnotation(value: String) = {
    // TODO: Check that we only process the "value" association. Deal with other associations.
    val parsedType =
      try {
        val lexer  = new ModuleTypeLexer(new ANTLRStringStream(value))
        val tokens = new CommonTokenStream(lexer)
        val parser = new edu.uvm.scalaness.parser.ModuleTypeParser(tokens)
       
        // Annotate the ugly result type for future reference (for now).
        val result: edu.uvm.scalaness.parser.ModuleTypeParser.module_type_return = parser.module_type()
        ANTLRToScala(t = result.getTree.asInstanceOf[CommonTree])
      }
      catch {
        case ex: org.antlr.runtime.RecognitionException =>
          reporter.error(null, "parse error in ModuleType annotation: " + ex.getClass.getName)

          // If there's a ModuleType annotation parse error, hand back an empty module type.
          TypeASTNode(
            ModuleTypeLexer.MODULE_TYPE,
            "",
            List(TypeASTNode(ModuleTypeLexer.EXISTENTIAL_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.TYPE_PARAMETER_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.VALUE_PARAMETER_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.IMPORT_LIST, "", List()),
                 TypeASTNode(ModuleTypeLexer.EXPORT_LIST, "", List())));
      }
    // TODO: We currently only handle one type (and we assume it is there).
    parsedType
  }
}

object ModuleTypeParser {

  /**
   * Convert an ANTLR-style abstract syntax tree into a TypeASTNode case class instance. Note
   * that some of the information contained inside the ANTLR produced tree is not preserved in
   * the case class instance. Currently that is information not needed.
   * 
   * @param t The ANTLR-style abstract syntax tree to be converted.
   * @return An ASTNode instance that represents the tree. The parent of the returned node is
   * None. The symbol tables attached to the returned node and its children are all None.
   */
  def ANTLRToScala(t: Tree): TypeASTNode = {
    var childList = List[TypeASTNode]()
    for (i <- 0 until t.getChildCount) {
      // I'm thinking there is probably a better way to do this.
      childList = childList ::: List(ANTLRToScala(t.getChild(i)))
    }    
    TypeASTNode(t.getType, t.getText, childList)
  }

}
