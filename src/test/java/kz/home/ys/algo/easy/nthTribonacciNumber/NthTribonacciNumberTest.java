package kz.home.ys.algo.easy.nthTribonacciNumber;

import junit.framework.TestCase;

public class NthTribonacciNumberTest extends TestCase {

    public void testTribonacci() {
        int tribonacci = new NthTribonacciNumber().tribonacci(25);

        assertEquals(1389537, tribonacci);
    }
}