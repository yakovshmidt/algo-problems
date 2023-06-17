package kz.home.ys.algo.easy.uglyNumber;

import junit.framework.TestCase;

public class UglyNumberTest extends TestCase {

    public void testIsUgly() {
        boolean isUgly = new UglyNumber().isUgly(6);

        assertTrue(isUgly);
    }
}