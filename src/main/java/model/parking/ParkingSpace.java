package model.parking;

import java.util.List;

// Singleton pattern since,
// I will be having one ParkingSpace only throughout the program.
public class ParkingSpace {
    private volatile List<ParkingFloor> parkingFloors;

    private static volatile ParkingSpace INSTANCE = null;

    private ParkingSpace(){}

    // Lazy and safe thread way of getInstance.
    public static ParkingSpace getInstance(){
        synchronized (ParkingSpace.class){
            if(INSTANCE == null){
                INSTANCE = new ParkingSpace();
            }
            return INSTANCE;
        }
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public synchronized void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "parkingFloors=" + parkingFloors +
                '}';
    }
}
