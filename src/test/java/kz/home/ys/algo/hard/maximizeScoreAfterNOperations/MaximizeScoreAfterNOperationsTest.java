package kz.home.ys.algo.hard.maximizeScoreAfterNOperations;

import junit.framework.TestCase;

public class MaximizeScoreAfterNOperationsTest extends TestCase {

    public void testMaxScore() {
        int maxScore = new MaximizeScoreAfterNOperations().maxScore(new int[]{1,2,3,4,5,6});

        assertEquals(14, maxScore);
    }
}