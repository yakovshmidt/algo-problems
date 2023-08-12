package kz.home.ys.algo.easy.arrangingCoins;

import junit.framework.TestCase;

public class ArrangingCoinsTest extends TestCase {

    public void testArrangeCoins() {
        int result = new ArrangingCoins().arrangeCoins(5);

        assertEquals(2, result);
    }
}