package kz.home.ys.algo.medium.removeKDigits;

import junit.framework.TestCase;

public class RemoveKDigitsTest extends TestCase {

    public void testRemoveKdigits() {
        String result = new RemoveKDigits().removeKdigits("1234567890", 9);

        assertEquals("0", result);
    }
}