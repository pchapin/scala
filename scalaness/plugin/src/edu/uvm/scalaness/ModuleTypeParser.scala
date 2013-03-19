//-----------------------------------------------------------------------
// FILE    : ModuleTypeParser.scala
// SUBJECT : Parsing and processing nesT module types in Scalaness code.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import org.antlr.runtime._
import org.antlr.runtime.tree.{Tree, CommonTree}
import scala.reflect.internal.SymbolTable
import edu.uvm.scalaness.parser._

trait ModuleTypeParser {
  self: SymbolTable =>
  import ModuleTypeParser._
  
  def parseScalanessAnnotation(associations: List[(Name, ClassfileAnnotArg)]) = {
    // TODO: Deal with parse errors!
    // TODO: Check that we only process the "value" association. Deal with other associations.
    val parsedTypes = for ((name, value) <- associations) yield {
      val lexer  = new ModuleTypeLexer(new ANTLRStringStream(value.toString))
      val tokens = new CommonTokenStream(lexer)
      val parser = new edu.uvm.scalaness.parser.ModuleTypeParser(tokens)

      // Annotate the ugly result type for future reference (for now).
      val result: edu.uvm.scalaness.parser.ModuleTypeParser.module_type_return = parser.module_type()
      ANTLRToScala(t = result.getTree.asInstanceOf[CommonTree])
    }
    // TODO: We currently only handle one type (and we assume it is there).
    parsedTypes(0)
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
