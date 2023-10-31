package kz.home.ys.algo.medium.basicCalculatorII;

import junit.framework.TestCase;

public class BasicCalculatorIITest extends TestCase {

    public void testCalculate() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();

        assertEquals(1, basicCalculatorII.calculate("1-1+1"));
        assertEquals(-2147483647, basicCalculatorII.calculate("0-2147483647"));
        assertEquals(42, basicCalculatorII.calculate("42"));
        assertEquals(5, basicCalculatorII.calculate(" 3+5 / 2 "));
        assertEquals(7, basicCalculatorII.calculate("3+2*2"));
    }
}