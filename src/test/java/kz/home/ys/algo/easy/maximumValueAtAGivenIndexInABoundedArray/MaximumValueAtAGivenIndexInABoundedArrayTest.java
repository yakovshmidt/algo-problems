package kz.home.ys.algo.easy.maximumValueAtAGivenIndexInABoundedArray;

import junit.framework.TestCase;

public class MaximumValueAtAGivenIndexInABoundedArrayTest extends TestCase {

    public void testMaxValue() {
        int maxValue = new MaximumValueAtAGivenIndexInABoundedArray().maxValue(6, 1, 10);

        assertEquals(3, maxValue);
    }
}