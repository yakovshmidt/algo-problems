package kz.home.ys.algo.easy.maxConsecutiveOnes;

import junit.framework.TestCase;

public class MaxConsecutiveOnesTest extends TestCase {

    public void testFindMaxConsecutiveOnes() {
        int maxConsecutiveOnes = new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});

        assertEquals(3, maxConsecutiveOnes);
    }
}