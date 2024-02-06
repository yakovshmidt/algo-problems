package kz.home.ys.algo.medium.findOriginalArrayFromDoubledArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class FindOriginalArrayFromDoubledArrayUsingCountingSortTest extends TestCase {

    public void testFindOriginalArray() {
        int[] expected = new int[]{1, 3, 4};

        int[] actual = new FindOriginalArrayFromDoubledArrayUsingCountingSort().findOriginalArray(new int[]{1, 3, 4, 2, 6, 8});

        assertArrays(expected, actual);
    }
}