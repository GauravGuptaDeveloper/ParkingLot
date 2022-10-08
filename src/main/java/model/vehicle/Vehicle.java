package model.vehicle;

import model.person.Person;
import model.person.VehicleOwner;

public class Vehicle {
    private Person owner;
    private String vehicleNumber;
    private VehicleCategoryWithCost vehicleCategoryWithCost;

    public Vehicle(VehicleOwner vehicleOwner, String vehicleNumber, VehicleCategoryWithCost vehicleCategoryWithCost){
        this.owner = vehicleOwner;
        this.vehicleNumber = vehicleNumber;
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleCategoryWithCost getVehicleCategory() {
        return vehicleCategoryWithCost;
    }

    public void setVehicleCategory(VehicleCategoryWithCost vehicleCategoryWithCost) {
        this.vehicleCategoryWithCost = vehicleCategoryWithCost;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner=" + owner +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleCategory=" + vehicleCategoryWithCost +
                '}';
    }
}
