package kz.home.ys.algo.medium.largestDivisibleSubset;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class LargestDivisibleSubsetTest extends TestCase {

    public void testLargestDivisibleSubset() {
        List<Integer> expected = List.of(3, 1);

        List<Integer> actual = new LargestDivisibleSubset().largestDivisibleSubset(new int[]{1, 2, 3});

        assertLists(expected, actual);
    }
}