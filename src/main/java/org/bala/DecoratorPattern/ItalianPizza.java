package org.bala.DecoratorPattern;

public class ItalianPizza extends BasePizza {
    @Override
    public int cost() {
        return super.cost() + 20;
    }
}
