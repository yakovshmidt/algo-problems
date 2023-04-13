package kz.home.ys.algo.medium.integerBreak;

import junit.framework.TestCase;

public class IntegerBreakRecursiveTest extends TestCase {

    public void testIntegerBreak() {
        int brokenInteger = new IntegerBreakRecursive().integerBreak(10);

        assertEquals(36, brokenInteger);
    }
}