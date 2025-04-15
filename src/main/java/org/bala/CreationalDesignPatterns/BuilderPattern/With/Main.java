package org.bala.CreationalDesignPatterns.BuilderPattern.With;

public class Main {
    public static void main(String[] args) {
        House house = House.HouseBuilder("Concreter")
                .setHasSwimmingPool(true)
                .setHasGarden(true)
                .build();
        System.out.println(house);
    }
}
