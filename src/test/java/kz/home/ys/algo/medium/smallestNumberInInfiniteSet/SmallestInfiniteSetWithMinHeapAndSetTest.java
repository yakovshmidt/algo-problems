package kz.home.ys.algo.medium.smallestNumberInInfiniteSet;

import junit.framework.TestCase;

public class SmallestInfiniteSetWithMinHeapAndSetTest extends TestCase {

    public void testSmallestInfiniteSetWithMinHeapAndSet() {
        SmallestInfiniteSetWithMinHeapAndSet smallestInfiniteSetWithMinHeapAndSet = new SmallestInfiniteSetWithMinHeapAndSet();

        smallestInfiniteSetWithMinHeapAndSet.addBack(2);
        assertEquals(1, smallestInfiniteSetWithMinHeapAndSet.popSmallest());
        assertEquals(2, smallestInfiniteSetWithMinHeapAndSet.popSmallest());
        assertEquals(3, smallestInfiniteSetWithMinHeapAndSet.popSmallest());
        smallestInfiniteSetWithMinHeapAndSet.addBack(1);
        assertEquals(1, smallestInfiniteSetWithMinHeapAndSet.popSmallest());
        assertEquals(4, smallestInfiniteSetWithMinHeapAndSet.popSmallest());
        assertEquals(5, smallestInfiniteSetWithMinHeapAndSet.popSmallest());
    }
}