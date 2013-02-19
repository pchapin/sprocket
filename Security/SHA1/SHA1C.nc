
// This code is a translation of an Ada implementation.

module SHA1C {
    provides interface SHA1;
}
implementation {
    typedef int w_index_t;         // Range 0 .. 79
    typedef uint32_t w_array[80];
    
    w_array w;
    
    // For convenience. The original code is in Ada.
    #define and &
    #define or  |
    #define not ~
    #define xor ^
    
    uint32_t rotate_left( uint32_t value, int count )
    {
        return ( value << count ) | ( value >> (32 - count) ); 
    }
    
    
    uint32_t F(w_index_t T, uint32_t B, uint32_t C, uint32_t D)
    {
        uint32_t result;
        if     ( T <= 19 ) result = (B and C) or ((not B) and D);
        else if( T <= 39 ) result = B xor C xor D;
        else if( T <= 59 ) result = (B and C) or (B and D) or (C and D);
        else               result = B xor C xor D;
        return result;
    }
    
    
    uint32_t K(w_index_t T)
    {
        uint32_t result;
        if     ( T <= 19 ) result = 0x5A827999;
        else if( T <= 39 ) result = 0x6ED9EBA1;
        else if( T <= 59 ) result = 0x8F1BBCDC;
        else               result = 0xCA62C1D6;
        return result;
    }
    
    
    command void SHA1.prepare(SHA1_State *s)
    {
        s->total_bit_count = 0;
        s->h[0] = 0x67452301;
        s->h[1] = 0xEFCDAB89;
        s->h[2] = 0x98BADCFE;
        s->h[3] = 0x10325476;
        s->h[4] = 0xC3D2E1F0;
        s->active = TRUE;
    }

    
    void internal_update_hash(SHA1_State *s, const message_block m)
    {
        uint32_t  temp;
        uint32_t  A, B, C, D, E;
        w_index_t T;
        
        memset( w, 0, sizeof(w_array) );
        
        // Part (a)
        for( T = 0; T <= 15; ++T ) {
            w[T] = m[T];
        }
        
        // Part (b)
        for( T = 16; T <= 79; ++T ) {
            w[T] = rotate_left( w[T - 3] xor w[T - 8] xor w[T - 14] xor w[T - 16], 1 ); 
        }
        
        // Part (c)
        A = s->h[0];
        B = s->h[1];
        C = s->h[2];
        D = s->h[3];
        E = s->h[4];

        // Part (d)
        for( T = 0; T <= 79; ++T ) {
            temp = rotate_left( A, 5 );
            temp += F( T, B, C, D ) + E + w[T] + K(T);
            E = D;
            D = C;
            C = rotate_left( B, 30 );
            B = A;
            A = temp;
        }

        // Part (e)
        s->h[0] = s->h[0] + A;
        s->h[1] = s->h[1] + B;
        s->h[2] = s->h[2] + C;
        s->h[3] = s->h[3] + D;
        s->h[4] = s->h[4] + E;
    }

    
    void compute_message_padding(message_block m, message_bit_count number_of_bits)
    {
        block_index_t padding_start_word;
        unsigned      padding_offset;
        uint32_t      padding_on_mask;
        uint32_t      padding_off_mask;
        block_index_t i;
        
        padding_start_word = number_of_bits / 32;
        padding_offset     = (32 - (number_of_bits % 32)) - 1;
        padding_on_mask    = (0x00000001 << padding_offset);
        padding_off_mask   = (0xFFFFFFFF << padding_offset);
        m[padding_start_word] |= padding_on_mask;
        m[padding_start_word] &= padding_off_mask;
        for( i = padding_start_word + 1; i <= 15; ++i ) {
            m[i] = 0;
        }
    }

    
    command void SHA1.update_hash(
        SHA1_State *s, message_block m, message_bit_count number_of_bits)
    {
        if( s->active == FALSE ) return;
        
        s->total_bit_count += number_of_bits;
        if( number_of_bits == 512 ) {
            internal_update_hash( s, m );
        }
        else {
            // If there is enough space for the message length at the end of this block...
            if( number_of_bits <= 512 - 65 ) {
                compute_message_padding( m, number_of_bits );
                m[14] = 0;
                m[15] = s->total_bit_count;
                internal_update_hash( s, m );
            }
            
            // Otherwise put the message length in an empty block by itself.
            else {
                compute_message_padding( m, number_of_bits );
                internal_update_hash( s, m );
                memset(m, 0, sizeof( message_block ) );
                m[15] = s->total_bit_count;
                internal_update_hash( s, m );
            }
            s->active = FALSE;
        }
    }

    
    command void SHA1.partake(SHA1_State *s, hash_array result)
    {
        // This assumes the hash state is not active.
        memcpy( result, s->h, sizeof( hash_array ) );
    }

}
