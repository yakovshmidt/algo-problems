package kz.home.ys.algo.medium.widestPairOfIndicesWithEqualRangeSum;

import junit.framework.TestCase;

public class WidestPairOfIndicesWithEqualRangeSumTest extends TestCase {

    public void testWidestPairOfIndices() {
        int result = new WidestPairOfIndicesWithEqualRangeSum().widestPairOfIndices(new int[]{1, 1, 0, 1}, new int[]{0, 1, 1, 0});

        assertEquals(3, result);
    }
}