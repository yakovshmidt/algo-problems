package kz.home.ys.algo.google.array;

import kz.home.ys.algo.google.googleInterviewLeetCodePremium.array.nextPermutation.NextPermutationLeetCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextPermutationLeetCodeTest {


    @Test
    public void testNextPermutation1() {
        int[] actual = {3, 2, 1};
        int[] expected = {1, 2, 3};

        new NextPermutationLeetCode().nextPermutation(actual);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testNextPermutation2() {
        int[] actual = {1, 3, 2};
        int[] expected = {2, 1, 3};

        new NextPermutationLeetCode().nextPermutation(actual);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}