package kz.home.ys.algo.medium.maximumXOROfTwoNumbersInAnArray;

import junit.framework.TestCase;

public class MaximumXOROfTwoNumbersInAnArrayWithSetTest extends TestCase {

    public void testFindMaximumXOR() {
        int result = new MaximumXOROfTwoNumbersInAnArrayWithSet().findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8});

        assertEquals(28, result);
    }
}