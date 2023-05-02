package kz.home.ys.algo.medium.smallestValueAfterReplacingWithSumOfPrimeFactors;

import junit.framework.TestCase;

public class SmallestValueAfterReplacingWithSumOfPrimeFactorsLeetCodeTest extends TestCase {

    public void testSmallestValue() {
        int smallestValue = new SmallestValueAfterReplacingWithSumOfPrimeFactorsLeetCode().smallestValue(15);

        assertEquals(5, smallestValue);
    }
}