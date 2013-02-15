//-----------------------------------------------------------------------
// FILE    : MininessTyper.scala
// SUBJECT : Class for type checking Mininess inclusions.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//                             and Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import parser.MininessLexer

object MininessTyper {

  class PositionalMininessTypeException(
        message: String,
    val line   : Int,
    val column : Int) extends Exception(message) {

    def this(message: String) = this(message, -1, -1)
  }

}


/**
 * Wraps facilities for type checking Minimal nesC code.
 *
 * @param typeVars A map of type variable names to their upper bound types. These type variables
 * parameterize the entire component.
 * @param typeRelation The isCompatible predicate. Two types are in this relation if the first is
 * convertable to the second.
 * @param debugFlag Set to true if debugging information should be dumped during the check.
 */
class MininessTyper(
  typeVars    : Map[String, MininessTypes.Representation],
  valueVars   : Map[String, MininessTypes.Representation],
  typeRelation: TypeCompatibilityRelation,
  debugFlag   : Boolean = false) {

  // For convenience
  import MininessTyper._
  import MininessTypes._
  import InterfaceDirectionality._

  
  /**
   * Type check a Mininess inclusion. Calling this method on an ASTNode causes that node and all
   * its child nodes to be type checked. If this method returns normally (and not by way of an
   * exception) then there are no type errors.
   *
   * @param node The AST node to be type checked. This check extends recursively to all child
   * nodes, however the node provided to this method should be a non-expression node.
   *
   * @return The representation of the node's type or None if the node does not have a type.
   * @throws PositionalNesCTypeException if a type error is detected.
   */
  def checkMininessInclusion(node: ASTNode, depth: Int = 0): Option[Representation] = {

    class TypeException(message: String) extends
      PositionalMininessTypeException(message, node.line, node.positionInLine)

  if (debugFlag && (node.parent == None)) TreeConverter.dumpAST(node)
      
    val resultType = node match {
      
      case ASTNode(MininessLexer.CASE, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars,t)
          case Some(childType) => childType
          case _ => throw new TypeException("'case' expression must have a type")
        }
        if (areSubtypes(childType, Int32)) {
          val bodyType = checkMininessInclusion(children(1), depth + 1)
          Some(Okay)
        }
        else throw new TypeException("'case' expression must be an integer")
      } // Case condition just has to be subtype of Int16? Or more specific?

      case ASTNode(MininessLexer.CHAR, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.COMMAND, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.COMPOUND_STATEMENT, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      }

      case ASTNode(MininessLexer.CONSTANT, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.DECLARATION, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.DECLARATOR, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.DECLARATOR_ARRAY_MODIFIER, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.DECLARATOR_LIST, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.DECLARATOR_PARAMETER_LIST_MODIFIER, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.DEFAULT, _, children, _, _) => {
        val childType = checkMininessInclusion(children(0), depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.ERROR_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.EVENT, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.FILE, _, children, _, _) => {
        var moduleChild = -1
        for (i <- 0 until children.length) {
          if (children(i).tokenType == MininessLexer.MODULE)
            moduleChild = i
          else
            checkMininessInclusion(children(i), depth + 1)
        }
        val returnType = if (moduleChild >= 0)
                           checkMininessInclusion(children(moduleChild), depth + 1)
                         else
                           Some(Okay)
        returnType
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.FOR, _, children, _, _) => {
        val firstChildType  = checkMininessInclusion(children(0), depth + 1)
        val secondChildType = checkMininessInclusion(children(1), depth + 1)
        val thirdChildType  = checkMininessInclusion(children(2), depth + 1)
        Some(Okay)
      } // Check children, OKAY

      case ASTNode(MininessLexer.FOR_CONDITION, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("'for' condition must have a type")
        }
        if (areSubtypes(childType, Int32) || areSubtypes(childType, UInt32)) {
          Some(Okay)
        }
        else throw new TypeException("'for' condition must be a signed or unsigned integer")
      } // Check for subtype of Int, OKAY

      case ASTNode(MininessLexer.FOR_INITIALIZE, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.FOR_ITERATION, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.FUNCTION_DEFINITION, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.IDENTIFIER_PATH, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.IF, _, children, _, _) => {
        val conditionType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(conditionType) => conditionType
          case _ => throw new TypeException("'if' condition must have a type")
        }
        if (areSubtypes(conditionType, Int32) || areSubtypes(conditionType, UInt32)) {
          val firstChildType = checkMininessInclusion(children(1), depth + 1)
          if (children.length == 3) {
            val secondChildType = checkMininessInclusion(children(2), depth + 1)
          }
          Some(Okay)
        }
        else throw new TypeException("'if' condition must be a signed or unsigned integer")
      }

      case ASTNode(MininessLexer.IMPLEMENTATION, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.INIT_DECLARATOR, _, children, _, _) => {
        checkMininessInclusion(children(0), depth + 1)
        if (children.length > 1)
          checkMininessExpression(children(1), depth + 1)  // The initilizer is an expression.
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.INT, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.INT8_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.INT16_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.INT32_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.INTERFACE, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.LINE_DIRECTIVE, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.MODULE, _, children, _, symList) => {

        val exportList = buildIEList(Declarations.extractExports(node), node)
        val importList = buildIEList(Declarations.extractImports(node), node)
        // val valueParameters = buildValueParameters(symList)
        val valueParameters = valueVars.toList
        val typeParameters = buildTypeParameters(typeVars.toList)
        for (child <- node.children)
          checkMininessInclusion(child, depth + 1)
        /* println("T:")
           println(typeParameters)
           println("V:")
           println(valueParameters)
           println("I:")
           println(importList)
           println("E:")
           println(exportList) 
         */        
        Some(Module(typeParameters, valueParameters, importList, exportList))
      } // TAG - Checks children and builds I/E lists, needs var maps

      case ASTNode(MininessLexer.NULL, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.PARAMETER, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.PARAMETER_LIST, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.POINTER_QUALIFIER, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.POSTFIX_EXPRESSION, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.PROVIDES, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.RAW_IDENTIFIER, ident, _, _, symList ) => {
         if (debugFlag) println(ident)
         Some(Symbols.lookupVariable(node, ident))
      }

      case ASTNode(MininessLexer.RETURN, _, children, _, _) => {
        for (child <- children)
          checkMininessExpression(child, depth + 1)  // RETURN has at most one child.
        Some(Okay)
      } // TAG - Return type - needs to compare to return type of function to see if valid

      case ASTNode(MininessLexer.SPECIFICATION, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.STATEMENT, _, children, _, _) => {
        for (child <- children)
          checkMininessExpression(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.STRING_LITERAL, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.STRUCT, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(MininessLexer.SWITCH, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("'switch' condition must have a type")
        }
        if (areSubtypes(childType, Int32)) {
          val bodyType = checkMininessInclusion(children(1), depth + 1)
          Some(Okay)
        }
        else throw new TypeException("'switch' condition must be an integer")
      }
      
      case ASTNode(MininessLexer.TYPEDEF, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.UINT8_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.UINT16_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.UINT32_T, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.UNSIGNED, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.USES, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.VOID, _, children, _, _) => {
        for (child <- children)
          checkMininessInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(MininessLexer.WHILE, _, children, _, _) => {
        val conditionType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(conditionType) => conditionType
          case _ => throw new TypeException("'while' condition must have a type")
        }
        if (areSubtypes(conditionType, Int32) || areSubtypes(conditionType, UInt32)) {
          val childType = checkMininessInclusion(children(1), depth + 1)
          Some(Okay)
        }
        else throw new TypeException("'while' condition must be a signed or unsigned integer")
      }

      case _ => {
        println("UNMATCHED Statement/Declaration AST node: " + node.tokenType)
        println(node.text)
        for (child <- node.children)
          checkMininessInclusion(child, depth + 1)
        None
      }
    }

    // Useful(?) debugging output.
    if (debugFlag) {
      for (_ <- 0 until depth) print("  ")
      println(resultType)
    }
    resultType
  }


  /**
   * Type check a Mininess expression. Calling this method on an ASTNode causes that node and all
   * its child nodes to be type checked. If this method returns normally (and not by way of an
   * exception) then there are no type errors.
   *
   * @param node The AST node to be type checked. This check extends recursively to all child
   * nodes, however the node provided to this method should be an expression node.
   *
   * @return The representation of the node's type or None if the node does not have a type.
   * @throws PositionalNesCTypeException if a type error is detected.
   */
  def checkMininessExpression(node: ASTNode, depth: Int): Option[Representation] = {

    class TypeException(message: String) extends
      PositionalMininessTypeException(message, node.line, node.positionInLine)


    def getSiblingType(
      parent   : Option[ASTNode],
      depth    : Int,
      debugFlag: Boolean = false): Option[Representation] = {

      val parentNode = parent match {
        case Some(value) => value
        case _ => throw new TypeException("INTERNAL ERROR: No parent node found")
      }
      val primaryChild =
        if (parentNode.children(0).tokenType == MininessLexer.CALL ||
            parentNode.children(0).tokenType == MininessLexer.POST) 1 else 0             
      checkMininessExpression(parentNode.children(primaryChild), depth)
    }


    def getTwoChildren(
      children : List[ASTNode],
      depth    : Int,
      debugFlag: Boolean = false): (Representation, Representation) = {

      val firstChildType = checkMininessExpression(children(0), depth + 1) match {
        case Some(TypeVariable(t)) => promote(typeVars, t) // Place-holder, need to look up typevar Upper bound
        case Some(childType) => childType
        case _ => throw new TypeException("INTERNAL ERROR: Child must have a type")
      }
      val secondChildType = checkMininessExpression(children(1), depth + 1) match {
        case Some(TypeVariable(t)) => promote(typeVars, t) // Place-holder, need to look up typevar Upper bound
        case Some(childType) => childType
        case _ => throw new TypeException("INTERNAL ERROR: Child must have a type")
      }

      (firstChildType, secondChildType)
    }


    val resultType = node match {

      case ASTNode(MininessLexer.ADDRESS_OF, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '&' must have a type")
        }
        if (isLeftValue(children(0)))
          Some(Pointer(childType))
        else
          throw new TypeException("Address Of must be performed on L-value")
      }

      // TODO: The type returned by bitwise AND isn't always Int16 (UInt16).
      case ASTNode(MininessLexer.AMP, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(UInt16)
        }
        else throw new TypeException("Operands of '&' must be integers")
      }

      case ASTNode(MininessLexer.AND, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '&&' must be integers")
      }

      case ASTNode(MininessLexer.ARGUMENT_LIST, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth)
        val (returnType, parameterList) = siblingType match {
          case Some(Function(rt, pl)) => (rt, pl)
          case _ => throw new TypeException("Function type is required")
        }

        for (i <- 0 until children.length) {
          val childType = checkMininessExpression(children(i), depth + 1) match {
            case Some(TypeVariable(t)) => promote(typeVars, t)
            case Some(cType) => cType
            case _ => throw new TypeException("Argument must have a type")
          }
          
          val parameterType = parameterList(i) match {
            case TypeVariable(t) => promote(typeVars, t)
            case cType => cType
          }
           
          if (!(areSubtypes(childType, parameterType)))
            throw new TypeException(s"Argument type mismatch. Found: $childType, Expected: $parameterType")
        } // Compares each argument type to the parameter being asked for by the function.
          // The argument should be subtype of parameter.

        Some(returnType)
      } // Case for the argument list of a function.
        // Finds the parameter list of the function, compares with given arguments.
        // If the two match, then the return type of the function is given as the result type.

      case ASTNode(MininessLexer.ARRAYINC, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        val isArray = firstChildType match {
          case Array(_, _) => true
          case _ => false
        }
        if (isArray && areSubtypes(secondChildType,Int16))
          Some(firstChildType)
        else if (isArray && areSubtypes(secondChildType,UInt16))
          Some(firstChildType)
        else throw new TypeException("Must increment an Array by a Integer value")
      }
        
      case ASTNode(MininessLexer.ARRAY_ELEMENT_SELECTION, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth)
        val arrayType = siblingType match {
          case Some(Array(aType, _)) => aType
          case _ => throw new TypeException("'[]' can only be used with arrays")
        }
        if (debugFlag) println("Array Type: " + arrayType)
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Array index must have a type")
        }
        if (areSubtypes(childType,Int16)) {
          Some(arrayType)
        }
        else if (areSubtypes(childType,UInt16)) {
          Some(arrayType)
        }
        else throw new TypeException("Array index must be Int16")
      }

      case ASTNode(MininessLexer.ARROW, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(Pointer(siblingType)) => siblingType
          case _ => throw new TypeException("'->' can only be used with pointers")
        }
        val identifier = children(0).text // Member to be looked up
        try {
          val memberType = MininessTypes.memberType(siblingType, identifier)
          Some(memberType)
        }
        catch {
          case ex: MininessTypeException =>
            throw new TypeException(ex.getMessage)
        }
      }

      case ASTNode(MininessLexer.ASSIGN, _, children, _, _) => {
        if (isLeftValue(children(0))) {
          val leftType = checkMininessExpression(children(0), depth + 1) match {
            case Some(TypeVariable(t)) => promote(typeVars, t)
            case Some(leftType) => leftType
            case _ => throw new TypeException("Left operand of '=' must have a type")
          }
          val rightType = checkMininessExpression(children(1), depth + 1) match {
            case Some(TypeVariable(t)) => promote(typeVars, t)
            case Some(rightType) => rightType
            case _ => throw new TypeException("Right operand of '=' must have a type")
          }
          if (areSubtypes(rightType, leftType)) {
            Some(Okay)
          }
          else throw new TypeException("Left and right operands of '=' must be like types")
        }
        else throw new TypeException("Left operand of '=' must be an lvalue")
      } // Checks that left side "storage" type is same as right side value type.
        // Updated for subtyping, but can subtype be assigned to supertype / vice-versa?

      case ASTNode(MininessLexer.BITANDASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '&=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '&=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      // TODO: The type returned by bitwise complement isn't always Int16 (or UInt16).
      case ASTNode(MininessLexer.BITCOMPLEMENT, _, children, _, _) => {
       val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '~' must have a type")
        }
       if (areSubtypes(childType, Int32)) {
         Some(Int16)
       }
       else if (areSubtypes(childType, UInt32)) {
         Some(UInt16)
       }
       else throw new TypeException("Operand of '~' must have integer type")
      }

      // TODO: The type returned by bitwise OR isn't always Int16 (UInt16).
      case ASTNode(MininessLexer.BITOR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(UInt16)
        }
        else throw new TypeException("Operands of '|' must have integer type")
      }

      case ASTNode(MininessLexer.BITORASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '|=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '|=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '|=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      // TODO: The type returned by bitwise XOR isn't always Int16 (UInt16).
      case ASTNode(MininessLexer.BITXOR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(UInt16)
        }
        else throw new TypeException("Operands of '^' must have integer type")
      }

      case ASTNode(MininessLexer.BITXORASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '^=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '^=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '^=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.CAST, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Cast child must have a type")
        }
        var castType = children(1).text match {
          case "struct" => Symbols.lookupStructVariable(node, children(1).children(0).text)
          case _ => Symbols.lookupTypeVariable(node, children(1).text)
        }
 
        if (castType == Uninit) {
          castType = promote(typeVars, children(1).text)
        }

        if (isCompatible(childType,castType,typeRelation))
          Some(castType)
        else throw new TypeException("Incompatible Cast")
      }
      
      case ASTNode(MininessLexer.CHARACTER_LITERAL, ident, _, _, _) => {
        if (debugFlag) println(ident)
        Some(Char)
      }

      case ASTNode(MininessLexer.CONSTANT, ident, _, _, _) => {
        val constantValue = convertInteger(ident)
        val (hasU, hasL) = (hasUSuffix(ident), hasLSuffix(ident))
        if (debugFlag) println(s"$ident, hasU = $hasU, hasL = $hasL")
        
        if (constantValue < 256)
          (hasU, hasL) match {
            case (false, false) => Some(Int8)
            case (false, true ) => Some(Int32)
            case (true,  false) => Some(UInt8)
            case (true,  true ) => Some(UInt32)
          }
        else if (constantValue < 65536)
          (hasU, hasL) match {
            case (false, false) => Some(Int16)
            case (false, true ) => Some(Int32)
            case (true,  false) => Some(UInt16)
            case (true,  true ) => Some(UInt32)
          }
        else
          if (hasU) Some(UInt32) else Some(Int32)
      } // Returns correct subtype depending on size of constant. Handles suffixes semi-ok.

      case ASTNode(MininessLexer.DEREFERENCE, _, children, _, _ ) => {
        val childType = checkMininessExpression(children(0), depth + 1)
        val returnType = childType match {
          case Some(Pointer(pType)) => Some(pType)
          case _ => throw new TypeException("Operand of '*' must have pointer type")
        }
        returnType
      }

      case ASTNode(MininessLexer.DIVASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '/=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '/=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '/=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.DIVIDE, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '/' must have integer type")
      }

      case ASTNode(MininessLexer.DOT, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(siblingType) => siblingType
          case _ => throw new TypeException("Left operand of '.' must have a type")
        }
        val identifier = children(0).text // Member to be looked up
        try {
          val memberType = MininessTypes.memberType(siblingType, identifier)
          Some(memberType)
        }
        catch {
          case ex: MininessTypeException =>
            throw new TypeException(ex.getMessage)
        }
      }

      case ASTNode(MininessLexer.EQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, secondChildType) ||
            areSubtypes(secondChildType, firstChildType))
          Some(Int16)
        else throw new TypeException("Operands of '==' must have compatible types")
      } // This makes sure that the two arguments to the EQUAL operation are like types, but
        // should any type be included, or should it be restricted?

      case ASTNode(MininessLexer.GREATER, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '>' must have integer type")
      }

      case ASTNode(MininessLexer.GREATEREQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '>=' must have integer type")
      }

      case ASTNode(MininessLexer.LESS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '<' must have integer type")
      }

      case ASTNode(MininessLexer.LESSEQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '<=' must have integer type")
      }

      case ASTNode(MininessLexer.LSHIFT, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '<<' must have integer types")
      }

      case ASTNode(MininessLexer.LSHIFTASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '<<=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '<<=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '<<=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.MINUS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType,Int16) && areSubtypes(secondChildType,Int16)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else if (areSubtypes(firstChildType,UInt16) && areSubtypes(secondChildType,UInt16)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '-' must have integer type")
      }

      case ASTNode(MininessLexer.MINUSASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '-=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '-=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '-=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.MINUSMINUS, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(siblingType) => siblingType
          case _ => throw new TypeException("Operand of '--' must have a type")
        }
        if (areSubtypes(siblingType, Int32)) {
          Some(siblingType)
        }
        else if (areSubtypes(siblingType, UInt32)) {
          Some(siblingType)
        }
        else throw new TypeException("Operand of '--' have integer type")
      }

      case ASTNode(MininessLexer.MODASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '%=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '%=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '%=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.MODULUS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '%' must have integer type")
      } // Updated to include subtyping - Valid if left and right are subtypes of Int16

      case ASTNode(MininessLexer.MULASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '*=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '*=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '*=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.NOT, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '!' must have a type")
        }
        if (areSubtypes(childType, Int32)){
         Some(Int16)
        }
        else if (areSubtypes(childType, UInt32)){
         Some(Int16)
        }
        else throw new TypeException("Operand of '!' must have integer type")
      }

      case ASTNode(MininessLexer.NOTEQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, secondChildType) ||
            areSubtypes(secondChildType, firstChildType))
          Some(Int16)
        else throw new TypeException("Operands of '!=' must have compatible types")
      } // This makes sure that the two arguments to the NOTEQUAL operation are like types, but
        // should any type be included, or should it be restricted?

      case ASTNode(MininessLexer.OR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '||' must have integer type")
      }

      case ASTNode(MininessLexer.PLUS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType,secondChildType))
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(leastUpperBound(firstChildType,secondChildType))
        }
        else throw new TypeException("Operands of '+' must have integer type")
      }

      case ASTNode(MininessLexer.PLUSASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '+=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '+=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '+=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.PLUSPLUS, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(siblingType) => siblingType
          case _ => throw new TypeException("Operand of '++' must have a type")
        }
        if (areSubtypes(siblingType, Int32)) {
          Some(siblingType)
        }
        else if (areSubtypes(siblingType, Int32)) {
          Some(siblingType)
        }
        else throw new TypeException("Expression must be applied to integer")
      }

      case ASTNode(MininessLexer.PRE_DECREMENT, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '--' must have a type")
        }
        if (areSubtypes(childType, Int32)) {
         Some(childType)
        }
        else if (areSubtypes(childType, UInt32)) {
         Some(childType)
        }
        else throw new TypeException("Operand of '--' must have integer type")
      }

      case ASTNode(MininessLexer.PRE_INCREMENT, _, children, _, _) => {
        val childType = checkMininessExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '++' must have a type")
        }
        if (areSubtypes(childType, Int32)) {
         Some(childType)
        }
        else if (areSubtypes(childType, UInt32)) {
         Some(childType)
        }
        else throw new TypeException("Operand of '++ must have an integer type")
      }

      case ASTNode(MininessLexer.RAW_IDENTIFIER, ident, _, _, _ ) => {
         if (debugFlag) println(ident)
         Some(Symbols.lookupVariable(node, ident))
      }

      case ASTNode(MininessLexer.RSHIFT, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '>>' must have integer types")
      }

      case ASTNode(MininessLexer.RSHIFTASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '>>=' must be a subtype of left operand")
        }
        else if (areSubtypes(firstChildType, UInt32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '>>=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '>>=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(MininessLexer.POSTFIX_EXPRESSION, _, children, _, _) => {
        var primaryChild = 0
        if (children(0).tokenType == MininessLexer.CALL ||
            children(0).tokenType == MininessLexer.POST)
          primaryChild = 1
        val numPostFixModifiers = ((children.length - 1) - primaryChild)
        val childType = checkMininessExpression(children(primaryChild), depth + 1)
        if (numPostFixModifiers == 0) {
          childType
        }
        else {
          var i = 0;
          var modifierType = childType;
          while (i < numPostFixModifiers) {
            modifierType = checkMininessExpression(children(primaryChild + 1 + i), depth + 1)
            i += 1
          }
          modifierType // Place-holder, this has to be different if the PFE is modified
        }
      }  // Tests for a CALL/POST child, but needs to be updated with the case that a CALL/POST
         // does exist and what to do with it? Fixed return type. No modifiers returns child
         // type. If there exists modifiers, it will typevcheck the modifiers and return the
         // modifier type. Problem may exist: More than one modifier? a[3]++ <- needs attention.

      case ASTNode(MininessLexer.SIZEOF_TYPE, _, _, _, _) =>
        // TODO: Type check children?
        // TODO: The actual type returned by sizeof() should be configurable.
        // TODO: Also handle SIZEOF_EXPRESSION and SIZEOF
        Some(UInt16)

      case ASTNode(MininessLexer.STAR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else if (areSubtypes(firstChildType, UInt32) && areSubtypes(secondChildType, UInt32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '*' must have integer types")
      }

      case ASTNode(MininessLexer.STRING_LITERAL, _, children, _, _) => {
       Some(Pointer(Char))
      }

      case _ => {
        println("UNMATCHED Expression AST node: " + node.tokenType)
        for (child <- node.children)
          checkMininessExpression(child, depth + 1)
        None
      }
    }

    // Useful(?) debugging output.
    if (debugFlag) {
      for (_ <- 0 until depth) print("  ")
      println(resultType)
    }
    resultType
  }

  /**
   * Returns true if the value is a "left value" or false if it is a "right" value
   */
  private def isLeftValue(node : ASTNode): Boolean = {
    node.tokenType match {
      case MininessLexer.ARRAY_ELEMENT_SELECTION => true
      case MininessLexer.DOT                     => true
      case MininessLexer.RAW_IDENTIFIER          => true
      case MininessLexer.DEREFERENCE             => true
      case MininessLexer.POSTFIX_EXPRESSION      => {
        val primaryChild =
          if (node.children(0).tokenType == MininessLexer.CALL ||
              node.children(0).tokenType == MininessLexer.POST) 1 else 0
        isLeftValue(node.children(primaryChild))
      }
      case _ => false
    }
  } // Needs to be tested with DOT, ARRAY, and DEREFERENCE cases, possible adjustments if the case can not be reached.


  /**
   * Removes the suffixes, if any, of a given integer literal. Returns the modified string.
   * 
   * @param ident The string representation of an integer literal.
   * @return The same string with any suffixes removed.
   */
  private def stripSuffixes(ident: String): String = {
    // TODO: Only LU characters at the end of the string should be removed.
    // Note that the lexer should only allow integer literals that are "reasonably" formatted.
    val builder = new StringBuilder
    for (ch <- ident) {
      if (ch != 'l' && ch != 'L' && ch != 'u' && ch != 'U') builder += ch
    }
    builder.toString
  }
  
  
  /**
   * Check to see if the given integer literal has an unsigned suffix.
   * 
   * @param ident the string representation of an integer literal.
   * @return true if the literal has a suffix indicated unsigned. 
   */
  private def hasUSuffix(ident: String): Boolean = {
    // TODO: Only U characters at the end of the string should be detected.
    // Note that the lexer should only allow integer literals that are "reasonably" formatted.
    ident.exists(ch => ch == 'u' || ch == 'U')
  }
  
  
  /**
   * Check to see if the given integer literal has a long suffix.
   * 
   * @param ident the string representation of an integer literal.
   * @return true if the literal has a suffix indicated long. 
   */
  private def hasLSuffix(ident: String): Boolean = {
    // TODO: Only L characters at the end of the string should be detected.
    // Note that the lexer should only allow integer literals that are "reasonably" formatted.
    ident.exists(ch => ch == 'l' || ch == 'L')
  }

  
  /**
   * Converts a string representation of an integer into an actual integer value. This method
   * knows how to handle leading "0x" prefixes for hex numbers and leading "0" prefixes for
   * octal numbers.
   *
   * @param ident The string representation of an integer literal to convert.
   * @return The converted value.
   */
  private def convertInteger(ident: String): Int = {
    // TODO: This method doesn't handle long (64 bit) values properly.
    val id = stripSuffixes(ident)
    if (id.length > 1 &&
        (id.charAt(0) == '0' && !(id.charAt(1) == 'x' || id.charAt(1) == 'X')))
      Integer.parseInt(id.substring(1), 8)
    else if (id.length > 2 && (id.substring(0, 2) == "0x" || id.substring(0, 2) == "0X"))
      Integer.parseInt(id.substring(2), 16)
    else
      id.toInt
  }

  private def buildIEList(nameList: Set[String], node: ASTNode): List[(String, Representation)] = {
    for (currName <- nameList.toList) yield {
      (currName -> Symbols.lookupVariable(node, currName))
    }
  }
  
  private def buildValueParameters(symList: Option[Symbols]): List[TypeBinding] = {
    val valueParameters = symList match {
      case Some(Symbols(_, _,valMap)) => {
        valMap.toList
      }
      case _ => {
        List()
      }
    }
    valueParameters
  }
  
  private def buildTypeParameters(typeVarList: List[(String, Representation)]): List[TypeBound] = {
    val typeParameters = for (typeVarPair <- typeVarList) yield {
      val newTypeVarPair = typeVarPair match {
        case (typeVar, binding) => {
          (TypeVariable(typeVar), binding)
        }
        case _ => {
          throw new Exception("Type variable not in correct form")
        }
      }
      newTypeVarPair
    }
    typeParameters
  }

}
