package kz.home.ys.algo.medium.numberOfLongestIncreasingSubsequences;

import junit.framework.TestCase;

public class NumberOfLongestIncreasingSubsequencesTest extends TestCase {

    public void testFindNumberOfLIS() {
        int numberOfLIS = new NumberOfLongestIncreasingSubsequences().findNumberOfLIS(new int[]{1, 3, 5, 4, 7});

        assertEquals(2, numberOfLIS);
    }
}