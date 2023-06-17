package kz.home.ys.algo.easy.canMakeArithmeticProgressionFromSequence;

import java.util.HashSet;
import java.util.Set;

class CanMakeArithmeticProgressionFromSequenceUsingSet {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int maxValue = Integer.MIN_VALUE; // 4
        int minValue = Integer.MAX_VALUE; // 1
        for (int curr : arr) {
            if (maxValue < curr) maxValue = curr;
            if (minValue > curr) minValue = curr;
        }

        if (maxValue - minValue == 0) return true;

        if ((maxValue - minValue) % (arr.length - 1) != 0) return false;

        int diff = (maxValue - minValue) / (arr.length - 1);  // 4 - 1 / 2 = 2

        Set<Integer> visited = new HashSet<>();
        for (int curr : arr) {
            if (visited.contains(curr) || (curr - minValue) % diff != 0) return false;
            visited.add(curr);
        }
        return true;

        // 3,1,5
        // 3 == 1 + 0 * ->
        // 3 - 1 / 2 -> 1
        // 1,3,5
        // 1 - 1 /  -> 0
    }
}