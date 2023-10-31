package kz.home.ys.algo.medium.subsets;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class SubsetsUsingBitmaskTest extends TestCase {

    public void testSubsets() {
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(3),
                List.of(2),
                List.of(2, 3),
                List.of(1),
                List.of(1, 3),
                List.of(1, 2),
                List.of(1, 2, 3)
        );

        List<List<Integer>> actual = new SubsetsUsingBitmask().subsets(new int[]{1, 2, 3});

        assertMatrices(expected, actual);
    }
}