package kz.home.ys.algo.easy.addBinary;

import junit.framework.TestCase;

public class AddBinaryTest extends TestCase {

    public void testAddBinary() {
        String result = new AddBinary().addBinary("1010", "1011");

        assertEquals("10101", result);
    }
}