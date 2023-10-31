package kz.home.ys.algo.medium.editDistance;

import junit.framework.TestCase;

public class EditDistanceTest extends TestCase {

    public void testMinDistance1() {
        int result = new EditDistance().minDistance("horse", "ros");

        assertEquals(3, result);
    }

    public void testMinDistance2() {
        int result = new EditDistance().minDistance("sea", "eat");

        assertEquals(2, result);
    }
}