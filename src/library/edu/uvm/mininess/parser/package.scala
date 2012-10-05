//-----------------------------------------------------------------------
// FILE    : package.scala
// SUBJECT : mininess.parser package object.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import org.antlr.runtime._
import org.antlr.runtime.tree.CommonTree

package object parser {

  /**
   * Parse the specified nesC file. This method locates the file, parses it, and reports parse errors. It does not do
   * any type checking on the resulting Mininess AST.
   * 
   * @param source The name of the Mininess file to parse. Names with paths (absolute or relative) should be treated
   *               "as is," and names without paths should be located using some sort of configurable search method.
   * 
   * @param typeVars A collection of type variable names that come from the type parameters in the Scalaness program.
   *                 This list, together with a few standard "built-in" types form the top level collection of known
   *                 type names used during parsing.
   * 
   * @return The abstract syntax tree of the Mininess inclusion.
   */
  // TODO: If parsing throws, convert error into one that makes sense to the compiler.
  def parseMininessInclusion(source: java.io.Reader, typeVars: Iterable[String]) = {
    
    // Prime the global symbol table with a few "known" types.
    val globalSymbols = new ParserSymbolsManager
    val globalTypes = Array("bool", "error_t", "message_t")
    for (globalType <- globalTypes) {
      globalSymbols.addType(globalType)
    }
    // TODO: Make sure there are no conflicts between typeVars and globalTypes.
    for (typeVar <- typeVars) {
      globalSymbols.addType(typeVar)
    }

    val lexer  = new MininessLexer(new ANTLRReaderStream(source))
    val tokens = new CommonTokenStream(lexer)
    val parser = new MininessParser(tokens)
    parser.setSymbols(globalSymbols)

    // Annotate the ugly result type for future reference (for now).
    val result: MininessParser.mininess_file_return = parser.mininess_file()
    TreeConverter.ANTLRToScala(t = result.getTree.asInstanceOf[CommonTree])
  }
  
  
}
