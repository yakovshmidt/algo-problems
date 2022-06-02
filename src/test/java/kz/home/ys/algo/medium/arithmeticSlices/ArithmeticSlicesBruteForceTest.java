package kz.home.ys.algo.medium.arithmeticSlices;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticSlicesBruteForceTest {

    @Test
    public void testNumberOfArithmeticSlices() {
        int numberOfArithmeticSlices = new ArithmeticSlicesBruteForce().numberOfArithmeticSlices(new int[]{1, 2, 3, 4});

        assertEquals(3, numberOfArithmeticSlices);
    }
}