package kz.home.ys.algo.medium.minimumSumPath;

import junit.framework.TestCase;

public class MinimumSumPathLeetCodeTest extends TestCase {

    public void testMinPathSum() {
        int minPathSum = new MinimumSumPathLeetCode().minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});

        assertEquals(7, minPathSum);
    }
}