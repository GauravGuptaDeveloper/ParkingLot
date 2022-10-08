package model.vehicle;

import model.person.VehicleOwner;

public class TwoWheelerVehicle extends Vehicle{

    public TwoWheelerVehicle(VehicleOwner vehicleOwner, String vehicleNumber) {
        super(vehicleOwner, vehicleNumber, VehicleCategoryWithCost.TWOWHEELER);
    }

}
