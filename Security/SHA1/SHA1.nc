
#include "sha1.h"

interface SHA1 {
    
    // Call this command to initlize an SHA1_State object.
    command void prepare(SHA1_State *s);
    
    // Update the hash given the message block. A bit count of less than 512 signals the last
    // message block. If necessary a bit count of 0 can be used for this purpose.
    //
    command void update_hash(SHA1_State *s, message_block m, message_bit_count number_of_bits);
    
    // Retreive the hash value. The hash must already be finalized by previously processing a
    // message block with a bit count of less than 512 bits.
    //
    command void partake(SHA1_State *s, hash_array result);
}
