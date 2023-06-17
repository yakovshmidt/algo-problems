package kz.home.ys.algo.easy.countNegativeNumbersInASortedMatrix;

import junit.framework.TestCase;

public class CountNegativeNumbersInASortedMatrixTest extends TestCase {

    public void testCountNegatives() {
        int negatives = new CountNegativeNumbersInASortedMatrix().countNegatives(
                new int[][]{
                        {4, 3, 2, -1},
                        {3, 2, 1, -1},
                        {1, 1, -1, -2},
                        {-1, -1, -2, -3}
                });

        assertEquals(8, negatives);
    }
}