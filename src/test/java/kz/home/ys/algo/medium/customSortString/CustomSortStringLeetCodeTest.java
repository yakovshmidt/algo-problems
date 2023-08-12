package kz.home.ys.algo.medium.customSortString;

import junit.framework.TestCase;

public class CustomSortStringLeetCodeTest extends TestCase {

    public void testCustomSortString() {
        String result = new CustomSortStringLeetCode().customSortString("cba", "abcd");

        assertEquals("cbad", result);
    }
}