package kz.home.ys.algo.easy.strobogrammaticNumber;

import junit.framework.TestCase;

public class StrobogrammaticNumberTest extends TestCase {

    public void testIsStrobogrammatic() {
        boolean isStrobogrammatic = new StrobogrammaticNumber().isStrobogrammatic("69");

        assertTrue(isStrobogrammatic);
    }
}