package kz.home.ys.algo.medium.countGoodNumbers;

import junit.framework.TestCase;

public class CountGoodNumbersTest extends TestCase {

    public void testCountGoodNumbers() {
        int result = new CountGoodNumbers().countGoodNumbers(4);

        assertEquals(400, result);
    }
}