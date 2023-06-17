package kz.home.ys.algo.easy.longestPalindrome;

import junit.framework.TestCase;

public class LongestPalindromeTest extends TestCase {

    public void testLongestPalindrome() {
        int longestPalindrome = new LongestPalindrome().longestPalindrome("abccccdd");

        assertEquals(7, longestPalindrome);
    }
}