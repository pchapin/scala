#!/bin/bash

# This batch file runs the standalone compiler on the source file specified by the argument.
# This makes it possible to exercise the plugin without doing a full compile (with code
# generation, etc).

COMPILER_CLASSPATH=../../lib/Scalaness.jar:$SCALA_HOME/lib/scala-library.jar:$SCALA_HOME/lib/scala-reflect.jar:$SCALA_HOME/lib/scala-compiler.jar:../../lib/antlr-3.4.jar
USER_CLASSPATH=../../lib/Scalaness.jar:$SCALA_HOME/lib/scala-library.jar:$SCALA_HOME/lib/scala-reflect.jar

java -cp $COMPILER_CLASSPATH edu.uvm.scalaness.standalone.Main -Xprint:scalanesspostparser -Yshow-trees -feature -classpath $USER_CLASSPATH $1
