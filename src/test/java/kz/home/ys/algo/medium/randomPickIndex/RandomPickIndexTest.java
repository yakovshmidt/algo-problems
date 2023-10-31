package kz.home.ys.algo.medium.randomPickIndex;

import junit.framework.TestCase;

import java.util.List;

public class RandomPickIndexTest extends TestCase {

    public void testPick() {
        List<Integer> threeIndices = List.of(2, 3, 4);
        RandomPickIndex randomPickIndex = new RandomPickIndex(new int[]{1, 2, 3, 3, 3});

        assertTrue(threeIndices.contains(randomPickIndex.pick(3)));
        assertEquals(0, randomPickIndex.pick(1));
        assertTrue(threeIndices.contains(randomPickIndex.pick(3)));
    }
}