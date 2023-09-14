package kz.home.ys.algo.medium.minimumFuelCostToReportToTheCapital;

import junit.framework.TestCase;

public class MinimumFuelCostToReportToTheCapitalTest extends TestCase {

    public void testMinimumFuelCost() {
        long result = new MinimumFuelCostToReportToTheCapital()
                .minimumFuelCost(new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}}, 2);

        assertEquals(7, result);
    }
}