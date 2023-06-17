package kz.home.ys.algo.easy.selfDividingNumbers;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class SelfDividingNumbersTest extends TestCase {

    public void testSelfDividingNumbers() {
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);

        List<Integer> actual = new SelfDividingNumbers().selfDividingNumbers(1, 22);

        assertLists(expected, actual);
    }
}