package kz.home.ys.algo.medium.capacityToShipPackagesWithinDDays;

import junit.framework.TestCase;

public class CapacityToShipPackagesWithinDDaysTest extends TestCase {

    public void testShipWithinDays() {
        int result = new CapacityToShipPackagesWithinDDays().shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3);

        assertEquals(6, result);
    }
}