package kz.home.ys.algo.easy.luckyNumberInAMatrix;

import junit.framework.TestCase;

import java.util.List;

public class LuckyNumberInAMatrixTest extends TestCase {

    public void testLuckyNumbers() {
        List<Integer> result = new LuckyNumberInAMatrix().luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});

        assertEquals(1, result.size());
        assertEquals(15, result.get(0).intValue());
    }
}