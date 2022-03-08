package kz.home.ys.algo.medium.longestCommonPalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPalindromeDynamicProgrammingTest {

    @Test
    public void testLongestPalindrome() {
        String palindrome = new LongestCommonPalindromeDynamicProgramming().longestPalindrome("babad");

        assertEquals("bab", palindrome);
    }
}