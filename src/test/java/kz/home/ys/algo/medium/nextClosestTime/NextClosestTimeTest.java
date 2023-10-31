package kz.home.ys.algo.medium.nextClosestTime;

import junit.framework.TestCase;

public class NextClosestTimeTest extends TestCase {

    public void testNextClosestTime() {
        String result = new NextClosestTime().nextClosestTime("23:59");

        assertEquals(result, "22:22");
    }
}