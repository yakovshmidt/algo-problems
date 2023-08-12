package kz.home.ys.algo.easy.intersectionOfTwoArrays;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class IntersectionOfTwoArraysTest extends TestCase {

    public void testIntersection() {
        int[] expected = new int[]{2};

        int[] actual = new IntersectionOfTwoArrays().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        assertArrays(expected, actual);
    }
}