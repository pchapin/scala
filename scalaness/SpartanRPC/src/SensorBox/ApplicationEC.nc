
// Configuration encapsulates application components that have exports.
configuration ApplicationEC {
    provides command void changed( );
}
implementation {
    components SensorBoxC;

    changed = SensorBoxC.changed;
}
