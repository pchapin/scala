//-----------------------------------------------------------------------
// FILE    : TyperTest.scala
// SUBJECT : Class for JUnit testing of nesT type checking.
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


/**
 *
 * @author Peter
 */
class TyperTest extends TestHarness {

  private val testRoot   = new File("testData")
  private val testTyping = new File(testRoot, "TypeChecking")
  private val nesTTyping = new File(testTyping, "NesT")
    
  @Before
  def setUp() {
    // Nothing needed for now.
  }

  @After
  def tearDown() {
    // Nothing needed for now.
  }

  /**
   * Parse a nesT file.
   * 
   * @param testCaseName The name of the file containing the nesT component to parse.
   * @return An ASTNode for the root of the resulting abstract syntax tree.
   */
  private def parseNesCFile(testCaseName: String) = {
    val testCase = new File(nesTTyping, testCaseName)
    val testFile = new FileInputStream(testCase.getPath)
    try {
      val lex = new NesTLexer(new ANTLRInputStream(testFile))
      val tokens = new CommonTokenStream(lex)
      val parser = new NesTParser(tokens)
      val globalSymbols = initializeGlobalSymbols()
      globalSymbols.addType("A")
      globalSymbols.addType("B")
      globalSymbols.addType("C")
      globalSymbols.addType("D")
      parser.setSymbols(globalSymbols)
      val abstractSyntax = 
        TreeConverter.ANTLRToScala(t = parser.nest_file().getTree.asInstanceOf[CommonTree])
      Symbols.decorateAST(abstractSyntax)
      abstractSyntax
    }
    finally testFile.close()
  }
  
  
  /**
   * Parse a nesT statement.
   * 
   * @param testCaseName The name of the file containing the statement to parse.
   * @return An ASTNode for the root of the resulting abstract syntax tree.
   */
  private def parseStatement(testCaseName: String) = {
    val testCase = new File(nesTTyping, testCaseName)
    val testFile = new FileInputStream(testCase.getPath)
    try {
      val lex = new NesTLexer(new ANTLRInputStream(testFile))
      val tokens = new CommonTokenStream(lex)
      val parser = new NesTParser(tokens)
      parser.setSymbols(initializeGlobalSymbols())
      TreeConverter.ANTLRToScala(t = parser.statement().getTree.asInstanceOf[CommonTree])
    }
    finally testFile.close()
  }
  
  
  /**
   * Sets the parent of a given list of ASTNodes to the specified parent.
   */
  private def reparent(children: List[ASTNode], newParent: ASTNode) {
    children foreach { child =>
      child.parent = Some(newParent)
    }
  }
  
  
  /**
   * Returns a map of type variables to their bounds that can be used in the test cases.
   */
  private def defaultTypeVars = {
    import NesTTypes._
    
    Map[String, NesTTypes.Representation](
      ("A" -> Top),
      ("B" -> Int16),
      ("C" -> TypeVariable("B")),
      ("D" -> Structure("structS", List(("m1", Int16), ("m2", Pointer(Int16)))))
    )   
  }
  
  
  /**
   * Returns a type compatibility map that can be used in the test cases.
   */
  private def defaultTypeCompatibility = {
    new TypeCompatibilityRelation(None)
  }
  
  
  /**
   * Returns a symbol table containing various symbols that can be used in the test cases. This allows statements and
   * expressions to be type checked without the complication of also processing declarations.
   */
  private def defaultSymbols = {
    import NesTTypes._
    
    new Symbols(
      structureNames   = Map[String, NesTTypes.Representation](),
      typeNames     = Map[String, NesTTypes.Representation](("int" -> Int16)),
      variableNames = Map(
        ("x" -> Int16),
        ("y" -> Int16),
        ("z" -> Int16),
        ("w" -> Int16),
        ("s" -> Int16),
        ("e" -> Int8),
        ("p" -> Pointer(Int16)),
        ("a" -> Array(Int16, "10")),
        ("f" -> Function(
            returnType     = Int8,
            parameterTypes = List(Char, Int16))),
        ("g" -> Function(
            returnType     = Int8,
            parameterTypes = List(Pointer(Structure("structS", List(("m1", Int16), ("m2", Pointer(Int16)))))))),
        ("sA1" -> Structure("structA", List(("a", Int8)))),
        ("sB1" -> Structure("structB", List(("a", Int8),("b", Int8)))),
        ("sC1" -> Structure("structC", List(("a", Int8),("c", Char)))),
        ("sA2" -> Structure("structA", List(("a", Int8)))),
        ("sB2" -> Structure("structB", List(("a", Int8),("b", Int8)))),
        ("sC2" -> Structure("structC", List(("a", Int8),("c", Char)))),
        ("psA" -> Pointer(Structure("structA", List(("a", Int8))))),
        ("tvarA" -> TypeVariable("A")),
        ("tvarB" -> TypeVariable("B")),
        ("tvarC" -> TypeVariable("C")),
        ("tvarD" -> TypeVariable("D"))
      )
    )
  }
  
  /**
   * Type checks a specific test case.
   * 
   * @param testCaseName The name of the file containing the test case. The file must contain a single statement (could
   *                     be an expression followed by a semicolon or a compound statement).
   * 
   * @param parseMethod A function that parses the specified file returning an ASTNode.
   * 
   * @param debugFlag If true then debugging information is printed onto the standard output device as the check is
   *                  performed.
   */
  private def typeCheckCase(
    testCaseName: String,
    parseMethod : String => ASTNode,
    debugFlag   : Boolean) {
    
    val ASTNode(token, text, children, parent, _) = parseMethod(testCaseName)
    val decoratedNode = ASTNode(token, text, children, parent, Some(defaultSymbols))
    reparent(children, newParent = decoratedNode)
    val typeChecker = new NesTTyper(defaultTypeVars, Map(), defaultTypeCompatibility, debugFlag)
    val result = typeChecker.checkNesTInclusion(decoratedNode)

    // The overall type of the nesT inclusion is actually a module type.
    // assertTrue(result == Some(NesTTypes.Okay))
  }
  

  @Test
  def ifTest() {
    val testCases = Array("if0010.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def whileTest() {
    val testCases = Array("while0010.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def forTest() {
    val testCases = Array("for0010.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def switchTest() {
    val testCases = Array("switch0010.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def basicExpressionTest() {
    val testCases = Array(
      "expr0010.nc", "expr0011.nc", "expr0012.nc", "expr0013.nc",
      "expr0014.nc", "expr0015.nc", "expr0016.nc"
    )
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def arrayExpressionTest() {
    val testCases = Array("expr0020.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }  

  
  @Test
  def pointerExpressionTest() {
    val testCases = Array("expr0030.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }

  
  @Test
  def structExpressionTest() {
    val testCases = Array("expr0040.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def assignExpressionTest() {
    val testCases = Array("expr0050.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def assignmentTest() {
    val testCases = Array("assign0010.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def subtypeTest() {
    val testCases = Array("subtype0010.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def typeVariableTest() {
    val testCases = Array("typevar0010.nc", "typevar0015.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  }
  
  
  @Test
  def typePromotionTest() {
    val testCases = Array("typevar0020.nc")
    testCases foreach { typeCheckCase(_, parseStatement, debugFlag = false) }
  } 
  
  @Test
  def Test() {
    val testCases = Array("module0040.nc")
    testCases foreach { typeCheckCase(_, parseNesCFile, debugFlag = false) }
  }
  
}
