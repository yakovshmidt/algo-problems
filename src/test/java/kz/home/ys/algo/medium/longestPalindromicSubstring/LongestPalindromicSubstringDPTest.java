package kz.home.ys.algo.medium.longestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringDPTest {

    @Test
    public void testLongestPalindrome() {
        String longestPalindrome = new LongestPalindromicSubstringDP().longestPalindrome("abbccbc");

        assertEquals("bccb", longestPalindrome);
    }
}