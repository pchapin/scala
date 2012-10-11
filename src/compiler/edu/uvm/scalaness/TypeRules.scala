//-----------------------------------------------------------------------
// FILE    : TypeRules.scala
// SUBJECT : An object that implements the special typing rules of Scalaness.
// AUTHOR  : (C) Copyright 2012 by Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import edu.uvm.mininess.parser.MininessLexer
import edu.uvm.mininess.MininessTypes._


object TypeRules {
  
  def check = {
    // These are the Mininess types of two modules that will be used to test the Scalaness
    // type rules. The actual typing will be done on Scalaness types that correspond to these
    // Mininess types. The scalaness types may not be exact, but should be close enough to have
    // this be a good start.
    val testBlinkModule =
      Module(List((TypeVariable("flashCountType"),Int32),(TypeVariable("periodType"),Int16)),
             List(("period",Int16)),
             List(("led0Toggle",Function(Uninit,List())),("led1Toggle",Function(Uninit,List())),("led2Toggle",Function(Uninit,List())),
                  ("get_initial_count",Function(TypeVariable("flashCountType"),List())),("startPeriodic",Function(Uninit,List(Int32)))),
             List(("fired",Function(Uninit,List())),("booted",Function(Uninit,List()))))
           
    val testCompoModule =
      Module(List((TypeVariable("flashCountType"),Int32)),
             List(("blinkCount",Int32)),
             List(),
             List(("get_initial_count",Function(TypeVariable("flashCountType"),List()))))
                              
    println("First Test:  ModuleT")
    val adultBlinkModule = practiceModuleT(testBlinkModule)
    val adultCompoModule = practiceModuleT(testCompoModule)
  
    println("Second Test: Wire")
    val composedMod = practiceWire(adultBlinkModule, adultCompoModule)
  
    println("Third Test: Instantiate")
    val instMod = practiceInstantiate(adultBlinkModule, List(Int32, Int16), List(Int16))
  
    println("Fourth Test: Validate")
    practiceValidate(instMod)
  }
  
  
  // If its a nesT module, return it in the Scalaness form, it has a type judgement in front of
  // it.
  def practiceModuleT(mod: Module): (Map[TypeVariable, Representation], Module) = {
    mod match {
      case Module(typePars, valPars, imports, exports) => {
        (Map[TypeVariable, Representation](), mod)
      }
      case _ => {
        throw new Exception("Expected module type")
      }
    }
  }
  

  // Wire two modules together, follow the proposed type rules.
  def practiceWire(
      modOne: (Map[TypeVariable,Representation], Module), 
      modTwo: (Map[TypeVariable,Representation], Module)): (Map[TypeVariable, Representation], Module) = {

    val (typeMapOne, typeOne, valOne, impOne, expOne) = modOne match {
      case (typeMap, Module(typePars, valPars, imports, exports)) => {
        (typeMap, typePars, valPars, imports, exports)
      }
      case _ => {
        throw new Exception("We require a module type during wiring")
      }
    }

    val (typeMapTwo, typeTwo, valTwo, impTwo, expTwo) = modTwo match {
      case (typeMap, Module(typePars, valPars, imports, exports)) => {
        (typeMap, typePars, valPars, imports, exports)
      }
      case _ => {
        throw new Exception("We require a module type during wiring")
      }
    }
    val impOneRemoved = removeDomain(impOne, expTwo)
    val typeMap       = nonExclusiveTypeMapMerge(typeMapOne.toList, typeMapTwo.toList)
    val typeVars      = nonExclusiveTypeMapMerge(typeOne, typeTwo)
    val valVars       = nonExclusiveMapMerge(valOne, valTwo)
    val imports       = impOneRemoved:::impTwo
    val exports       = expOne
    
    (typeMap.toMap, Module(typeVars,valVars,imports,exports))
  }
  
  
  def practiceInstantiate(
      mod: (Map[TypeVariable, Representation], Module), 
      listT1: List[Representation], listT2: List[Representation]): (Map[TypeVariable, Representation],Module) = {
  
    val (typeParList, valParList, impList, expList) = mod match {
      case (typeMap, Module(typePars, valPars, imports, exports)) => {
        if (typeMap.size == 0)
          (typePars, valPars, imports, exports)
        else throw new Exception("Bare Module Type Required")
      }
      case _ => throw new Exception("Bare Module Type Required")
    }
    
    // Upper bounds on what is asked for in module declaration
    val tList = for (i <- 0 until typeParList.length) yield {
      val currT = typeParList(i) match {
        case (TypeVariable(x), someType) => TypeVariable(x)
        case _ => throw new Exception("Expected type variables")
      } 
      currT
    }
    
    // Upper bounds on what is asked for in module declaration
    val tau1List = for (i <- 0 until typeParList.length) yield {
      val currTau = typeParList(i) match {
        case (TypeVariable(x), someType) => someType
        case _ => throw new Exception("Expected type variables")
      } 
      currTau
    }
    
    // Upper bounds on what is asked for in module declaration
    val tau2List = for (i <- 0 until valParList.length) yield {
      val currTau = valParList(i) match {
        case (someString, someType) => someType
        case _ => throw new Exception("Expected some value")
      }
      currTau
    }
   
    if (!(seriesSubType(listT1,tau1List.toList) && seriesSubType(listT2, tau2List.toList)))
      throw new Exception("Type and value parameters require subtype relation")
    
    val typeVarMap = newTypeMap(tList.toList, listT1)
    
    (typeVarMap, Module(List(),List(),impList,expList))
  }
 
  
  def practiceValidate(mod: (Map[TypeVariable, Representation], Module)): (Map[TypeVariable, Representation], Module) = {
    mod match {
      case (typeMap, Module(List(), List(), imports, exports)) => {
        (typeMap, Module(List(), List(), imports, exports))
      }
      case _ => throw new Exception("Validate expects runnable Module type")
    }
  }
  
  
  // Double arrows pointing down operation in nesT paper
  def nonExclusiveMapMerge(first: List[(String,  Representation)], second: List[(String, Representation)]): List[(String, Representation)] = {
    val firstMap   = first.toMap
    val secondMap  = second.toMap
    val firstKeys  = getListKeys(first)
    val secondKeys = getListKeys(second)
    var doubles = List[Any]()
    for (i <- 0 until firstKeys.length) {
      if (secondMap.contains(firstKeys(i))) {
        if (firstMap.get(firstKeys(i)) == secondMap.get(firstKeys(i))) {
          doubles ::= firstKeys(i)
        }
        else throw new Exception("Same domain must have same type")
      }
    }
    var returnList = List[(String,Representation)]()
    returnList :::= first
    for (i <- 0 until second.length) {
      if (!(doubles.contains(secondKeys(i))))
         returnList ::= second(i)
    }                   
    returnList
  }
  
  
  def nonExclusiveTypeMapMerge(first : List[(TypeVariable, Representation)], 
                               second: List[(TypeVariable, Representation)]): List[(TypeVariable, Representation)] = {
    val firstMap   = first.toMap
    val secondMap  = second.toMap
    val firstKeys  = getListTypeKeys(first)
    val secondKeys = getListTypeKeys(second)
    var doubles = List[Any]()
    for (i <- 0 until firstKeys.length) {
      if (secondMap.contains(firstKeys(i))) {
        if (firstMap.get(firstKeys(i)) == secondMap.get(firstKeys(i))) {
          doubles ::= firstKeys(i)
        }
        else throw new Exception("Same domain must have same type")
      }
    }
    var returnList = List[(TypeVariable,Representation)]()
    returnList :::= first
    for (i <- 0 until second.length) {
      if (!(doubles.contains(secondKeys(i))))
         returnList ::= second(i)
    }                   
    returnList
  }
  
  
  // SLASH operation in NesT paper
  def removeDomain(first: List[(String, Representation)], second: List[(String, Representation)]):List[(String, Representation)] = {
    val firstKeys  = getListKeys(first)
    val secondKeys = getListKeys(second)
    var returnList = List[(String, Representation)]()
    for (i <- 0 until first.length) {
      if (!(secondKeys.contains(firstKeys(i))))
        returnList ::= first(i)
    }
    returnList
  }  
  
  def getListKeys(myList: List[(String, Representation)]):List[String] = {
    val myKeys = for (i <- 0 until myList.length) yield {
                   val (key, _) = myList(i)
                   key
                 }
     myKeys.toList
  }
  
  
  def getListTypeKeys(myList: List[(TypeVariable, Representation)]):List[TypeVariable] = {
    val myKeys = for (i <- 0 until myList.length) yield {
                   val (key, _) = myList(i)
                   key
                 }
     myKeys.toList
  }
  
  
  def seriesSubType(listOne: List[Representation], listTwo: List[Representation]): Boolean = {
    var returnBool = true
    if (listOne.length == listTwo.length) {
      for (i <- 0 until listOne.length) {
        if (!(areSubtypes(listOne(i), listTwo(i))))
          returnBool = false
      }
    }
    else 
      throw new Exception("Parameter lists must be of equal length")
      
    returnBool
  }
  
  
  // Take a set of type values and add a new upper bound
  def newTypeMap(listOne: List[TypeVariable], listTwo: List[Representation]): Map[TypeVariable, Representation] = {
    
    val returnList = for (i <- 0 until listOne.length) yield {
      (listOne(i), listTwo(i))
    }
    
    returnList.toMap
  }
  
}
