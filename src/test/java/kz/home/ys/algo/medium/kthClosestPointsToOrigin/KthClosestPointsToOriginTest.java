package kz.home.ys.algo.medium.kthClosestPointsToOrigin;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class KthClosestPointsToOriginTest extends TestCase {

    public void testKClosest() {
        int[][] expected = new int[][]{{-2, 2}};

        int[][] actual = new KthClosestPointsToOrigin().kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);

        assertMatrices(expected, actual);
    }

    public void testKClosest2() {
        int[][] expected = new int[][]{{-2, 4}, {3, 3}};

        int[][] actual = new KthClosestPointsToOrigin().kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);

        assertMatrices(expected, actual);
    }
}