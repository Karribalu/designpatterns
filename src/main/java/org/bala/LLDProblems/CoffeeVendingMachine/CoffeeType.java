package org.bala.LLDProblems.CoffeeVendingMachine;

import java.util.Map;

public enum CoffeeType {
    CAPPUCCINO("cappuccino", Map.of(
            IngredientType.MILK, 20,
            IngredientType.WATER, 10,
            IngredientType.COFFEE_POWDER, 20
    ), 2.5),
    LATTE("latte", Map.of(
            IngredientType.MILK, 30,
            IngredientType.WATER, 10,
            IngredientType.COFFEE_POWDER, 20
    ), 2.0),
    ESPRESSO("espresso", Map.of(
            IngredientType.COFFEE_POWDER, 40,
            IngredientType.WATER, 10
    ), 1.5);

    private final String name;
    private final Map<IIngredient, Integer> ingredients;
    private final double price;

    CoffeeType(String name, Map<IIngredient, Integer> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Map<IIngredient, Integer> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }
}
