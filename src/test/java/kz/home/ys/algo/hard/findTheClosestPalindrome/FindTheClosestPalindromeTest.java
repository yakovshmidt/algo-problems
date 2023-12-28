package kz.home.ys.algo.hard.findTheClosestPalindrome;

import junit.framework.TestCase;

public class FindTheClosestPalindromeTest extends TestCase {

    public void testNearestPalindromic() {
        String result = new FindTheClosestPalindrome().nearestPalindromic("123");

        assertEquals("121", result);
    }
}