package kz.home.ys.algo.hard.maximumValueOfKCoinsFromPiles;

import junit.framework.TestCase;

import java.util.List;

public class MaximumValueOfKCoinsFromPilesTest extends TestCase {

    public void testMaxValueOfCoins() {
        int maxValueOfCoins = new MaximumValueOfKCoinsFromPiles().maxValueOfCoins(
                List.of(
                        List.of(1, 100, 3),
                        List.of(7, 8, 9)
                ),
                2
        );

        assertEquals(101, maxValueOfCoins);
    }
}