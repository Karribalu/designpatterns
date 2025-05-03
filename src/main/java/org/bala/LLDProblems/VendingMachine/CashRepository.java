package org.bala.LLDProblems.VendingMachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CashRepository {
    private final Map<String, Integer> cashInventory = new ConcurrentHashMap<>();

    public void deposit(Money m) {
        cashInventory.merge(m.getCode(), 1, Integer::sum);
    }

    public Integer withdraw(Money m) {
        return cashInventory.computeIfPresent(m.getCode(), (k, v) -> v > 0 ? v - 1 : v) ;
    }

    public Map<String, Integer> getCashInventory() {
        return cashInventory;
    }
}
