package service;

import model.parking.ParkingFloor;
import model.parking.ParkingSpace;

public interface ISystemService {
    ParkingFloor addParkingFloor(ParkingFloor parkingFloor);

    ParkingSpace removeParkingFloor(int floorNumber);

    ParkingFloor addEntranceGate(int floorNumber, int gateNumber);

    ParkingFloor addExitGate(int floorNumber, int gateNumber);

    ParkingFloor removeEntranceGate(int floorNumber, int gateNumber);

    ParkingFloor removeExitGate(int floorNumber, int gateNumber);

    ParkingFloor getParkingInformation(int floorNumber);
}
