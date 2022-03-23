package kz.home.ys.algo.hard.maximizeExpression;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximizeExpressionDynamicProgrammingTest {

    @Test
    public void testMaximizeExpression() {
        int expected = 4;

        int actual = new MaximizeExpressionDynamicProgramming().maximizeExpression(new int[]{3, 6, 1, -3, 2, 7});

        assertEquals(expected, actual);
    }
}