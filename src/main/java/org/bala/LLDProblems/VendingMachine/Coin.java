package org.bala.LLDProblems.VendingMachine;

public enum Coin implements Money {
    PENNY("PENNY", 0.01),
    NICKEL("NICKEL", 0.05),
    DIME("DIME", 0.1),
    QUARTER("QUARTER", 0.25),
    DOLLAR("DOLLAR", 1.0);
    private final String code;
    private final double value;

    Coin(String code, double value) {
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
