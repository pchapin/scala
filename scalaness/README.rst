
Scalaness README
================

This folder contains the Scalaness sample programs, documentation, and other materials. The
Scalaness source code is part of the compiler code base. Look for the packages

- edu.uvm.mininess
- edu.uvm.scalaness

in the src/library and src/compiler folders for most of the code related to Scalaness. Some
important parts of the system (type checking) are integrated into the existing Scala compiler
code base.

The contents of this folder are as follows

Blink
    This folder contains a trivial staged "blink" sample. It makes no use of the radio.

Checksum
    This folder contains a sample that specializes a module that computes checksums. It makes no
    use of the radio.

doc
    The Scalaness documentation set in DocBook format.

Figure1
    This folder contains a live version of the sample used in Figure 1 of the nesT/Scalaness
    paper.

IML
    This folder contains the files defining Issue Markup Language along with a list of Scalaness
    issues.

plugin
    The plugin version of Scalaness. This version attempts to implement the Scalaness system as
    a Scala compiler plugin. This may be infeasible due to the nature of type system changes
    required by Scalaness. However, the plugin is retained as a possible avenue for future work.

SendReceive
    This folder contains a sample that uses the Active Message radio stack.

SpartanRPC
    This folder contains a re-implementation of SpartanRPC (Sprocket) using Scalaness (a work in
    progress).

www
    This folder contains the Scalaness web site.

To run the samples you must first build the Scalaness compiler using the normal Scala compiler
build instructions. In all of the sample folders, except the SpartanRPC sample, you will find a
single source file named Main.scala. Compile this file using the Scalaness compiler in the usual
way. For example

     scalac -nowarn Main.scala

Execute the program using a command such as

     scala Main <arguments>

Where "arguments" are the command line arguments expected by the sample (each sample is
different). The result of executing a Scalaness program is a residual nesC program in a
subfolder named "generated." That folder will also contain a Makefile for use with the nesC
compiler and the TinyOS environment. Note that some of the supporting nesC components that
accompany each sample must (currently) be manually copied into the generated folder. In
particular the shim components must be copied.

Our test environments are both Windows (Windows 7) and Linux (Ubuntu 12.04). Our ultimate target
platform is the MSP430 and certain aspects of the implementation currently assume a 16 bit
target.

The Scalaness compiler reads a configuration file (Scalaness.cfg by default). The sample
programs provided here each have their own configuration files. For more information on the
Scalaness configuration file, see the Scalaness documentation in the doc folder.
