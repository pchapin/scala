
// Library configuration encapsulates arbitrary nesC components that have imports.
configuration LibraryIC {
    // Only uses (imports) are allowed here.

    // nesT version of the import Boot interface.
    uses command void booted( );
}
implementation {
    components MainC, BootShimC;

    BootShimC.booted = booted;  // The booted command called when the node starts.
    BootShimC.Boot   -> MainC;
}
