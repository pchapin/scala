// FILE   : AuthorizationServer.nc
// SUMMARY: General interface to authorization component used by servers.
//

interface AuthorizationServer {
   
    // Starts verification of authorization specific information on the message. It is possible
    // for this command to return SUCCESS and yet have the check_done event never signaled.
    //
    command error_t check_message(
        const uint8_t *message_buffer,  // Points at buffer containing authorized message.
              int      size,            // Total size of message (including authorization).
              uint16_t client_address   // The AM address of the sending of the message.
    );
    
    // Signaled with the message verification process is complete. The value of check_result
    // will be true if the verification succeeded and false otherwise.
    //
    event void check_done( bool check_result );
    
}
