package kz.home.ys.algo.medium.longestIncreasingSubsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequenceBSTTest {

    @Test
    public void testLengthOfLIS() {
        int lis = new LongestIncreasingSubsequenceBST().lengthOfLIS(new int[]{4, 10, 4, 3, 8, 9});

        assertEquals(3, lis);
    }
}