package kz.home.ys.algo.hard.numbersInPi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersInPiTest {

    private static final String PI = "3141592653589793238462643383279";

    @Test
    public void testNumbersInPi() {
        String[] numbers = new String[]{
                "314159265358979323846",
                "26433",
                "8",
                "3279",
                "314159265",
                "35897932384626433832",
                "79"
        };
        int expected = 2;

        int actual = new NumbersInPi().numbersInPi(PI, numbers);

        assertEquals(expected, actual);
    }
}