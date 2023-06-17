package kz.home.ys.algo.easy.numberOfSegmentsInAString;

import junit.framework.TestCase;

public class NumberOfSegmentsInAStringTest extends TestCase {

    public void testCountSegments() {
        int segmentsCount = new NumberOfSegmentsInAString().countSegments("Hello, my name is John");

        assertEquals(5, segmentsCount);
    }
}