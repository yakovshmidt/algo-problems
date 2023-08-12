package kz.home.ys.algo.medium.sortAnArray;

class SortAnArrayWithBubbleSort {

    // time - O(N^2)
    // space - O(1)
    public int[] sortArray(int[] nums) {
        int pivot = nums.length;
        while (pivot-- > 0) {
            for (int i = 0; i < pivot; i++) {
                if (nums[i] > nums[i + 1]) swap(nums, i, i + 1);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}