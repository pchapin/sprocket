configuration X {
}
implementation {
    components A, B;
    
    activate "C1" as "A" for A.I -> [B].I;
}
