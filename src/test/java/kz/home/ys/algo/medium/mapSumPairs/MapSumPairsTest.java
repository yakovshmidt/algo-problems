package kz.home.ys.algo.medium.mapSumPairs;

import junit.framework.TestCase;

public class MapSumPairsTest extends TestCase {

    public void testMapSumPairs() {
        MapSumPairs mapSum = new MapSumPairs();
        mapSum.insert("apple", 3);
        assertEquals(3, mapSum.sum("ap"));
        mapSum.insert("app", 2);
        assertEquals(5, mapSum.sum("ap"));
    }
}