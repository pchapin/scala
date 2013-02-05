//-----------------------------------------------------------------------
// FILE    : ScalanessTyper.scala
// SUBJECT : Handling of Scalaness specific type checking.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import java.io.{BufferedReader, File, FileReader}
import java.util.ArrayList
import scala.tools.nsc._
import scala.tools.nsc.typechecker.Analyzer
import io.VirtualFile
import reflect.internal.util.BatchSourceFile

import edu.uvm.mininess
import mininess._

/**
 * This trait provides the code for Scalaness type checking.
 */
trait ScalanessTyper {
  self: Analyzer =>
  import global._
  import global.definitions._
  
  private val configurableItems =
    Map("ASTOutput"     -> ConfigurationSettings.basicBooleanValidator _,
        "configFile"    -> ConfigurationSettings.basicPathValidator _,
        "debug"         -> ConfigurationSettings.basicBooleanValidator _,
        "inclusionPath" -> ConfigurationSettings.basicPathValidator _,
        "interfacePath" -> ConfigurationSettings.basicPathValidator _,
        "typeCompatibility" -> ConfigurationSettings.basicPathValidator _)
  private val scalanessSettings = new ConfigurationSettings(configurableItems)
  scalanessSettings.setDefaults(
    Map("ASTOutput"     -> "FALSE",
        "debug"         -> "FALSE",
        "inclusionPath" -> ".",
        "interfacePath" -> "."))
  private val configName =
    if (currentSettings.scalanessconfig.value == "") "Scalaness.cfg"
      else currentSettings.scalanessconfig.value
  scalanessSettings.readConfigurationFile(configName)
  // TODO: It would be better if these settings were handled the way other compiler settings are.
  
  /**
   * Return true if the given Type is a subtype of MininessComponent or ProgramComponent; false otherwise.
   */
  def isNesTComponent(tpe: Type) = {
    (tpe.baseClasses exists { _.toString == "trait MininessComponent" }) || (tpe.baseClasses exists { _.toString == "class ProgramComponent" })
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
  private def checkForMininessInclusion(lastItem: Tree) = {
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
   * Parses the Mininess inclusion stored in the specified file.
   * 
   * @param fullName The name of the file to parse.
   * @param typeVars A collection of top level type variable names to use during parsing.
   * @return The AST of the parse.
   * @throws java.io.IOException if the file can't be found or read, or an ANTLR exception if
   * the parse fails.
   */
  private def parseMininessInclusion(fullName: String, typeVars: Iterable[String]) = {
    val MininessReader = new BufferedReader(new FileReader(fullName))
    try {
      val abstractSyntax = mininess.parser.parseMininessInclusion(MininessReader, typeVars)
      abstractSyntax
    }
    finally MininessReader.close()
  }
      
        
  /**
   * Reads the raw text of the Mininess inclusion.
   * 
   * @param fullName The name of the Mininess inclusion to read.
   * @return An array containing the entire contents of the inclusion file.
   * @throws java.io.IOException if the file can't be found or read.
   */
  private def readMininessInclusion(fullName: String) = {
    val MininessInclusionFile = new File(fullName)
    val fileLength = MininessInclusionFile.length
    val MininessReader = new FileReader(fullName)
    try {
      val buffer = new Array[Char](fileLength.toInt)  // What happens if fileLength >= 2**31?
      MininessReader.read(buffer)
      buffer
    }
    finally MininessReader.close()
  }


  /**
   * Compute the lifted version of the given Scalaness type.
   * 
   * @param typeName The Scalaness type to lift as a string.
   * @return The Mininess representation of that type.
   */
  private def liftType(typeName: String) = {
    // TODO: Report errors with proper source position information.
    import MininessTypes._

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

        translation.getOrElse(baseTypeName, {
          reporter.error(null, "Liftable type " + baseTypeName + " not yet supported. Using Int32")
          Int32
        })
    }

    val lastDotIndex = typeName.lastIndexOf('.')
    lastDotIndex match {
      case -1 => liftBaseType(typeName)
      case  _ =>
        if (typeName.substring(0, lastDotIndex) != "edu.uvm.scalaness.LiftableTypes") {
          reporter.error(null, "Type " + typeName + " is not liftable. Using Int32")
          Int32
        }
        else {
          liftBaseType(typeName.substring(lastDotIndex + 1))
        }
    }
  }


  /**
   * Extracts the type and value parameters of a class representing a Mininess module.
   *
   * @param body A collection of AST roots that define the body of the class.
   * @return A pair of maps where the first map takes a type parameter name to its upper bound
   * and the second map takes a value parameter name to its type.
   */
  private def extractTypeAndValueParameters(body: List[Tree]) = {
    // TODO: Report errors with proper source position information.

    var typeParameterDeclarations = Map[String, MininessTypes.Representation]()
    var valueParameterDeclarations = Map[String, MininessTypes.Representation]()
    for (bodyItem <- body) {
      bodyItem match {
        case DefDef(mods, name, tparams, vparamss, tpt, rhs) =>
          // TODO: Handle the case where there are multiple constructors.
          if (name.toString == "instantiate" /* "<init>" */) {
            if (vparamss.length > 1)
              reporter.error(null, "Mininess modules can't have multiple parameter lists")

            val List(parameters) = vparamss
            parameters foreach { parameter =>
              val ValDef(mods, name, tpt, rhs) = parameter
              // Examine the type of the module's parameter. In theory I should match against
              // the AST of the type. However it's very difficult to figure out the proper
              // structure because the compiler options for printing ASTs only print abbreviated
              // ASTs. Thus I'm going to convert the type to its string representation and
              // analyze the string. It's a hack, but when (if) the compiler internals are
              // better documented this can be changed to do it the right way.
              //
              val typeName = tpt.toString()  // Or should this be tpt.tpe.toString()?
              val leftSquareBracketIndex = typeName.indexOf('[')
              if (leftSquareBracketIndex == -1) {
                // The type is not parameterized. Try to lift it.
                valueParameterDeclarations += (name.toString -> liftType(typeName))
              }
              else {
                // It is parameterized. Verify that it's a MetaType.
                val constructorName = typeName.substring(0, leftSquareBracketIndex)
                if (constructorName != "edu.uvm.scalaness.MetaType") {
                  reporter.error(null,
                    "Type constructor " + constructorName + " is not allowed as a parameter type here")
                }
                else {
                  typeParameterDeclarations +=
                    (name.toString -> liftType(typeName.substring(leftSquareBracketIndex + 1, typeName.length - 1)))
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
    
    // These are hard coded macros that are only interesting to TinyECC.
    // Clearly these need to come from a configuration file to make the compiler more general.
    val predefinedMacros = List(
        "PLATFORM_TELOSB",
        "SECP160K1"
        // "BARRETT_REDUCTION",  // Barrett reduction.
        // "HYBRID_MULT",        // Hybrid multiplication.
        // "HYBRID_SQR",         // Hybrid square.
        // "CURVE_OPT",          // Optimization for secg curve.
        // "PROJECTIVE",         // Projective coordinates.
        // "SLIDING_WIN",        // Sliding window method.
        // "SHAMIR_TRICK"        // Shamir trick.
        )
    
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
    commandLine.add("-I/opt/tinyos-2.1.2/apps/TinyECC-2.0")
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
   * Process the body of a class or module definition to see if it contains a Mininess inclusion.
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
      checkForMininessInclusion(lastItem) match {
        case None => ()
        case Some( (shortName, fullName) ) => {
          try {
            println("")
            println("**** Preprocessing Mininess inclusion: " + fullName)
            // TODO: Handle the (error) case where the full name does not contain any dots.
            val dotPosition = fullName.lastIndexOf('.')
            val preprocessedFullName = fullName.substring(0, dotPosition) + ".i"
            runPreprocessor(fullName, preprocessedFullName)
             
            val virtualFile = new VirtualFile(shortName, preprocessedFullName)
            val fileText = readMininessInclusion(preprocessedFullName)   // Might throw java.io.IOException
            val mininessSource = new BatchSourceFile(virtualFile, fileText)
            val (typeParameters, valueParameters) = extractTypeAndValueParameters(body)

            try {
              // TODO: Store the abstract syntax of Mininess inclusions in some suitable place.
              println("**** Parsing Mininess inclusion: " + preprocessedFullName)
              val abstractSyntax = parseMininessInclusion(preprocessedFullName, typeParameters.keys)

              // Output the Mininess abstract syntax tree for debugging purposes.
              val Some(astOutputSetting) = scalanessSettings("ASTOutput")
              if (astOutputSetting == "true") {
                println("**** AST")
                TreeConverter.dumpAST(abstractSyntax)
              }

              // Unwrap full interface definitions.
              // TODO: The interface files should be preprocessed as well.
              println("**** Interface Unwrapping")
              val Some(interfaceFolder) = scalanessSettings("interfacePath")
              val interfaceWorker = new edu.uvm.mininess.InterfaceUnwrapper(List(interfaceFolder))
              val unwrappedAbstractSyntax = interfaceWorker.unwrapInterface(abstractSyntax)
               
              // Decorate the AST by populating symbol tables from various declarations.
              println("**** Symbol Processing")
              edu.uvm.mininess.Symbols.decorateAST(unwrappedAbstractSyntax)
                
              // Mininess type checking.
              val compatibilityRelation =
                new TypeCompatibilityRelation(scalanessSettings("typeCompatibility"))
              val Some(debugSetting) = scalanessSettings("debug")
              println("**** Type Checking")
              val typeChecker = new MininessTyper(
                typeVars     = typeParameters,
                valueVars    = valueParameters,
                typeRelation = compatibilityRelation,
                debugFlag    = (debugSetting == "true"))
              unwrappedAbstractSyntax.symbolTable = Some(Symbols(
                Map[String, MininessTypes.Representation](),
                Map(("int"      -> MininessTypes.Int16 ),
                    ("char"     -> MininessTypes.Char  ),
                    ("uint8_t"  -> MininessTypes.UInt8 ),
                    ("uint16_t" -> MininessTypes.UInt16),
                    ("uint32_t" -> MininessTypes.UInt32),
                    ("int8_t"   -> MininessTypes.Int8  ),
                    ("int16_t"  -> MininessTypes.Int16 ),
                    ("int32_t"  -> MininessTypes.Int32 ),
                    ("error_t"  -> MininessTypes.ErrorT)),
                valueParameters)
                )
              val mininessInclusionType = typeChecker.checkMininessInclusion(unwrappedAbstractSyntax) match {
                case Some(miniType) => miniType
                case _ => throw new Exception("Unable to properly type Mininess inclusion")
              }
              return mininessInclusionType
              println()
            }
            catch {
              // Problems parsing the Mininess inclusion.
              case ex: org.antlr.runtime.RecognitionException =>

                // The Scala compiler's source positioning is zero based. ANTLR uses one based
                // positions for line numbers and zero based positions for column numbers.
                // 
                reporter.error(
                    mininessSource.position(mininessSource.lineToOffset(ex.line - 1) + ex.charPositionInLine),
                    ex.getMessage + ": " + ex.getClass.getName)
                
              // Problems type checking the Mininess inclusion.
              case ex: MininessTyper.PositionalMininessTypeException =>
                if (ex.line >= 0 && ex.column >= 0)
                  reporter.error(
                    mininessSource.position(mininessSource.lineToOffset(ex.line) + ex.column),
                    ex.getMessage + ": " + ex.getClass.getName)
                else
                  reporter.error(null, ex.getMessage + ": " + ex.getClass.getName)
                  
              // Other problems.
              case ex: Exception =>
                reporter.error(null, ex.getMessage + ": " + ex.getClass.getName)
            }
          }
          catch {
            // Problems reading the Mininess inclusion.
            case ex: java.io.IOException =>
              reporter.error(null, ex.getMessage + ": " + ex.getClass.getName)
          }
        }
      }
    }
  }

  
  /**
   * Perform a check on the give AST node. Only class and module definitions are checked for
   * Mininess inclusions.
   */
  def scalanessCheck(tree: Tree): Option[MininessTypes.Module] = {

    val moduleResult = tree match {

      // For class definitions, see if they provide a nesC inclusion.
      case ClassDef(mods, name, tparams, impl) =>
        processClassOrModuleDef(tparams, impl) match {
          case MininessTypes.Module(t,v,i,e) => Some(MininessTypes.Module(t,v,i,e))
          case _ => None
        }

      case ModuleDef(mods, name, impl) =>
        processClassOrModuleDef(List(), impl) match {
          case MininessTypes.Module(t,v,i,e) => Some(MininessTypes.Module(t,v,i,e))
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
