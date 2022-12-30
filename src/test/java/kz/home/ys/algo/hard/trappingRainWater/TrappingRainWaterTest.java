package kz.home.ys.algo.hard.trappingRainWater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {

    @Test
    public void testTrap() {
        int trap = new TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});

        assertEquals(6, trap);
    }
}