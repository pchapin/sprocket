configuration X {
}
implementation {
    components A, B;
    
    activate "C1" as "A" assuming "C2" for A.I -> [B].I;
}
