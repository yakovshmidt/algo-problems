package kz.home.ys.algo.medium.new21Game;

import junit.framework.TestCase;

public class New21GameTest extends TestCase {

    public void testNew21Game() {
        double probability = new New21Game().new21Game(21, 17, 10);

        assertEquals(1.00, probability, 2);
    }
}