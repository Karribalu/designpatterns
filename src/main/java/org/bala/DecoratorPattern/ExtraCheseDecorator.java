package org.bala.DecoratorPattern;

public class ExtraCheseDecorator extends ToppingsDecorator {
    private BasePizza basePizza;

    ExtraCheseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
