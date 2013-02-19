configuration X {
}
implementation {
    components A, B;
    
    enable "C1" as "A" for A.I -> [B].I;
}
