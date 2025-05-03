package org.bala.LLDProblems.VendingMachine;

import java.util.Map;

public class MaintenanceService {
    private VendingMachine vendingMachine = VendingMachine.getInstance();

    public void restockProduct(int id, int qty) {
        vendingMachine.restockProduct(id, qty);
    }

    public Map<String, Integer> collectAllCash() {
        return this.vendingMachine.collectAllCash();
    }
}
