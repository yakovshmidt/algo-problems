package kz.home.ys.algo.medium.combinationSum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumTest {

    @Test
    public void testCombinationSum() {
        List<List<Integer>> allUniqueCombinations = new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7);

        assertEquals(2, allUniqueCombinations.size());
        assertEquals(3, allUniqueCombinations.get(0).size());
        assertEquals(1, allUniqueCombinations.get(1).size());
        assertEquals(2, allUniqueCombinations.get(0).get(0).intValue());
        assertEquals(2, allUniqueCombinations.get(0).get(1).intValue());
        assertEquals(3, allUniqueCombinations.get(0).get(2).intValue());
        assertEquals(7, allUniqueCombinations.get(1).get(0).intValue());
    }
}