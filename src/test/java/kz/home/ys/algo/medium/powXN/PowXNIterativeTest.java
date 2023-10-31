package kz.home.ys.algo.medium.powXN;

import junit.framework.TestCase;

public class PowXNIterativeTest extends TestCase {

    public void testMyPow() {
        double result = new PowXNIterative().myPow(2, 10);

        assertEquals(1024, result, 0);
    }
}