package kz.home.ys.algo.medium.uglyNumberII;

import junit.framework.TestCase;

public class UglyNumberIITest extends TestCase {

    public void testNthUglyNumber() {
        int result = new UglyNumberII().nthUglyNumber(10);

        assertEquals(12, result);
    }
}