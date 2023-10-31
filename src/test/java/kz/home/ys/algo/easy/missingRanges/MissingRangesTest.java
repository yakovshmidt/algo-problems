package kz.home.ys.algo.easy.missingRanges;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class MissingRangesTest extends TestCase {

    public void testFindMissingRanges() {
        List<List<Integer>> expected = List.of(
                List.of(2, 2),
                List.of(4, 49),
                List.of(51, 74),
                List.of(76, 99)
        );

        List<List<Integer>> actual = new MissingRanges().findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);

        assertMatrices(expected, actual);
    }
}