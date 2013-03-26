//-----------------------------------------------------------------------
// FILE    : MininessTypes.scala
// SUBJECT : Internal representation (AST) of types used in Mininess code.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

object MininessTypes {

  class MininessTypeException(message: String) extends Exception(message)

  /**
   * Instances of this class describe Scalaness's representation of a nesC type.
   */
  sealed abstract class Representation


  // Primitive types.
  case object Okay   extends Representation { override def toString = "OKAY"     }
  case object Uninit extends Representation { override def toString = "void"     }
  case object Char   extends Representation { override def toString = "char"     }
  case object UInt8  extends Representation { override def toString = "uint8_t"  }
  case object UInt16 extends Representation { override def toString = "uint16_t" }
  case object UInt32 extends Representation { override def toString = "uint32_t" }
  case object Int8   extends Representation { override def toString = "int8_t"   }
  case object Int16  extends Representation { override def toString = "int16_t"  }
  case object Int32  extends Representation { override def toString = "int32_t"  }
  case object ErrorT extends Representation { override def toString = "error_t"  }
  case object Top    extends Representation { override def toString = "TOP"      }
  
  // Type variables.
  case class TypeVariable(name: String) extends Representation
  
  // Structured types.
  type TypeBound = (TypeVariable, Representation)
  type TypeBinding = (String, Representation)
  case class Structure(name: String, members: List[(String, Representation)]) extends Representation
  case class Array(elementType: Representation, size: String) extends Representation
  case class Pointer(targetType: Representation) extends Representation
  
  case class Function(
    returnType    : Representation,
    parameterTypes: List[Representation]) extends Representation

  
  // Module types.
  type Import = (String, Representation)       // Parameter types not considered here.
  type Export = (String, Representation)       // Parameter types not considered here.
  case class Module(
    typeParameters : List[TypeBound],
    valueParameters: List[TypeBinding],
    imports        : List[Import],
    exports        : List[Export]) extends Representation
  
  
  def promote(delta: Map[String, Representation], t: String): Representation = {
    val finalType = delta.get(t) match {
      case Some(TypeVariable(tvar)) => promote(delta, tvar)
      case Some(structuredType) => structuredType 
      case None => throw new MininessTypeException(s"Type Variable $t must exist in Delta")
    }
    finalType
  } // Recursively looks up the type variable until a structured type is found or returns Uninit.
    // Changed to take in Map[String,TR], t: string, and promote(delta, tvar) from TypeVariable

  /**
   * Looks up the type of a member in a structure that is indexed by a given identifier
   */
  def memberType(struct: Representation, index: String): Representation = {
    val memberList = struct match {
      case Structure(name, members) => members
      // case Uninit => List() // FLAG: This should be case Interface => lookupInterface("CommandName")
      case _ => throw new MininessTypeException("Must be structure type")
    }

    var currMbr = memberList.size
    
    while (currMbr > 0) {
    
      currMbr = currMbr - 1
      
      val (mbrName, mbrType) = memberList(currMbr) match {
        case (str, someType) => (str,someType)
        case _ => throw new MininessTypeException("Invalid member")
      }
      
      if (index == mbrName)
        return mbrType
    }
    return Function(Uninit,List()) // FLAG - just a placeholder to see what happens with Interfaces
    throw new MininessTypeException("Invalid address")
  }
    
  /**
   * Returns the least upper bound between two integer types
   */
  def leastUpperBound(left: Representation, right: Representation) = {
    if (left == right) left
    else {
      left match {
      
        case Int8 => right match {
          case Int16 | Int32 => right
          case _ => throw new MininessTypeException("Incompatible Types")
        }
        
        case Int16 => right match {
          case Int8 => Int16
          case Int32 => Int32
          case _ => throw new MininessTypeException("Incompatible Types")
        }
        
        case Int32 => right match {
          case Int8 | Int16 => Int32
          case _ => throw new MininessTypeException("Incompatible Types")
        }
        
        case _ => throw new MininessTypeException("Incompatible Types")
      }
    }
  }

  /**
   * Returns true if left <: right using nesT subtyping rules.
   */
  def areSubtypes(left: Representation, right: Representation) = {

    if (left == right || right == Top) true
    
    else {
      
      left match {

        case Int8 => right match {
          case Int16 | Int32 => true
          case _  => false
        }

        case Int16 => right match {
          case Int32 => true
          case _ => false
        }

        case UInt8 => right match {
          case UInt16 | UInt32 => true
          case _  => false
        }

        case UInt16 => right match {
          case UInt32 => true
          case _ => false
        }
        
        case Array(aType, aSize) => right match {
          case Array(aType, "") => true
          case _ => false
        }
        
        case Structure(_, leftMemberList) => right match {
          case Structure(_, rightMemberList) => {
            var passedTest = true
            if (leftMemberList.size < rightMemberList.size)
              passedTest = false
            else {
              for (i <- 0 until rightMemberList.size) {
                if (!(rightMemberList(i) == leftMemberList(i)))
                  passedTest = false
              }
            }
            passedTest
          }
          case _ => false 
        } // Updated so now to be a subtype the parameters must be identical and in the exact order to be true.

        
        case _ => false
      }
    }
  }
  
  /**
   * Returns true if left type can be converted into the right type
   */

  def stringToType(str: String) = {
    val returnType = str match {
      case "int" => Int16
      case "char" => Char
      case _ => Structure(str,List())
    }
    returnType
  }
  
  def findChild(node: ASTNode, token: Int): ASTNode = {
    for (i <- 0 until node.children.length) {
      if (node.children(i).tokenType == token)
        return node.children(i)
    }
    throw new Exception("UNABLE TO LOCATE CHILD OF TOKEN: " + token) 
  }
  
  def existsChild(node: ASTNode, token: Int): Boolean = {
    for (i <- 0 until node.children.length) {
      if (node.children(i).tokenType == token)
        return true
    }
    false
  }
   
  def isCompatible(
    left : Representation,
    right: Representation,
    typeRelation: TypeCompatibilityRelation): Boolean = {
      if (areSubtypes(left, right))
        return true
      val leftType = left match {
        case Structure(structName, fields) => Structure(structName, List())
        case _ => left
      }
      val rightType = right match {
        case Structure(structName, fields) => Structure(structName, List())
        case _ => right
      }
    typeRelation(leftType, rightType)}


}
