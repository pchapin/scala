
Samples README.txt
==================

Blink
    This folder contains a trivial staged "blink" sample.

Checksum
    This folder contains a sample that specializes a module that computes checksums.

doc
    The Scalaness documentation set in DocBook format.

Figure1
    This folder contains a live version of the sample used in Figure 1 of the nesT/Scalaness
    paper.

IML
    This folder contains the files defining Issue Markup Language along with a list of Scalaness
    issues.

SendReceive
    This folder contains a sample that uses the Active Message radio stack. Scalaness programs
    need to be able to interact with the radio before anyone can take them system seriously.

SpartanRPC
    This folder contains a re-implementation of SpartanRPC (Sprocket) using Scalaness.

www
    This folder contains the Scalaness web site.


For Scala compiler development we recommend Eclipse. We've used the latest Indigo (Eclipse v3.7)
with the nightly Scala IDE for Scala 2.10. Follow the instructions in src/eclipse for setting up
the environment. If you are on a Windows system you will probably also want to change the
default character encoding to UTF-8 and the default line ending convention to Unix style line
endings.

Build the compiler with ant first to generate some necessary scripts and then you can build
successfully in Eclipse. After running ant we recommend you do a full clean and rebuild in
Eclipse. The ant build will create a "pack" compiler. The Eclipse rebuild will generate all the
class files with Eclipse (for consistency) but leave the pack compiler unchanged. Thus pack
always represents the latest *ant* build.

We also recommend that you disable "semantic highlighting" in Eclipse so that it remains
responsive even when editing large files. Some of the files in the compiler code base (for
example in the type checker) are very large.

To run the compiler under Eclipse you will need to create a suitable run configuration. Use the
"Java Application" configuration template (although the compiler is a Scala program you need to
use its own Scala library, etc, rather than the one that comes with Eclipse). On the "Main" tab
of the run configuration dialog use

       Project: scala-compiler
       Main class: scala.tools.nsc.Main

On the "Classpath" tab add "reflect" and "scala-library" and "antlr-3.4.jar" (in
scala-library/lib/extra) to the "Bootstrap Entries" classpath. On the "Arguments" tab select the
working directory of one of the samples and use the "-nowarn Main.scala" (or some other suitable
main file) for the program arguments. For debugging use the "Scala Application (new debugger)
Launcher."

This should allow you to run and debug the compiler from inside Eclipse.

The SpartanRPC project has project files for the IntelliJ IDEA environment (one of us (pchapin)
prefers IntelliJ over Eclipse for normal programming). In IntelliJ you'll need to create
external libraries for "Scalaness-compiler" and "Scalaness-library" that refer to the jar files
created by the ant build (the pack compiler). Note that this means IntelliJ will not see any
changes made and compiled with Eclipse until you do 'ant quick.clean; ant' to rebuild the pack
compiler. For more information related to using IntelliJ with Scalaness see the README.txt file
in the SpartanRPC folder.
