module BoundsCheckC {
    provides command void boundsCheckFailed( );
}
implementation {

    command void boundsCheckFailed( )
    {
        // Do something useful if an array bounds check fails such as...
        //   1. Turn on an LED to indicate an error.
        //   2. Send a radio message to the base station.
        //   3. Restart the node.

        while( 1 ) { }
    }
}
