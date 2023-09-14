package kz.home.ys.algo.hard.slidingWindowMedian;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SlidingWindowMedianWithTwoHeapsTest extends TestCase {

    public void testMedianSlidingWindow() {
        double[] expected = new double[]{1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000};

        double[] actual = new SlidingWindowMedianWithTwoHeaps().medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

        assertArrays(expected, actual);
    }

    public void testMedianSlidingWindow2() {
        double[] expected = new double[]{2.50000};

        double[] actual = new SlidingWindowMedianWithTwoHeaps().medianSlidingWindow(new int[]{1,4,2,3}, 4);

        assertArrays(expected, actual);
    }

    public void testMedianSlidingWindow3() {
        double[] expected = new double[]{8.00000,6.00000,8.00000,8.00000,5.00000};

        double[] actual = new SlidingWindowMedianWithTwoHeaps().medianSlidingWindow(new int[]{7,0,3,9,9,9,1,7,2,3}, 6);

        assertArrays(expected, actual);
    }
}