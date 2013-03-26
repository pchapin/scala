//-----------------------------------------------------------------------
// FILE    : ParserTest.scala
// SUBJECT : Class for JUnit testing of the Mininess parser.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import org.junit.Assert._
import org.junit.{After, Before, Test}

import org.antlr.runtime._
import java.io.File
import java.io.FileInputStream
import edu.uvm.mininess.parser.{MininessLexer, MininessParser}


/**
 *
 * @author Peter
 */
class ParserTest extends TestHarness {

  private val testRoot   = new File("testData")
  private val testSyntax = new File(testRoot, "Syntax")
  private val syntaxPositive = new File(testSyntax, "Positive")
  private val syntaxNegative = new File(testSyntax, "Negative")
    
  @Before
  def setUp() {
    // Nothing needed for now.
  }

  @After
  def tearDown() {
    // Nothing needed for now.
  }

  private def doTests(testCaseNames       : Array[String],
                      startSymbolProcessor: MininessParser => Unit) {

    for (testCaseName <- testCaseNames) {
      val testCase = new File(syntaxPositive, testCaseName)
      val testFile = new FileInputStream(testCase.getPath)
      try {
        val lex = new MininessLexer(new ANTLRInputStream(testFile))
        val tokens = new CommonTokenStream(lex)
        val parser = new MininessParser(tokens)
        parser.setSymbols(initializeGlobalSymbols())
        startSymbolProcessor(parser)
      }
      finally {
        testFile.close()
      }
    }
  }
  

  @Test
  def basicExpressionTest() {
    val testCaseNames = Array(
      "Expression0000.nc", "Expression0002.nc", "Expression0004.nc", "Expression0006.nc",
      "Expression0008.nc", "Expression0010.nc", "Expression0012.nc", "Expression0014.nc",
      "Expression0016.nc", "Expression0018.nc", "Expression0020.nc", "Expression0022.nc"
    )
    doTests(testCaseNames, _.expression())
  }
    
  @Test
  def assignmentExpressionTest() {
    val testCaseNames = Array(
      "Expression0100.nc", "Expression0102.nc", "Expression0104.nc", "Expression0106.nc"
    )
    doTests(testCaseNames, _.expression())
  }
    
  @Test
  def functionCallExpressionTest() {
    val testCaseNames = Array(
      "Expression0200.nc", "Expression0202.nc", "Expression0204.nc", "Expression0206.nc",
      "Expression0208.nc"
    )
    doTests(testCaseNames, _.expression())
  }
    
  @Test
  def complexExpressionTest() {
    val testCaseNames = Array(
      "Expression0300.nc"
    )
    doTests(testCaseNames, _.expression())
  }
    
  @Test
  def basicStatementTest() {
    val testCaseNames = Array(
      "Statement0000.nc", "Statement0005.nc", "Statement0010.nc", "Statement0015.nc",
      "Statement0020.nc"
    )
    doTests(testCaseNames, _.statement())
  }
    
  @Test
  def complexStatementTest() {
    val testCaseNames = Array(
      "Statement0100.nc"
    )
    doTests(testCaseNames, _.statement())
  }

  @Test
  def basicDeclarationTest() {
    val testCaseNames = Array(
      "Declaration0000.nc", "Declaration0010.nc", "Declaration0020.nc", "Declaration0030.nc"
    )
    doTests(testCaseNames, _.declaration())
  }
    
  @Test
  def cvDeclarationTest() {
    val testCaseNames = Array(
      "Declaration0100.nc", "Declaration0120.nc"
    )
    doTests(testCaseNames, _.declaration())
  }
    
  @Test
  def structDeclarationTest() {
    val testCaseNames = Array(
      "Declaration0200.nc"
    )
    doTests(testCaseNames, _.declaration())
  }
    
  @Test
  def functionDeclarationTest() {
    val testCaseNames = Array(
      "Declaration0300.nc", "Declaration0310.nc", "Declaration0320.nc"
    )
    doTests(testCaseNames, _.declaration())
  }

  @Test
  def typedefDeclarationTest() {
    val testCaseNames = Array(
      "Declaration0400.nc", "Declaration0410.nc", "Declaration0420.nc", "Declaration0430.nc"
    )
    doTests(testCaseNames, _.declaration())
  }
  
  @Test
  def interfaceTest() {
    val testCaseNames = Array(
      "Interface0000.nc", "Interface0010.nc", "Interface0020.nc", "Interface0030.nc"
    )
    doTests(testCaseNames, _.mininess_file())
  }

  @Test
  def basicModuleTest() {
    val testCaseNames = Array(
      "Module0000.nc", "Module0010.nc", "Module0020.nc", "Module0030.nc"
    )
    doTests(testCaseNames, _.mininess_file())
  }

  @Test
  def typedefModuleTest() {
    val testCaseNames = Array(
      "Module0100.nc", "Module0110.nc", "Module0120.nc"
    )
    doTests(testCaseNames, _.mininess_file())
  }

  @Test
  def complexModuleTest() {
    val testCaseNames = Array(
      "Module0200.nc", "Module0230.nc"
    )
    doTests(testCaseNames, _.mininess_file())
  }

}
