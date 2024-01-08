package kz.home.ys.algo.medium.waterAndJugProblem;

import junit.framework.TestCase;

public class WaterAndJugProblemUsingMathTest extends TestCase {

    public void testCanMeasureWater() {
        boolean result = new WaterAndJugProblem().canMeasureWater(3, 4, 5);

        assertTrue(result);
    }
}