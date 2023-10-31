package kz.home.ys.algo.medium.maximumSubsequenceScore;

import junit.framework.TestCase;

public class MaximumSubsequenceScoreTest extends TestCase {

    public void testMaxScore() {
        long maxScore = new MaximumSubsequenceScore().maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3);

        assertEquals(12, maxScore);
    }
}