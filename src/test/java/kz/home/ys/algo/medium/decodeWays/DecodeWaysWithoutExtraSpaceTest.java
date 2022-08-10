package kz.home.ys.algo.medium.decodeWays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeWaysWithoutExtraSpaceTest {

    @Test
    public void testNumDecodings() {
        int ways = new DecodeWays().numDecodings("226");

        assertEquals(3, ways);
    }
}