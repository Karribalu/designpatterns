package org.bala.CreationalDesignPatterns.BuilderPattern.Without;

public class House {
    public boolean hasGarden;
    public boolean hasSwimmingPool;
    public String roofType;

    public House(String roofType, boolean hasGarden) {
        this.roofType = roofType;
        this.hasGarden = hasGarden;
    }

}
