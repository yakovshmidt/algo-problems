package kz.home.ys.algo.medium.maximumWhiteTilesCoveredByACarpet;

import junit.framework.TestCase;

public class MaximumWhiteTilesCoveredByACarpetTest extends TestCase {

    public void testMaximumWhiteTiles() {
        int result = new MaximumWhiteTilesCoveredByACarpet().maximumWhiteTiles(
                new int[][]{{1, 5}, {10, 11}, {12, 18}, {20, 25}, {30, 32}},
                10
        );

        assertEquals(9, result);
    }
}