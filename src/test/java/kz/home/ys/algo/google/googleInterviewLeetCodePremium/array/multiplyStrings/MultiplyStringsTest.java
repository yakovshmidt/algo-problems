package kz.home.ys.algo.google.googleInterviewLeetCodePremium.array.multiplyStrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringsTest   {

    @Test
    public void testMultiply() {
        String result = new MultiplyStrings().multiply("123", "456");

        assertEquals("56088", result);
    }
}