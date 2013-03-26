//-----------------------------------------------------------------------
// FILE    : PluginPropertiesTest.scala
// SUBJECT : Tests exercising the properties file.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import org.junit.Assert._
import org.junit.Test

class PluginPropertiesTest {
  
  @Test
  def testProperties() {
    assertEquals("Staged programming extension for embedded systems development", PluginProperties.pluginDescription)
    assertEquals("0.1", PluginProperties.versionString)
  }
}
