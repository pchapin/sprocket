configuration X {
}
implementation {
    components A, B;
    
    activate "C1" for A.I -> [B].I;
}
