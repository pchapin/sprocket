configuration X {
}
implementation {
    components A, B;
    
    enable "C1" assuming "C2" for A.I -> [B].I;
}
