package kz.home.ys.algo.medium.grayCode;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class GrayCodeWithIterationTest extends TestCase {

    public void testGrayCode() {
        List<Integer> expected = List.of(0, 1, 3, 2);

        List<Integer> actual = new GrayCodeWithIteration().grayCode(2);

        assertLists(expected, actual);
    }
}