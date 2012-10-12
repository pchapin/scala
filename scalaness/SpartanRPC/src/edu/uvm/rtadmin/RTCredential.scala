//-----------------------------------------------------------------------
// FILE    : RTCredential.scala
// SUBJECT : Classes that represent RT credentials in the abstract.
// AUTHOR  : (C) Copyright 2011 by Simone Willett <sgwillet@uvm.edu>
//                and Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.rtadmin

sealed abstract class RTCredential

case class RTMembershipCredential(
  target: (String, String),
  sourceEntity: String) extends RTCredential

case class RTInclusionCredential(
  target: (String, String),
  source: (String, String)) extends RTCredential

case class RTLinkedCredential(
  target: (String, String),
  source: (String, String),
  sourceRole2: String) extends RTCredential

case class RTIntersectionCredential(
  target: (String, String),
  source1: (String, String),
  source2: (String, String)) extends RTCredential
