//-----------------------------------------------------------------------
// FILE    : PluginRunner.scala
// SUBJECT : Class that controls the execution of the standalone plugin.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness.standalone

import edu.uvm.scalaness.{ConfigurationSettings, ScalanessPlugin}
import scala.tools.nsc.{Global, Settings, SubComponent}
import scala.tools.nsc.reporters.{ConsoleReporter, Reporter}

/**
 * This class is a compiler that will be used for running the plugin in standalone mode.
 */
class PluginRunner
  (settings: Settings, reporter: Reporter, scalanessSettings: ConfigurationSettings)

  extends Global(settings, reporter) {

  def this(settings: Settings, scalanessSettings: ConfigurationSettings) =
    this(settings, new ConsoleReporter(settings), scalanessSettings)


  // val annotationChecker = new ScalanessAnnotationChecker {
  //   val global: PluginRunner.this.type = PluginRunner.this
  // }
  // addAnnotationChecker(annotationChecker.checker)

  /**
   * The phases to be run.
   */
  override protected def computeInternalPhases() {
    phasesSet += syntaxAnalyzer
    phasesSet += analyzer.namerFactory
    phasesSet += analyzer.packageObjects
    phasesSet += analyzer.typerFactory
    // phasesSet += superAccessors  // Add super accessors.
    // phasesSet += pickler         // Serialize symbol tables.
    // phasesSet += refchecks       // Perform reference and override checking, translate nested objects.

    for (phase <- ScalanessPlugin.components(this, scalanessSettings)) {
      phasesSet += phase
    }
  }

}
