package kz.home.ys.algo.google.googleInterviewLeetCodePremium.dynamicProgramming.longestPalindromicSubstring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringDPTest {

    @Test
    public void testLongestPalindrome() {
        String longestPalindrome = new LongestPalindromicSubstringDP().longestPalindrome("baba");

        assertEquals("bab", longestPalindrome);
    }
}