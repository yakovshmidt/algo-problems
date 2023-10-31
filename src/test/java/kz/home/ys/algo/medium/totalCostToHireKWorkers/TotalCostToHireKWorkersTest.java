package kz.home.ys.algo.medium.totalCostToHireKWorkers;

import junit.framework.TestCase;

public class TotalCostToHireKWorkersTest extends TestCase {

    public void testTotalCost() {
        long totalCost = new TotalCostToHireKWorkers().totalCost(
                new int[]{10,1,11,10},
                2,
                1
        );

        assertEquals(11, totalCost);
    }
}