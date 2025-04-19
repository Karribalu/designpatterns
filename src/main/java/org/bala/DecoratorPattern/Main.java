package org.bala.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ItalianPizza();
        System.out.println("Italian base pizza cost " + pizza.cost());
        pizza = new ExtraCheseDecorator(pizza);
        System.out.println("Extra cheese added "+ pizza.cost());

        pizza = new ExtraVeggiesDecorator(pizza);

        System.out.println("Extra vegies added "+ pizza.cost());
    }
}
