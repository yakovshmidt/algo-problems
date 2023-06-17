package kz.home.ys.algo.easy.rankTransformOfAnArray;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class RankTransformOfAnArrayTest extends TestCase {

    public void testArrayRankTransform() {
        int[] expected = new int[]{4, 1, 2, 3};

        int[] actual = new RankTransformOfAnArray().arrayRankTransform(new int[]{40, 10, 20, 30});

        assertArrays(expected, actual);
    }
}