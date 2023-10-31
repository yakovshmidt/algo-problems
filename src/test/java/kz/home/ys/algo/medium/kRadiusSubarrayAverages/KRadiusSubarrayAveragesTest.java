package kz.home.ys.algo.medium.kRadiusSubarrayAverages;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class KRadiusSubarrayAveragesTest extends TestCase {

    public void testGetAverages() {
        int[] expected = new int[]{-1, -1, -1, 5, 4, 4, -1, -1, -1};

        int[] actual = new KRadiusSubarrayAverages().getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3);

        assertArrays(expected, actual);
    }
}