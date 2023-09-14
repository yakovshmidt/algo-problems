package kz.home.ys.algo.medium.longestPalindromicSubsequenceII;

import junit.framework.TestCase;

public class LongestPalindromicSubsequenceIITest extends TestCase {

    public void testLongestPalindromeSubseq() {
        int result = new LongestPalindromicSubsequenceII().longestPalindromeSubseq("dcbccacdb");

        assertEquals(4, result);
    }
}