// FILE   : Server.h
// SUMMARY: Global declarations used by the baseline benchmark server.
//

#ifndef SERVER_H
#define SERVER_H

enum {
  AM_BENCHMARK = 6
};

typedef nx_struct BenchmarkMsg {
  nx_uint16_t counter;
} BenchmarkMsg;

#endif
