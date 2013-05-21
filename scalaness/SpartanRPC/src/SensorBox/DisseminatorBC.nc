//-----------------------------------------------------------------------
// FILE    : DisseminatorBC.nc
// SUBJECT : SpartanRPC version of the broadcast Disseminator component.
// AUTHOR  : (C) Copyright 2013 by Peter C. Chapin <pchapin@cems.uvm.edu>
//
// -----------------------------------------------------------------------

//#include "KappaMsg.h"

// The structure of network commands
typedef struct commandTAG {
  uint8_t mote_id;    //the command destination node
  uint8_t command_name; //name of the command
  uint16_t val; //command parameter
  uint8_t nonce; // nonce to ensure *re*issued commands are updates
} command_t;

module DisseminatorBC {
    // provides remote interface DisseminationUpdateB requires "N.control";
    provides command void change( command_t new_value );       // Called by skeleton.

    // provides interface DisseminationValueB;
    provides command void set( const command_t *new_value );
    provides command const command_t *get( );
    uses command void changed( );

    // uses interface DisseminationUpdateB as NeighborUpdate;
    uses command void change_neighbor( command_t new_value );  // Calls into stub.

    // Maybe not necessary with Scalaness. Let the Scalaness program take care of this.
    // provides interface ComponentManager;
}
implementation {
    command_t current_value = { 0, 0, 0, 0 };

    // ----------------
    // Helper functions
    // ----------------

    bool commands_equal( const command_t *left, const command_t *right )
    {
        return ( left->mote_id      == right->mote_id      &&
                 left->command_name == right->command_name &&
                 left->val          == right->val          &&
                 left->nonce        == right->nonce );
    }

    // --------
    // Commands
    // --------
    
    command void change( command_t new_value )
    {
        if( !commands_equal( &current_value, &new_value ) ) {
            call change_neighbor( new_value );
            current_value = new_value;
            call changed( );
        }
    }


    command void set( const command_t *new_value )
    {
        current_value = *new_value;
    }
    

    command const command_t *get( )
    {
        return &current_value;
    }
    
//    component_id neighbors[] = {
//        // Each component_id is { node_id, component_number }.
//        { 2, 1 }
//    };
//
//    command component_set ComponentManager.elements( )
//    {
//        component_set remote_set = { neighbors, 1 };
//        return remote_set;
//    }
}

