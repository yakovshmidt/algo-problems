package kz.home.ys.algo.medium.sortAnArray;

class SortAnArrayWithSelectionSort {

    // time - O(N^2)
    // space - O(1)
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) minIdx = j;
            }
            swap(nums, minIdx, i);
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}