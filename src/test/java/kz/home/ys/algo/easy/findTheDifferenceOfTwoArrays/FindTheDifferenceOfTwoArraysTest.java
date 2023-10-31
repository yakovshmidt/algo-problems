package kz.home.ys.algo.easy.findTheDifferenceOfTwoArrays;

import junit.framework.TestCase;

import java.util.List;

public class FindTheDifferenceOfTwoArraysTest extends TestCase {

    public void testFindDifference() {
        List<List<Integer>> difference = new FindTheDifferenceOfTwoArrays().findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});

        assertEquals(1,difference.get(0).size());
        assertEquals(3,difference.get(0).get(0).intValue());
        assertEquals(0,difference.get(0).size());
    }
}