//-----------------------------------------------------------------------
// FILE    : ProgramComponent.scala
// SUBJECT : Class representing components of the generated minimal nesC program.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io._

/**
 * Immutable class to represent a program component. Unlike named program components these
 * program components are anonymous. They also contain configuration information since, in
 * general, they represent an entire collection of named program components. For now I will just
 * represent imports and exports of a program component by their names. Eventually I'll have to
 * also track their parameter types and return types. Thus a more complex data structure will be
 * needed later.
 * 
 * @param typeParameters A set of type parameter names. The bounds are not included.
 * @param valueParameters A set of term parameter names. The types are not included.
 * @param imports A set of command names that are used by this component.
 * @param exports A set of command names that are provided by this component.
 * @param configuration The nesC configuration wrapped by this ProgramComponent object.
 * @param targetFolder The location where the Mininess code of this component is generated.
 */
class ProgramComponent(
  private val typeParameters : Set[String],
  private val valueParameters: Set[String],
  private val imports        : ImportsType,
  private val exports        : ExportsType,
  private val configuration  : ProgramConfiguration,
  private val targetFolder   : String) extends Traversable[NamedProgramComponent] {

  /**
   * Exception thrown if the composition of components fails. The type system should rule this
   * out, but the exception exists for now since the full type checking is not yet implemented.
   */
  class CompositionException(message: String) extends Exception(message)


  // This allows a ProgramComponent to work like a collection of NamedProgramComponents.
  override def foreach[U](f: NamedProgramComponent => U) {
    configuration.componentSet.foreach(f)
  }


  /**
   * Perform a map merge of the type parameters. This is the stage #1 run time manifestation of
   * the map merge operation described in the theory.
   * 
   * @param otherTypeParameters A collection of type parameters to merge into the type
   * parameters of this object.
   * @return The merged result.
   */
  private def mergeTypeParameters(otherTypeParameters: Set[String]) = {
    // The bounds on common type parameters should be identical. In theory this is handled as
    // part of compile time type checking and thus should never be wrong during run time. It
    // might be nice to verify them anyway as a kind of sanity check. On the other hand that
    // would require passing type parameter bound information to the run time system which
    // currently isn't done.
    //
    
    typeParameters ++ otherTypeParameters

  }


  /**
   * Perform a map merge of the value parameters. This is the stage #1 run time manifestation of
   * the map merge operation described in the theory.
   * 
   * @param otherValueParameters A collection of value parameters to merge into the value
   * parameters of this object.
   * @return The merged result.
   */
  private def mergeValueParameters(otherValueParameters: Set[String]) = {
    // The types on common values should be identical. In theory this is handled as part of
    // compile time type checking and thus should never be wrong during run time. It might be
    // nice to verify them anyway as a kind of sanity check. On the other hand that would
    // require passing type information to the run time system which currently isn't done.
    //
    
    valueParameters ++ otherValueParameters
    
  }


  // Map merge.
  private def mergeImports(otherImports  : ImportsType,
                           otherExports  : ExportsType) = {  
    // TODO: Check to be sure types are identical for common domain elements.
    
    def rawMerge(otherImports: ImportsType) = {
      var combinedImports = imports
      for ((otherKey, otherComponentList) <- otherImports) {
        if (combinedImports.contains(otherKey)) {
          val overallComponentList = combinedImports(otherKey) ++ otherComponentList
          combinedImports += (otherKey -> overallComponentList)
        }
        else
          combinedImports += (otherKey -> otherComponentList)
      }
      combinedImports
    }

    rawMerge(otherImports) -- otherExports.keySet
    
  }


  // Mutually exclusive map merge.
  private def mergeExports(otherExports: ExportsType) = {
    val keyIntersection = exports.keySet intersect otherExports.keySet
    if (keyIntersection.size != 0)
      throw new CompositionException("Exports not mutually exclusive during component composition")
    exports ++ otherExports
  }


  /**
   * Combine the targetFolder values of two program components. The components must have
   * "compatible" target folders before a meaningful target folder for the composed component
   * can be defined.
   *
   * @param otherTargetFolder The target folder of the other component.
   * @return The compatible target folder based on 'this' component and the given target folder
   * of the other component.
   */
  private def mergeTargetFolders(otherTargetFolder: String) = {
    // TODO: Add some real logic here.
    // Roughly: the two target folders have to be the same, else exception.
    targetFolder
  }


  /**
   * Composes two ProgramComponents. The library can't use +> directly because otherwise
   * the Scalaness compiler complains about missing nesT module types. Thus internally
   * this method is used instead.
   * 
   * @param other The ProgramComponent to blend into this component.
   * @return A new ProgramComponent that wraps a configuration consisting of the two input
   * components joined together.
   */
  def wireTo(other: ProgramComponent) = {
    val newTypeParameters  = mergeTypeParameters(other.typeParameters)
    val newValueParameters = mergeValueParameters(other.valueParameters)
    val newExports         = exports
    val newImports         = mergeImports(other.imports, other.exports)
    val newConfiguration   =
      configuration.merge(other.configuration, imports, other.imports, newExports)
    val newTargetFolder    = mergeTargetFolders(other.targetFolder)

    new ProgramComponent(newTypeParameters,
                         newValueParameters,
                         newImports,
                         newExports,
                         newConfiguration,
                         newTargetFolder)
  }
  
  // These are the methods that would actually be called by the Scalaness programmer.
  def +>(other: ProgramComponent) = this wireTo other
  def +>(other: MininessComponent) = this wireTo other.configuration


  /**
   * Output this ProgramComponent as a nesC configuration.
   * 
   * @param outputFolder The folder into which the output file is written. The file has the name
   * "AppC.nc" in all cases.
   */
  def display(outputFolder: File) {
    val outputFile = new BufferedWriter(new FileWriter(new File(outputFolder, "AppC.nc")))
    
    try {
      outputFile.write("configuration AppC {\n")
 
      // It's not clear that the overall exports need to be displayed on the top level
      // configuration. However, a check should probably be done to verify that there are no
      // overall imports.
      // 
      // // TODO: Full declarations for the imports and exports should be displayed.
      // 
      // // Display all the exports.
      // for ((exportName, _) <- exports) {
      //   outputFile.write("    provides " + exportName + ";\n")
      // }
      //
      // // Display all the imports.
      // for ((importName, _) <- imports) {
      //   outputFile.write("    uses     " + importName + ";\n")
      // }
 
      outputFile.write("}\n")
      configuration.display(outputFile)
    }
    finally {
      outputFile.close()
    }
  }

  /**
   * Images the configuration. At compile time, special type checking is done. At run time
   * the generated program is written to disk. Note that the location of the top level
   * configuration is fixed here. The library can't use image() directly because otherwise
   * the Scalaness compiler complains about missing nesT module types. Thus internally
   * this method is used instead.
   */
  def makeImage() {
    val outputFolder = new File(targetFolder)

    // Copy the Makefile.
    val MakefileReader =
      new BufferedReader(new InputStreamReader(new FileInputStream("Makefile")))
    val MakefileWriter =
      new BufferedWriter(new FileWriter(new File(outputFolder, "Makefile")))
    var line: String = null
    while ({ line = MakefileReader.readLine(); line != null }) {
      MakefileWriter.write(line + "\n")
    }
    MakefileReader.close()
    MakefileWriter.close()

    // Generate the top level configuration.
    display(outputFolder)

    // Generate the various components of the program.
    for (component <- this) {
      component.display(outputFolder)
    }
  }
  
  // This is the method that would actually be called by the Scalaness programmer.
  def image() = makeImage()

}
