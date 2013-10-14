//-----------------------------------------------------------------------
// FILE    : CompositionTest.scala
// SUBJECT : Tests exercising Mininess module composition.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness.runtime

import edu.uvm.nest.ASTNode
import edu.uvm.nest.parser.NesTLexer
import java.io.File
import org.junit.Assert._
import org.junit.{After, Before, Test}

class CompositionTest {

  object dummyComponent extends NesTComponent {
    val configuration = new ProgramComponent(
      Set(), Set(), Map(), Map(), new ProgramConfiguration(Set(), List()), ".")
    
    def getTypeMap  = Map()
    def getValueMap = Map()
  }
  
  @Before
  def setUp() {
    // Clean up leftovers from last run. If the tests fail you don't want previous files there.
    val generatedFile1 = new File("testData/AppC.nc")
    if (generatedFile1.exists) generatedFile1.delete()
  }

  @After
  def tearDown() {
    // Don't delete the generated files here. If they are wrong you will want to look at them.
  }

  @Test
  def basicComposition() {
    // The ASTs of the components are not relevant for this test.
    val A = new NamedProgramComponent(
      name            = "A",
      enclosingObject = dummyComponent,
      typeParameters  = Set(),
      valueParameters = Set(),
      imports         = Set("c1", "c2"),
      exports         = Set(),
      abstractSyntax  = ASTNode(NesTLexer.NUMBER, "1", List(), None, None))

    val B = new NamedProgramComponent(
      name            = "B",
      enclosingObject = dummyComponent,
      typeParameters  = Set(),
      valueParameters = Set(),
      imports         = Set(),
      exports         = Set("c1"),
      abstractSyntax  = ASTNode(NesTLexer.NUMBER, "1", List(), None, None))

    val C = new NamedProgramComponent(
      name            = "C",
      enclosingObject = dummyComponent,
      typeParameters  = Set(),
      valueParameters = Set(),
      imports         = Set("c1"),
      exports         = Set("c2"),
      abstractSyntax  = ASTNode(NesTLexer.NUMBER, "1", List(), None, None))

    val composedComponent1 = new ProgramComponentWrapper(A, ".") wireTo new ProgramComponentWrapper(B, ".")
    val composedComponent2 = composedComponent1 wireTo new ProgramComponentWrapper(C, ".")
    composedComponent2.display(new File("testData"))
    assertTrue(FileUtilities.compareFiles("testData" + File.separator + "AppC.nc",
                                          "testData" + File.separator + "AppC.nc-expected"))
  }

}
