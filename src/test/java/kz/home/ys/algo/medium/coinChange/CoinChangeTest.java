package kz.home.ys.algo.medium.coinChange;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {

    @Test
    public void testCoinChange() {
        CoinChange coinChange = new CoinChange();

        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
        assertEquals(2, coinChange.coinChange(new int[]{1, 3, 4, 5}, 7));
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(0, coinChange.coinChange(new int[]{1}, 0));
    }
}