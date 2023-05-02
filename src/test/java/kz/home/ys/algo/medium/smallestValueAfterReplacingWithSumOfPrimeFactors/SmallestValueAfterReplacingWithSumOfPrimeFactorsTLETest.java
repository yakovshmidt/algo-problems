package kz.home.ys.algo.medium.smallestValueAfterReplacingWithSumOfPrimeFactors;

import junit.framework.TestCase;

public class SmallestValueAfterReplacingWithSumOfPrimeFactorsTLETest extends TestCase {

    public void testSmallestValue() {
        int smallestValue = new SmallestValueAfterReplacingWithSumOfPrimeFactorsTLE().smallestValue(15);

        assertEquals(5, smallestValue);
    }
}