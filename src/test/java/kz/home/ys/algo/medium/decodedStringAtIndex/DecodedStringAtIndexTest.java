package kz.home.ys.algo.medium.decodedStringAtIndex;

import junit.framework.TestCase;

public class DecodedStringAtIndexTest extends TestCase {

    public void testDecodeAtIndex1() {
        String result = new DecodedStringAtIndex().decodeAtIndex("leet2code3", 10);

        assertEquals("o", result);
    }

    public void testDecodeAtIndex2() {
        String result = new DecodedStringAtIndex().decodeAtIndex("a2b3c4d5e6f7g8h9", 10);

        assertEquals("c", result);
    }
}