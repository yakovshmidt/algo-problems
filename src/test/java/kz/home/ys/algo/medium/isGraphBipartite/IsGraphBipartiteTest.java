package kz.home.ys.algo.medium.isGraphBipartite;

import junit.framework.TestCase;

public class IsGraphBipartiteTest extends TestCase {

    public void testIsBipartite() {
        boolean isBipartite = new IsGraphBipartite().isBipartite(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}});

        assertFalse(isBipartite);
    }
}