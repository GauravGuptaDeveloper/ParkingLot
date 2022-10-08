package model.parking;

import model.vehicle.Vehicle;
import model.vehicle.VehicleCategoryWithCost;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle vehicle;
    private VehicleCategoryWithCost vehicleCategoryWithCost;
    private boolean isSpaceAvailableForParking;

    public ParkingSpot(int spotNumber, VehicleCategoryWithCost vehicleCategoryWithCost, boolean isSpaceAvailableForParking) {
        this.spotNumber = spotNumber;
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
        this.isSpaceAvailableForParking = isSpaceAvailableForParking;
    }

    public void freeTheParkingSpot(){
        this.isSpaceAvailableForParking = true;
        this.vehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleCategoryWithCost getVehicleCategory() {
        return vehicleCategoryWithCost;
    }

    public void setVehicleCategory(VehicleCategoryWithCost vehicleCategoryWithCost) {
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
    }

    public boolean isSpaceAvailableForParking() {
        return isSpaceAvailableForParking;
    }

    public void setSpaceAvailableForParking(boolean spaceAvailableForParking) {
        isSpaceAvailableForParking = spaceAvailableForParking;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", vehicle=" + vehicle +
                ", vehicleCategory=" + vehicleCategoryWithCost +
                ", isSpaceAvailableForParking=" + isSpaceAvailableForParking +
                '}';
    }
}
