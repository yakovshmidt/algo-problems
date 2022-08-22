package kz.home.ys.algo.hard.findMedianFromDataStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianFinderTest {

    @Test
    public void testFindMedian() {
        MedianFinder medianFinder = new MedianFinder();
        assertEquals(0.00000, medianFinder.findMedian(), 5);
        medianFinder.addNum(1);
        assertEquals(1.00000, medianFinder.findMedian(), 5);
        medianFinder.addNum(2);
        assertEquals(1.50000, medianFinder.findMedian(), 5);
        medianFinder.addNum(3);
        assertEquals(2.00000, medianFinder.findMedian(), 5);
        medianFinder.addNum(4);
        assertEquals(2.50000, medianFinder.findMedian(), 5);
        medianFinder.addNum(5);
        assertEquals(3.00000, medianFinder.findMedian(), 5);
        medianFinder.addNum(6);
        assertEquals(3.50000, medianFinder.findMedian(), 5);
        medianFinder.addNum(7);
        assertEquals(4.00000, medianFinder.findMedian(), 5);
        medianFinder.addNum(8);
        assertEquals(4.50000, medianFinder.findMedian(), 5);
        medianFinder.addNum(9);
        assertEquals(5.00000, medianFinder.findMedian(), 5);
        medianFinder.addNum(10);
        assertEquals(5.50000, medianFinder.findMedian(), 5);
    }
}