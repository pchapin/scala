configuration AppC {
}
implementation {
    components BoundsCheckC;
    components NodeC, SendC, RadioC;

    NodeC.boundsCheckFailed -> BoundsCheckC;
    SendC.boundsCheckFailed -> BoundsCheckC;
    RadioC.boundsCheckFailed -> BoundsCheckC;

}
