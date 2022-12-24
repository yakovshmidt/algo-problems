package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.jumpGame;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class JumpGameBacktrackingTest {

    @Test
    public void testCanJump() {
        boolean canJump = new JumpGameBacktracking().canJump(new int[]{3, 2, 1, 0, 4});

        assertFalse(canJump);
    }
}