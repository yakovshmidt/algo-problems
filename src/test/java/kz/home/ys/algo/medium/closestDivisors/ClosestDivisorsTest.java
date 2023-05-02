package kz.home.ys.algo.medium.closestDivisors;

import junit.framework.TestCase;

public class ClosestDivisorsTest extends TestCase {

    public void testClosestDivisors() {
        int[] closestDivisors = new ClosestDivisors().closestDivisors(25);

        assertEquals(3, closestDivisors[0]);
        assertEquals(9, closestDivisors[1]);
    }
}