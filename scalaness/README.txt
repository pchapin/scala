
Samples README.txt
==================

Blink
    This folder contains a trivial staged "blink" sample.

Checksum
    This folder contains a sample that specializes a module that computes checksums.

Figure1
    This folder contains a live version of the sample used in Figure 1 of the nesT/Scalaness
    paper.

SendReceive
    This folder contains a sample that uses the Active Message radio stack. Scalaness programs
    need to be able to interact with the radio before anyone can take them system seriously.

SpartanRPC
    This folder contains a re-implementation of SpartanRPC (Sprocket) using Scalaness.


For Scala compiler development we recommend Eclipse. We've used the latest Juno with the nightly
Scala IDE for Scala 2.10. Follow the instructions in src/eclipse for setting up the environment.
If you are on a Windows system you will probably also want to change the default character
encoding to UTF-8 and the default line ending convention to Unix style line endings. Build the
compiler with ant first to generate some necessary scripts and then you can build successfully
in Eclipse.

To run the compiler under Eclipse you will need to create a suitable run configuration. On the
"Main" tab of the run configuration dialog use

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
created by the ant build. For more information related to using IntelliJ with Scalaness see the
README.txt file in the SpartanRPC folder.
