package kz.home.ys.algo.medium.designHitCounter;

import junit.framework.TestCase;

public class HitCounterTest extends TestCase {

    public void testDesignHitCounter() {
        HitCounter hitCounter = new HitCounter();
        hitCounter.hit(1);       // hit at timestamp 1.
        hitCounter.hit(2);       // hit at timestamp 2.
        hitCounter.hit(3);       // hit at timestamp 3.
        assertEquals(3, hitCounter.getHits(4));   // get hits at timestamp 4, return 3.
        hitCounter.hit(300);     // hit at timestamp 300.
        assertEquals(4, hitCounter.getHits(300)); // get hits at timestamp 300, return 4.
        assertEquals(3, hitCounter.getHits(301)); // get hits at timestamp 301, return 3.
    }
}