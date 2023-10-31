package kz.home.ys.algo.medium.solvingQuestionsWithBrainpower;

import junit.framework.TestCase;

public class SolvingQuestionsWithBrainpowerRecursiveTest extends TestCase {

    public void testMostPoints() {
        long mostPoints = new SolvingQuestionsWithBrainpowerRecursive().mostPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}});

        assertEquals(7, mostPoints);
    }
}