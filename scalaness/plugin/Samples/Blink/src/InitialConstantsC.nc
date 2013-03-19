// FILE   : InitialConstantsC.nc
// SUMMARY: Module that manages constants used by the program.
//
// This is a silly module that just returns constant values as needed. It does demonstrate how
// the Scalaness system does module composition.

module InitialConstantsC {
    provides command flashCountType get_initial_count( );
}
implementation {
    
    command flashCountType get_initial_count( )
    {
        return blinkCount;
    }
    
}
