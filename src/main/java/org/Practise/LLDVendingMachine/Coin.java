package org.Practise.LLDVendingMachine;

public enum Coin {
    FIVE(5),
    TEN(10);
    private final double value;
    Coin(int value){
        this.value=value;
    }

    public double getValue() {
        return value;
    }
}
