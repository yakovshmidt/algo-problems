package kz.home.ys.algo.medium.findMinimumInRotatedSortedArray;

class FindMinimumInRotatedSortedArray2 {

    // time - O(log(N))
    // space - O(1)
    public int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;

            if (m > 0 && nums[m] < nums[m - 1]) {
                return nums[m];
            } else if (nums[l] <= nums[m] && nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return nums[l];
    }
}