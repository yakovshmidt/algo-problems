package kz.home.ys.algo.medium.minimumNumberOfStepsToMakeTwoStringsAnagram;

import junit.framework.TestCase;

public class MinimumNumberOfStepsToMakeTwoStringsAnagramTest extends TestCase {

    public void testMinSteps() {
        int minSteps = new MinimumNumberOfStepsToMakeTwoStringsAnagram().minSteps("leetcode", "practice");

        assertEquals(5, minSteps);
    }
}