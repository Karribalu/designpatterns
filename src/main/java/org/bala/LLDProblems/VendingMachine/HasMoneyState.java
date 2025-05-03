package org.bala.LLDProblems.VendingMachine;

public class HasMoneyState implements VendingMachineState {
    private final VendingMachine vendingMachine = VendingMachine.getInstance();

    @Override
    public void selectProduct(int productId) {
        throw new IllegalStateException("Payment is in progress");
    }

    @Override
    public void insertMoney(Money money) {
        throw new IllegalStateException("Money is already Paid");
    }

    @Override
    public void cancel() {
        this.vendingMachine.internalCancel();
    }

    @Override
    public void dispense() {
        this.vendingMachine.internalDispense();
        this.vendingMachine.setState(new IdleState(vendingMachine));
    }
}
