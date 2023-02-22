package kz.home.ys.algo.medium.sortColors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortColorsUsingSelectionSortTest {

    @Test
    public void testSortColors() {
        int[] expected = {0, 0, 1, 1, 2, 2};
        int[] actual = {2, 1, 0, 0, 1, 2};

        new SortColorsUsingSelectionSort().sortColors(actual);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}