package kz.home.ys.algo.medium.wiggleSort;

class WiggleSort {

    // time - O(N)
    // space - O(1)
    public void wiggleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i]; // 5
            int next = nums[i + 1]; // 5
            if (i % 2 == 0) { // even
                if (curr > next) swap(nums, i, i + 1);
            } else { // odd
                if (curr < next) swap(nums, i, i + 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}