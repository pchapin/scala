//-----------------------------------------------------------------------
// FILE    : InterfaceDefinition.scala
// SUBJECT : Encapsulates the definition of a nesT interface.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.nest

/**
 * Encapsulates the definition of a nesT interface. In nesT interfaces are regarded as a
 * collection of imports and exports. The translation from full nesC interface (done by an
 * InterfaceLocator) thus needs to know if the full nesC interface is being used or provided.
 * This class is currently a thin wrapper around Set[CommandInformation].
 * 
 * @param members A set of CommandInformation objects that this interface definition object
 * wraps.
 * 
 * @author Peter
 */
class InterfaceDefinition(
  private val members: Set[CommandInformation] = Set()) extends Traversable[CommandInformation] {
  
  import InterfaceDefinition._
  
  def foreach[U](f: CommandInformation => U) {
    members.foreach(f)
  }
  
  /**
   * Adds information about a command to this interface definition, returning a new interface
   * definition.
   * 
   * @param newCommand The command to insert into this interface definition.
   * 
   * @return A new interface definition containing the contents of the original interface
   * definition together with newCommand.
   */
  def +(newCommand: CommandInformation) = {
    // TODO: Some error checking is needed in case the incoming command is already present.
    new InterfaceDefinition(members + newCommand)
  }
  
  
  /**
   * Produce a new interface definition with the directionality of all the members reversed.
   * This method changes imports to exports and visa-versa. This method is side-effect free; the
   * original interface definition is not changed.
   */
  def reverseDirection = {
    import CommandDirectionality._
    
    val reversedMembers = for (member <- members) yield {
      val CommandInformation(direction, memberName, memberDeclaration) = member
      direction match {
        case IMPORT => CommandInformation(EXPORT, memberName, memberDeclaration)
        case EXPORT => CommandInformation(IMPORT, memberName, memberDeclaration)
      }
    }
    new InterfaceDefinition(reversedMembers)
  }
  
  
  /**
   * Look up the CommandInformation object associated with a particular command. There are
   * several other convenience methods in this class that look up individual attributes of a
   * command. However, if more than one attribute is needed it would probably be better to use
   * this method and match its result against a CommandInformation pattern to extract all
   * attributes at once.
   * 
   * @param commandName The name of the command to look up.
   * @return The CommandInformation object associated with that name.
   * @throws CommandNotFoundException if the specified command is not in this interface.
   */
  def getCommandInformation(commandName: String) = findCommand(commandName, members)
 
  
  /**
   * Look up the direction (import/export) associated with a particular command name.
   * 
   * @param commandName The name of the command to look up.
   * @return The direction (import or export) associated with that name.
   * @throws CommandNotFoundException if the specified command is not in this interface.
   */
  def getCommandDirection(commandName: String) = { 
    val CommandInformation(commandDirection, _, _) = findCommand(commandName, members)
    commandDirection
  }


  /**
   * Look up the declaration associated with a particular command name. The "uses command ..."
   * or "provides command ..." prefix is not included. The appropriate prefix to use depends on
   * the command's direction. In addition, the ASTNode returned by this method has parent and
   * symbolTable attributes both set to None.
   * 
   * @param commandName The name of the command to look up.
   * @return The declaration associated with that name.
   * @throws CommandNotFoundException if the specified command is not in this interface.
   */
  def getCommandDeclaration(commandName: String) = { 
    val CommandInformation(_, _, commandDeclaration) = findCommand(commandName, members)
    commandDeclaration
  }


  def getCommandNames = {
    val nameList = for (currMember <- members.toList) yield {
      val cName = currMember match {
        case CommandInformation(_, name, _) => name
        case _ => "ErrorWIT"
        }
      cName
    }
    nameList
  }
}


object InterfaceDefinition {
  
  /**
   * Looks up command information for a specific command in a command set.
   * 
   * @param commandName The name of the command to look up.
   * @return The CommandInformation object associated with that command.
   * @throws CommandNotFoundException if the given command is not in the command set.
   */
  private def findCommand(commandName: String, commandSet: Set[CommandInformation]) =
    commandSet.find( item => {
      val CommandInformation(_, particularName, _) = item
      if (particularName == commandName) true else false
    }).getOrElse(throw new CommandNotFoundException(commandName))
   
  
  /**
   * Exception thrown when an attempt is made to access a command not known to the interface.
   */
  class CommandNotFoundException(message: String) extends Exception(message)
}
