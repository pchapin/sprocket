// FILE   : Client.h
// SUMMARY: Global declarations used by the baseline benchmark client.
//

#ifndef CLIENT_H
#define CLIENT_H

enum {
  AM_BENCHMARK = 6,
};

typedef nx_struct BenchmarkMsg {
  nx_uint16_t counter;
} BenchmarkMsg;

#endif
