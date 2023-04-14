package kz.home.ys.algo.medium.longestPalindromicSubsequence;

import junit.framework.TestCase;

public class LongestPalindromicSubsequenceTest extends TestCase {

    public void testLongestPalindromeSubseq() {
        int longestPalindromeSubseq = new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab");

        assertEquals(4, longestPalindromeSubseq);
    }
}