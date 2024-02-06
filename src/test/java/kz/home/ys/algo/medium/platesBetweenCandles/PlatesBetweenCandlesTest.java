package kz.home.ys.algo.medium.platesBetweenCandles;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class PlatesBetweenCandlesTest extends TestCase {

    public void testPlatesBetweenCandles() {
        int[] expected = new int[]{9, 0, 0, 0, 0};

        int[] actual = new PlatesBetweenCandles().platesBetweenCandles("***|**|*****|**||**|*", new int[][]{{1, 17}, {4, 5}, {14, 17}, {5, 11}, {15, 16}});

        assertArrays(expected, actual);
    }
}