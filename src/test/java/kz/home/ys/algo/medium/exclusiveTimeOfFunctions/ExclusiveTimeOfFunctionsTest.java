package kz.home.ys.algo.medium.exclusiveTimeOfFunctions;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class ExclusiveTimeOfFunctionsTest extends TestCase {

    public void testExclusiveTime() {
        int[] expected = new int[]{3, 4};

        int[] actual = new ExclusiveTimeOfFunctions().exclusiveTime(2, List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6"));

        assertArrays(expected, actual);
    }
}