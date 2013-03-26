//-----------------------------------------------------------------------
// FILE    : FileUtilities.scala
// SUBJECT : Helper functions used for testing.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness.runtime

import java.io.{BufferedReader, File, FileReader}

object FileUtilities {

  def compareFiles(resultName: String, expectedName: String) = {
    val resultFile = new File(resultName)
    val expectedFile = new File(expectedName)
    var line: String = null
    var resultLines: List[String] = List()
    var expectedLines: List[String] = List()

    // Read the result file.
    val resultReader = new BufferedReader(new FileReader(resultFile))
    while({ line = resultReader.readLine(); line != null}) {
      resultLines = line :: resultLines
    }
    resultReader.close()

    // Read the expected file.
    val expectedReader = new BufferedReader(new FileReader(expectedFile))
    while({ line = expectedReader.readLine(); line != null}) {
      expectedLines = line :: expectedLines;
    }
    expectedReader.close()

    resultLines == expectedLines
  }

}
