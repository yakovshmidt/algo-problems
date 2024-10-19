package kz.home.ys.algo.easy.reverseVowelsOfAString;

import junit.framework.TestCase;

public class ReverseVowelsOfAStringTest extends TestCase {

    public void testReverseVowels() {
        String result = new ReverseVowelsOfAString().reverseVowels("leetcode");

        assertEquals("leotcede", result);
    }
}