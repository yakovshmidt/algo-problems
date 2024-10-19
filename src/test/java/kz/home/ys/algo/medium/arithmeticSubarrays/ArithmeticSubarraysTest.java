package kz.home.ys.algo.medium.arithmeticSubarrays;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertLists;

public class ArithmeticSubarraysTest extends TestCase {

    public void testCheckArithmeticSubarrays() {
        List<Boolean> expected = List.of(true, false, true);

        List<Boolean> actual = new ArithmeticSubarrays().checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5});

        assertLists(expected, actual);
    }
}