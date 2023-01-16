package kz.home.ys.algo.medium.countAndSay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAndSayRegularExpressionTest {

    @Test
    public void testCountAndSay() {
        String result = new CountAndSayRegularExpression().countAndSay(4);

        assertEquals("1211", result);
    }
}