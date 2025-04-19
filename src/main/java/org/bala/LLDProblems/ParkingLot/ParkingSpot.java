package org.bala.LLDProblems.ParkingLot;

class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public abstract class ParkingSpot {
    private Position position;

    public abstract void bookSpot(Vehicle vehicle);

    public abstract void releaseSpot();

    public abstract int getPrice();

    public int getDistance(int x, int y) {
        return (int) Math.sqrt(Math.pow((position.x - x), 2) + Math.pow((position.y - y), 2));
    }

    public abstract boolean isFree();
}
