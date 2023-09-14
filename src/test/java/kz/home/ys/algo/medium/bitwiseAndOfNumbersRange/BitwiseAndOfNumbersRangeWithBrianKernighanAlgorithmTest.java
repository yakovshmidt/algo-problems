package kz.home.ys.algo.medium.bitwiseAndOfNumbersRange;

import junit.framework.TestCase;

public class BitwiseAndOfNumbersRangeWithBrianKernighanAlgorithmTest extends TestCase {

    public void testRangeBitwiseAnd() {
        int result = new BitwiseAndOfNumbersRangeWithBrianKernighanAlgorithm().rangeBitwiseAnd(5, 7);

        assertEquals(4, result);
    }
}