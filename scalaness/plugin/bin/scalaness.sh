#!/bin/bash

# This script runs scala with the Scalaness plugin. 
#
scala -Xpluginsdir ../lib -Xplugin:Scalaness.jar -Xplugin:../lib/antlr-3.4.jar -P:Scalaness:inclusionPath:../Samples/Blink/src $*
