package kz.home.ys.algo.medium.palindromicSubstrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringsTest {

    @Test
    public void testCountSubstrings() {
        int numberOfPalindromes = new PalindromicSubstrings().countSubstrings("abcba");

        assertEquals(7, numberOfPalindromes);
    }
}