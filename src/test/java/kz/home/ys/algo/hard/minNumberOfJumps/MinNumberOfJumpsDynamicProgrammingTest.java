package kz.home.ys.algo.hard.minNumberOfJumps;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinNumberOfJumpsDynamicProgrammingTest {

    @Test
    public void testMinNumberOfJumps() {
        int numberOfJumps = new MinNumberOfJumpsDynamicProgramming().minNumberOfJumps(new int[]{3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3});

        assertEquals(4, numberOfJumps);
    }
}