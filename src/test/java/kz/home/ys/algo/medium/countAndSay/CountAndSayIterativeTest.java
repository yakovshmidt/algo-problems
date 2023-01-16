package kz.home.ys.algo.medium.countAndSay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayIterativeTest {

    @Test
    public void testCountAndSay() {
        String result = new CountAndSayIterative().countAndSay(4);

        assertEquals("1211", result);
    }
}