package org.bala.LLDProblems.ParkingLot;

public class Vehicle {
    public VehicleType vehicleType;
    public String vehicleNumber;

    Vehicle(VehicleType vehicleType, String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
}
