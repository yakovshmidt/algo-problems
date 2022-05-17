package kz.home.ys.algo.medium.numberOfProvinces;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberOfProvincesTest {

    @Test
    public void testFindCircleNum() {
        int numberOfProvinces = new NumberOfProvinces().findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});

        assertEquals(2, numberOfProvinces);
    }
}