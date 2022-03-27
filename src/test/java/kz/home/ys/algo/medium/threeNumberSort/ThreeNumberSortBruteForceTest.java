package kz.home.ys.algo.medium.threeNumberSort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeNumberSortBruteForceTest {

    @Test
    public void testThreeNumberSort() {
        var array = new int[]{1, 0, 0, -1, -1, 0, 1, 1};
        var order = new int[]{0, 1, -1};
        var expected = new int[]{0, 0, 0, 1, 1, 1, -1, -1};

        var actual = new ThreeNumberSortBruteForce().threeNumberSort(array, order);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}