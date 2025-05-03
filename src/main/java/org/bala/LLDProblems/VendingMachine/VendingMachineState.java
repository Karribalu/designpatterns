package org.bala.LLDProblems.VendingMachine;

public interface VendingMachineState {
    void selectProduct(int productId);

    void insertMoney(Money money);

    void cancel();

    void dispense();
}
