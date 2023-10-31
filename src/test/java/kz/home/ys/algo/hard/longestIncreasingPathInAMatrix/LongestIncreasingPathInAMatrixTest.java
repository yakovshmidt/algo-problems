package kz.home.ys.algo.hard.longestIncreasingPathInAMatrix;

import junit.framework.TestCase;

public class LongestIncreasingPathInAMatrixTest extends TestCase {

    public void testLongestIncreasingPath() {
        int result = new LongestIncreasingPathInAMatrix().longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}});

        assertEquals(4, result);
    }
}