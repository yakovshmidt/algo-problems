package kz.home.ys.algo.medium.countAndSay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayTest {

    @Test
    public void testCountAndSay() {
        String result = new CountAndSay().countAndSay(4);

        assertEquals("1211", result);
    }
}