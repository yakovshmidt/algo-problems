package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.plusOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusOneTest {

    @Test
    public void testPlusOne() {
        int[] expected = new int[]{4, 3, 2, 2};
        int[] actual = new PlusOne().plusOne(new int[]{4, 3, 2, 1});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testPlusOne_allNines() {
        int[] expected = new int[]{1, 0, 0, 0};
        int[] actual = new PlusOne().plusOne(new int[]{9, 9, 9});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}