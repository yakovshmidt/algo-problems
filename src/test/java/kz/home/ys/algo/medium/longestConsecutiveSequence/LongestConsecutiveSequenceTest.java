package kz.home.ys.algo.medium.longestConsecutiveSequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutive() {
        int longestConsecutive = new LongestConsecutiveSequence().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});

        assertEquals(4, longestConsecutive);
    }
}