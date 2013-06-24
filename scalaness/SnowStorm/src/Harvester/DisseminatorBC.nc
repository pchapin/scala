//-----------------------------------------------------------------------
// FILE    : DisseminatorBC.nc
// SUBJECT : SpartanRPC version of the broadcast Disseminator component.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// -----------------------------------------------------------------------

#include "KappaMsg.h"

module DisseminatorBC {
    // provides remote interface DisseminationUpdateB requires "N.control";
    provides command void change( struct commandTAG *new_value );       // Called by skeleton.

    // provides interface DisseminationValueB;
    provides command void set( const struct commandTAG *new_value );
    provides command const struct commandTAG *get( );
    uses command void changed( );

    // uses interface DisseminationUpdateB as NeighborUpdate;
    uses command void change_neighbor( struct commandTAG *new_value );  // Calls into stub.

    // Maybe not necessary with Scalaness. Let the Scalaness program take care of this.
    // provides interface ComponentManager;
}
implementation {
    struct commandTAG current_value = { 0, 0, 0, 0 };

    // ----------------
    // Helper functions
    // ----------------

    int commands_equal( const struct commandTAG *left, const struct commandTAG *right )
    {
        return ( left->mote_id      == right->mote_id      &&
                 left->command_name == right->command_name &&
                 left->val          == right->val          &&
                 left->nonce        == right->nonce );
    }

    // --------
    // Commands
    // --------
    
    command void change( struct commandTAG *new_value )
    {
        if( !commands_equal( &current_value, new_value ) ) {
            call change_neighbor( new_value );
            current_value = *new_value;
            call changed( );
        }
    }


    command void set( const struct commandTAG *new_value )
    {
        current_value = *new_value;
    }
    

    command const struct commandTAG *get( )
    {
        return &current_value;
    }
    
}

