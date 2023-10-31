package kz.home.ys.algo.medium.longestArithmeticSubsequence;

import junit.framework.TestCase;

public class LongestArithmeticSubsequenceTest extends TestCase {

    public void testLongestArithSeqLength() {
        int longestArithSeqLength = new LongestArithmeticSubsequence().longestArithSeqLength(new int[]{9, 4, 7, 2, 10});

        assertEquals(3, longestArithSeqLength);
    }
}