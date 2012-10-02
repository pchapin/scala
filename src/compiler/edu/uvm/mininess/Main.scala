//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Wrapper program for the Mininess parser.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import org.antlr.runtime._
import org.antlr.runtime.tree.CommonTree
import parser.{MininessLexer, MininessParser, ParserSymbolsManager}

/**
 * Wrapper object for the main method.
 *
 * @author Peter
 */
object Main {

    private val globalSymbols = new ParserSymbolsManager()

    /**
     * This program provides a simple, semi-interactive interface to the parser. It can be used for testing or other
     * experimentation. A real application would just use the parser class (see the code below for how to do that).
     *
     * @param args The command line arguments
     */
    def main(args: Array[String]) {
        // These are type names imported from the TinyOS library. When parsing just one file at a time, we need to
        // "preload" the global symbol table with this information.
        //
        val globalTypes = Array("bool", "error_t", "message_t")

        // Configure a global SymbolTableManager. This is necessary because nesC's global scope spans all files in the
        // program. That is, global entities declared in one file are visible in all other files compiled afterward.
        // Since this program is intended to parse just one nesC file at a time, we must preload the global symbol table
        // with information on commonly used types from the TinyOS library. This is a bit of a hack, but it will allow
        // the parser to be tested on non-trivial code examples.
        //
        for (typeName <- globalTypes) {
            globalSymbols.addType(typeName)
        }

        val lex = new MininessLexer(new ANTLRFileStream(args(0)))
        val tokens = new CommonTokenStream(lex)
        val parser = new MininessParser(tokens)
        parser.setSymbols(globalSymbols)
        val result: MininessParser.mininess_file_return = parser.mininess_file()

        // Unconditionally output the abstract syntax tree.
        val ANTLRAbstractSyntax = result.getTree.asInstanceOf[CommonTree]
        val abstractSyntax = TreeConverter.ANTLRToScala(ANTLRAbstractSyntax)
        val viewer = new SyntaxViewer(System.out, abstractSyntax)
        println("*** AST ==>")
        TreeConverter.dumpAST(abstractSyntax)
        println()

        // Display the rewritten source code.
        println("*** REWRITE ==>")
        viewer.rewrite()
        println()
    }
}
