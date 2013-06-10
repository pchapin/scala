// FILE   : AuthorizationClient.nc
// SUMMARY: General interface to authorization component used by clients.
//

interface AuthorizationClient {
    
    // Adds authorization specific information to the message. Return SUCCESS if all is ok.
    // PRE: size <= 16 && size <= max_size
    //
    command error_t prepare_message(
        uint8_t *message_buffer,  // Points at buffer containing unauthorized message.
        int      size,            // Size of unauthorized message.
        int      max_size,        // Size of the message buffer.
        int      entity_index,    // Identifier for "this" sender.
        int      remote_index     // Index into the remote components array.
    );
    
    // Signaled when the message has been prepared. Given the updated (total) size. Note that
    // it is possible for prepare_message to return SUCCESS and yet this event might never be
    // signaled.
    // PRE: new_size <= max_size
    //
    event void preparation_done( int new_size );

}
