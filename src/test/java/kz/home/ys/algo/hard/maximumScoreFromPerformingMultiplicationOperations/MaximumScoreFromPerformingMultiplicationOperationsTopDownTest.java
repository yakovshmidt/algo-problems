package kz.home.ys.algo.hard.maximumScoreFromPerformingMultiplicationOperations;

import junit.framework.TestCase;

public class MaximumScoreFromPerformingMultiplicationOperationsTopDownTest extends TestCase {

    public void testMaximumScore() {
        int maximumScore = new MaximumScoreFromPerformingMultiplicationOperationsTopDown().maximumScore(
                new int[]{-5, -3, -3, -2, 7, 1},
                new int[]{-10, -5, 3, 4, 6}
        );

        assertEquals(102, maximumScore);
    }
}