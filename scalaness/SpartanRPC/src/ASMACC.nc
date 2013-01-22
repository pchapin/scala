// FILE   : ASMACC.nc
// SUMMARY: An AuthorizationServer that uses hardware MAC authorization with a session key.
//

#include "CryptographicServices.h"
#include "ECC.h"

module ASRT0C {
    provides interface AuthorizationServer;
    uses {
    	interface Encrypt; // For hardware AES.
    }	
}

implementation {
    struct SessionKey session_key;  // The session key should be hard coded by Scalaness.
    uint8_t  aes_plaintext[16];
    uint8_t  aes_ciphertext[16];
    const uint8_t *message;
    int      total_size;
    bool     in_progress = FALSE;


    command error_t AuthorizationServer.check_message(
        const uint8_t *message_buffer,
              int      size,
              uint16_t client_address )
    {
        struct IDs endpoint;
        
        if( in_progress ) return FAIL;
        if( size < 8 ) return FAIL;     // At least a minimal header and a MAC.

        // TODO: Search for a matching MAC.
        endpoint.interface_id = message_buffer[0];
        endpoint.node_id      = client_address;
        endpoint.component_id = message_buffer[3];
        
        // if( call SessionKeyStorage.server_get_key( &endpoint, &session_key ) != SUCCESS ) {
        //     return FAIL;
        // }
        // else {
    	    // Copy message into aes_plaintext to prepare it for encryption later.
    	    memset( aes_plaintext, 0, 16 );
    	    memcpy( aes_plaintext, message_buffer, size - 4 );
    	    message = message_buffer;
    	    total_size = size;
    	    if( call Encrypt.setKey( session_key.value ) == SUCCESS) {
    	        in_progress = TRUE;
    	        return SUCCESS;
    	    }
    	    else {
    	        return FAIL;
    	    }
        // }
    }

    
    event void Encrypt.setKeyDone( uint8_t *key )
    {
        if( key != session_key.value ) {
            // Something strange happened while loading the key.
            in_progress = FALSE;
        }
        else {
            // Here I assume that if putPlain succeeds, the getCipher event will occur. However,
            // the implementation of the Encrypt interface that I'm using doesn't actually do
            // that in all cases. In that case in_progress will be stuck at TRUE forever.
            //
            if( call Encrypt.putPlain( aes_plaintext, aes_ciphertext ) == FAIL ) {
                in_progress = FALSE;
            }
        }
    }

    
    event void Encrypt.getCipher( uint8_t *plain, uint8_t *cipher )
    {
        int result;
        
        if( aes_plaintext != plain ) return;
        
        // Use the first four bytes of the cipher text as the MAC.
        result = memcmp( message + total_size - 4, cipher, 4 );

        // If want to change key, we need to call clrKey first.
        call Encrypt.clrKey( session_key.value );
        
        in_progress = FALSE;
        signal AuthorizationServer.check_done( (result == 0) ? TRUE : FALSE );
    }

}
