package kz.home.ys.algo.hard.nextPalindromeUsingSameDigits;

import junit.framework.TestCase;

public class NextPalindromeUsingSameDigitsTest extends TestCase {

    public void testNextPalindrome() {
        String result = new NextPalindromeUsingSameDigits().nextPalindrome("1221");

        assertEquals("2112", result);
    }
}