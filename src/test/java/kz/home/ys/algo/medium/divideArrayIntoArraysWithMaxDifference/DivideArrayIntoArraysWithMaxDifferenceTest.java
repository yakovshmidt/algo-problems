package kz.home.ys.algo.medium.divideArrayIntoArraysWithMaxDifference;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class DivideArrayIntoArraysWithMaxDifferenceTest extends TestCase {

    public void testDivideArray() {
        int[][] expected = new int[][] {{1,1,3}, {3,4,5}, {7,8,9}};

        int[][] actual = new DivideArrayIntoArraysWithMaxDifference().divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2);

        assertMatrices(expected, actual);
    }
}