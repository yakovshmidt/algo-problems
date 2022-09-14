package kz.home.ys.algo.medium.longestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringExpandAroundCenterTest {

    @Test
    public void testLongestPalindrome() {
        String oddLPS = new LongestPalindromicSubstringExpandAroundCenter().longestPalindrome("babad");
        String evenLPS = new LongestPalindromicSubstringExpandAroundCenter().longestPalindrome("cbbd");

        assertEquals("aba", oddLPS);
        assertEquals("bb", evenLPS);
    }
}