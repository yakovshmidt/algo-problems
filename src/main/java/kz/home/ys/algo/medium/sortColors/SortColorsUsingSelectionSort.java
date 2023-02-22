package kz.home.ys.algo.medium.sortColors;

class SortColorsUsingSelectionSort {

    // time - O(N^2)
    // space - O(1)
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }
    }
}