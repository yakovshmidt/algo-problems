package kz.home.ys.algo.easy.addDigits;

import junit.framework.TestCase;

public class AddDigitsDigitalRootTest extends TestCase {

    public void testAddDigits() {
        int digits = new AddDigitsDigitalRoot().addDigits(38);

        assertEquals(2, digits);
    }
}