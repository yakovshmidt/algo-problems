package kz.home.ys.algo.easy.addDigits;

import junit.framework.TestCase;

public class AddDigitsTest extends TestCase {

    public void testAddDigits() {
        int digits = new AddDigits().addDigits(38);

        assertEquals(2, digits);
    }
}