package kz.home.ys.algo.medium.maxConsecutiveOnesIII;

class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int l = 0;
        int r = 0;
        int result = 0;
        while (r < nums.length) {
            if (nums[r++] == 0) {
                zeros++;
                while (l < r && zeros > k) {
                    if (nums[l] == 0) {
                        zeros--;
                    }
                    l++;
                }
            }
            result = Math.max(result, r - l);
        }
        return result;
    }
}