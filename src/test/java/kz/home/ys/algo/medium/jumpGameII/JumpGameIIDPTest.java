package kz.home.ys.algo.medium.jumpGameII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpGameIIDPTest {

    @Test
    public void testJump() {
        int minJumps = new JumpGameIIDP().jump(new int[]{2, 3, 0, 1, 4});

        assertEquals(2, minJumps);
    }
}