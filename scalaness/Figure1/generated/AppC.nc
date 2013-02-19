configuration AppC {
}
implementation {
    components BoundsCheckC;
    components NodeC, SendC, RadioC;

    NodeC.boundsCheckFailed -> BoundsCheckC;
    SendC.boundsCheckFailed -> BoundsCheckC;
    RadioC.boundsCheckFailed -> BoundsCheckC;

    SendC.radio -> RadioC.radio;
    NodeC.send -> SendC.send;
}
