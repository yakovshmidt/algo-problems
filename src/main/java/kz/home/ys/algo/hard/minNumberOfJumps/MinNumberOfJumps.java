package kz.home.ys.algo.hard.minNumberOfJumps;

import java.util.Arrays;

class MinNumberOfJumps {

    // time - O(N^2)
    // space - O(N)
    public int minNumberOfJumps(int[] array) {
        int[] numberOfJumps = new int[array.length];
        Arrays.fill(numberOfJumps, Integer.MAX_VALUE);
        numberOfJumps[0] = 0;

        for (int j = 1; j < array.length; j++) {
            for (int i = 0; i < j; i++) {
                if (array[i] >= j - i) {
                    numberOfJumps[j] = Math.min(numberOfJumps[j], numberOfJumps[i] + 1);
                }
            }
        }

        return numberOfJumps[array.length - 1];
    }
}