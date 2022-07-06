package kz.home.ys.algo.medium.longestIncreasingSubsequence;

class LongestIncreasingSubsequenceDP {
    
    // time - O(N^2)
    // space - O(N)
    public int lengthOfLIS(int[] nums) {
        // add backtracking array
        // loop through array in a reverse order
        // backtrack LISs for each element
        // get max
        
        int[] lis = new int[nums.length];
        int resultedLIS = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int curr = nums[i];
            int currLIS = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > curr) {
                    currLIS = Math.max(currLIS, lis[j]);
                }
            }
            lis[i] = 1 + currLIS;
            resultedLIS = Math.max(lis[i], resultedLIS);
        }
        return resultedLIS;
    }
}