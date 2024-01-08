package kz.home.ys.algo.medium.rleIterator;

import junit.framework.TestCase;

public class RLEIteratorTest extends TestCase {

    public void testRLEIterator() {
        RLEIterator rleIterator = new RLEIterator(new int[]{3, 8, 0, 9, 2, 5});

        assertEquals(8, rleIterator.next(2));
        assertEquals(8, rleIterator.next(1));
        assertEquals(5, rleIterator.next(1));
        assertEquals(-1, rleIterator.next(2));
    }
}