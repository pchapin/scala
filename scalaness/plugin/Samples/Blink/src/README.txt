
README.txt
==========

This folder contains a staged version of the classic "Blink" application. This program runs on
a single node and does not use any radio facilities. The first stage program computes a blink
period, a blink count, and the optimal integer type to hold the count value. For example:

period  = 2048
count   = 100
count_t = uint8_t

This means that the LED flashes 100 times with a period of 2048 ms. The type uint8_t is used to
hold the count value. The first stage computes these values in some (imaginary) complicated way.

Peter C. Chapin <PChapin@vtc.vsc.edu>
