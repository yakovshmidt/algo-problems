package kz.home.ys.algo.easy.designParkingSpace;

import junit.framework.TestCase;

public class ParkingSystemTest extends TestCase {

    public void testParkingSystem() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

        assertTrue(parkingSystem.addCar(1));
        assertTrue(parkingSystem.addCar(2));
        assertFalse(parkingSystem.addCar(3));
        assertFalse(parkingSystem.addCar(1));
    }
}