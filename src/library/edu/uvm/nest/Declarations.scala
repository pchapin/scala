//-----------------------------------------------------------------------
// FILE    : Declarations.scala
// SUBJECT : Various methods for processing of nesT declarations.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//                             and Michael P. Watson <mpwatson@uvm.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import parser.NesTLexer

/**
 * Object to wrap various methods for processing declarations.
 */
object Declarations {
  
  private def extractImportsExports(abstractSyntax: ASTNode, marker: Int): Set[String] = {

    /**
     * Walks the abstract syntax tree of a nesT declaration (normally a command declaration
     * but this method is intended to be general) and returns a set of the declared names. For
     * example in a declaration such as
     *     command int com1(int x), com2(int x, int y);
     * the result should be Set("com1", "com2")
     * 
     * @param declaration The AST node representing the declaration.
     * @return A set of names declared by the declaration.
     */
    def extractDeclaredNames(declaration: ASTNode): Set[String] = {

      def extractNames(declarationFragment: ASTNode): Set[String] = {
        val namesInFragment = declarationFragment match {
          case ASTNode(NesTLexer.IDENTIFIER_PATH, _, pathComponents, _, _) => {
            // TODO: Handle multiple path components intelligently.
            List(Set(pathComponents(0).text))
          }
          
          // Nothing to see here... don't want declarators inside parameter lists to confuse us.
          case ASTNode(NesTLexer.PARAMETER_LIST, _, _, _, _) => 
            List(Set[String]())
      
          
          case _ =>
            // Loop needed to deal with multiple init_declarators in a declaration.
            for (child <- declarationFragment.children) yield extractNames(child)
        }
        (Set[String]() /: namesInFragment)(_ union _)
      }
    
      extractNames(declaration)
    }
  

    val childImports = abstractSyntax match {
      case ASTNode(`marker`, _, children, _, _) =>
        for (specification_element <- children) yield {
          // TODO: Handle the error condition of when an INTERFACE node is found instead.
          extractDeclaredNames(declaration = specification_element)
        }
        
      case _ =>
        for (child <- abstractSyntax.children) yield extractImportsExports(child, marker)
    }
    (Set[String]() /: childImports)(_ union _)
  }
  
  
  /**
   * Walks the abstract syntax tree of a nesT template and returns all imported commands.
   * 
   * @param abstractSyntax The ASTNode where the walk will begin in the template.
   * @return A set of all imports (by name) in the given nesT template.
   */
  def extractImports(abstractSyntax: ASTNode): Set[String] = {
    extractImportsExports(abstractSyntax, NesTLexer.USES)
  }
  
  
  /**
   * Walks the abstract syntax tree of a nesT template and returns all exported commands.
   * 
   * @param abstractSyntax The ASTNode where the walk will begin in the template.
   * @return A set of all imports (by name) in the given nesT template.
   */
  def extractExports(abstractSyntax: ASTNode): Set[String] = {
    extractImportsExports(abstractSyntax, NesTLexer.PROVIDES)
  }


  /**
   * Extracts a list of (name, type) pairs that are declared in a given declaration.
   * 
   * @param declaration The AST node of a single declaration.
   * @return A list of declared names along with their type representations.
   */
  def extractDeclaredNames(declaration: ASTNode): (List[(String, NesTTypes.Representation)],
                                                   List[(String, NesTTypes.Representation)])  = {
    import NesTTypes._
    
    // Returns a list of declarators, empty if it is a parameter
    def getDecList(declaration: ASTNode): List[ASTNode] = {
      if (declaration.children(0).tokenType == NesTLexer.FUNCTION_DEFINITION) {
        val funcDecNode = findChild(declaration.children(0), NesTLexer.DECLARATOR)
        return List(funcDecNode)
       }
      if (declaration.tokenType != NesTLexer.PARAMETER) {
        val declarationList = findChild(declaration, NesTLexer.DECLARATOR_LIST)
        val declarators = 
          for (i <- 0 until declarationList.children.length) yield {
            if (declarationList.children(i).tokenType == NesTLexer.INIT_DECLARATOR)
              declarationList.children(i).children(0)
            else
              declarationList.children(i)
          } 
        return declarators.toList       
      }
      if (declaration.tokenType == NesTLexer.PARAMETER &&
          declaration.children.length > 1) {
        val paramDecNode = findChild(declaration, NesTLexer.DECLARATOR)
        return List(paramDecNode)
      }       
      return List()
    }
  
    // If the declaration is a function definition, the FUNCTION_DEFINITION node is used as the
    // main declaration node, as its children mirror a normal declaration.
    def getDecNode(declaration: ASTNode): ASTNode = {
      if (existsChild(declaration, NesTLexer.FUNCTION_DEFINITION))
        findChild(declaration, NesTLexer.FUNCTION_DEFINITION)
      else
        declaration
    }

    // Looks at the children of the declaration to find the node with the type information in
    // it.  Either primary type or return type for a function.
    def getDecType(declarationNode: ASTNode): ASTNode = {
      for (i <- 0 until declarationNode.children.length) {
        if (declarationNode.children(i).tokenType == NesTLexer.DECLARATOR ||
            declarationNode.children(i).tokenType == NesTLexer.DECLARATOR_LIST)
          return declarationNode.children(i-1)    
      }
      //If there is no declarators, the only child is the declaration type
      declarationNode.children(0)
    }
    
    // Deals with the case where the declaration is a structure declaration. Right now can only
    // declare a new structure type or declare a value of an existing type. Ideally could do
    // both at once, logic can be changed to reflect this.
    def declareNewStruct(declarationNode: ASTNode): (List[(String, NesTTypes.Representation)],
                                                     List[(String, NesTTypes.Representation)])    = {
      val structNode = declarationNode.children(0)
      val structName = structNode.children(0).text

      // If we are declaring a new structure type
      val numStructFields = structNode.children.length
      val structFields = for (i <- 1 until numStructFields) yield {
        val (_, variableDecs) = extractDeclaredNames(structNode.children(i))
        variableDecs
      }
      val structMap = (structName -> Structure(structName,structFields.toList.flatten))  
      (List(structMap), List())
    }

    
    // Debug flag controls printing of helpful information about nodes
    var debugFlag = false
    if (debugFlag) TreeConverter.dumpAST(declaration)
    
    // If a new structure type is being declared, it is handled here
    if (declaration.children(0).tokenType == NesTLexer.STRUCT &&
        declaration.children.length == 1) {
      val newStructure = declareNewStruct(declaration)
      return newStructure
    }
    
    // Call the functions to find out relevant information about the declaration
    val decList = getDecList(declaration)
    val declarationNode = getDecNode(declaration)
    val declarationType = getDecType(declarationNode)
    
    // This is the primary declaration type, if primitive, then this is the type
    // If a function, this is the return type
    var declaredType = declarationType.tokenType match {
      case NesTLexer.VOID     => Uninit
      case NesTLexer.UNSIGNED => UInt16
      case NesTLexer.INT      => Int16
      case NesTLexer.CHAR     => Char
      case NesTLexer.UINT8_T  => UInt8
      case NesTLexer.UINT16_T => UInt16
      case NesTLexer.UINT32_T => UInt32
      case NesTLexer.INT8_T   => Int8
      case NesTLexer.INT16_T  => Int16
      case NesTLexer.INT32_T  => Int32
      case NesTLexer.ERROR_T  => ErrorT
      case NesTLexer.STRUCT   => Symbols.lookupStructVariable(declarationNode, declarationType.children(0).text)
      case NesTLexer.RAW_IDENTIFIER => TypeVariable(declarationType.text)
      case _                     => Uninit
    }
 
    // If the type is unsigned, the declared type will adjust
    if (existsChild(declarationNode,NesTLexer.UNSIGNED)) {
      declaredType = declaredType match {
        case Int8  => UInt8
        case Int16 => UInt16
        case Int32 => UInt32
        case _     => declaredType
      }
    }
    
    // If the declaration is a parameter with no declarators
    if (decList.length == 0)
      return (List(), List("NULL" -> declaredType))
    
    // Goes through each declared variable and makes a pair that maps the variable to the
    // declared type.
    val declaratorList =
      for (declarationChild <- decList) yield {
        
        // Find the individual identifier for each declarator.
        val identifierPath = findChild(declarationChild, NesTLexer.IDENTIFIER_PATH)
        val identifier = identifierPath.children(0).text
       
        // A localized copy of the declaration type that can be manipulated.
        var finalType = declaredType
        
        // If the declaration is a pointer, or an array of pointers, the pointers will be added
        val existsPointers = existsChild(declarationChild, NesTLexer.POINTER_QUALIFIER)
        if (existsPointers) {
          finalType = Pointer(finalType)
          var pointerChild = findChild(declarationChild, NesTLexer.POINTER_QUALIFIER)
          while (existsChild(pointerChild,NesTLexer.POINTER_QUALIFIER)) {
            finalType = Pointer(finalType)
            pointerChild = findChild(pointerChild, NesTLexer.POINTER_QUALIFIER)
          }
        }
        
        // Boolean that denotes existence of an array or function modifier.
        val existsModifier =
          (existsChild(declarationChild, NesTLexer.DECLARATOR_ARRAY_MODIFIER) ||
           existsChild(declarationChild, NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER))
        
        // If there is no modifier, we return a map from identifier to type        
        if (!(existsModifier)) {
          (identifier -> finalType)
        }
        
        // If there is an array modifier, return an array type
        else if (existsChild(declarationChild, NesTLexer.DECLARATOR_ARRAY_MODIFIER)) {
          val arrayModifier =
            findChild(declarationChild, NesTLexer.DECLARATOR_ARRAY_MODIFIER)
          val arraySize =
            if (arrayModifier.children.length > 0)
              arrayModifier.children(0).children(0).text
            else 
              ""
         (identifier -> Array(finalType, arraySize))
        }
        
        // If there is a function modifier, build the parameter list and return function type
        else if (existsChild(declarationChild, NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER)) {
            
          // Find the parameter list node
          val parameterListModifier =
            findChild(declarationChild, NesTLexer.DECLARATOR_PARAMETER_LIST_MODIFIER)              
          val parameterListChild =
            findChild(parameterListModifier, NesTLexer.PARAMETER_LIST)
            
          // Boolean that is true if there are no parameters
          var voidParameter =
            (parameterListChild.children.length == 0) || 
            (parameterListChild.children(0).children(0).tokenType == NesTLexer.VOID)
                                
          // Initialize an empty parameter list to be filled up if parameters exist
          var parameterList = List[NesTTypes.Representation]()
            
          // Builds the parameter list
          if (!(voidParameter)) {
            for (i <- 0 until parameterListChild.children.length) {
              val (_, extractedList) = extractDeclaredNames(parameterListChild.children(i))
              val parType = extractedList(0) match {
                case (parDecName, parDecType) => parDecType
                case _ => Uninit
              }
              parameterList ::= parType
            }
              
          }
          if (debugFlag) println((identifier -> Function(finalType, parameterList.reverse)))
          (identifier -> Function(finalType, parameterList.reverse))
                                 
        }
        else {
          throw new Exception("Unable to match declaration type")
        } 

      } //declaratorList
    
      
    // Returns list of identifiers mapped to types
    if (debugFlag) println(declaratorList)
    (List(), declaratorList)
  }
  
  
}
