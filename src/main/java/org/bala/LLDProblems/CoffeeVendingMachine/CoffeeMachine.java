package org.bala.LLDProblems.CoffeeVendingMachine;

import java.util.Map;

public class CoffeeMachine {
    private Inventory inventory;
    private CoffeeDispencer dispencer;
    private PaymentProcessor paymentProcessor;

    CoffeeMachine() {
        this.inventory = new Inventory(Map.of(
                IngredientType.COFFEE_POWDER, 40,
                IngredientType.MILK, 50,
                IngredientType.WATER, 100
        ));
        this.dispencer = new CoffeeDispencer();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void showMenu() {
        for (CoffeeType coffeeType : CoffeeType.values()) {
            System.out.println(coffeeType.getName() + " " + coffeeType.getPrice());
        }
    }

    public synchronized void orderCoffee(CoffeeType coffeeType, double amount) {
        if (!this.inventory.isAvailable(coffeeType)) {
            System.out.println("[Error] Coffee Not avaialable");
            return;
        }
        try {
            double change = this.paymentProcessor.charge(coffeeType.getPrice(), amount);

            this.inventory.consume(coffeeType);
            this.dispencer.dispense(coffeeType);
            if (change > 0) {
                System.out.println("Dispensing the change " + change);
            }
        } catch (Exception e) {
            System.out.println("[ERROR] Coffee Dispense Failed " + e.getMessage());
        }
    }
}
