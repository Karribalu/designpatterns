package org.bala.LLDProblems.VendingMachine;

public class HasSelectedState implements VendingMachineState {
    private final VendingMachine vendingMachine = VendingMachine.getInstance();

    @Override
    public void selectProduct(int productId) {
        throw new IllegalStateException("Item already selected, Please cancel or go to the payment section");
    }

    @Override
    public void insertMoney(Money money) {
        this.vendingMachine.internalInsertMoney(money);
        if (this.vendingMachine.getBalance() >= this.vendingMachine.getSelectedProduct().getPrice()) {
            this.vendingMachine.setState(new HasMoneyState());
        }
    }

    @Override
    public void cancel() {
        vendingMachine.internalCancel();
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("Insufficient funds to dispense the product");
    }
}
