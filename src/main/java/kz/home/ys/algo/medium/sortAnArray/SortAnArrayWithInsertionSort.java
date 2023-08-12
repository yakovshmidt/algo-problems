package kz.home.ys.algo.medium.sortAnArray;

class SortAnArrayWithInsertionSort {

    // time - O(N^2)
    // space - O(1)
    public int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j >= 1) {
                if (nums[j] < nums[j - 1]) swap(nums, j, j - 1);
                else break;
                j--;
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