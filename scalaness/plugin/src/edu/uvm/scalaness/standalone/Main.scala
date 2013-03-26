//-----------------------------------------------------------------------
// FILE    : Main.scala
// SUBJECT : Main class of the standalone Scalaness compiler plugin.
// AUTHOR  : (C) Copyright 2011 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness.standalone

import edu.uvm.scalaness.{ConfigurationSettings, PluginProperties}
import scala.tools.nsc.CompilerCommand
import scala.tools.nsc.Settings

/**
 * An object for running the plugin as standalone application.
 */
object Main {
  // TODO: Print, parse, and apply plugin options.
  // Ideally re-use the ScalanessPlugin (-> runsAfter, optionsHelp, processOptions, components, annotationChecker)
  // instead of duplicating it here and in PluginRunner.

  def main(args: Array[String]) {
    val settings = new Settings
    
    val command = new CompilerCommand(args.toList, settings) {
      /**
       * The command name that will be printed in in the usage message. This is automatically set to the value of
       * 'plugin.commandname' in the file build.properties.
       */
      override val cmdName = PluginProperties.pluginCommand
    }

    if (!command.ok)
      return ()

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

    // Settings are configured here and in ScalanessPlugin.scala and in ScalanessPluginTest.scala
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
          "interfacePath" -> "."))
    scalanessSettings.readConfigurationFile("Scalaness.cfg")

    val runner = new PluginRunner(settings, scalanessSettings)
    val run = new runner.Run
    run.compile(command.files)
  }
}
