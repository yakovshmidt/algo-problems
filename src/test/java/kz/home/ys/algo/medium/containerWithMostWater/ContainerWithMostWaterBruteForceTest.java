package kz.home.ys.algo.medium.containerWithMostWater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterBruteForceTest {

    @Test
    public void testMaxArea() {
        int maxArea = new ContainerWithMostWaterBruteForce().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        assertEquals(49, maxArea);
    }
}