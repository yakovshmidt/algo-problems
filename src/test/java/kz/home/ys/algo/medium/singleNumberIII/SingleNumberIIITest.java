package kz.home.ys.algo.medium.singleNumberIII;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SingleNumberIIITest extends TestCase {

    public void testSingleNumber() {
        int[] expected = new int[]{3, 5};

        int[] actual = new SingleNumberIII().singleNumber(new int[]{1, 2, 1, 3, 2, 5});

        assertArrays(expected, actual);
    }
}