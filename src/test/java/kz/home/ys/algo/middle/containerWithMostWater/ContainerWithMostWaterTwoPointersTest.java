package kz.home.ys.algo.middle.containerWithMostWater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTwoPointersTest {

    @Test
    public void testMaxArea() {
        int maxArea = new ContainerWithMostWaterTwoPointers().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        assertEquals(49, maxArea);
    }
}