#!/bin/bash

# Simple script that runs the compiler on the Blink sample.

./scalanessc.sh -Ybrowse:typer -cp ../lib/Scalaness.jar ../Samples/Blink/src/edu/uvm/blink/Main.scala

# Erase the compilation artifacts if they exist.
if [ -d edu ]; then
    rm -r edu
fi
