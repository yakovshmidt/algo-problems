package kz.home.ys.algo.medium.bullsAndCows;

import junit.framework.TestCase;

public class BullsAndCowsTest extends TestCase {

    public void testGetHint() {
        String result = new BullsAndCows().getHint("1807", "7810");

        assertEquals("1A3B", result);
    }
}