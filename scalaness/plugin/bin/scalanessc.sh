#!/bin/bash

# This script runs scalac with the Scalaness plugin.
#
scalac -Xpluginsdir ../lib -Xplugin:Scalaness.jar -Xplugin:../lib/antlr-3.4.jar -P:Scalaness:inclusionPath:../Samples/Blink/src $*
