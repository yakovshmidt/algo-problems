package kz.home.ys.algo.medium.theLatestTimeToCatchABus;

import junit.framework.TestCase;

public class TheLatestTimeToCatchABusTest extends TestCase {

    public void testLatestTimeCatchTheBus() {
        int latestTimeCatchTheBus = new TheLatestTimeToCatchABus().latestTimeCatchTheBus(new int[]{10, 20}, new int[]{2, 17, 18, 19}, 2);

        assertEquals(16, latestTimeCatchTheBus);
    }
}