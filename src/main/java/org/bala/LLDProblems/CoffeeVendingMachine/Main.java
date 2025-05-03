package org.bala.LLDProblems.CoffeeVendingMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.showMenu();

        coffeeMachine.orderCoffee(CoffeeType.LATTE, 2.5); // .5 change
        coffeeMachine.orderCoffee(CoffeeType.LATTE, 1.0);

        coffeeMachine.orderCoffee(CoffeeType.CAPPUCCINO, 2.0); // Payment not sufficient

        coffeeMachine.orderCoffee(CoffeeType.CAPPUCCINO, 2.5);
    }
}
