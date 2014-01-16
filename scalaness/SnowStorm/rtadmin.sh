#!/bin/bash

RTADMIN_CLASSPATH=$SCALANESS_HOME/lib/antlr-3.4.jar
RTADMIN_CLASSPATH=$SCALANESS_HOME/lib/scala-library.jar:$RTADMIN_CLASSPATH
RTADMIN_CLASSPATH=$SCALANESS_HOME/lib/scala-reflect.jar:$RTADMIN_CLASSPATH
RTADMIN_CLASSPATH=$SCALANESS_HOME/lib/scala-actors.jar:$RTADMIN_CLASSPATH
RTADMIN_CLASSPATH=$SCALANESS_HOME/lib/scala-parser-combinators_2.11.0-M5-1.0-RC2.jar:$RTADMIN_CLASSPATH
RTADMIN_CLASSPATH=$SCALANESS_HOME/../../scalaness/bin/scalaness.jar:$RTADMIN_CLASSPATH
RTADMIN_CLASSPATH=$SCALANESS_HOME/../../scalaness/SnowStorm/bin/SnowStorm.jar:$RTADMIN_CLASSPATH
RTADMIN_CLASSPATH=$SCALANESS_HOME/../../scalaness/SnowStorm/lib/bcprov-jdk16-145.jar:$RTADMIN_CLASSPATH

java -cp $RTADMIN_CLASSPATH edu.uvm.rtadmin.Main $*
