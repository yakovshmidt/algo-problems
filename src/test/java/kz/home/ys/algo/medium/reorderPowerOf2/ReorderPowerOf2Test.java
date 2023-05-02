package kz.home.ys.algo.medium.reorderPowerOf2;

import junit.framework.TestCase;

public class ReorderPowerOf2Test extends TestCase {

    public void testReorderedPowerOf2() {
        boolean canBeReordered = new ReorderPowerOf2().reorderedPowerOf2(10);

        assertFalse(canBeReordered);
    }
}