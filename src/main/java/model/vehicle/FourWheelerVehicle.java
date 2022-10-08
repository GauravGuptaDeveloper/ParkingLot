package model.vehicle;

import model.person.VehicleOwner;

public class FourWheelerVehicle extends Vehicle{

    public FourWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.FOURWHEELER);
    }
}
