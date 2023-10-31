package kz.home.ys.algo.medium.stringWithoutAAAOrBBB;

import junit.framework.TestCase;

public class StringWithoutAAAOrBBBTest extends TestCase {

    public void testStrWithout3a3b() {
        String result = new StringWithoutAAAOrBBB().strWithout3a3b(4, 1);

        assertEquals("aabaa", result);
    }
}