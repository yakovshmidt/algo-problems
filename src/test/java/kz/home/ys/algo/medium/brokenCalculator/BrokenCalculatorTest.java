package kz.home.ys.algo.medium.brokenCalculator;

import junit.framework.TestCase;

public class BrokenCalculatorTest extends TestCase {

    public void testBrokenCalc() {
        int minNumberOfOperations = new BrokenCalculator().brokenCalc(5, 8);

        assertEquals(2, minNumberOfOperations);
    }
}