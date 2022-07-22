package kz.home.ys.algo.medium.setMatrixZeroes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetMatrixZeroesTest {

    @Test
    public void testSetZeroes() {
        int[][] actual = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        new SetMatrixZeroes().setZeroes(actual);

        int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[0].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}