package kz.home.ys.algo.medium.numberOfProvinces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfProvincesWithRankedDisjointSetTest {

    @Test
    public void testFindCircleNum() {
        int numberOfProvinces = new NumberOfProvincesWithRankedDisjointSet().findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});

        assertEquals(2, numberOfProvinces);
    }
}