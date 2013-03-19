
module InterfaceUnwrap02C {
    // Simple interface that only contains commands.
    uses interface Interface1;
}
implementation {
    
    void flash( int n )
    {
        int i;
        for( i = 0; i < n; ++i ) {
            // Be sure all commands in the interface are recognized/handled.
            call Interface1.c1( );
            call Interface1.c2( 10 );
            call Interface1.c3( );
        }
    }
    
}
