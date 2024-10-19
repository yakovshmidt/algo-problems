package kz.home.ys.algo.medium.largestPalindromicNumber;

import junit.framework.TestCase;

public class LargestPalindromicNumberTest extends TestCase {

    public void testLargestPalindromic() {
        String result = new LargestPalindromicNumber().largestPalindromic("444947137");

        assertEquals("7449447", result);
    }

    public void testLargestPalindromic2() {
        String result = new LargestPalindromicNumber().largestPalindromic("00001105");

        assertEquals("1005001", result);
    }

    public void testLargestPalindromic3() {
        String result = new LargestPalindromicNumber().largestPalindromic("5736732");

        assertEquals("73637", result);
    }
}