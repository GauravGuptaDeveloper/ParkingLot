package service;

import model.gate.ParkingEntryGate;
import model.parking.ParkingFloor;
import model.parking.ParkingSpace;
import model.parking.ParkingSpot;
import model.ticket.Ticket;
import model.vehicle.Vehicle;

public class ParkingService implements IBookParkingService, IFreeParkingService {

    private ParkingSpace parkingSpace;
    private TicketService ticketService;

    public ParkingService(ParkingSpace parkingSpace, TicketService ticketService) {
        this.parkingSpace = parkingSpace;
        this.ticketService = ticketService;
    }

    @Override
    public Ticket bookParking(int parkingEntryGateNumber, Vehicle vehicle) {
        ParkingSpot parkingSpot = null;
        boolean parkingFound = false;

        for (int floor = 0; floor < parkingSpace.getParkingFloors().size(); floor++) {
            ParkingFloor parkingFloor = parkingSpace.getParkingFloors().get(floor);
            for (int i = 0; i < parkingFloor.getParkingEntryGates().size(); i++) {
                ParkingEntryGate parkingEntryGate = parkingFloor.getParkingEntryGates().get(i);
                if(parkingEntryGate.getGateNumber() == parkingEntryGateNumber && parkingEntryGate.isOpen()){
                    for (int j = 0; j < parkingFloor.getParkingSpots().size(); j++) {
                        parkingSpot = parkingFloor.getParkingSpots().get(j);
                        if (parkingSpot.getVehicleCategory() == vehicle.getVehicleCategory()
                                && parkingSpot.isSpaceAvailableForParking() ){
                            parkingSpot.setVehicle(vehicle);
                            parkingSpot.setSpaceAvailableForParking(false);
                            parkingFound = true;
                            break;
                        }
                    }
                }
                if(parkingFound){
                    break;
                }
            }
            if(parkingFound){
                break;
            }
        }

        return ticketService.getTicket(parkingEntryGateNumber, parkingSpot, vehicle);
    }

    @Override
    public double freeParking(Ticket ticket) {
        int parkingEntryGate1 = ticket.getParkingEntryGate();
        ParkingSpot parkingSpot1 = ticket.getParkingSpot();

        boolean parkingFreed = false;

        for (int floor = 0; floor < parkingSpace.getParkingFloors().size(); floor++) {
            ParkingFloor parkingFloor = parkingSpace.getParkingFloors().get(floor);
            for (int i = 0; i < parkingFloor.getParkingEntryGates().size(); i++) {
                ParkingEntryGate parkingEntryGate = parkingFloor.getParkingEntryGates().get(i);
                if(parkingEntryGate.getGateNumber() == parkingEntryGate1){
                    for (int j = 0; j < parkingFloor.getParkingSpots().size(); j++) {
                        ParkingSpot parkingSpot = parkingFloor.getParkingSpots().get(j);
                        if (parkingSpot.getSpotNumber() == parkingSpot1.getSpotNumber()){
                            parkingSpot.freeTheParkingSpot();
                            parkingFreed = true;
                            break;
                        }
                    }
                }
                if(parkingFreed){
                    break;
                }
            }
            if(parkingFreed){
                break;
            }
        }

        return ticketService.getParkingFare(ticket);
    }
}