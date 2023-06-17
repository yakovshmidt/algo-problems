package kz.home.ys.algo.easy.reverseString;

import junit.framework.TestCase;

public class ReverseStringTest extends TestCase {

    public void testReverseString() {
        char[] expected = {'o', 'l', 'l', 'e', 'h' };
        char[] actual = {'h', 'e', 'l', 'l', 'o' };

        new ReverseString().reverseString(actual);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}