package kz.home.ys.algo.medium.integerBreak;

import junit.framework.TestCase;

public class IntegerBreakIterativeTest extends TestCase {

    public void testIntegerBreak() {
        int brokenInteger = new IntegerBreakIterative().integerBreak(10);

        assertEquals(36, brokenInteger);
    }
}