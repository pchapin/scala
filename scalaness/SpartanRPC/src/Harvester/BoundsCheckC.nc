
module BoundsCheckC {
    provides command void boundsCheckFailed( );
}
implementation {
    command void boundsCheckFailed( )
    {
        // Something useful and application specific (restart the node?).
    }
}
