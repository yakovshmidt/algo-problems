package kz.home.ys.algo.medium.longestCommonSubsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceDPTest {

    @Test
    public void testLongestCommonSubsequence() {
        int longestCommonSubsequence = new LongestCommonSubsequenceDP().longestCommonSubsequence("abcde", "abc");

        assertEquals(3, longestCommonSubsequence);
    }
}