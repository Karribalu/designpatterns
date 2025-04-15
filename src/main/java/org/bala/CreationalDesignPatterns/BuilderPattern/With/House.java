package org.bala.CreationalDesignPatterns.BuilderPattern.With;

public class House {
    public String roofType;
    public boolean hasSwimmingPool;
    public boolean hasGarden;
    public boolean hasGarage;

    public House(HouseBuilder houseBuilder) {
        this.roofType = houseBuilder.getRoofType();
        this.hasGarden = houseBuilder.isHasGarden();
        this.hasSwimmingPool = houseBuilder.isHasSwimmingPool();
    }


    public static HouseBuilder HouseBuilder(String roofType) {
        return new HouseBuilder(roofType);
    }

    @Override
    public String toString() {
        return "House{" +
                "roofType='" + roofType + '\'' +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
