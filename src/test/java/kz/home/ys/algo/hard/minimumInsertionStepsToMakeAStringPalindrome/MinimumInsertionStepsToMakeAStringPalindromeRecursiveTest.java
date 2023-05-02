package kz.home.ys.algo.hard.minimumInsertionStepsToMakeAStringPalindrome;

import junit.framework.TestCase;

public class MinimumInsertionStepsToMakeAStringPalindromeRecursiveTest extends TestCase {

    public void testMinInsertions() {
        int minInsertions = new MinimumInsertionStepsToMakeAStringPalindromeRecursive().minInsertions("leetcode");

        assertEquals(5, minInsertions);
    }
}