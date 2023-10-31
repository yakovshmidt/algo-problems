package kz.home.ys.algo.medium.nestedListWeightSum;

import junit.framework.TestCase;

import java.util.List;

public class NestedListWeightSumTest extends TestCase {

    public void testDepthSum() {
        int depthSum = new NestedListWeightSum().depthSum(List.of(
                new NestedInteger(1),
                new NestedInteger(
                        List.of(
                                new NestedInteger(4),
                                new NestedInteger(
                                        List.of(
                                                new NestedInteger(6)
                                        )
                                )
                        )
                )
        ));

        assertEquals(27, depthSum);
    }
}