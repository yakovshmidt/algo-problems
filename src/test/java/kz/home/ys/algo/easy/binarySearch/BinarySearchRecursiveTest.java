package kz.home.ys.algo.easy.binarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchRecursiveTest {

    @Test
    public void testSearch() {
        int expected = 4;

        int actual = new BinarySearchRecursive().search(new int[]{-1, 0, 3, 5, 9, 12}, 9);

        assertEquals(expected, actual);
    }
}