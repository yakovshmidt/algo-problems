package kz.home.ys.algo.medium.longestPalindromicSubsequence;

import junit.framework.TestCase;

public class LongestPalindromicSubsequenceIterativeTest extends TestCase {

    public void testLongestPalindromeSubseq() {
        int longestPalindromeSubseq = new LongestPalindromicSubsequence().longestPalindromeSubseq("baabc");

        assertEquals(4, longestPalindromeSubseq);
    }
}