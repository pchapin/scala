
Blink README.txt
================

This folder contains a staged Blink sample. This sample generates a program that runs on a
single node and blinks an LED a fixed number of times. The Scalaness program computes the blink
period (in ms), the blink count, and an optimized data type for representing the count. For
example:

period  = 2048
count   = 100
count_t = uint8_t

This means that the LED flashes 100 times with a period of 2048 ms. The type uint8_t is used to
hold the count value. The first stage computes these values in some (imaginary) complicated way.

To make the sample more interesting, two Mininess modules are specialized and composed. Thus
this sample illustrates

1. Module specialization over both types and terms.
2. Module composition.

In addition this sample demonstrates how Scalaness generated code can interact with existing
(non-staged) libraries.

Peter C. Chapin <PChapin@vtc.vsc.edu>
