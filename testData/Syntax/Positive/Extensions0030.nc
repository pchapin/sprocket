configuration X {
}
implementation {
    components A, B;
    
    enable "C1" for A.I -> [B].I;
}
