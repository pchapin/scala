//-----------------------------------------------------------------------
// FILE    : TypeAbbreviation.scala
// SUBJECT : Instances of MetaType represent Mininess types.
// AUTHOR  : (C) Copyright 2012 by Michael P. Watson <mpwatson@uvm.edu>
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import edu.uvm.mininess.MininessTypes

class TypeAbbreviation( val fullType: String, val params: List[String]) {
    val nesTType: MininessTypes.Representation = MininessTypes.Int32
    val numParams = params.length
    
    //def toNesTModuleType(): (Map[TypeVariable, Representation], Module) {
    //}
    
    def toNesTModuleType() {
      println("This is a NesTModuleType")
    }
    
    def getNesTType(): MininessTypes.Representation = {
      return nesTType
    }
    
    def getFullType(): String = {
      fullType
    }
    
    def parameterize(newParams: List[String]): String = {
      if (params.length != newParams.length)
        throw new Exception("Parameterize given incorrect list length of parameters for Type Abbreviation")
      var returnString = fullType
      for (i <- 0 until params.length) {
        returnString = returnString.replaceAll(params(i),newParams(i))
      }
      returnString
    }
    

}