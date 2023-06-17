package kz.home.ys.algo.easy.validPalindromeII;

import junit.framework.TestCase;

public class ValidPalindromeIITest extends TestCase {

    public void testValidPalindrome() {
        boolean isValidPalindrome = new ValidPalindromeII().validPalindrome("abca");

        assertTrue(isValidPalindrome);
    }
}