// FILE   : SendReceive.h
// SUMMARY: Global declarations used by the Scalaness SendReceive sample.
//

#ifndef SENDRECEIVE_H
#define SENDRECEIVE_H

enum {
  AM_CHANNEL = 6,
  TIMER_PERIOD_MILLI = 1000     // Transmit quickly enough to make 'scope capture easy.
};

typedef nx_struct BenchmarkMsg {
  nx_uint16_t nodeid;
  nx_uint16_t counter;
} BenchmarkMsg;

#endif
