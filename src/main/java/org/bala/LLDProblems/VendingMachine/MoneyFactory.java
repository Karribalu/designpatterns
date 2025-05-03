package org.bala.LLDProblems.VendingMachine;

public class MoneyFactory {
    public Money createCoin(String code) {
        return Coin.valueOf(code);
    }

    public Money createNote(String code) {
        return Note.valueOf(code);
    }
}
