package kz.home.ys.algo.medium.shortestWordDistanceIII;

import junit.framework.TestCase;

public class ShortestWordDistanceTwoPointersTest extends TestCase {

    public void testShortestWordDistance() {
        int shortestWordDistance = new ShortestWordDistanceTwoPointers().shortestWordDistance(
                new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "makes",
                "coding"
        );

        assertEquals(1, shortestWordDistance);
    }
}