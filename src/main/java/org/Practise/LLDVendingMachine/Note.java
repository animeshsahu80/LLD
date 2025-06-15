package org.Practise.LLDVendingMachine;

public enum Note {
    HUNDRED(100),
    TWO_HUNDRED(200);
    private final double value;
    Note(int value){
        this.value=value;
    }

    public double getValue() {
        return value;
    }
}
