package kz.home.ys.algo.hard.slidingWindowMaximum;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SlidingWindowMaximumTest extends TestCase {

    public void testMaxSlidingWindow() {
        int[] expected = new int[]{3, 3, 5, 5, 6, 7};

        int[] actual = new SlidingWindowMaximum().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        assertArrays(expected, actual);
    }
}