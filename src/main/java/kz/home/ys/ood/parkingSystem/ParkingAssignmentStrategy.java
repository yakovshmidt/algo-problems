package kz.home.ys.ood.parkingSystem;

public class ParkingAssignmentStrategy {

    public ParkingSpotEntranceStrategy getParkingSpot() {
        return new ParkingSpotEntranceStrategy();
    }

    public ParkingSpotExitStrategy releaseParkingSpot() {
        return new ParkingSpotExitStrategy();
    }
}
