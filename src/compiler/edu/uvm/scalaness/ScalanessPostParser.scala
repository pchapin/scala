//-----------------------------------------------------------------------
// FILE    : ScalanessPostParser.scala
// SUBJECT : New compiler phase for handling AST manipulations immediately after parsing.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//-----------------------------------------------------------------------
package edu.uvm.scalaness

import scala.tools.nsc._
import scala.tools.nsc.plugins.PluginComponent
import scala.tools.nsc.reporters.Reporter
import scala.tools.nsc.transform.Transform
import scala.tools.nsc.symtab.Flags
import java.io.File
import edu.uvm.nest.NesTTypes

/**
 * This class injects boilerplate into the program's AST after parsing.
 *
 * This class is implemented as a plugin component using tree transformers providing a new phase
 * to run immediately after parsing (but before type checking). This phase is "manually" added
 * to the phase pipeline in the compiler source code. I can't tell if this approach is hackish
 * or elegant. In any case it will facilitate adaption to the plugin version of Scalaness if
 * that ever again becomes a reality.
 *
 * Be aware that this phase runs before name resolution and type checking. Thus names from the
 * program are "raw" and not yet put into canonical form. This creates some guesswork in the
 * analysis but the implementation here works well enough.
 */
class ScalanessPostParser(val global: Global) extends PluginComponent with Transform {
  import global._
  import global.definitions._

  val runsAfter = List("parser")
  override val runsBefore = List("namer")
  override def description = "injects Scalaness boilerplate"
  val phaseName = "postparser"

  def newTransformer(unit: CompilationUnit) = new PostParserTransformer

  /*
   * Check to see if last item in the class or object definition is a string literal.
   *
   * @param lastItem The AST of the last item in a class definition.
   *
   * @return Some( (shortName, fullName) ) if the last item is a string literal. Here shortName
   * is the value of the string literal and fullName is the full path to the inclusion. This
   * method does not check if the inclusion file actually exists. None is returned if the last
   * item is not a string literal.
   */
  private def checkForNesTInclusion(lastItem: Tree) = {
    // TODO: In theory we should check that the class/object extends NesTComponent.
    // That would be complicated to do here since name resolution has not yet occured.

    lastItem match {
      // The last item is a literal of some kind...
      case Literal(constantValue) => {
        if (constantValue.tag != StringTag) {
          None
        }
        else {
          val Constant(value) = constantValue

          // Here I depend on the fact that inclusionPrefix has a default value.
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


  /**
   * Compute the lowered version of the nesT type. Currently when generating boilerplate the
   * parameter types of the instantiate method are converted to strings and then immediately
   * lifted. Those lifted types are passed back to this method and lowered again. Ultimately the
   * input to this method should come from the ModuleType annotation on the class/object
   * instead (and the name of the method should be changed accordingly).
   * 
   * @param liftedType The nesT type to lower.
   * @param The AST of the lowered Scala type.
   */
  private def lowerType(reporter: Reporter, liftedType: NesTTypes.Representation): Tree = {
    import NesTTypes._

    val translation: Map[Representation, Tree] =
      Map(
        Char   -> Ident(TypeName("Char"  )),
        Int8   -> Ident(TypeName("Int8"  )),
        Int16  -> Ident(TypeName("Int16" )),
        Int32  -> Ident(TypeName("Int32" )),
        UInt8  -> Ident(TypeName("UInt8" )),
        UInt16 -> Ident(TypeName("UInt16")),
        UInt32 -> Ident(TypeName("UInt32")),
        ErrorT -> Ident(TypeName("ErrorT")))

    liftedType match {
      case Array(elementType, size) =>
        AppliedTypeTree(Ident(TypeName("Array")),
                        List(lowerType(reporter, elementType)))

      case _ =>
        translation.getOrElse(liftedType, {
          reporter.error(null, "type " + liftedType + " not yet supported. Using Int16")
          Ident(TypeName("Int16"))
        })
    }
  }


  /**
   * Process the body of a class or module definition to see if it contains a nesT inclusion.
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
      checkForNesTInclusion(lastItem) match {
        case None => impl
        case Some( (shortName, fullName) ) => {
          // This is a hackish way of getting (for example) ExampleC from ExampleC.nt.
          val NesTComponentName = shortName.substring(0, shortName.lastIndexOf('.'))
          val reparseName = fullName.replace(".nt", ".i")

          val (typeParameters, valueParameters) = extractTypeAndValueParameters(body)
          // println(s"typeParameters = $typeParameters, valueParameters = $valueParameters")

          // Compute 'var someName: MetaType[SomeType] = null' for each type and value parameter.
          // TODO: Be sure appropriate imports are available.
          val typeVars = for ( (typeName, typeType) <- typeParameters ) yield {
            // println(s"typeName = $typeName; typeType = $typeType")
            treeBuilder.makePatDef(
              Modifiers(Flags.PRIVATE | Flags.MUTABLE),
              Typed(Ident("sc_" + typeName),
                    AppliedTypeTree(Ident(TypeName("MetaType")),
                                    List(lowerType(reporter, typeType)))),
              Literal(Constant(null)))
          }
          val valueVars = for ( (valueName, valueType) <- valueParameters) yield {
            treeBuilder.makePatDef(
              Modifiers(Flags.PRIVATE | Flags.MUTABLE),
              Typed(Ident("sc_" + valueName),
                    lowerType(reporter, valueType)),
              Literal(Constant(null)))
          }

          // Compute 'val abstractSyntax =
          //            Parser.reparse("ExampleC.i", List("firstType", "secondType"))'
          // TODO: Be sure appropriate imports are available.
          val typeNames =
            for ( (typeName, _) <- typeParameters ) yield Literal(Constant(typeName))
          val typeNameList =
            Apply(Ident("List"), typeNames.toList)
          val reparseInvocation =
            Apply(Select(Ident("Parser"), "reparse"),
                  List(Literal(Constant(s"$reparseName")), typeNameList))
          val abstractSyntaxVal =
            treeBuilder.makePatDef(
              Modifiers(Flags.PRIVATE),
              Ident("abstractSyntax"),
              reparseInvocation)

          // Display the generated code if requested.
          val Some(displayGenerated) = scalanessSettings("displayGenerated")
          if (displayGenerated == "true") {
            println(s"\nCode generated into $NesTComponentName...")
            println(s"\t$typeVars")
            println(s"\t$valueVars")
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
                  List(someDef) ++ typeVars.flatten ++ valueVars.flatten ++ abstractSyntaxVal
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

      // For class definitions, see if they provide a nesT inclusion.
      case ClassDef(mods, name, tparams, impl) =>
        treeCopy.ClassDef(tree, mods, name, tparams, processClassOrModuleDef(tparams, impl))

      // For module definitions, see if they provide a nesT inclusion.
      case ModuleDef(mods, name, impl) =>
        treeCopy.ModuleDef(tree, mods, name, processClassOrModuleDef(List(), impl))

      case _ => tree
    }

    override def transform(tree: Tree): Tree = {
      postTransform(super.transform(preTransform(tree)))
    }
  }
}
