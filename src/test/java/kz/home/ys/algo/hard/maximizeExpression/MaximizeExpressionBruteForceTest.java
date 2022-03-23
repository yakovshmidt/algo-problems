package kz.home.ys.algo.hard.maximizeExpression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximizeExpressionBruteForceTest {

    @Test
    public void testMaximizeExpression() {
        int expected = 4;

        int actual = new MaximizeExpressionBruteForce().maximizeExpression(new int[]{3, 6, 1, -3, 2, 7});

        assertEquals(expected, actual);
    }
}