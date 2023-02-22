package kz.home.ys.algo.medium.countPrimes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrimesTest {

    @Test
    public void testCountPrimes() {
        CountPrimes countPrimes = new CountPrimes();

        assertEquals(4, countPrimes.countPrimes(10));
        assertEquals(0, countPrimes.countPrimes(0));
        assertEquals(0, countPrimes.countPrimes(1));
        assertEquals(0, countPrimes.countPrimes(2));
        assertEquals(1, countPrimes.countPrimes(3));
    }
}