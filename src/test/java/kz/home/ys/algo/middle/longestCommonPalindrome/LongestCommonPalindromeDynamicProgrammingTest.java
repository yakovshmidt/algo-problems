package kz.home.ys.algo.middle.longestCommonPalindrome;

import kz.home.ys.algo.middle.longestCommonPalindrome.LongestCommonPalindromeDynamicProgramming;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPalindromeDynamicProgrammingTest {

    @Test
    public void testLongestPalindrome() {
        String palindrome = new LongestCommonPalindromeDynamicProgramming().longestPalindrome("babad");

        assertEquals("bab", palindrome);
    }
}