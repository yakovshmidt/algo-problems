package kz.home.ys.algo.easy.convertANumberToHexadecimal;

import junit.framework.TestCase;

public class ConvertANumberToHexadecimalTest extends TestCase {

    public void testToHex() {
        String result = new ConvertANumberToHexadecimal().toHex(26);

        assertEquals("1a", result);
    }

    public void testToHex2() {
        String result = new ConvertANumberToHexadecimal().toHex(-1);

        assertEquals("ffffffff", result);
    }
}