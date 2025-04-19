package org.bala.DecoratorPattern;

public class ExtraVeggiesDecorator extends ToppingsDecorator {
    private final BasePizza basePizza;

    ExtraVeggiesDecorator(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
