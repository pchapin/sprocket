
#ifndef SHA1_H
#define SHA1_H

typedef int block_index_t;          // Range 0 .. 15
typedef int hash_index_t;           // Range 0 .. 5
typedef int message_bit_count;      // Range 0 .. 512
typedef uint32_t message_block[16];
typedef uint32_t hash_array[5];

typedef struct {
    uint16_t   total_bit_count;     // Limits implementation to 8192 byte messages.
    hash_array h;
    bool       active;
} SHA1_State;

#endif
