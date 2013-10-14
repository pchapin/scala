//-----------------------------------------------------------------------
// FILE    : Lifter.scala
// SUBJECT : Utility methods for lifting and lowering Scala types to/from nesT
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import scala.tools.nsc.reporters.Reporter
import edu.uvm.nest.NesTTypes

object Lifter {

  /**
   * Compute the lifted version of the given Scalaness type.
   * 
   * @param typeName The Scalaness type to lift as a string.
   * @return The nesT representation of that type.
   */
  private[scalaness] def liftType(
    reporter: Reporter, typeName: String): NesTTypes.Representation = {

    // TODO: Report errors/warnings with proper source position information.
    import NesTTypes._

    val firstBracketIndex = typeName.indexOf('[')
    val lastBracketIndex = typeName.lastIndexOf(']')
    // We need the last '.' that comes before the first '[' (if any).
    val lastOuterDotIndex =
      typeName.lastIndexOf('.',
                           if (firstBracketIndex == -1) typeName.length else firstBracketIndex)

    def liftBaseType(baseTypeName: String) = {
      // TODO: Handle more complex types just the primitives.
      val translation = Map(
        "Top"    -> Top,
        "Char"   -> Char,
        "Int8"   -> Int8,
        "Int16"  -> Int16,
        "Int32"  -> Int32,
        "UInt8"  -> UInt8,
        "UInt16" -> UInt16,
        "UInt32" -> UInt32,
        "ErrorT" -> ErrorT)

      if (firstBracketIndex != -1) {
        val parameterType =
          liftType(reporter, typeName.substring(firstBracketIndex + 1, lastBracketIndex))

        // Assume the type constructor is 'Array' (or else we wouldn't be here).
        // TODO: What should be used for the size parameter here?
        Array(parameterType, "")
      }
      else {

        translation.getOrElse(baseTypeName, {
          reporter.error(null, "Liftable type " + baseTypeName + " not yet supported. Using Int32")
          Int32
        })
      }
    }

    lastOuterDotIndex match {
      case -1 => liftBaseType(typeName)
      case  _ =>
        if (typeName.substring(0, lastOuterDotIndex) != "edu.uvm.scalaness.LiftableTypes") {
          reporter.error(null, "Type " + typeName + " is not liftable. Using Int32")
          Int32
        }
        else {
          liftBaseType(typeName.substring(lastOuterDotIndex + 1))
        }
    }
  }


  /**
   * Compute the lowered version of the nesT type.
   * 
   * @param typeName The name of the nesT type to lower.
   * @param The name of the Scalaness representation of that type.
   */
  private[scalaness] def lowerType(reporter: Reporter, typeName: String) = {
    // TODO: Handle more complex types just the primitives.
    val translation = Map(
      "char"     -> "Char",
      "int"      -> "Int16",    // Assume a 16 bit microcontroller.
      "int8_t"   -> "Int8",
      "int16_t"  -> "Int16",
      "int32_t"  -> "Int32",
      "uint8_t"  -> "UInt8",
      "uint16_t" -> "UInt16",
      "uint32_t" -> "UInt32")

    translation.getOrElse(typeName, {
      reporter.error(null, "type " + typeName + " not yet supported. Using Int16")
      "Int16"
    })
  }

}
