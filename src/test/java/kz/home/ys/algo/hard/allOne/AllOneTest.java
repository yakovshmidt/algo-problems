package kz.home.ys.algo.hard.allOne;

import junit.framework.TestCase;

import java.util.PriorityQueue;

public class AllOneTest extends TestCase {

    public void testAllOne() {
        AllOne allOne = new AllOne();

        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("b");
        allOne.dec("b");
        allOne.dec("b");
        assertEquals("b", allOne.getMaxKey());
        assertEquals("a", allOne.getMinKey());
    }

    public void testAllOne2() {
        AllOne allOne = new AllOne();

        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.dec("b");
        allOne.dec("b");
        assertEquals("a", allOne.getMinKey());
        allOne.dec("a");
        assertEquals("c", allOne.getMaxKey());
        assertEquals("c", allOne.getMinKey());
    }
}