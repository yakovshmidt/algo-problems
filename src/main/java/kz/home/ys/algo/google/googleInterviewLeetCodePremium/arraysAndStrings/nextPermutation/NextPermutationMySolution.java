package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.nextPermutation;

import java.util.Arrays;

public class NextPermutationMySolution {

    // time - O(N*log(N))
    // space - O(1) - in case of sorting algorithms do not use any additional space
    public void nextPermutation(int[] nums) {
        /*

        1) find pivot -> max decreasing subarray from the end
        2) find first which is greater than pivot element
        3) swap
        4) reverse subarray

        */

        int pivot = -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }

        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }

        for (int i = nums.length - 1; i >= pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        Arrays.sort(nums, pivot + 1, nums.length);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
