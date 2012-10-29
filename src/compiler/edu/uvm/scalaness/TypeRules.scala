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
                              
    println("First Test:  toModuleType")
    val adultBlinkModule = toModuleType(testBlinkModule)
    val adultCompoModule = toModuleType(testCompoModule)
  
    println("Second Test: typeWire")
    val composedMod = typeWire(adultBlinkModule, adultCompoModule)
  
    println("Third Test: typeInstantiate")
    val instMod = typeInstantiate(adultBlinkModule, List(Int32, Int16), List(Int16))
  
    println("Fourth Test: typeImage")
    typeImage(instMod)
  }
  
  
  // If its a nesT module, return it in the Scalaness form, it has a type judgement in front
  // of it.
  def toModuleType(mod: Module): (Map[TypeVariable, Representation], Module) = {
    (Map[TypeVariable, Representation](), mod)
  }
  

  // Wire two modules together, follow the proposed type rules.
  def typeWire(
      modOne: (Map[TypeVariable,Representation], Module), 
      modTwo: (Map[TypeVariable,Representation], Module)): (Map[TypeVariable, Representation], Module) = {

    val (typeMapOne, typeOne, valOne, impOne, expOne) = modOne match {
      case (typeMap, Module(typePars, valPars, imports, exports)) => {
        (typeMap, typePars, valPars, imports, exports)
      }
      case _ => {
        throw new Exception("require a module type during wiring")
      }
    }

    val (typeMapTwo, typeTwo, valTwo, impTwo, expTwo) = modTwo match {
      case (typeMap, Module(typePars, valPars, imports, exports)) => {
        (typeMap, typePars, valPars, imports, exports)
      }
      case _ => {
        throw new Exception("require a module type during wiring")
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
  
  
  def typeInstantiate(
      mod: (Map[TypeVariable, Representation], Module), 
      listT1: List[Representation], listT2: List[Representation]): (Map[TypeVariable, Representation],Module) = {
  
    val (typeParList, valParList, impList, expList) = mod match {
      case (typeMap, Module(typePars, valPars, imports, exports)) => {
        if (typeMap.size == 0)
          (typePars, valPars, imports, exports)
        else throw new Exception("bare module type required")
      }
      case _ => throw new Exception("bare module type required")
    }
    
    // Upper bounds on what is asked for in module declaration
    val tList = for (i <- 0 until typeParList.length) yield {
      val currT = typeParList(i) match {
        case (TypeVariable(x), someType) => TypeVariable(x)
        case _ => throw new Exception("expected type variables")
      } 
      currT
    }
    
    // Upper bounds on what is asked for in module declaration
    val tau1List = for (i <- 0 until typeParList.length) yield {
      val currTau = typeParList(i) match {
        case (TypeVariable(x), someType) => someType
        case _ => throw new Exception("expected type variables")
      } 
      currTau
    }
    
    // Upper bounds on what is asked for in module declaration
    val tau2List = for (i <- 0 until valParList.length) yield {
      val currTau = valParList(i) match {
        case (someString, someType) => someType
        case _ => throw new Exception("expected some value")
      }
      currTau
    }
   
    if (!(seriesSubType(listT1,tau1List.toList) && seriesSubType(listT2, tau2List.toList)))
      throw new Exception("type and value parameters require subtype relation")
    
    val typeVarMap = newTypeMap(tList.toList, listT1)
    
    (typeVarMap, Module(List(),List(),impList,expList))
  }
 
  
  def typeImage(mod: (Map[TypeVariable, Representation], Module)): (Map[TypeVariable, Representation], Module) = {
    mod match {
      case (typeMap, Module(List(), List(), imports, exports)) => {
        (typeMap, Module(List(), List(), imports, exports))
      }
      case _ => throw new Exception("image expects runnable module type")
    }
  }
  
  
  // Double arrows pointing down operation in nesT paper
  private def nonExclusiveMapMerge(
      first : List[(String,  Representation)],
      second: List[(String, Representation)]): List[(String, Representation)] = {
    
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
        else throw new Exception("same domain must have same type")
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
  
  
  private def nonExclusiveTypeMapMerge(
      first : List[(TypeVariable, Representation)], 
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
        else throw new Exception("same domain must have same type")
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
  private def removeDomain(
      first : List[(String, Representation)],
      second: List[(String, Representation)]):List[(String, Representation)] = {
    
    val firstKeys  = getListKeys(first)
    val secondKeys = getListKeys(second)
    var returnList = List[(String, Representation)]()
    for (i <- 0 until first.length) {
      if (!(secondKeys.contains(firstKeys(i))))
        returnList ::= first(i)
    }
    returnList
  }  
  
  private def getListKeys(myList: List[(String, Representation)]):List[String] = {
    val myKeys = for (i <- 0 until myList.length) yield {
                   val (key, _) = myList(i)
                   key
                 }
     myKeys.toList
  }
  
  
  private def getListTypeKeys(
      myList: List[(TypeVariable, Representation)]): List[TypeVariable] = {
    
    val myKeys = for (i <- 0 until myList.length) yield {
                   val (key, _) = myList(i)
                   key
                 }
     myKeys.toList
  }
  
  
  private def seriesSubType(
      listOne: List[Representation],
      listTwo: List[Representation]): Boolean = {
    
    var returnBool = true
    if (listOne.length == listTwo.length) {
      for (i <- 0 until listOne.length) {
        if (!(areSubtypes(listOne(i), listTwo(i))))
          returnBool = false
      }
    }
    else 
      throw new Exception("parameter lists must be of equal length")
      
    returnBool
  }
  
  
  // Take a set of type values and add a new upper bound
  private def newTypeMap(
      listOne: List[TypeVariable],
      listTwo: List[Representation]): Map[TypeVariable, Representation] = {
    
    val returnList = for (i <- 0 until listOne.length) yield {
      (listOne(i), listTwo(i))
    }
    
    returnList.toMap
  }
  
  // Lift a Scalaness level type into a Mininess level type
  def liftTypeString(
    typeString: String): Representation = {
      val returnType = typeString match {
        case "LiftableTypes.UInt8"  => UInt8
        case "LiftableTypes.UInt16" => UInt16
        case "LiftableTypes.UInt32" => UInt32
        case "LiftableTypes.Int8"   => Int8
        case "LiftableTypes.Int16"  => Int16
        case "LiftableTypes.Int32"  => Int32
        case _ => throw new Exception("Not a liftable type")
      }
      
      returnType
    }
  
}
