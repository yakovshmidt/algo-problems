package kz.home.ys.algo.easy.squaresOfSortedArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquaresOfSortedArrayTest {

    @Test
    public void testSortedSquares() {
        int[] expected = new int[]{0, 1, 9, 16, 100};

        int[] actual = new SquaresOfSortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}