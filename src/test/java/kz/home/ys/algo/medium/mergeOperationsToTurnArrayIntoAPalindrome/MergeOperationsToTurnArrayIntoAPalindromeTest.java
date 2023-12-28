package kz.home.ys.algo.medium.mergeOperationsToTurnArrayIntoAPalindrome;

import junit.framework.TestCase;

public class MergeOperationsToTurnArrayIntoAPalindromeTest extends TestCase {

    public void testMinimumOperations() {
        int result = new MergeOperationsToTurnArrayIntoAPalindrome().minimumOperations(new int[]{4, 3, 2, 1, 2, 3, 1});

        assertEquals(2, result);
    }
}