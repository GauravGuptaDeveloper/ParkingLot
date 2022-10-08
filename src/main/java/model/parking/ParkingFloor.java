package model.parking;

import model.gate.ParkingEntryGate;
import model.gate.ParkingExitGate;
import model.person.Person;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<Person> guards;
    private List<ParkingSpot> parkingSpots;
    private List<ParkingEntryGate> parkingEntryGates;
    private List<ParkingExitGate> parkingExitGates;

    public ParkingFloor(int floorNumber, List<Person> guards, List<ParkingSpot> parkingSpots,
                        List<ParkingEntryGate> parkingEntryGates, List<ParkingExitGate> parkingExitGates) {
        this.floorNumber = floorNumber;
        this.guards = guards;
        this.parkingSpots = parkingSpots;
        this.parkingEntryGates = parkingEntryGates;
        this.parkingExitGates = parkingExitGates;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Person> getGuards() {
        return guards;
    }

    public void setGuards(List<Person> guards) {
        this.guards = guards;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public List<ParkingEntryGate> getParkingEntryGates() {
        return parkingEntryGates;
    }

    public void setParkingEntryGates(List<ParkingEntryGate> parkingEntryGates) {
        this.parkingEntryGates = parkingEntryGates;
    }

    public List<ParkingExitGate> getParkingExitGates() {
        return parkingExitGates;
    }

    public void setParkingExitGates(List<ParkingExitGate> parkingExitGates) {
        this.parkingExitGates = parkingExitGates;
    }

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "floorNumber=" + floorNumber +
                ", guards=" + guards +
                ", parkingSpots=" + parkingSpots +
                ", parkingEntryGates=" + parkingEntryGates +
                ", parkingExitGates=" + parkingExitGates +
                '}';
    }
}
