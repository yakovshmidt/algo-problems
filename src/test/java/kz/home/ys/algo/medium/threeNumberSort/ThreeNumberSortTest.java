package kz.home.ys.algo.medium.threeNumberSort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeNumberSortTest {

    @Test
    public void testThreeNumberSort() {
        var array = new int[]{1, 0, 0, -1, -1, 0, 1, 1};
        var order = new int[]{0, 1, -1};
        var expected = new int[]{0, 0, 0, 1, 1, 1, -1, -1};

        var actual = new ThreeNumberSort().threeNumberSort(array, order);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testThreeNumberSort_arrayDoesNotContainOneElement() {
        var array = new int[]{-2, -3, -3, -3, -3, -3, -2, -2, -3};
        var order = new int[]{-2, -3, 0};
        var expected = new int[]{-2, -2, -2, -3, -3, -3, -3, -3, -3};

        var actual = new ThreeNumberSort().threeNumberSort(array, order);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}