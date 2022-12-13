package kz.home.ys.algo.google.medium.fruitIntoBasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitIntoBasketSlidingWindowTest {

    @Test
    public void testTotalFruit() {
        int totalFruit = new FruitIntoBasketSlidingWindow().totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4});

        assertEquals(5, totalFruit);
    }
}