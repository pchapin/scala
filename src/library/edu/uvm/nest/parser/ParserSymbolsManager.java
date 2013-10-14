//-----------------------------------------------------------------------
// FILE    : ParserSymbolsManager.java
// SUBJECT : Class for handling stacks of parser symbol tables.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest.parser;

import java.util.Stack;

/**
 * Class that manages a stack of symbols that are of interest to the parser. Note that parser
 * symbol tables are simplifications of the full symbol information needed by the compiler in
 * general. This class allows proper handling of nested scopes. Whenever a new scope is entered,
 * a new symbol table is created for that scope.
 * 
 * A stack of symbol tables is sufficient since the symbol tables are created and destroyed
 * dynamically as the parsing is being done (no need to record information about sibling
 * scopes).
 *
 * @author Peter
 */
public class ParserSymbolsManager {
  Stack<ParserSymbols> scopes = new Stack<ParserSymbols>();
  
  public ParserSymbolsManager() {
      enterScope();
  }

  /**
   * Stacks a new, empty symbol table on top of the symbol tables for the enclosing scopes. This
   * method should be called whenever a new scope is entered.
   */
  public void enterScope()
  {
      scopes.push(new ParserSymbols());
  }

  
  /**
   * Adds a type name to the currently active scope.
   *
   * @param name The name of the type to add.
   * @throws ParserSymbols.SymbolRedefinitionException
   * @throws ParserSymbols.SymbolConflictException
   */
  public void addType(String name)
  {
      try {
          scopes.peek().addType(name);
      }
      catch (Exception e) {
          // Eat all exceptions for now. These should be passed up but at the moment I don't
          // know how to allow user defined exceptions through ANTLR generated code. Google for
          // "ANTLR throws spec" (the ANTLR site is down at the moment).
      }
  }

  
  /**
   * Adds an ordinary identifier (non-type name) to the currently active scope.
   * 
   * @param name The name of the identifier to add.
   * @throws ParserSymbols.SymbolRedefinitionException
   * @throws ParserSymbols.SymbolConflictException
   */
  public void addIdentifier(String name)
  {
      try {
        scopes.peek().addIdentifier(name);
      }
      catch (Exception e) {
          // Eat all exceptions for now. These should be passed up but at the moment I don't
          // know how to allow user defined exceptions through ANTLR generated code. Google for
          // "ANTLR throws spec" (the ANTLR site is down at the moment).
      }
  }

  
  /**
   * Checks to see if the given name is the name of a type. Scopes are searched from the
   * current scope outward through all enclosing scopes until the global scope is reached
   * and searched. Note that a non-type name can hide a type name in an enclosing scope.
   *
   * @param name The name to check.
   * @return true if the name specifies a type, false otherwise.
   */
  public boolean isType(String name)
  {
      int i = scopes.size() - 1;
      while (i >= 0) {
          if (scopes.get(i).isType(name)) return true;
          if (scopes.get(i).isDefined(name)) return false;
          i = i - 1;
      }
      return false;
  }


  /**
   * Pops the symbol table stack by removing the top symbol table. This method should be called
   * whenever a scope is exited.
   */
  public void exitScope()
  {
      scopes.pop();
  }


  /**
   * Writes all symbol tables to standard output. This is useful for debugging purposes.
   */
  public void dump()
  {
      int i = scopes.size() - 1;
      while (i >= 0) {
          System.out.println("SCOPE LEVEL " + i + ": " + scopes.get(i));
          i = i - 1;
      }
      System.out.println("");
  }

}
