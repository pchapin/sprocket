// FILE   : CryptographicServicesC.nc
// SUMMARY: Wraps the underlying crypto operations. This implementation calls into TinyECC.
//

module CryptographicServicesC {
    provides interface CryptographicServices;
    uses     interface ECDSA;
    uses     interface ECDH;
}
implementation {
    
    command void CryptographicServices.public_key_initializer( struct PublicKey *key )
    {
        memset( key->value.x, 0, 2*NUMWORDS );
        memset( key->value.y, 0, 2*NUMWORDS );
    }
    
    
    command void CryptographicServices.signature_initializer( struct Signature *signature )
    {
        memset( signature->r, 0, 2*NUMWORDS );
        memset( signature->s, 0, 2*NUMWORDS );
    }
    
    
    command bool CryptographicServices.same_keys( const struct PublicKey *x, const struct PublicKey * y )
    {
        // If there is no padding (I don't think there is) we should be able to compare the raw
        // memory of *x and *y as a single block. That might be slightly faster and easier.
        //
        return memcmp( x->value.x, y->value.x, 2*NUMWORDS ) == 0 &&
               memcmp( x->value.y, y->value.y, 2*NUMWORDS ) == 0;
    }
    
    // NOTE: The MSP430 can only access words at even addresses. Thus data in the certificate
    // must be accessed one byte at a time since the pointers used are not necessarily word
    // aligned. The code in the raw_to_* commands below is complicated because it is converting
    // a big endian array of bytes into a little endian array of words.
    
    // TODO: There is a lot of commonality in the code below that could probably be factor out.
    
    command void CryptographicServices.raw_to_public_key(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int              *last,
              struct PublicKey *key,
              bool             *valid )
    {
        int i;
        
        memset( key->value.x, 0, 2*NUMWORDS );
        memset( key->value.y, 0, 2*NUMWORDS );
        
        if( first < 0 || first + PUBLIC_KEY_SIZE > raw_data_size ) {
            *last = first;
            *valid = FALSE;
        }
        else {
            const uint8_t *key_material;
            
            // Read Key.x from the certificate backwards.
            key_material = &raw_data[first] + PUBLIC_KEY_SIZE/2;
            for( i = 0; i < KEYDIGITS; ++i ) {
                key_material -= 2;
                key->value.x[i] = (key_material[0] << 8) | key_material[1];
            }
            
            // Read Key.y from the certificate backwards.
            key_material = &raw_data[first] + PUBLIC_KEY_SIZE;
            for( i = 0; i < KEYDIGITS; ++i ) {
                key_material -= 2;
                key->value.y[i] = (key_material[0] << 8) | key_material[1];
            }

            *last = first + PUBLIC_KEY_SIZE - 1;
            *valid = TRUE;
        }
    }

    
    command void CryptographicServices.raw_to_signature(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int              *last,
              struct Signature *signature,
              bool             *valid )
    {
        int i;
        
        memset( signature->r, 0, 2*NUMWORDS );
        memset( signature->s, 0, 2*NUMWORDS );
        
        if( first < 0 || first + SIGNATURE_SIZE > raw_data_size ) {
            *last = first;
            *valid = FALSE;
        }
        else {
            const uint8_t *signature_material;
            
            // Read sig.r from the certificate backwards.
            signature_material = &raw_data[first] + SIGNATURE_SIZE/2;
            for( i = 0; i < NUMWORDS - 1; ++i ) {
                signature_material -= 2;
                signature->r[i] = (signature_material[0] << 8) | signature_material[1];
            }
            // The most significant byte of r has to be handled as a special case.
            signature->r[i] = *--signature_material;
            
            // Read sig.s from the certificate backwards.
            signature_material = &raw_data[first] + SIGNATURE_SIZE;
            for( i = 0; i < NUMWORDS - 1; ++i ) {
                signature_material -= 2;
                signature->s[i] = (signature_material[0] << 8) | signature_material[1];
            }
            // The most significant byte of s has to be handled as a special case.
            signature->s[i] = *--signature_material;

            *last = first + SIGNATURE_SIZE - 1;
            *valid = TRUE;
        }
    }
    
    
    command void CryptographicServices.compute_signature(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int               last,
              struct Signature *signature,
        const struct PrivateKey *key )
    {
    }
    
    
    command bool CryptographicServices.verify_signature(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int               last,
        const struct Signature *signature,
        const struct PublicKey *key )
    {
        // Note that TinyECC is not const-correct. Hence it is necessary to cast away const.
        bool return_code = FALSE;
        if( call ECDSA.init( (Point *)&key->value ) == SUCCESS ) {
            if( call ECDSA.verify( (uint8_t *)&raw_data[first],
                                   last - first + 1,
                                   (NN_DIGIT *)signature->r,
                                   (NN_DIGIT *)signature->s,
                                   (Point *)&key->value) == 1 ){ return_code = TRUE;     
            }
        }
        return return_code;
    }

    
    command error_t CryptographicServices.compute_session_key(
        const struct PublicKey *public,
        const NN_DIGIT         *private,        // TODO: Change to struct PrivateKey.
              octet_t          *session_key )
    {
        int agree_result;
        
        // Is it really necessary to call this every time? Probably not.
        call ECDH.init( );
        
        // Note that TinyECC is not const-correct. Hence it is necessary to cast away const.
        agree_result = call ECDH.key_agree(
            session_key, 16, (Point *)&public->value, (NN_DIGIT *)private );
        
        if( agree_result == 0 ) return FAIL;
        return SUCCESS;
    }
}
