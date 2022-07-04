package kz.home.ys.algo.easy.climbingStairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();

        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(8, climbingStairs.climbStairs(5));
    }
}