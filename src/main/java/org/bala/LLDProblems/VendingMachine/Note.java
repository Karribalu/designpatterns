package org.bala.LLDProblems.VendingMachine;

public enum Note implements Money {
    ONE("ONE", 1.0),
    FIVE("FIVE", 5.0),
    TEN("TEN", 10.0);
    private final String code;
    private final double value;

    Note(String code, double value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}
