package org.bala.LLDProblems.CoffeeVendingMachine;

public class CoffeeDispencer {
    public void dispense(CoffeeType coffeeType) {
        for (IIngredient ingredient : coffeeType.getIngredients().keySet()) {
            System.out.println("Pouring " + ingredient.getName());
        }
    }
}
