package kz.home.ys.algo.medium.gasStation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasStationLeetCodeTest {

    @Test
    public void testCanCompleteCircuit() {
        int result = new GasStationLeetCode().canCompleteCircuit(new int[]{4, 5, 2, 6, 5, 3}, new int[]{3, 2, 7, 3, 2, 9});

        assertEquals(-1, result);
    }
}