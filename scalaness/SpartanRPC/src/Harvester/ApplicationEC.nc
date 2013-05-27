
// Configuration encapsulates application components that have exports.
configuration ApplicationEC {
    provides command void changed( );
}
implementation {
    components HarvesterC;

    changed = HarvesterC.changed;
}
