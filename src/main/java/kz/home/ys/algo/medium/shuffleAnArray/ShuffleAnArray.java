package kz.home.ys.algo.medium.shuffleAnArray;

import java.util.Arrays;
import java.util.Random;

class ShuffleAnArray {

    private final int[] arr;
    private final Random random;

    public ShuffleAnArray(int[] nums) {
        arr = nums;
        random = new Random();
    }

    // time - O(1)
    // space - O(N)
    public int[] reset() {
        return arr;
    }

    // time - O(N)
    // space - O(N)
    public int[] shuffle() {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length; i++) {
            int randomIdx = random.nextInt(copy.length - i) + i; // choose between "i" and "arr.length"
            int temp = copy[i];
            copy[i] = copy[randomIdx];
            copy[randomIdx] = temp;
        }

        return copy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */