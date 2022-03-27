package kz.home.ys.algo.easy.countOddNumbersInIntervalRange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOddNumbersInIntervalRangeTest {

    @Test
    public void testCountOdds() {
        int expected = 3;

        int actual = new CountOddNumbersInIntervalRange().countOdds(3, 7);

        assertEquals(expected, actual);
    }
}