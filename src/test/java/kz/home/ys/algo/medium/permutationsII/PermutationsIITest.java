package kz.home.ys.algo.medium.permutationsII;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PermutationsIITest {

    @Test
    public void testPermuteUnique() {
        List<List<Integer>> permutations = new PermutationsII().permuteUnique(new int[]{1, 1, 2});

        assertEquals(3, permutations.size());
    }
}