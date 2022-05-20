package kz.home.ys.algo.medium.combinationSumII;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CombinationSumIITest {

    @Test
    public void testCombinationSum2() {
        List<List<Integer>> allUniqueCombinations = new CombinationSumII().combinationSum2(new int[]{2, 5, 2, 2}, 4);

        assertEquals(1, allUniqueCombinations.size());
        assertEquals(2, allUniqueCombinations.get(0).size());
        assertEquals(2, allUniqueCombinations.get(0).get(0).intValue());
        assertEquals(2, allUniqueCombinations.get(0).get(1).intValue());
    }
}