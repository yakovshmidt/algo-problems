package kz.home.ys.algo.hard.largestRectangleInHistogram;

import junit.framework.TestCase;

public class LargestRectangleInHistogramUsingStackTest extends TestCase {

    public void testLargestRectangleArea() {
        int largestRectangleArea = new LargestRectangleInHistogramUsingStack().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});

        assertEquals(10, largestRectangleArea);
    }
}