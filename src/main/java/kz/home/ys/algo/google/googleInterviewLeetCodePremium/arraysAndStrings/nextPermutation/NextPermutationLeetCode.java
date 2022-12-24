package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.nextPermutation;

public class NextPermutationLeetCode {

    // time - O(N)
    // space - O(1)
    public void nextPermutation(int[] nums) {
        int pivot = nums.length - 2;
        while (pivot >= 0 && nums[pivot + 1] <= nums[pivot]) {
            pivot--;
        }

        if (pivot >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[pivot]) {
                j--;
            }
            swap(nums, pivot, j);
        }

        reverse(nums, pivot + 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
