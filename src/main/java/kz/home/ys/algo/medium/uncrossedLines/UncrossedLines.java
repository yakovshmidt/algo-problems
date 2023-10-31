package kz.home.ys.algo.medium.uncrossedLines;

class UncrossedLines {

    private int[][] memo;
    private int[] nums1;
    private int[] nums2;

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        this.memo = new int[nums1.length][nums2.length];
        this.nums1 = nums1;
        this.nums2 = nums2;

        /*

        Constraints:
        1 <= nums1.length,nums2.length <= 500
        1 <= nums[i] <= 2000
        
        Input: nums1 = [2,5,1,2,5], 
               nums2 = [10,5,2,1,5,2]

        Approach:
        1. take first element from nums1 and search for the same value in nums2
        2. as only we found the value in nums2 there are 2 options:
            * take and mark left side of nums2 as visited
            * don't take and go on to the next element of nums1 array

        time - O(N * M)
        space - O(N * M)

        */

        return maxUncrossedLinesHelper(0, 0);
    }

    private int maxUncrossedLinesHelper(int nums1Idx, int nums2Idx) {
        if (nums1Idx == nums1.length || nums2Idx == nums2.length) return 0;
        if (memo[nums1Idx][nums2Idx] != 0) return memo[nums1Idx][nums2Idx];

        memo[nums1Idx][nums2Idx] = maxUncrossedLinesHelper(nums1Idx + 1, nums2Idx);

        int num1 = nums1[nums1Idx];
        for (int i = nums2Idx; i < nums2.length; i++) {
            int num2 = nums2[i];
            if (num1 == num2) {
                memo[nums1Idx][nums2Idx] = Math.max(memo[nums1Idx][nums2Idx], maxUncrossedLinesHelper(nums1Idx + 1, i + 1) + 1);
            }
        }

        return memo[nums1Idx][nums2Idx];
    }
}