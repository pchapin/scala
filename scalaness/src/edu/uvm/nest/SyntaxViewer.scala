//-----------------------------------------------------------------------
// FILE    : SyntaxViewer.scala
// SUBJECT : Class that allows an abstract syntax tree to be viewed.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import java.io.PrintStream
import java.util.Stack
import parser.NesTLexer

/**
 * Provides a nice way to view nesT abstract syntax trees. This code was ported from Java.
 *
 * @param sink The object into which the output is sent.
 * @param syntaxTree The tree that this viewer will use.
 *
 * @author Peter C. Chapin
 */
class SyntaxViewer(private val sink: PrintStream, private val syntaxTree: ASTNode) {

  private var indentationLevel = 0
  private var suppressRewriting = false

  // Used to handle parentheses in nested declarators in a nice way. Consider, for example,
  //     int (*p)(int x);
  // In this case the declarator '*p' should be parenthesized, but neither the declarator 'x'
  // nor the overall declarator needs to be. (Note that they could be, but that is ugly).
  //
  private val declaratorNestingLevels = new Stack[Int]()
  declaratorNestingLevels.push(0)

  // Used to prevent the top level expression from being parenthesized. For example, normally we
  // have something like this:
  //     ( x = ( a * ( b + c ) ) );
  // If this flag is set to false before rewriting this expression we have instead:
  //       x = ( a * ( b + c ) );
  // This looks a little nicer (especially in, for example, the conditional expressions of if,
  // while, and for loops). Fully "correct" handling of this issue would require the rewriter to
  // consider operator precedence when deciding when to parenthesize.
  //
  private var enableExpressionParentheses = true


  /**
   * Indents by an amount related to the current indentation level. This method is used during
   * rewriting to make the output look approximately nice.
   */
  private def indent() {
    for (i <- 0 until indentationLevel) {
      sink.print("    ")
    }
  }


  /**
   * Outputs the entire syntax tree in source code form. The output is sent to the PrintStream
   * object previously given to the constructor. This method adds a '\n' to the end of the output.
   *
   */
  def rewrite() {
    rewrite(syntaxTree)
    sink.print("\n")
  }


  /**
   * Outputs the syntax tree rooted at t in source code form. The output is sent to the
   * PrintStream object previously given to the constructor.
   *
   * @param t The tree to output.
   */
  private def rewrite(t: ASTNode) {
    var value = 0
    var currentChild = 0  // Used when processing struct/enum declarations.

    t.tokenType match {
      // Putting a space after all occurrences of RAW_IDENTIFIER is overkill. However, it is
      // important to include a space after RAW_IDENTIFIERS that are type names (at least when
      // they appear as a declaration specifier in a declaration or function definition). Ideally
      // the rewriter for those constructs would include the extra space when necessary. However,
      // it is easier to just include it here. Aside from making the output look a little funny,
      // the extra space is harmless in other cases.
      //
      case NesTLexer.RAW_IDENTIFIER =>
          sink.print(t.text)
          sink.print(" ")

      // Declarations
      // ------------

      // Raw tokens. These tokens just stand for themselves in the AST. These cases could be
      // handled by the default case instead. However, having them here makes it explicit which
      // tokens should be processed in this way. Eventually the default case should probably be
      // changed to throw an exception of some kind to indicate that an unexpected token was
      // encountered.
      //
      case NesTLexer.CALL     |
           NesTLexer.CHAR     |
           NesTLexer.COMMAND  |
           NesTLexer.CONST    |
           NesTLexer.EVENT    |
           NesTLexer.INT      |
           NesTLexer.POST     |
           NesTLexer.SHORT    |
           NesTLexer.SIGNED   |
           NesTLexer.TASK     |
           NesTLexer.TYPEDEF  |
           NesTLexer.UNSIGNED |
           NesTLexer.VOID =>
        sink.print(t.text)
        sink.print(" ")

      case NesTLexer.DECLARATION =>
        indent()
        for (child <- t.children) {
          rewrite(child)
          if (child.tokenType == NesTLexer.RAW_IDENTIFIER) sink.print(" ")
        }
        if (t.children(0).tokenType != NesTLexer.FUNCTION_DEFINITION) {
          sink.print(";")
        }
        sink.print("\n")

      case NesTLexer.DECLARATOR =>
        if (declaratorNestingLevels.peek() != 0) sink.print("(")
        value = declaratorNestingLevels.pop()
        declaratorNestingLevels.push(value + 1)
        for (child <- t.children) {
          rewrite(child)
          sink.print(" ")
        }
        value = declaratorNestingLevels.pop()
        declaratorNestingLevels.push(value - 1)
        if (declaratorNestingLevels.peek() != 0) sink.print(")")

      case NesTLexer.DECLARATOR_ARRAY_MODIFIER =>
        sink.print("[")
        if (t.children.length != 0) rewrite(t.children(0))
        sink.print("]")

      case NesTLexer.DECLARATOR_LIST =>
        for (i <- 0 until t.children.length) {
          if (i != 0) sink.print(", ")
          rewrite(t.children(i))
        }

      case NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER =>
        sink.print("( ")
        rewrite(t.children(0))
        sink.print(" )")

      case NesTLexer.ENUM =>
        sink.print("enum ")
        currentChild = 0
        if (t.children(currentChild).tokenType != NesTLexer.ENUMERATOR) {
          rewrite(t.children(currentChild))
          sink.print(" ")
          currentChild += 1
        }
        if (currentChild < t.children.length) {
          sink.print("{ ")
          var firstTime = true
          while (currentChild < t.children.length) {
            if (!firstTime) sink.print(", ")
            rewrite(t.children(currentChild))
            firstTime = false
            currentChild += 1
          }
          sink.print("} ")
        }

      case NesTLexer.ENUMERATOR =>
        rewrite(t.children(0))
        if (t.children.length > 1) {
          sink.print(" = ")
          rewrite(t.children(1))
        }

      case NesTLexer.FUNCTION_DEFINITION =>
        for (child <- t.children) {
          if (child.tokenType == NesTLexer.COMPOUND_STATEMENT) {
            sink.print("\n")
            indentationLevel += 1  // This is a hack.
          }
          rewrite(child)
          if (child.tokenType == NesTLexer.COMPOUND_STATEMENT) {
            indentationLevel -= 1
          }
        }

      case NesTLexer.IDENTIFIER_PATH =>
        for (i <- 0 until t.children.length) {
            if (i != 0) sink.print(".")
            rewrite(t.children(i))
        }

      case NesTLexer.INIT_DECLARATOR =>
        rewrite(t.children(0))
        if (t.children.length > 1) {
          sink.print(" = ")
          for (i <- 1 until t.children.length) {
            rewrite(t.children(i))
          }
        }

      case NesTLexer.INITIALIZER_LIST =>
        sink.print("{ ")
        for (i <- 0 until t.children.length) {
          if (i != 0) sink.print(", ")
          rewrite(t.children(i))
        }
        sink.print(" }")

      case NesTLexer.PARAMETER =>
        for (child <- t.children) {
          rewrite(child)
          if (child.tokenType == NesTLexer.RAW_IDENTIFIER) sink.print(" ")
        }

      case NesTLexer.PARAMETER_LIST =>
        declaratorNestingLevels.push(0)
        for (i <- 0 until t.children.length) {
            if (i != 0) sink.print(", ")
            rewrite(t.children(i))
        }
        declaratorNestingLevels.pop()

      case NesTLexer.POINTER_QUALIFIER =>
        sink.print("*")
        t.children.foreach(rewrite)

      case NesTLexer.STRUCT =>
        sink.print(t.text)
        sink.print(" ")
        currentChild = 0
        if (t.children(currentChild).tokenType != NesTLexer.DECLARATION) {
          rewrite(t.children(currentChild))
          sink.print(" ")
          currentChild += 1
        }
        if (currentChild < t.children.length) {
          sink.print("{\n")
          indentationLevel += 1
          while (currentChild < t.children.length) {
            rewrite(t.children(currentChild))
            currentChild += 1
          }
          indentationLevel -= 1
          indent()
          sink.print("} ")
        }

      // Statements
      // ----------

      case NesTLexer.CASE =>
        // Outdent the case label.
        indentationLevel -= 1
        indent()
        sink.print("case ")
        rewrite(t.children(0))
        sink.print(":\n")
        indentationLevel += 1
        rewrite(t.children(1))

      case NesTLexer.COMPOUND_STATEMENT =>
        // Outdent the braces.
        indentationLevel -= 1; indent(); sink.print("{\n"); indentationLevel += 1
        t.children.foreach(rewrite)
        indentationLevel -= 1; indent(); sink.print("}\n"); indentationLevel += 1

      // This handles 'default' in switch statements, but not in declarations.
      case NesTLexer.DEFAULT =>
        // Outdent the default label.
        indentationLevel -= 1; indent(); sink.print("default:\n"); indentationLevel += 1
        rewrite(t.children(0))

      case NesTLexer.FOR =>
        indent()
        sink.print("for( ")
        // The loop header.
        for (i <- 0 until 3) {
          if (i != 0) sink.print("; ")
          rewrite(t.children(i))
        }
        sink.print(" )\n")
        indentationLevel += 1
        rewrite(t.children(3))  // The controlled statement.
        indentationLevel -= 1

      case NesTLexer.FOR_CONDITION =>
        enableExpressionParentheses = false
        if (t.children.length == 1) rewrite(t.children(0))
        enableExpressionParentheses = true

      case NesTLexer.FOR_INITIALIZE =>
        enableExpressionParentheses = false
        if (t.children.length == 1) rewrite(t.children(0))
        enableExpressionParentheses = true

      case NesTLexer.FOR_ITERATION =>
        enableExpressionParentheses = false
        if (t.children.length == 1) rewrite(t.children(0))
        enableExpressionParentheses = true

      case NesTLexer.IF =>
        indent()
        sink.print("if( ")
        enableExpressionParentheses = false
        rewrite(t.children(0))
        enableExpressionParentheses = true
        sink.print(" )\n")
        indentationLevel += 1
        rewrite(t.children(1))
        indentationLevel -= 1
        if (t.children.length == 3) {
          indent()
          sink.print("else\n")
          indentationLevel += 1
          rewrite(t.children(2))
          indentationLevel -= 1
        }

      case NesTLexer.RETURN =>
        indent()
        sink.print("return ")
        if (t.children.length == 1) rewrite(t.children(0))
        sink.print(";\n")

      // Expression statements are handled here.
      case NesTLexer.STATEMENT =>
        indent()
        enableExpressionParentheses = false
        if (t.children.length == 1) rewrite(t.children(0))
        enableExpressionParentheses = true
        sink.print(";\n")

      case NesTLexer.SWITCH =>
        indent()
        sink.print("switch( ")
        enableExpressionParentheses = false
        rewrite(t.children(0))
        enableExpressionParentheses = true
        sink.print(" )\n")
        indentationLevel += 1
        rewrite(t.children(1))
        indentationLevel -= 1

      case NesTLexer.WHILE =>
        indent()
        sink.print("while( ")
        enableExpressionParentheses = false
        rewrite(t.children(0))
        enableExpressionParentheses = true
        sink.print(" )\n")
        indentationLevel += 1
        rewrite(t.children(1))
        indentationLevel -= 1

      // Expressions
      // -----------

      // All binary infix operators are handled the same way.
      case NesTLexer.AMP          |
           NesTLexer.AND          |
           NesTLexer.ASSIGN       |
           NesTLexer.BITANDASSIGN |
           NesTLexer.BITOR        |
           NesTLexer.BITORASSIGN  |
           NesTLexer.BITXOR       |
           NesTLexer.BITXORASSIGN |
           NesTLexer.COMMA        |
           NesTLexer.DIVASSIGN    |
           NesTLexer.DIVIDE       |
           NesTLexer.EQUAL        |
           NesTLexer.GREATER      |
           NesTLexer.GREATEREQUAL |
           NesTLexer.LESS         |
           NesTLexer.LESSEQUAL    |
           NesTLexer.LSHIFT       |
           NesTLexer.LSHIFTASSIGN |
           NesTLexer.MINUS        |
           NesTLexer.MINUSASSIGN  |
           NesTLexer.MODULUS      |
           NesTLexer.MODASSIGN    |
           NesTLexer.NOTEQUAL     |
           NesTLexer.OR           |
           NesTLexer.PLUS         |
           NesTLexer.PLUSASSIGN   |
           NesTLexer.RSHIFT       |
           NesTLexer.RSHIFTASSIGN |
           NesTLexer.STAR =>
        val oldExpressionParentheses = enableExpressionParentheses
        if (enableExpressionParentheses) sink.print("( ")
        enableExpressionParentheses = true
        rewrite(t.children(0))    // The left operand.
        sink.print(" ")
        sink.print(t.text)        // The operator itself.
        sink.print(" ")
        rewrite(t.children(1))    // The right operand.
        enableExpressionParentheses = oldExpressionParentheses
        if (enableExpressionParentheses) sink.print(" )")

      case NesTLexer.ADDRESS_OF =>
        sink.print("( &")
        rewrite(t.children(0))
        sink.print(" )")

      case NesTLexer.ARGUMENT_LIST =>
        sink.print("( ")
        for (i <- 0 until t.children.length) {
          if (i != 0) sink.print(", ")
          rewrite(t.children(i))
        }
        sink.print(" )")

      case NesTLexer.ARRAY_ELEMENT_SELECTION =>
        sink.print("[")
        rewrite(t.children(0))
        sink.print("]")

      case NesTLexer.ARROW =>
        sink.print("->")
        rewrite(t.children(0))

      case NesTLexer.BITCOMPLEMENT =>
        sink.print("~")
        rewrite(t.children(0))

      case NesTLexer.CAST =>
        sink.print("(")
        for (i <- 1 until t.children.length) {
          rewrite(t.children(i))
        }
        sink.print(")( ")
        rewrite(t.children(0))
        sink.print(" )")

      // The AST distinguishes this use of '*' from multiplication. How nice.
      case NesTLexer.DEREFERENCE =>
        sink.print("( *")
        rewrite(t.children(0))
        sink.print(" )")

      case NesTLexer.DOT =>
        sink.print(".")
        rewrite(t.children(0))

      case NesTLexer.MINUSMINUS =>
        sink.print("--")

      case NesTLexer.NOT =>
        sink.print("!")
        rewrite(t.children(0))

      case NesTLexer.PLUSPLUS =>
        sink.print("++")

      case NesTLexer.POSTFIX_EXPRESSION =>
        t.children.foreach(rewrite)

      case NesTLexer.PRE_DECREMENT =>
        sink.print("--")
        rewrite(t.children(0))

      case NesTLexer.PRE_INCREMENT =>
        sink.print("++")
        rewrite(t.children(0))

      // Perhaps the AST does not need to distinguish between these cases.
      case NesTLexer.SIZEOF_TYPE |
           NesTLexer.SIZEOF_EXPRESSION =>
        sink.print("sizeof( ")
        t.children.foreach(rewrite)
        sink.print(" )")

      case NesTLexer.UNARY_MINUS =>
        sink.print("-")
        rewrite(t.children(0))

      case NesTLexer.UNARY_PLUS =>
        sink.print("+")
        rewrite(t.children(0))

      // Large Scale Structure
      // ---------------------

      case NesTLexer.FILE =>
        for (child <- t.children) {
          if (!suppressRewriting || child.tokenType == NesTLexer.LINE_DIRECTIVE)
            rewrite(child)
        }

      // This is a simple hack. Emit a #include for line directives that reference header files,
      // but only if rewriting is not currently suppressed. Once we pass over a line directive
      // that references a header file, further rewriting is turned off... until we encounter a
      // line directive that references the main .nc file again.
      //
      case NesTLexer.LINE_DIRECTIVE =>
        val fileNameWithQuotes = t.children(0).text
        if (fileNameWithQuotes.endsWith(".h\"") || fileNameWithQuotes.endsWith(".h>")) {
          if (!suppressRewriting) {

            // Remove any leading path from the file name. This is necessary because cpp tends
            // to expand header paths when it writes the *.i files. However since the generated
            // program is typically in a different place than the original source this expansion
            // yields invalid paths in many cases. For example the path "./src/Client/global.h"
            // reflects the location where cpp was run. Compiling the program in a folder like
            // "./generated/Client/global.h" will fail even if the header global.h is in that
            // folder. The approach here is really hackish.
            //
            // TODO: Pass a prefix path into this class that specifies what should be removed.
            val startQuote =
              if (fileNameWithQuotes.charAt(fileNameWithQuotes.length - 1) == '\"')
                "\""
              else
                "<"

            val lastSlashIndex = fileNameWithQuotes.lastIndexOf('/')
            val simpleFileName =
              if (lastSlashIndex == -1)
                fileNameWithQuotes
              else
                startQuote + fileNameWithQuotes.substring(lastSlashIndex + 1)

            sink.print("#include " + simpleFileName + "\n")
          }
          suppressRewriting = true
        }
        else {
          suppressRewriting = false
        }

      case NesTLexer.IMPLEMENTATION =>
        sink.print("implementation {\n")
        indentationLevel += 1
        for (child <- t.children) {
          if (!suppressRewriting || child.tokenType == NesTLexer.LINE_DIRECTIVE)
            rewrite(child)
        }
        indentationLevel -= 1
        sink.print("}\n")

      case NesTLexer.INTERFACE =>
        // This is correct for 'interface' as it appears in specifications.
        indent()
        sink.print("interface ")
        rewrite(t.children(0))
        sink.print(";\n")

      case NesTLexer.MODULE =>
        sink.print("module ")
        rewrite(t.children(0))  // Name of the module.
        rewrite(t.children(1))  // Specification.
        if (t.children.length == 3) rewrite(t.children(2))  // Implementation.

      case NesTLexer.PROVIDES =>
        indent()
        sink.print("provides {\n")
        indentationLevel += 1
        t.children.foreach(rewrite)
        indentationLevel -= 1
        indent()
        sink.print("}\n")

      case NesTLexer.SPECIFICATION =>
        sink.print(" {\n")
        indentationLevel += 1
        t.children.foreach(rewrite)
        indentationLevel -= 1
        sink.print("}\n")

      case NesTLexer.USES =>
        indent()
        sink.print("uses {\n")
        indentationLevel += 1
        t.children.foreach(rewrite)
        indentationLevel -= 1
        indent()
        sink.print("}\n")

      // The NULL token is used as a placeholder to allow multiple nodes to replace a single
      // node when a tree is transformed. All of its children should be treated as if they are
      // its siblings.
      //
      case NesTLexer.NULL =>
        t.children.foreach(rewrite)

      // Is it right to have this default case? It is useful during development because it shows
      // the "next" token that needs to be implemented in order to get a proper rewriting.
      //
      case _ =>
        sink.print(t.text)
        sink.print(" ")
    }
  }
}
