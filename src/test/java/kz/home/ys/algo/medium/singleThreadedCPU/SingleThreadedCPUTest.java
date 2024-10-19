package kz.home.ys.algo.medium.singleThreadedCPU;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SingleThreadedCPUTest extends TestCase {

    public void testGetOrder() {
        int[] expected = new int[] {6,1,2,9,4,10,0,11,5,13,3,8,12,7};

        int[] actual = new SingleThreadedCPU().getOrder(new int[][]{{19, 13}, {16, 9}, {21, 10}, {32, 25}, {37, 4}, {49, 24}, {2, 15}, {38, 41}, {37, 34}, {33, 6}, {45, 4}, {18, 18}, {46, 39}, {12, 24}});

        assertArrays(expected, actual);
    }
}