package model.person;

import model.gate.ParkingExitGate;
import service.IFreeParkingService;

public class ParkingExitStaff extends Staff {
    private ParkingExitGate parkingExitGate;
    private IFreeParkingService freeParkingService;

    public ParkingExitStaff(String name, String age, String address, String emailId, IFreeParkingService freeParkingService) {
        super(name, age, address, emailId);
        this.freeParkingService = freeParkingService;
    }

    public ParkingExitGate getParkingExitGate() {
        return parkingExitGate;
    }

    public void setParkingExitGate(ParkingExitGate parkingExitGate) {
        this.parkingExitGate = parkingExitGate;
    }

    public IFreeParkingService getFreeParkingService() {
        return freeParkingService;
    }

    public void setFreeParkingService(IFreeParkingService freeParkingService) {
        this.freeParkingService = freeParkingService;
    }
}
