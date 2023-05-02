package kz.home.ys.algo.hard.minimumInsertionStepsToMakeAStringPalindrome;

import junit.framework.TestCase;

public class MinimumInsertionStepsToMakeAStringPalindromeIterativeTest extends TestCase {

    public void testMinInsertions() {
        int minInsertions = new MinimumInsertionStepsToMakeAStringPalindromeIterative().minInsertions("leetcode");

        assertEquals(5, minInsertions);
    }
}