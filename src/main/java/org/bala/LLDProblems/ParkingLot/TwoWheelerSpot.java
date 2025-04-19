package org.bala.LLDProblems.ParkingLot;

public class TwoWheelerSpot extends ParkingSpot {
    public Vehicle vehicle;
    public boolean isFree;

    @Override
    public void bookSpot(Vehicle vehicle) {
        if (!this.isFree) {
            throw new UnsupportedOperationException("Parking spot is already full");
        } else if (vehicle.vehicleType != VehicleType.TwoWheeler) {
            throw new UnsupportedOperationException("Parking spot is only reserved for 2 Wheeler");
        }
        this.vehicle = vehicle;
        this.isFree = false;
    }

    @Override
    public void releaseSpot() {
        this.vehicle = null;
        this.isFree = true;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    public boolean isFree(){
        return this.isFree;
    }
}
