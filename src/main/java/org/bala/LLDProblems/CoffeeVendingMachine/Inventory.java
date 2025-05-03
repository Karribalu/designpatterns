package org.bala.LLDProblems.CoffeeVendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<IIngredient, Integer> stocks;

    private final Integer STOCK_THRESHOLD = 10;

    Inventory(Map<IIngredient, Integer> stock) {
        this.stocks = new HashMap<>(stock);
    }

    public boolean isAvailable(CoffeeType coffeeType) {
        for (Map.Entry<IIngredient, Integer> ingredient : coffeeType.getIngredients().entrySet()) {
            if (stocks.get(ingredient.getKey()) < ingredient.getValue()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void consume(CoffeeType coffeeType) {
        if (!isAvailable(coffeeType)) {
            throw new IllegalArgumentException("Insufficient stocks");
        }
        for (Map.Entry<IIngredient, Integer> ingredient : coffeeType.getIngredients().entrySet()) {
            stocks.put(ingredient.getKey(), stocks.get(ingredient.getKey()) - ingredient.getValue());
            if (stocks.get(ingredient.getKey()) < STOCK_THRESHOLD) {
                System.out.println("[Stock Alert] "+ingredient.getKey() + " "+ stocks.get(ingredient.getKey()));
            }
        }
    }

    public void addIngredient(IIngredient ingredient, Integer amount) {
        this.stocks.put(ingredient, this.stocks.getOrDefault(ingredient, 0) + amount);
    }
}
