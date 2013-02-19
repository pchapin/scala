configuration AppC {
}
implementation {
    components LibraryIC, MessageFormatterC, ChecksumC, LibraryEC;
    LibraryIC.booted -> MessageFormatterC.booted;
    LibraryIC.fired -> MessageFormatterC.fired;
    MessageFormatterC.compute_checksum -> ChecksumC.compute_checksum;
    MessageFormatterC.startPeriodic -> LibraryEC.startPeriodic;
}
