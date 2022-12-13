package kz.home.ys.algo.google.hard.oddEvenJump;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddEvenJumpsTest {

    @Test
    public void testOddEvenJumps() {
        int jumps = new OddEvenJumps().oddEvenJumps(new int[]{10, 13, 12, 14, 15});

        assertEquals(2, jumps);
    }
}