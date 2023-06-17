package kz.home.ys.algo.easy.longestHarmoniousSubsequence;

import junit.framework.TestCase;

public class LongestHarmoniousSubsequenceTest extends TestCase {

    public void testFindLHS() {
        int lhs = new LongestHarmoniousSubsequence().findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7});

        assertEquals(5, lhs);
    }
}