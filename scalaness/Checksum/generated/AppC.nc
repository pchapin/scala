configuration AppC {
}
implementation {
    components BoundsCheckC;
    components LibraryIC, MessageFormatterC, ChecksumC, LibraryEC;

    MessageFormatterC.boundsCheckFailed -> BoundsCheckC;
    ChecksumC.boundsCheckFailed -> BoundsCheckC;

}
