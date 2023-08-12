package kz.home.ys.algo.hard.shortestPathToGetAllKeys;

import junit.framework.TestCase;

public class ShortestPathToGetAllKeysTest extends TestCase {

    public void testShortestPathAllKeys() {
        int result = new ShortestPathToGetAllKeys().shortestPathAllKeys(new String[]{"@.a..", "###.#", "b.A.B"});

        assertEquals(8, result);
    }
}