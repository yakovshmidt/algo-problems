package kz.home.ys.algo.medium.maximumElementAfterDecreasingAndRearranging;

import junit.framework.TestCase;

public class MaximumElementAfterDecreasingAndRearrangingTest extends TestCase {

    public void testMaximumElementAfterDecrementingAndRearranging() {
        int result = new MaximumElementAfterDecreasingAndRearranging().maximumElementAfterDecrementingAndRearranging(new int[]{3, 1, 3, 3, 3});

        assertEquals(3, result);
    }
}