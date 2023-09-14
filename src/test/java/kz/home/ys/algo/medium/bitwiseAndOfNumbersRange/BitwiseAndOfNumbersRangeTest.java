package kz.home.ys.algo.medium.bitwiseAndOfNumbersRange;

import junit.framework.TestCase;

public class BitwiseAndOfNumbersRangeTest extends TestCase {

    public void testRangeBitwiseAnd() {
        int result = new BitwiseAndOfNumbersRange().rangeBitwiseAnd(5, 7);

        assertEquals(4, result);
    }
}