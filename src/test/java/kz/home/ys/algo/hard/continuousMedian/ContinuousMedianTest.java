package kz.home.ys.algo.hard.continuousMedian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContinuousMedianTest {

    @Test
    public void testContinuousMedian() {
        ContinuousMedian.ContinuousMedianHandler handler = new ContinuousMedian.ContinuousMedianHandler();
        handler.insert(5);
        handler.insert(10);
        handler.insert(100);
        handler.insert(200);
        handler.insert(6);
        assertEquals(10.0, handler.getMedian(), 0.0);
        handler.insert(13);
        assertEquals(11.5, handler.getMedian(), 0.0);
    }
}