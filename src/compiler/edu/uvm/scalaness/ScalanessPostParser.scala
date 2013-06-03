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
import scala.tools.nsc.symtab.Flags
import java.io.File
import edu.uvm.mininess.MininessTypes

/**
 * This class implements a plugin component using tree transformers.
 * 
 * This class originally took settings: ConfigurationSettings. This allowed it to access the
 * Scalaness configuration. Currently a ConfigurationSettings object is created in Scalaness-
 * Typer but getting access to it from here is awkward. For the now I'm just hard coding paths
 * into the compiler. Obviously that is very lame.
 */
class ScalanessPostParser(val global: Global) extends PluginComponent with Transform {
  import global._
  import global.definitions._

  val runsAfter = List("parser")
  override val runsBefore = List("namer")
  override def description = "injects Scalaness boilerplate"
  val phaseName = "postparser"

  def newTransformer(unit: CompilationUnit) = new PostParserTransformer

  // The methods surrounded by '=' are currently (nearly) duplicated in ScalanessTyper.scala.
  // They should be factored out if possible. However, the methods are not identical so some
  // sort of parameterization of them might be necessary to handle the differences.
  //=============================================================================================

  /*
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
          // val Some(inclusionPrefix) = settings("inclusionPath")
          val inclusionPrefix = "."

          val fullName = inclusionPrefix + File.separator + value.asInstanceOf[String]
          Some(value.asInstanceOf[String], fullName)
        }
      }

      // The last item is something other than a literal.
      case _ => None
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

            vparamss match {
              case List() => // No parameters at all. Just return two empty maps.
              case List(parameters) =>
                parameters foreach { parameter =>
                  val ValDef(mods, name, tpt, rhs) = parameter
                  // Examine the type of the module's parameter. I should be matching against
                  // the AST of the type. However it's very difficult to figure out the proper
                  // structure because the compiler options for printing ASTs only print
                  // "abbreviated" ASTs. Thus I'm going to convert the type to its string
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
                    // It is parameterized. This is a little dicey because at this point the
                    // normal namer and typer phases have not yet run. Thus type names have not
                    // been put into a canonical form yet. The code below works for typical
                    // cases.
                    //
                    val constructorName = typeName.substring(0, leftSquareBracketIndex)
                    if (constructorName == "Array") {
                      valueParameterDeclarations +=
                        (name.toString -> Lifter.liftType(reporter, typeName))
                    }
                    else if (constructorName == "MetaType") {
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

  //=============================================================================================

  /**
   * Process the body of a class or module definition to see if it contains a Mininess inclusion.
   * If it does, then inject appropriate material, etc.
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
          val MininessComponentName = shortName.substring(0, shortName.lastIndexOf('.'))
          val reparseName = fullName.replace(".nc", ".i")

          val (typeParameters, valueParameters) = extractTypeAndValueParameters(body)
          // println(s"typeParameters = $typeParameters, valueParameters = $valueParameters")

          // Compute 'var someName: SomeType = null' for each type and value parameter.
          // TODO: Be sure appropriate imports are available.
//          val typeVars = for ( (typeName, typeType) <- typeParameters ) yield {
//            println(s"typeName = $typeName; typeType = $typeType")
//            treeBuilder.makePatDef(
//              Modifiers(Flags.PRIVATE | Flags.MUTABLE),
//              Typed(Ident("sc_" + typeName), AppliedTypeTree(Ident("MetaType"), List(Ident(Lifter.lowerType(reporter, typeType.toString))))),
//              Literal(Constant("null")))
//          }
//          val valueVars = for ( (valueName, valueType) <- valueParameters) yield {
//            treeBuilder.makePatDef(
//              Modifiers(Flags.PRIVATE | Flags.MUTABLE),
//              Typed(Ident("sc_" + valueName), TypeTree(Ident(Lifter.lowerType(reporter, valueType.toString)))),
//              Literal(Constant("null")))
//          }

          // Compute 'val abstractSyntax =
          //            Parser.reparse("ExampleC.i", List("firstType", "secondType"))'
          // TODO: Be sure appropriate imports are available.
          val typeNames = for ( (typeName, _) <- typeParameters ) yield Literal(Constant(typeName))
          val typeNameList =
            Apply(Ident("List"), typeNames.toList)
          val reparseInvocation =
            Apply(Select(Ident("Parser"), "reparse"), List(Literal(Constant(s"$reparseName")), typeNameList))
          val abstractSyntaxVal = treeBuilder.makePatDef(
            Modifiers(Flags.PRIVATE),
            Ident("abstractSyntax"),
            reparseInvocation)

          // Display the generated code if requested.
          val Some(displayGenerated) = scalanessSettings("displayGenerated")
          if (displayGenerated == "true") {
            println(s"Code generated into $MininessComponentName...")
//            println(s"\t$typeVars")
//            println(s"\t$valueVars")
            println(s"\t$abstractSyntaxVal")
          }

          // This loop ensures we insert our new material after the synthesized primary
          // constructor. I'm not sure how necessary that really is, but it seems like a good
          // idea.
          //
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
