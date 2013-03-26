//-----------------------------------------------------------------------
// FILE    : ScalanessPlugin.scala
// SUBJECT : Main class of the Scalaness compiler plugin.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import scala.tools.nsc.Global
import scala.tools.nsc.plugins.Plugin

/**
 * The main class describing the plugin
 */
class ScalanessPlugin(val global: Global) extends Plugin {

  val name = PluginProperties.pluginName
  val runsAfter = List[String]("refchecks")
  val description = PluginProperties.pluginDescription
  
  // Settings are configured here and in ScalanessPluginTest.scala and in Standalone's Main.
  val configurableItems =
    Map("ASTOutput"     -> ConfigurationSettings.basicBooleanValidator _,
        "configFile"    -> ConfigurationSettings.basicPathValidator _,
        "debug"         -> ConfigurationSettings.basicBooleanValidator _,
        "inclusionPath" -> ConfigurationSettings.basicPathValidator _,
        "interfacePath" -> ConfigurationSettings.basicPathValidator _,
        "typeCompatibility" -> ConfigurationSettings.basicPathValidator _)
  val scalanessSettings = new ConfigurationSettings(configurableItems)
  scalanessSettings.setDefaults(
    Map("ASTOutput"     -> "FALSE",
        "debug"         -> "FALSE",
        "inclusionPath" -> ".",
        "interfacePath" -> "."))
      
  // Not all of the Scalaness configuration settings can be provided on the command line.
  override val optionsHelp = Some(
    "  -P:" + name + ":ASTOutput         Turn on the output of Mininess ASTs\n" +
    "  -P:" + name + ":configFile        Location of configuration file (default none)\n" +
    "  -P:" + name + ":inclusionPath     Location of nesC inclusions (default '.')" +
    "  -P:" + name + ":interfacePath     Location of nesC interfaces (default '.')")

  /** Implement parsing of plugin options */
  override def processOptions(options: List[String], error: String => Unit) {
    
    // Locate the configFile options (if it exists) and use it to read the configuration file.
    for (option <- options) {
      val optionDelimiterLocation = option.indexOf(':')
      if (optionDelimiterLocation != -1) {
        val optionName = option.substring(0, optionDelimiterLocation)
        val optionValue = option.substring(optionDelimiterLocation + 1)
        if (optionName == "configFile") {
          scalanessSettings.readConfigurationFile(optionValue)
        }
      }
    }
    
    // Process options explicitly given, letting them override anything set in the config file.
    for (option <- options) {
      val optionDelimiterLocation = option.indexOf(':')
      if (optionDelimiterLocation == -1)
        scalanessSettings.put(option, "TRUE")
      else {
        val optionName = option.substring(0, optionDelimiterLocation)
        val optionValue = option.substring(optionDelimiterLocation + 1)
        scalanessSettings.put(optionName, optionValue)
      }
    }
  }

  /**
   * The compiler components that will be used when running this plugin. I'm not sure why I should get this list by
   * calling a method in the companion object. However that is what the plugin template does so I'll follow that lead
   * for now. [It's so the PluginRunner can get the same list in a static context.]
   */
  val components = ScalanessPlugin.components(global, scalanessSettings)

  // val annotationChecker = new ScalanessAnnotationChecker {
  //   val global: ScalanessPlugin.this.global.type = ScalanessPlugin.this.global
  // }
  // global.addAnnotationChecker(annotationChecker.checker)
}

object ScalanessPlugin {
  /**
   * Yields the list of Components to be executed in this plugin. For now the components are place holders. Eventually
   * only a subset of these components might be necessary.
   */
  def components(global: Global, settings: ConfigurationSettings) =
    List(new ScalanessPostParser(global, settings), new ScalanessTyper(global, settings))
}
