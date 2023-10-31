package kz.home.ys.algo.medium.powXN;

import junit.framework.TestCase;

public class PowXNRecursiveTest extends TestCase {

    public void testMyPow() {
        double result = new PowXNRecursive().myPow(2, 10);

        assertEquals(1024, result, 0);
    }
}