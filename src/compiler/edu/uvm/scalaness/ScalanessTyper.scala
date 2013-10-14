//-----------------------------------------------------------------------
// FILE    : ScalanessTyper.scala
// SUBJECT : Handling of Scalaness specific type checking.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.{BufferedReader, File, FileReader}
import java.util.ArrayList
import scala.tools.nsc._
import scala.tools.nsc.typechecker.Analyzer
import io.VirtualFile
import reflect.internal.util.BatchSourceFile

import edu.uvm.nest
import nest._

/**
 * This trait provides the code for Scalaness type checking.
 */
trait ScalanessTyper {
  self: Analyzer =>
  import global._
  import global.definitions._
    
  /**
   * Return true if the given Type is a subtype of NesTComponent or ProgramComponent; false
   * otherwise.
   */
  def isNesTComponent(tpe: Type) = {
    (tpe.baseClasses exists { _.toString == "trait NesTComponent" }) || (tpe.baseClasses exists { _.toString == "class ProgramComponent" })
  }

  /**
   * Check to see if last item in the class definition is a string literal.
   * 
   * @param lastItem The AST of the last item in a class definition.
   * @return Some( (shortName, fullName) ) if the last item is a string literal. Here shortName
   * is the value of the string literal and fullName is the full path to the inclusion. This
   * method does not check if the inclusion file actually exists. None is returned if the last
   * item is not a string literal.
   */
  private def checkForNesTInclusion(lastItem: Tree) = {
    lastItem match {
      // The last item is a literal of some kind...
      case Literal(constantValue) => {
        if (constantValue.tag != StringTag) {
          None
        }
        else {
          val Constant(value) = constantValue

          // I depend on the fact that inclusionPrefix has a default value.
          val Some(inclusionPrefix) = scalanessSettings("inclusionPath")

          val fullName = inclusionPrefix + File.separator + value.asInstanceOf[String]
          Some(value.asInstanceOf[String], fullName)
        }
      }
          
      // The last item is something other than a literal.
      case _ => None
    }
  }
     
  
  /**
   * Reads the raw text of the nesT inclusion.
   * 
   * @param fullName The name of the nesT inclusion to read.
   * @return An array containing the entire contents of the inclusion file.
   * @throws java.io.IOException if the file can't be found or read.
   */
  private def readNesTInclusion(fullName: String) = {
    val nesTInclusionFile = new File(fullName)
    val fileLength = nesTInclusionFile.length
    val nesTReader = new FileReader(fullName)
    try {
      val buffer = new Array[Char](fileLength.toInt)  // What happens if fileLength >= 2**31?
      nesTReader.read(buffer)
      buffer
    }
    finally nesTReader.close()
  }


  /**
   * Parses the nesT inclusion stored in the specified file.
   * 
   * @param fullName The name of the file to parse.
   * @param typeVars A collection of top level type variable names to use during parsing.
   * @return The AST of the parse.
   * @throws java.io.IOException if the file can't be found or read, or an ANTLR exception if
   * the parse fails.
   */
  private def parseNesTInclusion(fullName: String, typeVars: Iterable[String]) = {
    val nesTReader = new BufferedReader(new FileReader(fullName))
    try {
      val abstractSyntax = nest.parser.parseNesTInclusion(nesTReader, typeVars)
      abstractSyntax
    }
    finally nesTReader.close()
  }
      
        
  /**
   * Extracts the type and value parameters of a class representing a nesT module.
   *
   * @param body A collection of AST roots that define the body of the class.
   * @return A pair of maps where the first map takes a type parameter name to its upper bound
   * and the second map takes a value parameter name to its type.
   */
  private def extractTypeAndValueParameters(body: List[Tree]) = {
    // TODO: Report errors with proper source position information.

    var typeParameterDeclarations = Map[String, NesTTypes.Representation]()
    var valueParameterDeclarations = Map[String, NesTTypes.Representation]()
    for (bodyItem <- body) {
      bodyItem match {
        case DefDef(mods, name, tparams, vparamss, tpt, rhs) =>
          // TODO: Handle the case where there are multiple constructors.
          if (name.toString == "instantiate" /* "<init>" */) {
            if (vparamss.length > 1)
              reporter.error(null, "NesT modules can't have multiple parameter lists")

            vparamss match {
              case List() => // No parameters at all. Just return two empty maps.
              case List(parameters) =>
                parameters foreach { parameter =>
                  val ValDef(mods, name, tpt, rhs) = parameter
                  // Examine the type of the module's parameter. I should be matching against
                  // the AST of the type. However it's very difficult to figure out the proper
                  // structure because the compiler options for printing ASTs only print
                  // abbreviated ASTs. Thus I'm going to convert the type to its string
                  // representation and analyze the string.
                  //
                  val typeName = tpt.toString()  // Or should this be tpt.tpe.toString()?
                  val leftSquareBracketIndex = typeName.indexOf('[')
                  if (leftSquareBracketIndex == -1) {
                    // The type is not parameterized. Try to lift it.
                    valueParameterDeclarations +=
                      (name.toString -> Lifter.liftType(reporter, typeName))
                  }
                  else {
                    // It is parameterized.
                    val constructorName = typeName.substring(0, leftSquareBracketIndex)
                    if (constructorName == "Array") {
                      valueParameterDeclarations +=
                        (name.toString -> Lifter.liftType(reporter, typeName))
                    }
                    else if (constructorName == "edu.uvm.scalaness.MetaType") {
                      typeParameterDeclarations +=
                        (name.toString ->
                         Lifter.liftType(reporter, typeName.substring(leftSquareBracketIndex + 1, typeName.length - 1)))
                    }
                    else {
                      reporter.error(null,
                        "Type constructor " + constructorName + " is not allowed as a parameter type here")
                    }
                  }
                }
            }
          }
          
        case _ =>
          // Do nothing.
      }
    }
    (typeParameterDeclarations, valueParameterDeclarations)
  }
  
  
  /**
   * Preprocess the indicated file to the indicated result.
   * 
   * @param fullName The full name (possibly with path) of the file to preprocess.
   * @param preprocessedFullName The full name (possibly with path) of the result of preprocessing.
   */
  def runPreprocessor(fullName: String, preprocessedFullName: String) = {
    // TODO: Various aspects of preprocessing should be configurable.
    
    // These are hard coded macros.
    // TODO: It should be possible to define additional macros in the configuration file.
    val predefinedMacros = List("__NEST__")
    
    // Prepare the preprocessor command line.
    val commandLine = new ArrayList[String]()
    val preprocessorName = "cpp"
    commandLine.add(preprocessorName)
    
    // TODO: Eventually the include paths should be configurable and might need this processing.
    // settings("IncludePaths") match {
    //   case Some(includePathsString) =>
    //     val includePaths = includePathsString.split(":")
    //     for (path <- includePaths) {
    //       commandLine.add("-I" + path)
    //     }
    //   case None =>  // Do nothing.
    // }

    for (predefinedMacro <- predefinedMacros) {
      commandLine.add("-D" + predefinedMacro)
    }
    commandLine.add(fullName)
    commandLine.add(preprocessedFullName)
    val cppCommand = new ProcessBuilder(commandLine)

    // Run the preprocessor and display its standard error to the console.
    val cpp = cppCommand.start()
    val errorStream = cpp.getErrorStream
    var rawByte = 0
    while ({ rawByte = errorStream.read(); rawByte != -1}) System.out.print(rawByte.toChar)
    val exitStatus = cpp.waitFor()
    if (exitStatus != 0) throw new Exception(s"Preprocessing $fullName failed")
  }

  
  /**
   * Process the body of a class or module definition to see if it contains a nesT inclusion.
   * If it does, then parse and type check that inclusion, etc.
   * 
   * @param tparams The type parameters of the enclosing class (an empty list for a module).
   * @param impl The AST of the body of the class or module.
   */
  private def processClassOrModuleDef(tparams: List[TypeDef], impl: Template): Any = {
    val Template(_, _, body) = impl

    // Make sure this class has a non-empty body.
    if (body.size >= 1) {
      val lastItem = body(body.size - 1)
      checkForNesTInclusion(lastItem) match {
        case None => ()
        case Some( (shortName, fullName) ) => {
          try {
            println("")
            println("**** Preprocessing nesT inclusion: " + fullName)
            // TODO: Handle the (error) case where the full name does not contain any dots.
            val slashedFullName = fullName.replace('\\','/')
            val dotPosition = slashedFullName.lastIndexOf('.')
            val preprocessedFullName = slashedFullName.substring(0, dotPosition) + ".i"
            runPreprocessor(slashedFullName, preprocessedFullName)
             
            val virtualFile = new VirtualFile(shortName, preprocessedFullName)
            val fileText = readNesTInclusion(preprocessedFullName)   // Might throw java.io.IOException
            val nesTSource = new BatchSourceFile(virtualFile, fileText)
            val (typeParameters, valueParameters) = extractTypeAndValueParameters(body)

            try {
              // TODO: Store the abstract syntax of nesT inclusions in some suitable place.
              println("**** Parsing nesT inclusion: " + preprocessedFullName)
              val abstractSyntax = parseNesTInclusion(preprocessedFullName, typeParameters.keys)

              // Output the nesT abstract syntax tree for debugging purposes.
              val Some(astOutputSetting) = scalanessSettings("ASTOutput")
              if (astOutputSetting == "true") {
                println("**** AST")
                TreeConverter.dumpAST(abstractSyntax)
              }

              // // Unwrap full interface definitions.
              // // TODO: The interface files should be preprocessed as well.
              // println("**** Interface Unwrapping")
              // val Some(interfaceFolder) = scalanessSettings("interfacePath")
              // val interfaceWorker =
              //   new edu.uvm.nest.InterfaceUnwrapper(List(interfaceFolder))
              // val unwrappedAbstractSyntax = interfaceWorker.unwrapInterface(abstractSyntax)
              val unwrappedAbstractSyntax = abstractSyntax  // In case we put unwrapping back.

              // Decorate the AST by populating symbol tables from various declarations.
              println("**** Symbol Processing")
              edu.uvm.nest.Symbols.decorateAST(unwrappedAbstractSyntax)
                
              // NesT type checking.
              val compatibilityRelation =
                new TypeCompatibilityRelation(scalanessSettings("typeCompatibility"))
              val Some(debugSetting) = scalanessSettings("debug")
              println("**** Type Checking")
              val typeChecker = new NesTTyper(
                typeVars     = typeParameters,
                valueVars    = valueParameters,
                typeRelation = compatibilityRelation,
                debugFlag    = (debugSetting == "true"))
              unwrappedAbstractSyntax.symbolTable = Some(Symbols(
                Map[String, NesTTypes.Representation](),
                Map(("int"      -> NesTTypes.Int16 ),
                    ("char"     -> NesTTypes.Char  ),
                    ("uint8_t"  -> NesTTypes.UInt8 ),
                    ("uint16_t" -> NesTTypes.UInt16),
                    ("uint32_t" -> NesTTypes.UInt32),
                    ("int8_t"   -> NesTTypes.Int8  ),
                    ("int16_t"  -> NesTTypes.Int16 ),
                    ("int32_t"  -> NesTTypes.Int32 ),
                    ("error_t"  -> NesTTypes.ErrorT)),
                valueParameters)
                )
              val nesTInclusionType = typeChecker.checkNesTInclusion(unwrappedAbstractSyntax) match {
                case Some(nesType) => nesType
                case _ => throw new Exception("Unable to properly type nesT inclusion")
              }
              return nesTInclusionType
              println()
            }
            catch {
              // Problems parsing the nesT inclusion.
              case ex: org.antlr.runtime.RecognitionException =>

                // The Scala compiler's source positioning is zero based. ANTLR uses one based
                // positions for line numbers and zero based positions for column numbers.
                // 
                reporter.error(
                    nesTSource.position(nesTSource.lineToOffset(ex.line - 1) + ex.charPositionInLine),
                    ex.getMessage + ": " + ex.getClass.getName)
                
              // Problems type checking the nesT inclusion.
              case ex: NesTTyper.PositionalNesTTypeException =>
                if (ex.line >= 0 && ex.column >= 0)
                  reporter.error(
                    nesTSource.position(nesTSource.lineToOffset(ex.line) + ex.column),
                    ex.getMessage + ": " + ex.getClass.getName)
                else
                  reporter.error(null, ex.getMessage + ": " + ex.getClass.getName)
                  
              // Other problems.
              case ex: Exception =>
                reporter.error(null, ex.getMessage + ": " + ex.getClass.getName)
            }
          }
          catch {
            // Problems reading the nesT inclusion.
            case ex: java.io.IOException =>
              reporter.error(null, ex.getMessage + ": " + ex.getClass.getName)
          }
        }
      }
    }
  }

  
  /**
   * Perform a check on the give AST node. Only class and module definitions are checked for
   * nesT inclusions.
   */
  def scalanessCheck(tree: Tree): Option[NesTTypes.Module] = {

    val moduleResult = tree match {

      // For class definitions, see if they provide a nesC inclusion.
      case ClassDef(mods, name, tparams, impl) =>
        processClassOrModuleDef(tparams, impl) match {
          case NesTTypes.Module(t,v,i,e) => Some(NesTTypes.Module(t,v,i,e))
          case _ => None
        }

      case ModuleDef(mods, name, impl) =>
        processClassOrModuleDef(List(), impl) match {
          case NesTTypes.Module(t,v,i,e) => Some(NesTTypes.Module(t,v,i,e))
          case _ => None
        }
      
      // Find all module instantiations. They will all involve operator new.
      case New(tpt) => None
        // println("New expression found! tpt = " + tpt)

      // Ignore all other constructs.
      case _ => None
    }
    
    moduleResult
    
  }
}
