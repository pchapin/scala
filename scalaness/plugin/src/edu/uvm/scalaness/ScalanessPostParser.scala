//-----------------------------------------------------------------------
// FILE    : ScalanessPostParser.scala
// SUBJECT : New compiler phase for handling AST manipulations immediately after parsing.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import scala.tools.nsc._
import scala.tools.nsc.plugins.PluginComponent
import scala.tools.nsc.transform.Transform
import java.io.File
import edu.uvm.mininess.MininessTypes

/**
 * This class implements a plugin component using tree transformers.
 */
class ScalanessPostParser(val global: Global, settings: ConfigurationSettings) extends PluginComponent with Transform {
  import global._
  import global.definitions._

  val runsAfter = List("parser")
  override val runsBefore = List("namer")
  val phaseName = "scalanesspostparser"

  def newTransformer(unit: CompilationUnit) = new PostParserTransformer

  // The methods surrounded by '=' are currently duplicated in ScalanessTyper.scala. They should be factored out.
  //===================================================================================================================

  /*
   * Check to see if last item in the class definition is a string literal.
   *
   * @param lastItem The AST of the last item in a class definition.
   * @return Some( (shortName, fullName) ) if the last item is a string literal. Here shortName is the value of the
   * string literal and fullName is the full path to the inclusion. This method does not check if the inclusion file
   * actually exists. None is returned if the last item is not a string literal.
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
          val Some(inclusionPrefix) = settings("inclusionPath")

          val fullName = inclusionPrefix + File.separator + value.asInstanceOf[String]
          Some(value.asInstanceOf[String], fullName)
        }
      }

      // The last item is something other than a literal.
      case _ => None
    }
  }


  /**
   * Compute the lifted version of the given Scalaness type.
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
        "UInt32" -> UInt32)

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
   * @return A pair of maps where the first map takes a type parameter name to its upper bound and the second map takes
   *         a value parameter name to its type.
   */
  private def extractTypeAndValueParameters(body: List[Tree]) = {
    // TODO: Report errors with proper source position information.

    var typeParameterDeclarations = Map[String, MininessTypes.Representation]()
    var valueParameterDeclarations = Map[String, MininessTypes.Representation]()
    for (bodyItem <- body) {
      bodyItem match {
        case DefDef(mods, name, tparams, vparamss, tpt, rhs) =>
          // TODO: Handle the case where there are multiple constructors.
          if (name.toString == "<init>") {
            if (vparamss.length > 1)
              reporter.error(null, "Mininess modules can't have multiple parameter lists")

            val List(parameters) = vparamss
            parameters foreach { parameter =>
              val ValDef(mods, name, tpt, rhs) = parameter
              // Examine the type of the module's parameter. In theory I should match against the AST of the type.
              // However it's very difficult to figure out the proper structure because the compiler options for
              // printing ASTs only print "abbreviated" ASTs that aren't actually useful to me. Thus I'm going to
              // convert the type to its string representation and analyze the string. It's a hack, but when (if) the
              // compiler internals are better documented this can be changed to do it the right way.
              //
              val typeName = tpt.toString()  // Or should this be tpt.tpe.toString()?
              val leftSquareBracketIndex = typeName.indexOf('[')
              if (leftSquareBracketIndex == -1) {
                // The type is not parameterized. Try to lift it.
                valueParameterDeclarations +=
                  (name.toString -> liftType(typeName))
              }
              else {
                // It is parameterized. Verify that it's a MetaType. This is a little dicey because at this point the
                // normal namer and typer phases have not yet run. Thus type names have not been put into a canonical
                // form yet. The code below works for typical cases.
                //
                val constructorName = typeName.substring(0, leftSquareBracketIndex)
                if (constructorName != "MetaType") {
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

  //===================================================================================================================

  /**
   * Process the body of a class or module definition to see if it contains a Mininess inclusion. If it does, then
   * inject appropriate material, etc.
   *
   * @param tparams The type parameters of the enclosing class (an empty list for a module).
   * @param impl The AST of the body of the class or module.
   */
  private def processClassOrModuleDef(tparams: List[TypeDef], impl: Template) = {
    val Template(parents, self, body) = impl

    // Make sure this class has a non-empty body.
    if (body.size == 0) impl
    else {
      val lastItem = body(body.size - 1)
      checkForMininessInclusion(lastItem) match {
        case None => impl
        case Some( (shortName, fullName) ) => {
          // This is a hackish way of getting (for example) ExampleC from ExampleC.nc.
          val MininessComponentName = shortName.substring(0, shortName.indexOf('.'))

          val (typeParameters, valueParameters) = extractTypeAndValueParameters(body)
          // println(s"typeParameters = $typeParameters, valueParameters = $valueParameters")

          // Compute 'val abstractSyntax = Parser.reparse("/ExampleC.nc", List("firstType", "secondType"))'
          // TODO: Make the synthesized val private.
          // TODO: Be sure appropriate imports are available.
          val typeNames = for ( (typeName, _) <- typeParameters ) yield Literal(Constant(typeName))
          val typeNameList =
            Apply(Ident("List"), typeNames.toList)
          val reparseInvocation =
            Apply(Select(Ident("Parser"), "reparse"), List(Literal(Constant(s"/$shortName")), typeNameList))
          val abstractSyntaxVal = treeBuilder.makePatDef(Ident("abstractSyntax"), reparseInvocation)

          // This loop ensures we insert our new material after the synthesized primary constructor.
          // I'm not sure how necessary that really is, but it seems like a good idea.
          val newBody = for (bodyItem <- body) yield {
            bodyItem match {
              case someDef @ DefDef(_, name, _, _, _, _) =>
                if (name.toString == "<init>")
                  List(someDef) ++ abstractSyntaxVal
                else
                  List(someDef)
              case _ => List(bodyItem)
            }
          }
          treeCopy.Template(impl, parents, self, newBody.flatten)
        }
      }
    }
  }


  /**
   * The tree transformer that implements the behavior of this component.
   */
  class PostParserTransformer extends Transformer {

    /**
     * When using <code>preTransform</code>, each node is visited before its children.
     */
    def preTransform(tree: Tree): Tree = tree match {
      case _ => tree
    }

    /**
     * When using <code>postTransform</code>, each node is visited after its children.
     */
    def postTransform(tree: Tree): Tree = tree match {

      // For class definitions, see if they provide a Mininess inclusion.
      case ClassDef(mods, name, tparams, impl) =>
        treeCopy.ClassDef(tree, mods, name, tparams, processClassOrModuleDef(tparams, impl))

      // For module definitions, see if they provide a Mininess inclusion.
      case ModuleDef(mods, name, impl) =>
        treeCopy.ModuleDef(tree, mods, name, processClassOrModuleDef(List(), impl))

      case _ => tree
    }

    override def transform(tree: Tree): Tree = {
      postTransform(super.transform(preTransform(tree)))
    }
  }
}
