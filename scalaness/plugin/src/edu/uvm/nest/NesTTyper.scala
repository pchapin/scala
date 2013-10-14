//-----------------------------------------------------------------------
// FILE    : NesTTyper.scala
// SUBJECT : Class for type checking nesT inclusions.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//                             and Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import parser.NesTLexer

object NesTTyper {

  class PositionalNesTTypeException(
        message: String,
    val line   : Int,
    val column : Int) extends Exception(message) {

    def this(message: String) = this(message, -1, -1)
  }

}


/**
 * Wraps facilities for type checking Minimal nesC code.
 *
 * @param typeVars     A map of type variable names to their upper bound types. These type variables parameterize the
 *                     entire component.
 * @param typeRelation The isCompatible predicate. Two types are in this relation if the first is convertable to the
 *                     second.
 * @param debugFlag    Set to true if debugging information should be dumped during the check.
 */
class NesTTyper(
  typeVars    : Map[String, NesTTypes.Representation],
  valueVars   : Map[String, NesTTypes.Representation],
  typeRelation: TypeCompatibilityRelation,
  debugFlag   : Boolean = false) {

  // For convenience
  import NesTTyper._
  import NesTTypes._
  import InterfaceDirectionality._

  
  /**
   * Type check a nesT inclusion. Calling this method on an ASTNode causes that node and all
   * its child nodes to be type checked. If this method returns normally (and not by way of an
   * exception) then there are no type errors.
   *
   * @param node The AST node to be type checked. This check extends recursively to all child
   * nodes, however the node provided to this method should be a non-expression node.
   *
   * @return The representation of the node's type or None if the node does not have a type.
   * @throws PositionalNesCTypeException if a type error is detected.
   */
  def checkNesTInclusion(node: ASTNode, depth: Int = 0): Option[Representation] = {

    class TypeException(message: String) extends
      PositionalNesTTypeException(message, node.line, node.positionInLine)

  if (debugFlag && (node.parent == None)) TreeConverter.dumpAST(node)
      
    val resultType = node match {
      
      case ASTNode(NesTLexer.CASE, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars,t)
          case Some(childType) => childType
          case _ => throw new TypeException("'case' expression must have a type")
        }
        if (areSubtypes(childType, Int32)) {
          val bodyType = checkNesTInclusion(children(1), depth + 1)
          Some(Okay)
        }
        else throw new TypeException("'case' expression must be an integer")
      } // Case condition just has to be subtype of Int16? Or more specific?

      case ASTNode(NesTLexer.CHAR, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.COMMAND, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.COMPOUND_STATEMENT, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      }

      case ASTNode(NesTLexer.CONSTANT, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.DECLARATION, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.DECLARATOR, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.DECLARATOR_ARRAY_MODIFIER, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.DECLARATOR_LIST, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.DEFAULT, _, children, _, _) => {
        val childType = checkNesTInclusion(children(0), depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.ERROR_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.EVENT, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.FILE, _, children, _, _) => {
        var moduleChild = -1
        for (i <- 0 until children.length) {
          if (children(i).tokenType == NesTLexer.MODULE)
            moduleChild = i
          else
            checkNesTInclusion(children(i), depth + 1)
        }
        val returnType = if (moduleChild >= 0)
                           checkNesTInclusion(children(moduleChild), depth + 1)
                         else
                           Some(Okay)
        returnType
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.FOR, _, children, _, _) => {
        val firstChildType  = checkNesTInclusion(children(0), depth + 1)
        val secondChildType = checkNesTInclusion(children(1), depth + 1)
        val thirdChildType  = checkNesTInclusion(children(2), depth + 1)
        Some(Okay)
      } // Check children, OKAY

      case ASTNode(NesTLexer.FOR_CONDITION, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("'for' condition must have a type")
        }
        if (areSubtypes(childType, Int32)) {
          Some(Okay)
        }
        else throw new TypeException("'for' condition must be an integer")
      } // Check for subtype of Int, OKAY

      case ASTNode(NesTLexer.FOR_INITIALIZE, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.FOR_ITERATION, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.FUNCTION_DEFINITION, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.IDENTIFIER_PATH, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.IF, _, children, _, _) => {
        val conditionType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(conditionType) => conditionType
          case _ => throw new TypeException("'if' condition must have a type")
        }
        if (areSubtypes(conditionType, Int32)) {
          val firstChildType = checkNesTInclusion(children(1), depth + 1)
          if (children.length == 3) {
            val secondChildType = checkNesTInclusion(children(2), depth + 1)
          }
          Some(Okay)
        }
        else throw new TypeException("'if' condition must be an integer")
      }

      case ASTNode(NesTLexer.IMPLEMENTATION, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.INIT_DECLARATOR, _, children, _, _) => {
        checkNesTInclusion(children(0), depth + 1)
        if (children.length > 1)
          checkNesTExpression(children(1), depth + 1)  // The initilizer is an expression.
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.INT, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.INT8_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.INT16_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.INT32_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.INTERFACE, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.MODULE, _, children, _, symList) => {

        val exportList = buildIEList(Declarations.extractExports(node), node)
        val importList = buildIEList(Declarations.extractImports(node), node)
        // val valueParameters = buildValueParameters(symList)
        val valueParameters = valueVars.toList
        val typeParameters = buildTypeParameters(typeVars.toList)
        for (child <- node.children)
          checkNesTInclusion(child, depth + 1)
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

      case ASTNode(NesTLexer.NULL, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.PARAMETER, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.PARAMETER_LIST, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.POINTER_QUALIFIER, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.POSTFIX_EXPRESSION, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.PROVIDES, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.RAW_IDENTIFIER, ident, _, _, symList ) => {
         if (debugFlag) println(ident)
         Some(Symbols.lookupVariable(node, ident))
      }

      case ASTNode(NesTLexer.RETURN, _, children, _, _) => {
        for (child <- children)
          checkNesTExpression(child, depth + 1)  // RETURN has at most one child.
        Some(Okay)
      } // TAG - Return type - needs to compare to return type of function to see if valid

      case ASTNode(NesTLexer.SPECIFICATION, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.STATEMENT, _, children, _, _) => {
        for (child <- children)
          checkNesTExpression(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.STRUCT, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY
      
      case ASTNode(NesTLexer.SWITCH, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("'switch' condition must have a type")
        }
        if (areSubtypes(childType, Int32)) {
          val bodyType = checkNesTInclusion(children(1), depth + 1)
          Some(Okay)
        }
        else throw new TypeException("'switch' condition must be an integer")
      }
      
      case ASTNode(NesTLexer.TYPEDEF, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.UINT8_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.UINT16_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.UINT32_T, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.UNSIGNED, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.USES, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.VOID, _, children, _, _) => {
        for (child <- children)
          checkNesTInclusion(child, depth + 1)
        Some(Okay)
      } // If children type check, then OKAY

      case ASTNode(NesTLexer.WHILE, _, children, _, _) => {
        val conditionType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(conditionType) => conditionType
          case _ => throw new TypeException("'while' condition must have a type")
        }
        if (areSubtypes(conditionType, Int32)) {
          val childType = checkNesTInclusion(children(1), depth + 1)
          Some(Okay)
        }
        else throw new TypeException("'while' condition must be an integer")
      }

      case _ => {
        println("UNMATCHED Statement/Declaration AST node: " + node.tokenType)
        for (child <- node.children)
          checkNesTInclusion(child, depth + 1)
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
   * Type check a nesT expression. Calling this method on an ASTNode causes that node and all its child nodes to be
   * type checked. If this method returns normally (and not by way of an exception) then there are no type errors.
   *
   * @param node The AST node to be type checked. This check extends recursively to all child nodes, however the node
   *             provided to this method should be an expression node.
   *
   * @return The representation of the node's type or None if the node does not have a type.
   * @throws PositionalNesCTypeException if a type error is detected.
   */
  def checkNesTExpression(node: ASTNode, depth: Int): Option[Representation] = {

    class TypeException(message: String) extends
      PositionalNesTTypeException(message, node.line, node.positionInLine)


    def getSiblingType(
      parent   : Option[ASTNode],
      depth    : Int,
      debugFlag: Boolean = false): Option[Representation] = {

      val parentNode = parent match {
        case Some(value) => value
        case _ => throw new TypeException("INTERNAL ERROR: No parent node found")
      }
      val primaryChild =
        if (parentNode.children(0).tokenType == NesTLexer.CALL ||
            parentNode.children(0).tokenType == NesTLexer.POST) 1 else 0             
      checkNesTExpression(parentNode.children(primaryChild), depth)
    }


    def getTwoChildren(
      children : List[ASTNode],
      depth    : Int,
      debugFlag: Boolean = false): (Representation, Representation) = {

      val firstChildType = checkNesTExpression(children(0), depth + 1) match {
        case Some(TypeVariable(t)) => promote(typeVars, t) // Place-holder, need to look up typevar Upper bound
        case Some(childType) => childType
        case _ => throw new TypeException("INTERNAL ERROR: Child must have a type")
      }
      val secondChildType = checkNesTExpression(children(1), depth + 1) match {
        case Some(TypeVariable(t)) => promote(typeVars, t) // Place-holder, need to look up typevar Upper bound
        case Some(childType) => childType
        case _ => throw new TypeException("INTERNAL ERROR: Child must have a type")
      }

      (firstChildType, secondChildType)
    }


    val resultType = node match {

      case ASTNode(NesTLexer.ADDRESS_OF, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '&' must have a type")
        }
        if (isLeftValue(children(0)))
          Some(Pointer(childType))
        else
          throw new TypeException("Address Of must be performed on L-value")
      }

      case ASTNode(NesTLexer.AMP, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '&' must be integers")
      }

      case ASTNode(NesTLexer.AND, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '&&' must be integers")
      }

      case ASTNode(NesTLexer.ARGUMENT_LIST, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth)
        val (returnType, parameterList) = siblingType match {
          case Some(Function(rt, pl)) => (rt, pl)
          case _ => throw new TypeException("Function type is required")
        }

        for (i <- 0 until children.length) {
          val childType = checkNesTExpression(children(i), depth + 1) match {
            case Some(TypeVariable(t)) => promote(typeVars, t)
            case Some(cType) => cType
            case _ => throw new TypeException("Argument must have a type")
          }
          
          val parameterType = parameterList(i) match {
            case TypeVariable(t) => promote(typeVars, t)
            case cType => cType
          }
           
          if (!(areSubtypes(childType, parameterType)))
            throw new TypeException("Parameter type mismatch")
        } // Compares each argument type to the parameter being asked for by the function.
          // Argument should be subtype of parameter, is this right?

        Some(returnType)
      } // Case for the argument list of a function.
        // Finds the parameter list of the function, compares with given arguments.
        // If the two match, then the return type of the function is given as the result type.

      case ASTNode(NesTLexer.ARRAYINC, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        val isArray = firstChildType match {
          case Array(_, _) => true
          case _ => false
        }
        if (isArray && areSubtypes(secondChildType,Int16))
          Some(firstChildType)
        else throw new TypeException("Must increment an Array by a Integer value")
      }
        
      case ASTNode(NesTLexer.ARRAY_ELEMENT_SELECTION, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth)
        val arrayType = siblingType match {
          case Some(Array(aType, _)) => aType
          case _ => throw new TypeException("'[]' can only be used with arrays")
        }
        if (debugFlag) println("Array Type: " + arrayType)
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Array index must have a type")
        }
        if (areSubtypes(childType,Int16)) {
          Some(arrayType)
        }
        else throw new TypeException("Array index must be Int16")
      }

      case ASTNode(NesTLexer.ARROW, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(Pointer(siblingType)) => siblingType
          case _ => throw new TypeException("'->' can only be used with pointers")
        }
        val identifier = children(0).text // Member to be looked up
        try {
          val memberType = NesTTypes.memberType(siblingType, identifier)
          Some(memberType)
        }
        catch {
          case ex: NesTTypeException =>
            throw new TypeException(ex.getMessage)
        }
      }

      case ASTNode(NesTLexer.ASSIGN, _, children, _, _) => {
        if (isLeftValue(children(0))) {
          val leftType = checkNesTExpression(children(0), depth + 1) match {
            case Some(TypeVariable(t)) => promote(typeVars, t)
            case Some(leftType) => leftType
            case _ => throw new TypeException("Left operand of '=' must have a type")
          }
          val rightType = checkNesTExpression(children(1), depth + 1) match {
            case Some(TypeVariable(t)) => promote(typeVars, t)
            case Some(rightType) => rightType
            case _ => throw new TypeException("Right operand of '=' must have a type")
          }
          if (areSubtypes(leftType, rightType) || areSubtypes(rightType, leftType)) {
            Some(Okay)
          }
          else throw new TypeException("Left and right operands of '=' must be like types")
        }
        else throw new TypeException("Left operand of '=' must be an lvalue")
      } // Checks that left side "storage" type is same as right side value type.
        // Updated for subtyping, but can subtype be assigned to supertype / vice-versa?

      case ASTNode(NesTLexer.BITANDASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '&=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.BITCOMPLEMENT, _, children, _, _) => {
       val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '~' must have a type")
        }
       if (areSubtypes(childType, Int32)){
         Some(Int16)
       }
       else throw new TypeException("Operand of '~' must have integer type")
      }

      case ASTNode(NesTLexer.BITOR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '|' must have integer type")
      }

      case ASTNode(NesTLexer.BITORASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '|=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '|=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.BITXOR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '^' must have integer type")
      }

      case ASTNode(NesTLexer.BITXORASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '^=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '^=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.CAST, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
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
      
      case ASTNode(NesTLexer.CHARACTER_LITERAL, ident, _, _, _) => {
        if (debugFlag) println(ident)
        Some(Char)
      }

      case ASTNode(NesTLexer.CONSTANT, ident, _, _, _) => {
        val constantValue = convertInteger(ident)
        if (debugFlag) println(ident)
        if (constantValue < 256)
          Some(Int8)
        else {
          if (constantValue < 65536)
            Some(Int16)
          else {
            Some(Int32)
          }
        }
      } // Returns correct subtype depending on size of constant.

      case ASTNode(NesTLexer.DEREFERENCE, _, children, _, _ ) => {
        val childType = checkNesTExpression(children(0), depth + 1)
        val returnType = childType match {
          case Some(Pointer(pType)) => Some(pType)
          case _ => throw new TypeException("Operand of '*' must have pointer type")
        }
        returnType
      }

      case ASTNode(NesTLexer.DIVASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '/=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '/=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.DIVIDE, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '/' must have integer type")
      }

      case ASTNode(NesTLexer.DOT, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(siblingType) => siblingType
          case _ => throw new TypeException("Left operand of '.' must have a type")
        }
        val identifier = children(0).text // Member to be looked up
        try {
          val memberType = NesTTypes.memberType(siblingType, identifier)
          Some(memberType)
        }
        catch {
          case ex: NesTTypeException =>
            throw new TypeException(ex.getMessage)
        }
      }

      case ASTNode(NesTLexer.EQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, secondChildType) ||
            areSubtypes(secondChildType, firstChildType))
          Some(Int16)
        else throw new TypeException("Operands of '==' must have compatible types")
      } // This makes sure that the two arguments to the EQUAL operation are like types, but
        // should any type be included, or should it be restricted?

      case ASTNode(NesTLexer.GREATER, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '>' must have integer type")
      }

      case ASTNode(NesTLexer.GREATEREQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '>=' must have integer type")
      }

      case ASTNode(NesTLexer.LESS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '<' must have integer type")
      }

      case ASTNode(NesTLexer.LESSEQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '<=' must have integer type")
      }

      case ASTNode(NesTLexer.LSHIFT, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '<<' must have integer types")
      }

      case ASTNode(NesTLexer.LSHIFTASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '<<=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '<<=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.MINUS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType,Int16) && areSubtypes(secondChildType,Int16)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '-' must have integer type")
      }

      case ASTNode(NesTLexer.MINUSASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '-=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '-=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.MINUSMINUS, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(siblingType) => siblingType
          case _ => throw new TypeException("Operand of '--' must have a type")
        }
        if (areSubtypes(siblingType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operand of '--' have integer type")
      }

      case ASTNode(NesTLexer.MODASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '%=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '%=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.MODULUS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '%' must have integer type")
      } // Updated to include subtyping - Valid if left and right are subtypes of Int16

      case ASTNode(NesTLexer.MULASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '*=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '*=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.NOT, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '!' must have a type")
        }
        if (areSubtypes(childType, Int32)){
         Some(Int16)
        }
        else throw new TypeException("Operand of '!' must have integer type")
      }

      case ASTNode(NesTLexer.NOTEQUAL, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, secondChildType) ||
            areSubtypes(secondChildType, firstChildType))
          Some(Int16)
        else throw new TypeException("Operands of '!=' must have compatible types")
      } // This makes sure that the two arguments to the NOTEQUAL operation are like types, but
        // should any type be included, or should it be restricted?

      case ASTNode(NesTLexer.OR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Operands of '||' must have integer type")
      }

      case ASTNode(NesTLexer.PLUS, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType,secondChildType))
        }
        else throw new TypeException("Operands of '+' must have integer type")
      }

      case ASTNode(NesTLexer.PLUSASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '+=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '+=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.PLUSPLUS, _, children, parent, _) => {
        val siblingType = getSiblingType(parent, depth) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(siblingType) => siblingType
          case _ => throw new TypeException("Operand of '++' must have a type")
        }
        if (areSubtypes(siblingType, Int32)) {
          Some(Int16)
        }
        else throw new TypeException("Expression must be applied to integer")
      }

      case ASTNode(NesTLexer.PRE_DECREMENT, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '--' must have a type")
        }
        if (areSubtypes(childType, Int32)) {
         Some(Int16)
        }
        else throw new TypeException("Operand of '--' must have integer type")
      }

      case ASTNode(NesTLexer.PRE_INCREMENT, _, children, _, _) => {
        val childType = checkNesTExpression(children(0), depth + 1) match {
          case Some(TypeVariable(t)) => promote(typeVars, t)
          case Some(childType) => childType
          case _ => throw new TypeException("Operand of '++' must have a type")
        }
        if (areSubtypes(childType, Int32)) {
         Some(Int16)
        }
        else throw new TypeException("Operand of '++ must have an integer type")
      }

      case ASTNode(NesTLexer.RAW_IDENTIFIER, ident, _, _, _ ) => {
         if (debugFlag) println(ident)
         Some(Symbols.lookupVariable(node, ident))
      }

      case ASTNode(NesTLexer.RSHIFT, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '>>' must have integer types")
      }

      case ASTNode(NesTLexer.RSHIFTASSIGN, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32)) {
          if (areSubtypes(secondChildType, firstChildType)) {
            Some(firstChildType)
          }
          else throw new TypeException("Right operand of '>>=' must be a subtype of left operand")
        }
        else throw new TypeException("Left operand of '>>=' must have numeric type")
      } // Right side must be a subtype of left side, so var type of left side doesn't change?

      case ASTNode(NesTLexer.POSTFIX_EXPRESSION, _, children, _, _) => {
        var primaryChild = 0
        if (children(0).tokenType == NesTLexer.CALL ||
            children(0).tokenType == NesTLexer.POST)
          primaryChild = 1
        val numPostFixModifiers = ((children.length - 1) - primaryChild)
        val childType = checkNesTExpression(children(primaryChild), depth + 1)
        if (numPostFixModifiers == 0) {
          childType
        }
        else {
          var i = 0;
          var modifierType = childType;
          while (i < numPostFixModifiers) {
            modifierType = checkNesTExpression(children(primaryChild + 1 + i), depth + 1)
            i += 1
          }
          modifierType // Place-holder, this has to be different if the PFE is modified
        }
      }  // Tests for a CALL/POST child, but needs to be updated with the case that a CALL/POST does exist and what to
         // do with it? Fixed return type. No modifiers returns child type. If there exists modifiers, it will type
         // check the modifiers and return the modifier type. Problem may exist: More than one modifier? a[3]++ <- needs
         // attention.

      case ASTNode(NesTLexer.STAR, _, children, _, _) => {
        val (firstChildType, secondChildType) = getTwoChildren(children, depth)
        if (areSubtypes(firstChildType, Int32) && areSubtypes(secondChildType, Int32)) {
          Some(leastUpperBound(firstChildType, secondChildType))
        }
        else throw new TypeException("Operands of '*' must have integer types")
      }

      case ASTNode(NesTLexer.STRING_LITERAL, _, children, _, _) => {
       Some(Pointer(Char))
      }

      case _ => {
        println("UNMATCHED Expression AST node: " + node.tokenType)
        for (child <- node.children)
          checkNesTExpression(child, depth + 1)
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
      case NesTLexer.ARRAY_ELEMENT_SELECTION => true
      case NesTLexer.DOT                     => true
      case NesTLexer.RAW_IDENTIFIER          => true
      case NesTLexer.DEREFERENCE             => true
      case NesTLexer.POSTFIX_EXPRESSION      => {
        val primaryChild =
          if (node.children(0).tokenType == NesTLexer.CALL ||
              node.children(0).tokenType == NesTLexer.POST) 1 else 0
        isLeftValue(node.children(primaryChild))
      }
      case _ => false
    }
  } // Needs to be tested with DOT, ARRAY, and DEREFERENCE cases, possible adjustments if the case can not be reached.



  /**
   * Converts a string representation of an integer into an actual integer value. This method knows how to handle
   * leading "0x" prefixes for hex numbers and leading "0" prefixes for octal numbers.
   *
   * @param ident The string representation of the integer to convert.
   * @return The converted value.
   */
  private def convertInteger(ident: String): Int = {
    if ( ident.length > 2 &&
        (ident.charAt(0) == '0' && !(ident.charAt(1) == 'x' || ident.charAt(1) == 'X')))
      Integer.parseInt(ident.substring(1), 8)
    else if (ident.length > 2 && (ident.substring(0, 2) == "0x" || ident.substring(0,2) == "0X"))
      Integer.parseInt(ident.substring(2), 16)
    else
      ident.toInt
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
