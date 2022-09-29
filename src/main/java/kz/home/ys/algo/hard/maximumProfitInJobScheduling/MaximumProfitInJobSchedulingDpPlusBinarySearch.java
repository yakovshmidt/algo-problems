package kz.home.ys.algo.hard.maximumProfitInJobScheduling;

import java.util.Arrays;
import java.util.Comparator;

class MaximumProfitInJobSchedulingDpPlusBinarySearch {

    // time - O(N*log(N))
    // space - O(N)
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] jobs = new int[startTime.length][3];
        for (int i = 0; i < startTime.length; i++) {
           jobs[i] = new int[] {startTime[i], endTime[i], profit[i]}; 
        }
        
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
    
        int[] dp = new int[jobs.length];
        Arrays.fill(dp, -1);
        
        return rec(jobs, 0, dp);
    }
    
    private int rec(int[][] jobs, int idx, int[] dp) {
        if (idx == jobs.length) return 0;
        if (dp[idx] != -1) return dp[idx];
        
        int nextIdx = findNextIdxViaBinarySearch(jobs, idx);
        int pick = jobs[idx][2] + rec(jobs, nextIdx, dp);
        int notPick = rec(jobs, idx + 1, dp);
        
        return dp[idx] = Math.max(pick, notPick);
    }
    
    private int findNextIdxViaBinarySearch(int[][] jobs, int idx) {
        int ans = jobs.length;
        int l = idx + 1;
        int r = jobs.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (jobs[idx][1] <= jobs[mid][0]) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}