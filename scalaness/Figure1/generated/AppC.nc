configuration AppC {
}
implementation {
    components NodeC, SendC, RadioC;
    SendC.radio -> RadioC.radio;
    NodeC.send -> SendC.send;
}
