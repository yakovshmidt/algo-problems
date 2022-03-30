package kz.home.ys.algo.easy.moveZeroes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveZeroesTest {

    @Test
    public void testMoveZeroes() {
        int[] expected = {1, 3, 12, 0, 0};
        int[] actual = {0, 1, 0, 3, 12};

        new MoveZeroes().moveZeroes(actual);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}