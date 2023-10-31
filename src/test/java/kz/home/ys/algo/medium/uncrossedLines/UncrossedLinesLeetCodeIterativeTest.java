package kz.home.ys.algo.medium.uncrossedLines;

import junit.framework.TestCase;

public class UncrossedLinesLeetCodeIterativeTest extends TestCase {

    public void testMaxUncrossedLines() {
        int maxUncrossedLines = new UncrossedLinesLeetCodeIterative().maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2});

        assertEquals(3, maxUncrossedLines);
    }
}