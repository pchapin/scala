configuration AppC {
}
implementation {
    components BoundsCheckC;
    components LibraryIC, MessageFormatterC, ChecksumC, LibraryEC;

    MessageFormatterC.boundsCheckFailed -> BoundsCheckC;
    ChecksumC.boundsCheckFailed -> BoundsCheckC;

    LibraryIC.booted -> MessageFormatterC.booted;
    LibraryIC.fired -> MessageFormatterC.fired;
    MessageFormatterC.compute_checksum -> ChecksumC.compute_checksum;
    MessageFormatterC.startPeriodic -> LibraryEC.startPeriodic;
}
