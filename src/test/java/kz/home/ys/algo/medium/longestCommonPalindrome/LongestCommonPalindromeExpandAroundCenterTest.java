package kz.home.ys.algo.medium.longestCommonPalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPalindromeExpandAroundCenterTest {

    @Test
    public void testLongestPalindrome() {
        String palindrome = new LongestCommonPalindromeExpandAroundCenter().longestPalindrome("babad");

        assertEquals("bab", palindrome);
    }
}