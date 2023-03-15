package kz.home.ys.algo.medium.kthSmallestElementInASortedMatrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementInASortedMatrixTest {

    @Test
    public void testKthSmallest() {
        int kthSmallest = new KthSmallestElementInASortedMatrix().kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8);

        assertEquals(13, kthSmallest);
    }
}