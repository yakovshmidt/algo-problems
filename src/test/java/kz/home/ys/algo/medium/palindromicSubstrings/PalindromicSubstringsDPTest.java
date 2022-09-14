package kz.home.ys.algo.medium.palindromicSubstrings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringsDPTest {

    @Test
    public void testCountSubstrings() {
        int countSubstrings = new PalindromicSubstrings().countSubstrings("aaa");

        assertEquals(6, countSubstrings);
    }
}