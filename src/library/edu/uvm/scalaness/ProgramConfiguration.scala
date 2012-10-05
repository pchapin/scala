//-----------------------------------------------------------------------
// FILE    : ProgramConfiguration.scala
// SUBJECT : Class representing implied minimal nesC configurations.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.BufferedWriter

/**
 * Immutable class representing nesC configurations. Each configuration contains a set of named
 * components that comprise the configuration along with the wires that connect them.
 * 
 * @param componentSet The set of NamedProgramComponents that comprise this configuration.
 * @param wireList The wires joining the program components in this configuration.
 */
class ProgramConfiguration(
          val componentSet: Set[NamedProgramComponent],
  private val wireList    : List[WireType]) {

  def merge(
    other   : ProgramConfiguration,
    imports1: ImportsType,
    imports2: ImportsType,
    exports : ExportsType) = {

    def getComponentList(imports: ImportsType, commandName: String) =
      if (imports.contains(commandName)) imports(commandName) else List()

    var newWires: List[WireType] = List()
    val satisfied = (imports1.keySet ++ imports2.keySet) intersect exports.keySet
    for (commandName <- satisfied) {
      val providingComponent = exports(commandName)
      val usingComponents =
        getComponentList(imports1, commandName) ++ getComponentList(imports2, commandName)
      val additionalWires = usingComponents map { (commandName, _, providingComponent) }
      newWires = newWires ++ additionalWires
    }

    new ProgramConfiguration(
      componentSet ++ other.componentSet, wireList ++ other.wireList ++ newWires)
  }

  /**
   * Writes the configuration implementation to the specified output file. Only the components
   * line and the wiring is output by this method. The configurations header and specification
   * are assumed to have already been written.
   * 
   * @param outputFile The file into which the configuration should be written.
   */
  def display(outputFile: BufferedWriter) {
    outputFile.write("implementation {\n")

    // Display the components line.
    outputFile.write("    components")
    var firstComponent = true
    for (currentComponent <- componentSet) {
      if (firstComponent) {
        outputFile.write( " " + currentComponent.name)
        firstComponent = false
      }
      else
        outputFile.write(", " + currentComponent.name)
    }
    outputFile.write(";\n")

    // Display the wires.
    for ((commandName, usingComponent, providingComponent) <- wireList) {
      outputFile.write("    ")
      outputFile.write(usingComponent.name + "." + commandName)
      outputFile.write(" -> ")
      outputFile.write(providingComponent.name + "." + commandName)
      outputFile.write(";\n")
    }
    outputFile.write("}\n")
  }
}
