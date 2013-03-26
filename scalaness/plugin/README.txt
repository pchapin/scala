
Scalaness README.txt
by Peter C. Chapin <PChapin@vtc.vsc.edu>
========================================

NOTE NOTE NOTE NOTE
*******************
This is the plugin version of the Scalaness system. It is currently obsolete and retained here
for historical purposes only. Please refer to the Scalaness GitHub repository for the most
up-to-date version of this system: https://github.com/pchapin/scala.


Welcome!

This repository contains the source code and documenation for the Scalaness project and related
subprojects. See the doc folder for more information about Scalaness. The subprojects are
documented separately and many contain separate README.txt files and/or doc folders. However,
there is some commonality to many of the subprojects.

To build Scalaness you will need

+ JDK   (I used v7u7)
+ Scala (I used v2.10; be sure SCALA_HOME is set appropriately)
+ Ant   (I used v1.8.2)

All other necessary libraries are included in this repository (although their documentation
isn't... consult the web site for the libraries used for more information about them). The
intention is for Scalaness to be buildable and usable on either Linux or Windows systems.
However at the time of this writing Scalaness development is done primarly on Windows; the Linux
environment is not well tested. It is likely, however, that Scalaness development can be done on
any system that supports Java.

Although not necessary Scalaness and its subprojects can be developed in IntelliJ (with some
restrictions). The Community Edition of IntelliJ is sufficient. You will also need to install
the latest Scala plugin from the IntelliJ plugin manager.

Folder Organization
-------------------

The contents of this repository are organized as follows:

bin
    Contains some scripts and related files that are useful in testing.

doc
    The documentation for Scalaness. This includes Scalaness research papers, my disseration,
    and the Scaladoc generated from the source code itself.

lib
    Various supporting library jar files needed by Scalaness. The Scalaness plugin is put into
    this folder when it is built by Ant.

Samples
    Various sample programs that demonstrate (and test) the Scalaness plugin. Each sample
    program is a subproject and has a folder structure that approximately follows the one
    described here for the main plugin.

src
    The source code of the Scalaness plugin.

test
    The source code of the Scalaness plugin test program (for unit tests).

testData
    Various test data sets used by the Scalaness plugin test program.


Ant Targets
-----------

Scalaness and its samples are built using Ant. No particular IDE is required. IntelliJ can be
used to run the various Ant targets. IntelliJ can also build and test the main plugin without
the help of Ant. However, Ant must be used to build and test the samples.

Note that a single Ant build script builds both the plugin and the samples. This is for
convenience. For a full list of targets available consult build.xml. The following targets are
likely to be of particular interest.

(default)
    Builds Scalaness.jar into the lib folder.

antlr
    Compiles the ANTLR grammar of Mininess. This is useful if you are working on the grammar
    and you want to check if ANTLR accepts your changes.

test
    Compiles and runs the Scalaness plugin test program.

scaladoc
    Generates internal documentation to doc/scaladoc

blink.compile
    Compiles the staged Blink sample program using the latest Scalaness.jar file. During this
    compilation the plugin is actually used so you may see plugin debugging output from Ant.

blink.run
    Builds and then runs the Blink sample program. This allows the dynamic behavior of the
    sample to be checked.

spartan.compile
    Compiles the staged SpartanRPC sample program using the latest Scalaness.jar file.

spartan.run
    Builds and then runs the SpartanRPC sample program.

clean, blink.clean, spartan.clean, all.clean
    Cleans the Scalaness plugin, the Blink sample, the SpartanRPC sample, or all three as
    appropriate. A clean operation removes all build artifacts and should restore your working
    copy to its original condition (modulo any changes you've made or additional files you've
    added explicitly). Note that cleaning Ant only removes artifacts created by Ant. You must
    clean the IntelliJ project separately if you've been using it.
