//-----------------------------------------------------------------------
// FILE    : ParserSymbols.java
// SUBJECT : Class representing a single scope symbol table as used by the parser.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess.parser;

import java.util.Set;
import java.util.TreeSet;

/**
 * This class records information about each name in a particular scope. The parser only cares
 * about the distinction between type names and non-type (ordinary identifier) names. Because of
 * the possibility of hiding it is necessary to record non-type names so that they can be found
 * in inner scopes properly.
 *
 * @author Peter
 */
public class ParserSymbols {
  
  /**
   * Exception class used to signal duplicate symbols in the same scope.
   */
  public static class SymbolRedefinitionException extends Exception {
      SymbolRedefinitionException(String message) {
          super(message);
      }
  }

  
  /**
   * Exception class used to signal conflicting symbols in the same scope (symbols that are
   * used as both type names and non-type names).
   */
  public static class SymbolConflictException extends Exception {
      SymbolConflictException(String message) {
          super(message);
      }
  }

  
  private Set<String> types = new TreeSet<String>();
  private Set<String> identifiers = new TreeSet<String>();

  /**
   * Adds a type name to the symbol table.
   *
   * @param name The name of the type to add.
   */
  public void addType(String name)
          throws SymbolRedefinitionException, SymbolConflictException
  {
      if (types.contains(name)) {
          throw new SymbolRedefinitionException("Symbol: " + name + " already defined");
      }
      if (identifiers.contains(name)) {
          throw new SymbolConflictException("Symbol: " + name +" already used as identifier");
      }
      types.add(name);
  }

  
  /**
   * Adds an ordinary identifier (a non-type name) to the symbol table.
   *
   * @param name The name of the identifier to add.
   */
  public void addIdentifier(String name)
          throws SymbolRedefinitionException, SymbolConflictException
  {
      if (identifiers.contains(name)) {
          throw new SymbolRedefinitionException("Symbol: " + name + " already defined");
      }
      if (types.contains(name)) {
          throw new SymbolConflictException("Symbol: " + name + " already used as a type");
      }
      identifiers.add(name);
  }


  /**
   * Checks a name to see if it specifies a type.
   *
   * @param name The name to check.
   * @return true if the given name specifies a type in this scope; false if the name specifies
   * a non-type or if the name is not defined in this scope.
   */
  public boolean isType(String name)
  {
      return types.contains(name);
  }


  /**
   * Checks a name to see if it exists in this scope.
   * @param name The name to check.
   * @return true if the name is defined in this specific scope as either a type name or an
   * ordinary identifier; false otherwise.
   */
  public boolean isDefined(String name)
  {
      return types.contains(name) || identifiers.contains(name);
  }

  
  @Override
  public String toString()
  {
      return "(Types: " + types.toString() + "; Identifiers: " + identifiers.toString();
  }

}
