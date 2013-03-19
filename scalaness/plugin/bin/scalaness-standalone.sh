#!/bin/bash

# This script runs the Scalaness plugin in standalone mode.
#
java -cp ../lib/Scalaness.jar:../lib/antlr-3.4.jar:$SCALA_HOME/lib/scala-library.jar:$SCALA_HOME/lib/scala-reflect.jar;$SCALA_HOME/lib/scala-compiler.jar edu.uvm.scalaness.standalone.Main $*
