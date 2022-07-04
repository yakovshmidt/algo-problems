package kz.home.ys.algo.easy.countingBits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingBitsTest   {

    @Test
    public void testCountBits() {
        int[] result = new CountingBits().countBits(5);

        assertEquals(6, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        assertEquals(1, result[2]);
        assertEquals(2, result[3]);
        assertEquals(1, result[4]);
        assertEquals(2, result[5]);
    }
}