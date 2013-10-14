//-----------------------------------------------------------------------
// FILE    : TypeCompatibilityMap.scala
// SUBJECT : A class representing a map of castable types. This map is user configurable.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

import java.io.{BufferedReader, File, FileReader}
import NesTTypes._

class TypeCompatibilityRelation(relationFileName: Option[String])
  extends Function2[Representation, Representation, Boolean] {
  
  // I wonder if scalaz (or some other third party library) has a generic relation class.
  private var typeRelation: Map[Representation, List[Representation]] = Map()
  
  private def readRelationFile {
    relationFileName match {
      case None =>
        // No type compatibility relation requested. Do nothing.
        
      case Some(fileName) =>
        val relationFile = new File(fileName)
        
        // TODO: Issue a warning if a requested type compatibility file does not exist.
        if (relationFile.exists) {
          val input = new BufferedReader(new FileReader(relationFile))
          try {
            var line: String = null
            while ({ line = input.readLine(); line != null }) {
              val commentMark = line.indexOf('#')
              line = if (commentMark == -1) line else line.substring(0, commentMark)
              line = line.trim
              val parts = line.split("""\s+""")
              if (parts.length == 2) {
          
                // TODO: Better error handling if the line is not in the expected format.
                // TODO: Handle types in the compatibility relation other than structure types.

                // Type equivalence of structures is nominal. The member list doesn't matter
                val typeLeft = parts(0) match {
                  case "Int32"  => Int32
                  case "UInt32" => UInt32
                  case "Int16"  => Int16
                  case "UInt16" => UInt16
                  case "Int8"   => Int8
                  case "UInt8"  => UInt8
                  case "Int"    => Int16
                  case "UInt"   => UInt16
                  case "Char"   => Char
                  case _ => Structure(parts(0), List())
                }
                val typeRight = parts(1) match {
                  case "Int32"  => Int32
                  case "UInt32" => UInt32
                  case "Int16"  => Int16
                  case "UInt16" => UInt16
                  case "Int8"   => Int8
                  case "UInt8"  => UInt8
                  case "Int"    => Int16
                  case "UInt"   => UInt16
                  case "Char"   => Char
                  case _ => Structure(parts(1), List())
                }
                if (typeRelation.isDefinedAt(typeLeft)) {
                  // TODO: Handle the case where typeRight is already on the list for typeLeft.
                  typeRelation += (typeLeft -> (typeRight :: typeRelation(typeLeft)))
                }
                else {
                  typeRelation += (typeLeft -> List(typeRight))
                }
              }
            }
          }
          finally input.close()
        }
    }
    // After this method completes typeRelation is (intended to be) immutable.
  }
    
  // The primary constructor just reads the relation file.
  readRelationFile
  
  def apply(arg1: Representation, arg2: Representation) = {
    typeRelation.get(arg1) match {
      case None => false
      case Some(typeList) =>
        typeList.find( _ == arg2).isDefined
    }
  }
}
