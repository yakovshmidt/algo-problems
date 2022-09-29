package kz.home.ys.algo.hard.maximalRectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalRectangleTest {

    @Test
    public void testMaximalRectangle() {
        int maximalRectangle1 = new MaximalRectangle().maximalRectangle(
                new char[][]{
                        {'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}}
        );

        assertEquals(6, maximalRectangle1);

        int maximalRectangle2 = new MaximalRectangle().maximalRectangle(
                new char[][]{
                        {'1', '0'},
                        {'0', '1'}}
        );

        assertEquals(1, maximalRectangle2);
    }
}