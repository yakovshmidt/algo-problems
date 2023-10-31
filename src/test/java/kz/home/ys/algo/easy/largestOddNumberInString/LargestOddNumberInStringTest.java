package kz.home.ys.algo.easy.largestOddNumberInString;

import junit.framework.TestCase;

public class LargestOddNumberInStringTest extends TestCase {

    public void testLargestOddNumber() {
        String result = new LargestOddNumberInString().largestOddNumber("35427");

        assertEquals("35427", result);
    }
}