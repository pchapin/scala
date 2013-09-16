Scalaness
=========

This repository is an experimental fork of the Scala compiler and libraries called "Scalaness."
The compiler has been modified so that it can specialize, compose, and type check components
written in the embedded systems language nesC. One unique feature of Scalaness is its type
system. If a Scalaness program type checks then all possible generated nesC programs will also
type check successfully. In addition Scalaness allows nesC types to be manipulated as first
class values in the Scalaness program. See the documentation in scalaness/doc for more
information and the Scalaness README (in the scalaness folder) for details on setting up a
Scalaness development system and building the sample programs. Send questions or comments to
PChapin@vtc.vsc.edu.

The material below is the README from the original Scala compiler repository.

Scala
=====

This is the repository for the [Scala Programming Language](http://www.scala-lang.org).

  - [Report an issue](https://issues.scala-lang.org);
  - [Read about the development of the compiler and the standard library](http://docs.scala-lang.org/scala/);
  - [Check our Jenkins status](https://scala-webapps.epfl.ch/jenkins/);
  - [Download the latest nightly](https://scala-webapps.epfl.ch/jenkins/job/scala-nightly-main-master/ws/dists/latest/*zip*/latest.zip);
  - ... and contribute right here! Please, first read our [policy](http://docs.scala-lang.org/scala/pull-request-policy.html),
and [sign the contributor's license agreement](http://typesafe.com/contribute/cla/scala).
