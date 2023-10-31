package kz.home.ys.algo.medium.countNumberOfHomogenousStrings;

import junit.framework.TestCase;

public class CountNumberOfHomogenousStringsTest extends TestCase {

    public void testCountHomogenous() {
        int result = new CountNumberOfHomogenousStrings().countHomogenous("abbcccaa");

        assertEquals(13, result);
    }
}