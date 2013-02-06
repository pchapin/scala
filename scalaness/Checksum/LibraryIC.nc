
// Library configuration encapsulates arbitrary nesC components that have imports.
configuration LibraryIC {

    // nesT version of the import Boot interface.
    uses command void booted( );
    
    // nesT version of the import Timer interface.
    uses command void fired( );
}
implementation {
    components MainC, BootShimC, SpecificTimerC;

    BootShimC.booted = booted;  // The booted command called when the node starts.
    BootShimC.Boot   -> MainC;

    SpecificTimerC.fired = fired;
}
