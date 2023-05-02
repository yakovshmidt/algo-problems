package kz.home.ys.algo.easy.findTargetIndicesAfterSortingArray;

import junit.framework.TestCase;

import java.util.List;

public class FindTargetIndicesAfterSortingArrayTest extends TestCase {

    public void testTargetIndices() {
        List<Integer> targetIndices = new FindTargetIndicesAfterSortingArray().targetIndices(new int[]{1, 2, 5, 2, 3}, 2);

        assertEquals(2,targetIndices.size());
        assertEquals(1, targetIndices.get(0).intValue());
        assertEquals(2, targetIndices.get(1).intValue());
    }
}