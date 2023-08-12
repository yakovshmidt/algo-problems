package kz.home.ys.algo.medium.customSortString;

import junit.framework.TestCase;

public class CustomSortStringTest extends TestCase {

    public void testCustomSortString() {
        String result = new CustomSortString().customSortString("cba", "abcd");

        assertEquals("dcba", result);
    }
}