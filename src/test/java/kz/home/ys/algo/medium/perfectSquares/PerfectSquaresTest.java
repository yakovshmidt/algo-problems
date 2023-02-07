package kz.home.ys.algo.medium.perfectSquares;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerfectSquaresTest {

    @Test
    public void testNumSquares() {
        int minSumOfSquares = new PerfectSquares().numSquares(12);

        assertEquals(3, minSumOfSquares);
    }
}