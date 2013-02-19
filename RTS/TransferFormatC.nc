
// #include "printf.h"
// #define TF_DEBUG
#include "CryptographicServices.h"

module TransferFormatC {
    provides interface TransferFormat;
    uses     interface CryptographicServices;
    uses     interface KeyStorage;
    uses     interface CredentialStorage;
    uses     interface Leds;                // Needed only for debugging support.
}
implementation {
    
    int current_index;
    
    // Return TRUE if the certificate form byte is something sensible. Otherwise return FALSE.
    bool check_certificate_form( const uint8_t *raw_data, int raw_data_size )
    {
        bool result = FALSE;
        
        // Is there a form byte?
        if( raw_data_size <= 0 ) return FALSE;
        
        // Is the form byte reasonable?
        switch( raw_data[0] ) {
        case Invalid:
            result = FALSE;
            break;
        case Role_Membership:
        case Role_Inclusion:
        case Role_Linked:
        case Role_Intersection:
            result = TRUE;
            break;
        default:
            result = FALSE;
            break;
        }
        return result;
    }
    
    
    // Return the offset into the certificate where the signature should be located based on the
    // credential's form.
    //
    int signature_offset( const uint8_t *raw_data, int raw_data_size )
    {
        int offset = 0;
        
        switch( raw_data[0] ) {
        case Role_Membership:
            offset = 1 + PUBLIC_KEY_SIZE + 1 + PUBLIC_KEY_SIZE;
            break;
        case Role_Inclusion:
            offset = 1 + PUBLIC_KEY_SIZE + 1 + PUBLIC_KEY_SIZE + 1;
            break;
        case Role_Linked:
            offset = 1 + PUBLIC_KEY_SIZE + 1 + PUBLIC_KEY_SIZE + 1 + 1;
            break;
        case Role_Intersection:
            offset = 1 + PUBLIC_KEY_SIZE + 1 + PUBLIC_KEY_SIZE + PUBLIC_KEY_SIZE + 1 + 1;
            break;
        }
        return offset;
    }
    
    
    // Returns TRUE if the size of the certificate is appropriate based on its form. Returns
    // FALSE otherwise.
    //
    bool check_certificate_size( const uint8_t *raw_data, int raw_data_size )
    {
        int expected_size = signature_offset( raw_data, raw_data_size ) + SIGNATURE_SIZE;
        return expected_size == raw_data_size;
    }
        

    void check_credential_validity( const uint8_t *raw_data, int raw_data_size, bool *valid )
    {
        struct PublicKey key;
        struct Signature signature;
        int end_of_signature;
        int end_of_key;
        int offset;
        
        // Quick sanity check on the form and size of the certificate.
        if( check_certificate_form( raw_data, raw_data_size ) == FALSE ||
            check_certificate_size( raw_data, raw_data_size ) == FALSE) {
        
            *valid = FALSE;
            return;
        }
        
        offset = signature_offset( raw_data, raw_data_size );
        
        // Verify the signature.
        call CryptographicServices.raw_to_signature(
            raw_data, raw_data_size, offset, &end_of_signature, &signature, valid );
        if( *valid ) {
            call CryptographicServices.raw_to_public_key(
                raw_data, raw_data_size, 1, &end_of_key, &key, valid );
            if( *valid ) {
                *valid = call CryptographicServices.verify_signature(
                    raw_data, raw_data_size, 0, raw_data_size - SIGNATURE_SIZE - 1, &signature, &key );
            }
        }
    }
    
    
    void get_key( const uint8_t *raw_data, int raw_data_size, int *key, bool *key_ok )
    {
        int  last_index;
        int  key_index;
        bool invalidate_old;        
        struct PublicKey public_key;
        
        call CryptographicServices.raw_to_public_key(
            raw_data, raw_data_size, current_index, &last_index, &public_key, key_ok );
        if( !*key_ok ) {
            *key = 0;
        }
        else {
            call KeyStorage.add_key( &public_key, &key_index, &invalidate_old );
            *key = key_index;
            if( invalidate_old ) {
                call CredentialStorage.invalidate_credentials_using( key_index );
            }
        }
        current_index = last_index;
    }
    
    
    void get_role( const uint8_t *raw_data, int *role )
    {
        *role = raw_data[current_index];
    }
    

    command void TransferFormat.raw_to_credential
        ( const uint8_t *raw_data, int raw_data_size, struct CredentialType *credential, bool *valid )
    {
        enum StateType { Get_Form,
                         Get_Defining_Key,
                         Get_Target_Role,
                         Get_Source_Key1,
                         Get_Source_Key2,
                         Get_Source_Role1,
                         Get_Source_Role2,
                         Done };
                         
        bool key_ok;
        enum StateType state = Get_Form;
        
        // TODO: Initialize credential to an invalid credential.

        check_credential_validity( raw_data, raw_data_size, valid );
        if( *valid ) {
            current_index = 0;
            while( state != Done && current_index < raw_data_size ) {
                switch( state ) {
                case Get_Form:
                    credential->form = raw_data[current_index];
                    current_index++;
                    state = Get_Defining_Key;
                    break;
                
                 case Get_Defining_Key:
                    get_key( raw_data, raw_data_size, &credential->defining_key, &key_ok );
                    if( !key_ok ) {
                        *valid = FALSE;
                        state = Done;
                    }
                    else {
                        current_index++;
                        state = Get_Target_Role;
                    }
                    break;
                
               case Get_Target_Role:
                    get_role( raw_data, &credential->target_role );
                    current_index++;
                    state = Get_Source_Key1;
                    break;
                
                case Get_Source_Key1:
                    get_key( raw_data, raw_data_size, &credential->source_key1, &key_ok );
                    if( !key_ok ) {
                        *valid = FALSE;
                        state = Done;
                    }
                    else {
                        current_index++;
                        switch( credential->form ) {
                        case Role_Membership:
                            state = Done;
                            break;
                        
                        case Role_Inclusion:
                        case Role_Linked:
                        case Role_Intersection:
                            state = Get_Source_Role1;
                            break;
                        
                        default:
                            *valid = FALSE;
                            state = Done;
                            break;
                        }
                    }
                    break;
                
                case Get_Source_Key2:
                    get_key( raw_data, raw_data_size, &credential->source_key2, &key_ok );
                    if( !key_ok ) {
                        *valid = FALSE;
                        state = Done;
                    }
                    else {
                        current_index++;
                        switch( credential->form ) {
                        case Role_Intersection:
                            state = Get_Source_Role2;
                            break;
                        
                        default:
                            *valid = FALSE;
                            state = Done;
                            break;
                        }
                    }
                    break;
                
                case Get_Source_Role1:
                    get_role( raw_data, &credential->source_role1 );
                    current_index++;
                    switch( credential->form ) {
                    case Role_Inclusion:
                        state = Done;
                        break;
                    
                    case Role_Linked:
                        state = Get_Source_Role2;
                        break;
                        
                    case Role_Intersection:
                        state = Get_Source_Key2;
                        break;
                    
                    default:
                        *valid = FALSE;
                        state = Done;
                        break;
                    }
                    break;
                
                case Get_Source_Role2:
                    get_role( raw_data, &credential->source_role2 );
                    current_index++;
                    switch( credential->form ) {
                    case Role_Linked:
                    case Role_Intersection:
                        state = Done;
                        break;
                    
                    default:
                        *valid = FALSE;
                        state = Done;
                        break;
                    }
                    break;
                
                case Done:
                    // Should never occur. When State == Done, the enclosing loop terminates.
                    break;
                }
            }
        }
    }
}

