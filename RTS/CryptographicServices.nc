// FILE   : CryptographicServices.nc
// SUMMARY: Interface to the specific crypto services needed by Sprocket.
//
// The expectation is that these services will be implemented by some other supporting library.
// This interface just presents the services of that library in a convenient manner.

#include "CryptographicServices.h"

interface CryptographicServices {
    
    // Initialize a public key value to all zero bytes.
    command void public_key_initializer( struct PublicKey *key );
    
    // Initialize a signature value to all zero bytes.
    command void signature_initializer( struct Signature *signature );
    
    // Return TRUE if the two public keys have the same value; FALSE otherwise.
    command bool same_keys( const struct PublicKey *x, const struct PublicKey *y );
    
    // Converts raw data bytes in a certificate to a public key value.
    //   raw_data     : Pointer to the first byte of the certificate.
    //   raw_data_size: Total size of the certificate.
    //   first        : Index value of the first byte of candidate public key.
    //   last         : Receives the index value of the last byte of the public key.
    //   key          : Receives the public key itself.
    //   valid        : TRUE if conversion successful; FALSE otherwise. If the conversion fails
    //                  then *last and *key contain undefined values.
    //
    command void raw_to_public_key(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int              *last,
              struct PublicKey *key,
              bool             *valid );
    

    // Converts raw data bytes in a certificate to a signature value.
    //   raw_data     : Pointer to the first byte of the certificate.
    //   raw_data_size: Total size of the certificate.
    //   first        : Index value of the first byte of candidate signature.
    //   last         : Receives the index value of the last byte of the signature.
    //   key          : Receives the signature itself.
    //   valid        : TRUE if conversion successful; FALSE otherwise. If the conversion fails
    //                  then *last and *signature contain undefined values.
    //
    command void raw_to_signature(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int              *last,
              struct Signature *signature,
              bool             *valid );
    
    command void compute_signature(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int               last,
              struct Signature *signature,
        const struct PrivateKey *key );
    
    // Checks the signature on a certificate.
    //   raw_data     : Pointer to the first byte of the certificate.
    //   raw_data_size: Total size of the data.
    //   first        : Index value of the first byte of the signed data.
    //   last         : Index value of the last byte of the signed data.
    //   signature    : Pointer to a signature object.
    //   key          : Pointer to the public key corresponding to the private key used to sign.
    //
    command bool verify_signature(
        const uint8_t          *raw_data,
              int               raw_data_size,
              int               first,
              int               last,
        const struct Signature *signature,
        const struct PublicKey *key );
    
    
    // Computes a session key using Diffie-Hellman.
    //   public      : Pointer to the public key to use.
    //   private     : Pointer to the private key to use.
    //   session_key : Pointer to an array of exactly 16 octets to receive the session key.
    //
    command error_t compute_session_key(
        const struct PublicKey *public,
        const NN_DIGIT         *private,        // TODO: Change to struct PrivateKey.
              octet_t          *session_key );
}

