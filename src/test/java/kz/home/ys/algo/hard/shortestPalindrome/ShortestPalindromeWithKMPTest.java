package kz.home.ys.algo.hard.shortestPalindrome;

import junit.framework.TestCase;

public class ShortestPalindromeWithKMPTest extends TestCase {

    public void testShortestPalindrome() {
        String result = new ShortestPalindromeWithKMP().shortestPalindrome("aacecaaa");

        assertEquals("aaacecaaa", result);
    }
}