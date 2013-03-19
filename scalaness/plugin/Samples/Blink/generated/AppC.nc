configuration AppC {
}
implementation {
    components InitialConstantsC, BlinkC;
    BlinkC.get_initial_count -> InitialConstantsC.get_initial_count;
}
