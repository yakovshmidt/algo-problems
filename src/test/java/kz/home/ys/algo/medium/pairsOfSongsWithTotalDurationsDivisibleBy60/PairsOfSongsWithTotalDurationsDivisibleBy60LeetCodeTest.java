package kz.home.ys.algo.medium.pairsOfSongsWithTotalDurationsDivisibleBy60;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairsOfSongsWithTotalDurationsDivisibleBy60LeetCodeTest {

    @Test
    public void testNumPairsDivisibleBy60() {
        int actual = new PairsOfSongsWithTotalDurationsDivisibleBy60LeetCode().numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});

        assertEquals(3, actual);
    }
}