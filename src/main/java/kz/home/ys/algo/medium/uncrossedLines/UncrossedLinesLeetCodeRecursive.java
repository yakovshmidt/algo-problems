package kz.home.ys.algo.medium.uncrossedLines;

class UncrossedLinesLeetCodeRecursive {

    private int[][] memo;
    private int[] nums1;
    private int[] nums2;

    // time - O(N*M)
    // space - O(N*M)
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        this.memo = new int[nums1.length + 1][nums2.length + 1];
        this.nums1 = nums1;
        this.nums2 = nums2;
        return maxUncrossedLinesHelper(nums1.length, nums2.length);
    }

    private int maxUncrossedLinesHelper(int i, int j) {
        if (i <= 0 || j <= 0) return 0;
        if (memo[i][j] != 0) return memo[i][j];

        if (nums1[i - 1] == nums2[j - 1]) {
            memo[i][j] = maxUncrossedLinesHelper(i - 1, j - 1) + 1;
        } else {
            memo[i][j] = Math.max(maxUncrossedLinesHelper(i - 1, j), maxUncrossedLinesHelper(i, j - 1));
        }

        return memo[i][j];
    }
}