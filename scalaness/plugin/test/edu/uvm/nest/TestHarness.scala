//-----------------------------------------------------------------------
// FILE    : TestHarness.scala
// SUBJECT : Trait containing various helper methods for the test cases.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import parser.ParserSymbolsManager

trait TestHarness {

  /**
   * Create a fresh global symbol table stack that is preloaded with certain type names from the TinyOS library. This
   * symbol table stack is used in tests that are intended to process entire, realistic files. Unlike normal nesC,
   * global symbols defined in one file should <em>not</em> be carried over to the next. Thus this method must be used
   * before each appropriate test.
   *
   * @return A fresh global symbol table stack preloaded with certain type names.
   */
  def initializeGlobalSymbols(): ParserSymbolsManager = {
    val globalTypes = Array("bool", "error_t", "message_t")

    val globalSymbols = new ParserSymbolsManager()

    for (typeName <- globalTypes) {
      globalSymbols.addType(typeName)
    }
    globalSymbols
  }

}
