package kz.home.ys.algo.medium.rangeSumQuery2DImmutable;

import junit.framework.TestCase;

public class NumMatrixTest extends TestCase {

    public void testSumRegion() {
        NumMatrix numMatrix = new NumMatrix(new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}});

        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
    }
}