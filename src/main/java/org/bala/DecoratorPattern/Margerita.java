package org.bala.DecoratorPattern;

public class Margerita extends BasePizza {
    @Override
    public int cost() {
        return super.cost() + 10;
    }
}
