package org.bala.LLDProblems.ParkingLot;

public class FourWheelerSpot extends ParkingSpot {
    private Position position;
    public Vehicle vehicle;

    public boolean isFree;

    public FourWheelerSpot(int x, int y) {
        this.position = new Position(x, y);
        this.isFree = true;
    }

    @Override
    public void bookSpot(Vehicle vehicle) {
        if (!this.isFree) {
            throw new UnsupportedOperationException("Parking spot is already full");
        } else if (vehicle.vehicleType != VehicleType.FourWheeler) {
            throw new UnsupportedOperationException("Parking spot is only reserved for 4 Wheeler");
        }
        this.vehicle = vehicle;
        this.isFree = false;
    }

    @Override
    public void releaseSpot() {
        this.isFree = true;
        this.vehicle = null;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
