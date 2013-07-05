
Scalaness
=========

This folder contains the Scalaness sample programs, documentation, and other related materials.
The Scalaness source code is in three parts. The part used *only* by the compiler is in the
compiler code base (in ROOT/src/compiler) and becomes part of scala-compiler.jar. The part used
by both the compiler and by Scalaness programs is in the library code base (in ROOT/src/library)
and becomes part of scala-library.jar. The part used *only* by Scalaness programs is in the src
folder here and becomes the scalaness.jar file. That jar must be added to the classpath used
when compiling and running Scalaness programs (as described below).

In all cases look for the packages

- edu.uvm.mininess
- edu.uvm.scalaness

for most of the code related to Scalaness. Some important parts of the system (type checking)
are integrated into the existing Scala compiler code base. However an effort was made to keep as
much of the Scalaness specific code as possible factored into separate packages.

The contents of this folder are as follows

bin, classes
   These folders are created when scalaness.jar is built. The final jar file is put into the bin
   folder.

Blink, Checksum, Figure1, SendReceive
    These folders contain various simple examples of Scalaness, largely designed to exercise
    different aspects of the system and used for testing. See the README files in each folder
    for more information.

doc
    The Scalaness documentation in DocBook format, the dissertation of Peter Chapin describing
    the Scalaness system, the LaTeX source of some Scalaness papers, and various presentations
    about Scalaness.

notes
    This folder contains some notes and experimental programs that proved useful during the
    development of Scalaness and/or the Scalaness samples. The contents of this folder is
    volatile.

plugin
    The plugin version of Scalaness. This version attempts to implement the Scalaness system as
    a Scala compiler plugin. This may be infeasible due to the nature of type system changes
    required by Scalaness. However, the plugin is retained as a possible avenue for future work.
    Note that the plugin version of Scalaness is unmaintained and thus many of its files are
    likely to be significantly out of date.

SnowStorm
    This folder contains an implementation of the SnowStorm sample using Scalaness. Unlike the
    other samples, this is an example of a realistic application (compare with the version using
    Sprocket).

src
    This folder contains the source of scalaness.jar, the runtime components of Scalaness that
    are used by only Scalaness programs. See ROOT/src/library and ROOT/src/compiler in the main
    code base for additional Scalaness related material.

www
    This folder contains the Scalaness web site.

The sections that follow describe how to set up a Scalaness development environment, how to run
Scalaness programs, and how to experiment with the provided sample code. Additional
documentation may be found in the doc folder.

Setting Up a Development Environment
------------------------------------

Since Scalaness is a modified Scala compiler, building it is essentially the same as building
the Scala compiler. The README.rst in the root folder provides some information on how to do a
Scala compiler build. Here we provide more specific details to assist the newcomer.

1. Install a Java Development Kit. At the time of this writing the Scala compiler build works
   best using Java 6. Download and install the latest Java 6 JDK. We recommend setting the
   JAVA_HOME environment variable to point at the location where the JDK is installed. Also add
   $JAVA_HOME/bin (or %JAVA_HOME%\bin on Windows) to your PATH environment variable.

2. Install Ant_. We have used ant version 1.8.2 but any recent version should work. Add the
   folder containing the `ant` script to your PATH environment variable.

3. (Windows only) Install Cygwin_. All Scalaness development should take place inside a Cygwin
   bash shell. However, you can run the Scalaness compiler from an ordinary Windows console.

4. Be sure you have appropriate supporting packages. You will need `git` to obtain the source
   code and `cpp` (the C preprocessor). These packages may already be installed on your Linux
   system but you will almost certainly have to install them in Cygwin via the Cygwin setup
   program.

   If you intend to make commits to the Git repository for Scalaness you should also configure
   git with your identity information. Execute the following commands (using your own name and
   email address, of course):

       git config --global user.name "Jill Jones"
       git config --global user.email "jjones@example.com"

3. Clone the Scalaness repository to your system.

   ::

       $ mkdir Scala    # Make an appropriate folder.
       $ cd Scala
       $ git clone https://github.com/pchapin/scala.git .    # Note trailing dot.

4. Build the Scalaness compiler. Go into your `Scala` folder and run `ant`. See the root
   README.rst for more information on ant build target options. Note that the full compiler
   build takes a long time.

5. Go into the `scalaness` folder (where this README.rst is located) and run `ant` again to
   build the scalaness.jar file.

6. (Optional) Set up a TinyOS development environment. This is necessary if you want to compile
   the second stage programs produced by the execution of a Scalaness program. The details on
   setting up and using TinyOS are not described here. See instead the `TinyOS web site`_ for
   more information.

If you make a change to the files in the `scalaness` folder you normally only have to rebuild
scalaness.jar. If you make a change to the main compiler or library files you should do `ant
quick` in the root folder to rebuild the compiler and library.


Using Scalaness
---------------

Finish Me!

Running the Samples
-------------------

In all of the sample folders, except the SnowStorm sample, you will find a single source file
named Main.scala. Compile this file using the Scalaness compiler in the usual way. For example

::

     scalac -cp ../bin/scalaness.jar -nowarn Main.scala

Execute the program using a command such as

::

     scala -cp .:../bin/scalaness.jar Main <arguments>

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

.. _Ant: http://ant.apache.org/
.. _Cygwin: http://www.cygwin.com/
.. _TinyOS web site: http://www.tinyos.net/
