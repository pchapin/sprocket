configuration X {
}
implementation {
    components A, B;
    
    enable "C1" as "A" assuming "C2" for A.I -> [B].I;
}
