package kz.home.ys.algo.medium.uglyNumberII;

import junit.framework.TestCase;

public class UglyNumberIIUsingBacktrackingTest extends TestCase {

    public void testNthUglyNumber() {
        int result = new UglyNumberIIUsingBacktracking().nthUglyNumber(10);

        assertEquals(12, result);
    }
}