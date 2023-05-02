package kz.home.ys.algo.medium.findAPeakElementII;

import junit.framework.TestCase;

public class FindAPeakElementBinarySearchIITest extends TestCase {

    public void testFindPeakGrid() {
        int[] peakGrid = new FindAPeakElementBinarySearchII().findPeakGrid(new int[][]{{1, 4}, {3, 2}});

        assertEquals(1, peakGrid[0]);
        assertEquals(0, peakGrid[1]);
    }
}