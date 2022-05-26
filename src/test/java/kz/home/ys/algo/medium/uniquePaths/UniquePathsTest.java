package kz.home.ys.algo.medium.uniquePaths;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    @Test
    public void testUniquePaths() {
        int uniquePaths = new UniquePaths().uniquePaths(3, 7);

        assertEquals(28, uniquePaths);
    }
}