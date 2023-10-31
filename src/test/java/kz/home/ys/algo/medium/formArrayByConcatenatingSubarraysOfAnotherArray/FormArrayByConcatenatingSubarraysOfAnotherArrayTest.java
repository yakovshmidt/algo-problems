package kz.home.ys.algo.medium.formArrayByConcatenatingSubarraysOfAnotherArray;

import junit.framework.TestCase;

public class FormArrayByConcatenatingSubarraysOfAnotherArrayTest extends TestCase {

    public void testCanChoose() {
        boolean canChoose = new FormArrayByConcatenatingSubarraysOfAnotherArray().canChoose(
                new int[][]{{1, -1, -1}, {3, -2, 0}},
                new int[]{1, -1, 0, 1, -1, -1, 3, -2, 0}
        );

        assertTrue(canChoose);
    }
}