package kz.home.ys.algo.medium.threeSum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThreeSumHashTableTest {

    @Test
    public void testThreeSum() {
        List<List<Integer>> threeSum = new ThreeSumHashTable().threeSum(new int[]{-1, 0, 1, 2, -1, 4});

        assertEquals(2, threeSum.size());
        assertEquals(3, threeSum.get(0).size());
        assertEquals(3, threeSum.get(1).size());
        List<Integer> firstExpected = List.of(-1, -1, 2);
        assertTrue(firstExpected.containsAll(threeSum.get(0)) && threeSum.get(0).containsAll(firstExpected));
        List<Integer> secondExpected = List.of(-1, 0, 1);
        assertTrue(secondExpected.containsAll(threeSum.get(1)) && threeSum.get(1).containsAll(secondExpected));
    }
}