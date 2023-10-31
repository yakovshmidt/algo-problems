package kz.home.ys.algo.medium.findKPairsWithSmallestSum;

import junit.framework.TestCase;

import java.util.List;

public class FindKPairsWithSmallestSumTest extends TestCase {

    public void testKSmallestPairs() {
        List<List<Integer>> result = new FindKPairsWithSmallestSum().kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);

        assertEquals(3, result.size());
    }
}