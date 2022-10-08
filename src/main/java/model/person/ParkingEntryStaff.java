package model.person;

import model.gate.ParkingEntryGate;
import service.IBookParkingService;

public class ParkingEntryStaff extends Staff{
    private ParkingEntryGate parkingEntryGate;
    private IBookParkingService bookParkingService;

    public ParkingEntryStaff(String name, String age, String address, String emailId, IBookParkingService bookParkingService) {
        super(name, age, address, emailId);
        this.bookParkingService = bookParkingService;
    }

    public ParkingEntryGate getParkingEntryGate() {
        return parkingEntryGate;
    }

    public void setParkingEntryGate(ParkingEntryGate parkingEntryGate) {
        this.parkingEntryGate = parkingEntryGate;
    }

    public IBookParkingService getBookParkingService() {
        return bookParkingService;
    }

    public void setBookParkingService(IBookParkingService bookParkingService) {
        this.bookParkingService = bookParkingService;
    }
}
