package kz.home.ys.algo.medium.wiggleSort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WiggleSortTest {

    @Test
    public void testWiggleSort() {
        int[] actual = {6, 6, 5, 6, 3, 8};
        int[] expected = {6, 6, 5, 6, 3, 8};

        new WiggleSort().wiggleSort(actual);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}