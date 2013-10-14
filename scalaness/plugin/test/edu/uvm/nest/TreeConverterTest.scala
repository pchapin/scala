//-----------------------------------------------------------------------
// FILE    : TreeConverterTest.scala
// SUBJECT : Tests exercising the Mininess tree converting done by the runtime system.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import org.junit.Assert._
import org.junit.{After, Before, Test}
import java.io.{PrintStream, File, FileReader, BufferedReader}

class TreeConverterTest {

  @Before
  def setUp()  {
    // Nothing needed for now.
  }

  @After
  def tearDown() {
    // Nothing needed for now.
  }


  /**
   * Returns the AST of the named Mininess file.
   *
   * @param fileName The file to parse.
   */
  private def getAST(fileName: String) = {
    val name = "testData" + File.separator + "TreeConverter" + File.separator + fileName
    val MininessReader = new BufferedReader(new FileReader(name))
    val abstractSyntax = try {
      // We always parse the entire file so we don't need a specialized parsing method like some other tests.
      parser.parseNesTInclusion(MininessReader, List())
    }
    finally MininessReader.close()
    abstractSyntax
  }


  /**
   * Outputs the final AST as serialized nesC source.
   *
   * @param fileName The base name to use when constructing the output file name.
   * @param root The AST to output.
   */
  private def putAST(fileName: String, root: ASTNode) {
    // TODO: Compare the output file against some notion of expected output.
    val name = "testData" + File.separator + "TreeConverter" + File.separator + fileName + ".out"
    val output = new PrintStream(name)
    TreeConverter.dumpNesCSource(output, root)
  }


  @Test
  def castReplacementTest() {
    val testCaseNames = Array("Cast01C.nc")

    for (testCase <- testCaseNames) {
      val abstractSyntax = getAST(testCase)
      edu.uvm.nest.Symbols.decorateAST(abstractSyntax)
      val finalAbstractSyntax = TreeConverter.replaceCastOperations(abstractSyntax)
      putAST(testCase, finalAbstractSyntax)
    }
  }


  @Test
  def arrayBoundsTest() {
    val testCaseNames = Array("Array01C.nc")

    for (testCase <- testCaseNames) {
      val abstractSyntax = getAST(testCase)
      edu.uvm.nest.Symbols.decorateAST(abstractSyntax)
      val finalAbstractSyntax = TreeConverter.addArrayBoundsChecks(abstractSyntax)
      putAST(testCase, finalAbstractSyntax)
    }
  }

}
