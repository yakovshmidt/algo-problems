package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.jumpGame;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class JumpGameGreedyTest {

    @Test
    public void testCanJump() {
        boolean canJump = new JumpGameGreedy().canJump(new int[]{3, 2, 1, 0, 4});

        assertFalse(canJump);
    }
}