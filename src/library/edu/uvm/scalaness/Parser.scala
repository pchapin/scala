//-----------------------------------------------------------------------
// FILE    : Parser.scala
// SUBJECT : A module for parsing Mininess code at runtime.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.{BufferedReader, FileInputStream, InputStreamReader}
import edu.uvm.mininess
import edu.uvm.mininess.InterfaceUnwrapper

object Parser {
  
  /**
   * Parse a Mininess inclusion during the execution of the Scalaness program. Although the
   * Scalaness compiler parses the inclusion for purposes of type checking, the running program
   * only has access (currently) to the original source code and thus it needs to be parsed
   * again.
   * 
   * @param mininessFileName The path to source file to parse. This path is relative to the
   * program's working directory or  (after deleting any leading dot) absolute inside the
   * program's jar file.
   * @param typeVars A list of type parameter names. This is needed because in C-like languages
   * it is necessary to distinguish type names from non-type names during parsing.
   */
  def reparse(mininessFileName: String, typeVars: List[String]) = {
    
    val MininessReader = try {
      // Try getting the file out of the file system.
      new BufferedReader(new InputStreamReader(new FileInputStream(mininessFileName)))
    }
    catch {
      case ex: java.io.FileNotFoundException =>
        // If that didn't work, try getting it out of the jar file.
        val adjustedName =
          if (mininessFileName.charAt(0) == '.') mininessFileName.substring(1) else mininessFileName
        new BufferedReader(new InputStreamReader(getClass.getResourceAsStream(adjustedName)))
    }
    
    // TODO: Use two different parsing methods in the compiler and in the runtime system.
    val abstractSyntax = try {
      mininess.parser.parseMininessInclusion(MininessReader, typeVars)
    }
    finally MininessReader.close()
    // TODO: Make the location of the interface definitions configurable.
    // Notice that this is a run time configuration instead of a compile time configuration.
    // When the compiler hands Mininess ASTs to the run time already parsed and already with
    // their interfaces unwrapped this issue will be moot.
    val interfaceWorker = new InterfaceUnwrapper(List("interfaces"))
    interfaceWorker.unwrapInterface(abstractSyntax)
  }

}
