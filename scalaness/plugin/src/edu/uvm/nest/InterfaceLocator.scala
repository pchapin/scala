//-----------------------------------------------------------------------
// FILE    : InterfaceLocator.scala
// SUBJECT : Implementors of this trait can locate interface information from libraries.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

/**
 * Abstracts the algorithm for locating and parsing nesT interface information. Classes that have this trait use
 * some internal mechanism for accessing nesC libraries. Multiple implementations are possible depending on how the
 * libraries are stored. This trait is intended to expose only a nesT interface. If the underlying libraries are
 * full nesC this trait must either hide those distinctions or report an error condition.
 */
trait InterfaceLocator {

  /**
   * Looks up a particular interface from an appropriate library. The direction of the interface is significant. An
   * interface that is being used will have its commands listed as imports and its events listed as exports. An
   * interface that is being provided will have its commands listed as exports and its events listed as imports.
   * 
   * @param interfaceName The name of the interface to locate.
   * @param direction Indicates if the interface is being used or provided.
   * 
   * @return The definition of the specified interface in nesT form. The import and export lists depend on the
   *         interface's direction.
   * 
   * @throws InterfaceNotFoundException if this locator can't find the interface.
   * @throws InterfaceNotRepresentableException if the interface isn't expressible as nesT.
   */
  def locate(
    interfaceName: String,
    direction    : InterfaceDirectionality.Value): InterfaceDefinition

}

object InterfaceLocator {
  
  /**
   * Exception thrown when an interface can't be located.
   */
  class InterfaceNotFoundException(message: String) extends Exception(message)
  
  
  /**
   * Exception thrown when an interface is defined more than once and no disambiguation policy is in effect.
   */
  class InterfaceMultiplyDefinedException(message: String) extends Exception(message)
  
  
  /**
   * Exception thrown when an interface can't be represented in nesT terms. This exception is also thrown when an
   * interface does not parse successfully. The presumption is that such interfaces contain full nesC constructs that
   * are not legal nesT.
   */
  class InterfaceNotRepresentableException(message: String) extends Exception(message)


  /**
   * Exception thrown when the interface processing encounters an "impossible" error. This exception should never arise.
   */
  class InterfaceInternalException(message: String) extends Exception(message)
  
}
