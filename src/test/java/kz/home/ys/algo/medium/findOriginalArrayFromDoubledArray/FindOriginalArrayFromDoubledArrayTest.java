package kz.home.ys.algo.medium.findOriginalArrayFromDoubledArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class FindOriginalArrayFromDoubledArrayTest extends TestCase {

    public void testFindOriginalArray() {
        int[] expected = new int[]{1, 3, 4};

        int[] actual = new FindOriginalArrayFromDoubledArray().findOriginalArray(new int[]{1, 3, 4, 2, 6, 8});

        assertArrays(expected, actual);
    }
}