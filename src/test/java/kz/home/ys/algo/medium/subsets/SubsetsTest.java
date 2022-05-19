package kz.home.ys.algo.medium.subsets;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SubsetsTest {

    @Test
    public void testSubsets() {
        List<List<Integer>> actualSubsets = new Subsets().subsets(new int[]{1, 2, 3});

        assertEquals(8, actualSubsets.size());
        assertEquals(0, actualSubsets.get(0).size());
        assertEquals(1, actualSubsets.get(1).size());
        assertEquals(1, actualSubsets.get(1).get(0).intValue());
        assertEquals(2, actualSubsets.get(2).size());
        assertEquals(1, actualSubsets.get(2).get(0).intValue());
        assertEquals(2, actualSubsets.get(2).get(1).intValue());
        assertEquals(3, actualSubsets.get(3).size());
        assertEquals(1, actualSubsets.get(3).get(0).intValue());
        assertEquals(2, actualSubsets.get(3).get(1).intValue());
        assertEquals(3, actualSubsets.get(3).get(2).intValue());
        assertEquals(2, actualSubsets.get(4).size());
        assertEquals(1, actualSubsets.get(4).get(0).intValue());
        assertEquals(3, actualSubsets.get(4).get(1).intValue());
        assertEquals(1, actualSubsets.get(5).size());
        assertEquals(2, actualSubsets.get(5).get(0).intValue());
        assertEquals(2, actualSubsets.get(6).size());
        assertEquals(2, actualSubsets.get(6).get(0).intValue());
        assertEquals(3, actualSubsets.get(6).get(1).intValue());
        assertEquals(1, actualSubsets.get(7).size());
        assertEquals(3, actualSubsets.get(7).get(0).intValue());
    }
}