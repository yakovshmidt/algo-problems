package kz.home.ys.algo.easy.intersectionOfTwoArraysII;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionOfTwoArraysIIUsingHashMapTest {

    @Test
    public void testIntersect() {
        int[] expected = new int[]{2, 2};
        int[] actual = new IntersectionOfTwoArraysIIUsingHashMap().intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}