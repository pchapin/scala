//-----------------------------------------------------------------------
// FILE    : ScalanessPluginTest.scala
// SUBJECT : Tests exercising the Scalaness plugin itself.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.File

import org.junit.Assert._
import org.junit.Test
import scala.tools.nsc.{CompilerCommand, Settings}

import edu.uvm.scalaness.standalone.PluginRunner

class ScalanessPluginTest {

  /**
   * Runs a test instance of the compiler with the plugin active on the specified files.
   * @param configFile The location of the Scalaness configuration file to use for this compilation.
   * @param arguments A list of files to compile during this compilation.
   */
  def doTestCompilation(configFile: String, arguments: List[String]) {
    // The follow was the code originally in this test. I'm not sure if it's worth keeping.
    //
    // import scala.tools.nsc.{Global, Settings}
    // import scala.tools.nsc.reporters.ConsoleReporter
    // val settings = new Settings
    // val compiler = new Global(settings, new ConsoleReporter(settings))
    // val plugin = new ScalanessPlugin(compiler)
    // assertEquals("Scalaness", plugin.name)

    val settings = new Settings
    val compilerArguments = List(
      "-classpath",
      "lib/Scalaness.jar:" +
        System.getenv("SCALA_HOME") + "/lib/scala-library.jar:" +
        System.getenv("SCALA_HOME") + "/lib/scala-reflect.jar",
      "-nowarn"
    ) ++ arguments

    val command = new CompilerCommand(compilerArguments, settings) {
      /**
       * The command name that will be printed in in the usage message. This is automatically
       * set to the value of 'plugin.commandname' in the file build.properties.
       */
      override val cmdName = PluginProperties.pluginCommand
    }
    if (!command.ok) return ()

    /**
     * The version number of this plugin is read from the properties file.
     */
    if (settings.version.value) {
      println(command.cmdName + " version " + PluginProperties.versionString)
      return ()
    }
    if (settings.help.value) {
      println(command.usageMsg)
      return ()
    }

    // Settings are configured here and in ScalanessPlugin.scala and in Standalone's Main.
    val configurableItems =
      Map("ASTOutput"     -> ConfigurationSettings.basicBooleanValidator _,
        "configFile"    -> ConfigurationSettings.basicPathValidator _,
        "debug"         -> ConfigurationSettings.basicBooleanValidator _,
        "inclusionPath" -> ConfigurationSettings.basicPathValidator _,
        "interfacePath" -> ConfigurationSettings.basicPathValidator _,
        "typeCompatibility" -> ConfigurationSettings.basicPathValidator _
      )
    val scalanessSettings = new ConfigurationSettings(configurableItems)
    scalanessSettings.setDefaults(
      Map("ASTOutput"     -> "FALSE",
        "debug"         -> "FALSE",
        "inclusionPath" -> ".",
        "interfacePath" -> ".")
    )
    scalanessSettings.readConfigurationFile(configFile)

    val runner = new PluginRunner(settings, scalanessSettings)
    val run = new runner.Run
    run.compile(command.files)
  }


  @Test
  def postParserTest() {
    val stem = "testData" + File.separator + "PostParser" + File.separator
    val configFile = stem + "Scalaness.cfg"
    val filesToCompile = List(
      stem + "Basic.scala",
      stem + "DynamicTypeConstruction.scala"
    )

    doTestCompilation(configFile, filesToCompile)
  }


  @Test
  def moduleDefinitionTest() {
    val stem = "testData" + File.separator + "ModuleDefinition" + File.separator
    val configFile = stem + "Scalaness.cfg"
    val filesToCompile = List(
      stem + "ModuleDefinition01.scala"
    )
    doTestCompilation(configFile, filesToCompile)
  }


  @Test
  def unwrapTest() {
    val stem = "testData" + File.separator + "Scalaness" + File.separator
    val configFile = stem + "Scalaness.cfg"
    val filesToCompile = List(
      stem + "ExternalLibrary.scala",
      stem + "UnwrapMe.scala"
    )

    doTestCompilation(configFile, filesToCompile)
  }

}
