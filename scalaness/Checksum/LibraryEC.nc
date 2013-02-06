
// Library configuration encapsulates arbitrary nesC components that have exports.
configuration LibraryEC {

    // nesT version of the export Timer interface.
    provides command void startPeriodic( uint32_t period );
}
implementation {
    components SpecificTimerC;

    startPeriodic = SpecificTimerC.startPeriodic;
}
