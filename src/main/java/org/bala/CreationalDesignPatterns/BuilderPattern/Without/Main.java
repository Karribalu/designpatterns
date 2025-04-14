package org.bala.CreationalDesignPatterns.BuilderPattern.Without;

public class Main {
    public static void main(String[] args) {
        House house = new House("Concrete", true);
        System.out.println(house);
    }
}
