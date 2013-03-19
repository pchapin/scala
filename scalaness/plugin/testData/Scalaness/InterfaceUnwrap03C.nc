
module InterfaceUnwrap03C {
    // Simple interface that only contains events.
    uses interface Interface2;
}
implementation {

    event void Interface2.e1( )
    {
    }
    
    event void Interface2.e2( int x )
    {
    }
    
    event void Interface2.e3( )
    {
    }

}
