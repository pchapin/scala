//-----------------------------------------------------------------------
// FILE    : InterfaceLocatorTest.scala
// SUBJECT : Tests exercising interface locators.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.mininess

import java.io.File
import org.junit.Assert._
import org.junit.{After, Before, Test}

class InterfaceLocatorTest {
  
  private val testFolderName = "testData" + File.separator + "InterfaceLocator"

  @Before
  def setUp() {
  }

  @After
  def tearDown()  {
  }

  @Test
  def testSourceLocator() {
    val interfaceFolderList = List(
      testFolderName + File.separator + "Folder1",
      testFolderName + File.separator + "Folder2")
    val locator: InterfaceLocator = new InterfaceSourceLocator(interfaceFolderList)
    
    val i001 = locator.locate("I001", InterfaceDirectionality.USES)
  }

}
