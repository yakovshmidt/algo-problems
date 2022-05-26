package kz.home.ys.algo.medium.longestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome() {
        String oddLPS = new LongestPalindromicSubstring().longestPalindrome("babad");
        String evenLPS = new LongestPalindromicSubstring().longestPalindrome("cbbd");

        assertEquals("aba", oddLPS);
        assertEquals("bb", evenLPS);
    }
}