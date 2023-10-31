package kz.home.ys.algo.medium.minimumSumPath;

import junit.framework.TestCase;

public class MinimumSumPathTest extends TestCase {

    public void testMinPathSum() {
        int minPathSum = new MinimumSumPath().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});

        assertEquals(7, minPathSum);
    }
}