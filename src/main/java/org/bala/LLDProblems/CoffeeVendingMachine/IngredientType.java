package org.bala.LLDProblems.CoffeeVendingMachine;

public enum IngredientType implements IIngredient {
    WATER("water", "ml"),
    MILK("milk", "ml"),
    COFFEE_POWDER("coffee_powder", "g");
    private final String name;
    private final String unit;

    IngredientType(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getUnit() {
        return this.unit;
    }
}
