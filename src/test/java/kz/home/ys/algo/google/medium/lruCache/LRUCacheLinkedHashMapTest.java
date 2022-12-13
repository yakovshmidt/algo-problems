package kz.home.ys.algo.google.medium.lruCache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheLinkedHashMapTest {

    @Test
    public void testLruCache() {
        LRUCacheLinkedHashMap lruCache = new LRUCacheLinkedHashMap(2);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        assertEquals(-1, lruCache.get(2));
        lruCache.put(4, 4);
        assertEquals(-1, lruCache.get(1));
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
    }
}