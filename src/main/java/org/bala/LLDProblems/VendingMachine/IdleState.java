package org.bala.LLDProblems.VendingMachine;

public class IdleState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(int id) {
        this.vendingMachine.internalSelect(id);
        this.vendingMachine.setState(new HasSelectedState());
    }

    @Override
    public void insertMoney(Money money) {
        throw new IllegalStateException("Please select the product before inserting the money");
    }

    @Override
    public void cancel() {
        this.vendingMachine.internalCancel();
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("Nothing to dispense");
    }
}
