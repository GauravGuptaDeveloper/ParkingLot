package model.person;

import model.parking.ParkingFloor;
import service.ISystemService;

public class ParkingSystemAdministrator extends Admin{
    private ISystemService iSystemService;

    public ParkingSystemAdministrator(String name, String age, String address, String emailId, ISystemService systemService) {
        super(name, age, address, emailId);
        this.iSystemService = systemService;
    }

    public void addParkingFloors(ParkingFloor parkingFloor){
        this.iSystemService.addParkingFloor(parkingFloor);
    }

    public void removeParkingFloor(int floorNumber){
        this.iSystemService.removeParkingFloor(floorNumber);
    }

    public void addEntranceGate(int floorNumber, int gateNumber){
        this.iSystemService.addEntranceGate(floorNumber, gateNumber);
    }

    public void addExitGate(int floorNumber, int gateNumber){
        this.iSystemService.addExitGate(floorNumber, gateNumber);
    }

    public void removeEntranceGate(int floorNumber, int gateNumber){
        this.iSystemService.removeEntranceGate(floorNumber, gateNumber);
    }

    public void removeExitGate(int floorNumber, int gateNumber){
        this.iSystemService.removeExitGate(floorNumber, gateNumber);
    }

    @Override
    public ParkingFloor getFloorInformation(int floorNumber) {
        return iSystemService.getParkingInformation(floorNumber);
    }
}
