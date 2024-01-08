package kz.home.ys.algo.medium.waterAndJugProblem;

import junit.framework.TestCase;

public class WaterAndJugProblemTest extends TestCase {

    public void testCanMeasureWater() {
        boolean result = new WaterAndJugProblem().canMeasureWater(3, 5, 4);

        assertTrue(result);
    }
}