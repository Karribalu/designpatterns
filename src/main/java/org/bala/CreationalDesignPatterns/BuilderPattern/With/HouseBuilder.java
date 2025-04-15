package org.bala.CreationalDesignPatterns.BuilderPattern.With;

public class HouseBuilder {
    private String roofType;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private boolean hasGarage;

    public HouseBuilder(String roofType) {
        this.roofType = roofType;

    }

    public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(this);
    }

    public String getRoofType() {
        return roofType;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }
}
