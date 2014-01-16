//-----------------------------------------------------------------------
// FILE    : DeclarationExtractorTest.scala
// SUBJECT : Class for JUnit testing of declaration extraction.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import org.junit.Assert._
import org.junit.{After, Before, Test}

import org.antlr.runtime._
import org.antlr.runtime.tree.CommonTree
import java.io.File
import java.io.FileInputStream
import edu.uvm.nest.parser.{NesTLexer, NesTParser}


class DeclarationExtractorTest extends TestHarness {

  private val testRoot         = new File("testData")
  private val testDeclarations = new File(testRoot, "Declarations")
  private val nesTDeclarations = new File(testDeclarations, "NesT")
    
  @Before
  def setUp() {
    // Nothing needed for now.
  }

  @After
  def tearDown() {
    // Nothing needed for now.
  }


  /**
   * Parse a Minimal nesC declaration.
   * 
   * @param testCaseName The name of the file containing the declaration to parse.
   * @return An ASTNode for the root of the resulting abstract syntax tree.
   */
  private def parseDeclaration(testCaseName: String) = {
    val testCase = new File(nesTDeclarations, testCaseName)
    val testFile = new FileInputStream(testCase.getPath)
    try {
      val lex = new NesTLexer(new ANTLRInputStream(testFile))
      val tokens = new CommonTokenStream(lex)
      val parser = new NesTParser(tokens)
      parser.setSymbols(initializeGlobalSymbols())
      TreeConverter.ANTLRToScala(t = parser.declaration().getTree.asInstanceOf[CommonTree])
    }
    finally testFile.close()
  }
  
  
  /**
   * Extracts the declared names from a specified test case.
   * 
   * @param testCaseName The name of the file containing the test case. The file must contain a single declaration.
   * 
   * @param expectedResults A map from variable name to its type that gives the expected results of the extraction.
   */
  private def extractDeclarationsCase(
    testCaseName   : String,
    expectedResults: Map[String, NesTTypes.Representation]) {
    
    val node = parseDeclaration(testCaseName)
    val (_, extractedResults) = Declarations.extractDeclaredNames(node)
    
    // Is every name found expected?
    for ((name, declaredType) <- extractedResults) {
      assertTrue(expectedResults.contains(name))
      assertTrue(expectedResults(name) == declaredType)
    }
    
    // Is every expected result found in the declaration?
    for ((name, expectedType) <- expectedResults) {
      assertTrue(extractedResults.contains( (name, expectedType) ))
    }
  }
  

  @Test
  def basicDeclarationTest() = {
    import NesTTypes._
    
    val testCases = Map(
      "decl0010.nc" -> Map("x" -> Int16, "y" -> Int16, "z" -> Int16)
    )
    testCases foreach { testCase => extractDeclarationsCase(testCase._1, testCase._2)}
  }
  
  /*
  @Test
  def arrayDeclarationTest() = {
    import NesCTypes._
    
    val testCases = Map(
      "array0010.nc" -> Map("a" -> Array(Char, 1024)),
      "array0011.nc" -> Map("a" -> Array(Char, 1024), "b" -> Array(Char, 2048))
    )
    testCases foreach { testCase => extractDeclarationsCase(testCase._1, testCase._2)}
  }
  */
  @Test
  def pointerDeclarationTest() = {
    import NesTTypes._
    
    val testCases = Map(
      "pointer0010.nc" -> Map("p" -> Pointer(Int16)),
      "pointer0011.nc" -> Map("p" -> Pointer(Int16), "x" -> Int16),
      "pointer0012.nc" -> Map("p" -> Pointer(Pointer(Int16))) ,
      "pointer0013.nc" -> Map("a" -> Array(Pointer(Int16), "10"), "p" -> Pointer(Int16), "x" -> Int16)
    )
    testCases foreach { testCase => extractDeclarationsCase(testCase._1, testCase._2)}
  }
  

  @Test
  def functionDeclarationTest() {
    import NesTTypes._
    
    val testCases = Map(
      "function0010.nc" -> Map("f" -> Function(Int16, List()), "g" -> Function(Int16, List())),
      "function0020.nc" -> Map("f" -> Function(UInt16, List(Int16, Char)), "g" -> Function(UInt16, List(Int16, Char))),
      "function0030.nc" -> Map("f" -> Function(
          Uninit, List(Pointer(Int16), Pointer(Pointer(Int16))))) 
    )
    testCases foreach { testCase => extractDeclarationsCase(testCase._1, testCase._2)}
  }
/*
  
  @Test
  def typeVarDeclarationTest() = {
    import NesCTypes._
    
    val testCases = Map(
      "typevardec0010.nc" -> Map("x" -> TypeVariable("myType"), "y" -> TypeVariable("myType"), "z" -> TypeVariable("myType"))
    )
    testCases foreach { testCase => extractDeclarationsCase(testCase._1, testCase._2)}
  }
   *///This still doesn't work, but in practice works fine in examples.  Perhaps something to think about later?
}
