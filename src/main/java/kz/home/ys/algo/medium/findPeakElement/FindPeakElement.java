package kz.home.ys.algo.medium.findPeakElement;

class FindPeakElement {

    // time - O(log(N))
    // space - O(1)
    public int findPeakElement(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return 0;

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            int leftNeighborIdx = m > 0 ? m - 1 : nums.length - 1;
            int rightNeighborIdx = m < nums.length ? m + 1 : 0;
            boolean isPeak = nums[m] >= nums[leftNeighborIdx] && nums[m] >= nums[rightNeighborIdx];
            if (isPeak) {
                return m;
            } else if (nums[leftNeighborIdx] > nums[m]) {
                if (m > 0) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}