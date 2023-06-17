package kz.home.ys.algo.easy.canMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        if (arr.length == 2) return true;

        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int currDiff = arr[i] - arr[i - 1];
            if (diff != currDiff) return false;
        }

        return true;
    }
}
