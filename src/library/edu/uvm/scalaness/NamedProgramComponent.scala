//-----------------------------------------------------------------------
// FILE    : NamedProgramComponent.scala
// SUBJECT : Class representing components of the generated minimal nesC program.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.{File, PrintStream}
import edu.uvm.mininess.{ASTNode, Symbols, SyntaxViewer, TreeConverter}

/**
 * Immutable class to represent a named program component during first stage execution. These
 * are the components actually created by the Scalaness programmer. Because these components do
 * not contain any embedded components their import and export lists are simplified compared to
 * the more general ProgramComponent type. They also do not contain any configuration
 * information but they do contain the abstract syntax of the Mininess code they represent.
 * 
 * @param name The name of the component as provided by the programmer.
 * @param typeParameters A set of type parameter names. The bounds are not included.
 * @param valueParameters A set of term parameter names. The types are not included.
 * @param imports A set of command names that are used by this component.
 * @param exports A set of command names that are provided by this component.
 * @param abstractSyntax The Mininess AST of the component's code.
 */
class NamedProgramComponent(
  val name           : String,
  val enclosingObject: MininessComponent,
  val typeParameters : Set[String],
  val valueParameters: Set[String],
  val imports        : Set[String],
  val exports        : Set[String],
  val abstractSyntax : ASTNode) {

  // NOTE: NamedProgramComponent can't be a subclass of ProgramComponent because translating the
  // class parameters from one type to the other can't be done in the 'extends' clause of the
  // NamedProgramComponent class definition.

  override def toString = name

  /**
   * Outputs the NamedProgramComponent to a file. This method serializes the AST of the
   * component back to ordinary nesC source code.
   * 
   * @param outputFolder The folder into which this named component should be generated.
   */
  def display(outputFolder: File) {
    
    def doSpecialization[A](
      items : List[(String, A)],
      ast   : ASTNode,
      editor: (ASTNode, String, A) => ASTNode): ASTNode = {
      
      items match {
        case Nil => ast
        case (name, value) :: rest =>
          doSpecialization(rest, editor(ast, name, value), editor)
      }
    }
    
    // Objects with null abstract syntax trees are not specialized. Such objects represent
    // hand coded shims. Shim objects can't be processed by Scalaness because they may contain
    // arbitrary nesC code.
    // TODO: Is this check still necessary?
    //
    if (abstractSyntax == null) return ()
    
    val outputFile = new PrintStream(new File(outputFolder, name + ".nc"))
    try {
      val valueList = enclosingObject.getValueMap.toList
      val valueSpecializedAST =
        doSpecialization(valueList, abstractSyntax, Specialize.editor _)
      val typeList = enclosingObject.getTypeMap.toList map
        { item => (item._1, item._2.wrappedType) }
      val fullySpecializedAST =
        doSpecialization(typeList, valueSpecializedAST, Specialize.editor _)

      // Do the necessary transformations on array bounds and casts.
      // TODO: Is this really the right place for this?
      Symbols.decorateAST(fullySpecializedAST)
      val transformedAST1 = TreeConverter.addArrayBoundsChecks(fullySpecializedAST)
      val transformedAST2 = TreeConverter.replaceCastOperations(transformedAST1)
      val viewer = new SyntaxViewer(outputFile, transformedAST2)
      viewer.rewrite()
    }
    finally {
      outputFile.close()
    }
  }
}
