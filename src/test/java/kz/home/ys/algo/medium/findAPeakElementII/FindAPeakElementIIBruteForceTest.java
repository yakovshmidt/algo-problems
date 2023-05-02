package kz.home.ys.algo.medium.findAPeakElementII;

import junit.framework.TestCase;

public class FindAPeakElementIIBruteForceTest extends TestCase {

    public void testFindPeakGrid() {
        int[] peakGrid = new FindAPeakElementIIBruteForce().findPeakGrid(new int[][]{{1, 4}, {3, 2}});

        assertEquals(0, peakGrid[0]);
        assertEquals(1, peakGrid[1]);
    }
}