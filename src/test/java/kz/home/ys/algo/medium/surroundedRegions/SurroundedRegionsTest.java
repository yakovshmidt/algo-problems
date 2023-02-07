package kz.home.ys.algo.medium.surroundedRegions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SurroundedRegionsTest {

    @Test
    public void testSolve() {
        char[][] actual = new char[][] {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] expected = new char[][] {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        new SurroundedRegions().solve(actual);

        for (int r = 0; r < expected.length; r++) {
            for (int c = 0; c < expected[0].length; c++) {
                assertEquals(expected[r][c], actual[r][c]);
            }
        }
    }
}