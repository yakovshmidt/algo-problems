package kz.home.ys.algo.medium.findMinimumInRotatedSortedArray;

class FindMinimumInRotatedSortedArray {

    // time - O(log(N))
    // space - O(1)
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int left = nums[l];
            int middle = nums[m];
            int right = nums[r];
            
            if (middle < left) {
                min = Math.min(middle, min);
                r = m - 1;
            } else if (right < middle) {
                min = Math.min(right, min);
                l = m + 1;
            } else {
                min = Math.min(left, min);
                break;
            }
        }
        return min;
    }
}