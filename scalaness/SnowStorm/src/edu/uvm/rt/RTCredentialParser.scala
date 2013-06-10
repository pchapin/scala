//-----------------------------------------------------------------------
// FILE    : CredentialParser.scala
// SUBJECT : Class that knows how to parse RT_0 credentials.
// AUTHOR  : (C) Copyright 2011 by Simone Willett <sgwillet@uvm.edu>
//                and Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rt

import scala.util.parsing.combinator._

class RTCredentialParser extends JavaTokenParsers {
  import RTCredentialParser.ParseErrorException

  def parseCredential(credentialString: String) = {
    parseAll(credential, credentialString) match {
      case Success(parsedCredential, _) => parsedCredential
      case Failure(message, _)          => throw new ParseErrorException(message)
      case Error(message, _)            => throw new ParseErrorException(message)
    }
  }

  // The order is important. Long credentials must be attempted first.
  def credential: Parser[RTCredential] =
    (intersection_credential | linked_credential | inclusion_credential | membership_credential)

  def membership_credential: Parser[RTMembershipCredential] =
    role_definition ~ "<-" ~ entity ^^
      { case target ~ "<-" ~ sourceEntity =>
	  RTMembershipCredential(target, sourceEntity) }

  def inclusion_credential: Parser[RTInclusionCredential] =
    role_definition ~ "<-" ~ role_definition ^^
      { case target ~ "<-" ~ source =>
	  RTInclusionCredential(target, source) }

  def linked_credential: Parser[RTLinkedCredential] =
    role_definition ~ "<-" ~ role_definition ~ "." ~ role_identifier ^^
      { case target ~ "<-" ~ source ~ "." ~ sourceRole2 =>
	  RTLinkedCredential(target, source, sourceRole2) }

  def intersection_credential: Parser[RTIntersectionCredential] =
    role_definition ~ "<-" ~ role_definition ~ "^" ~ role_definition ^^
      { case target ~ "<-" ~ source1 ~ "^" ~ source2 =>
	  RTIntersectionCredential(target, source1, source2) }

  def role_definition: Parser[(String, String)] =
    entity ~ "." ~ role_identifier ^^
      { case entityName ~ "." ~ roleName => (entityName, roleName) }

  def entity: Parser[String] =
    ident

  def role_identifier: Parser[String] =
    ident

}


object RTCredentialParser {

  class ParseErrorException(message: String) extends java.lang.RuntimeException {
    println("RT parser exception: " + message)
  }

}
