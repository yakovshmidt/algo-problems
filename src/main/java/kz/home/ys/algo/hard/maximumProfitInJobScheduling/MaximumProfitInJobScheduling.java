package kz.home.ys.algo.hard.maximumProfitInJobScheduling;

import java.util.Arrays;
import java.util.Comparator;

class MaximumProfitInJobScheduling {

    // time - O(N^2)
    // space - O(N^2)
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] jobs = new int[startTime.length][3];
        for (int i = 0; i < startTime.length; i++) {
           jobs[i] = new int[] {startTime[i], endTime[i], profit[i]}; 
        }
        
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));
    
        return rec(jobs, 0);
    }
    
    private int rec(int[][] jobs, int i) {
        if (i >= jobs.length) return 0;
        
        int j = i + 1;
        while (j < jobs.length && jobs[i][1] > jobs[j][0]) {
            j++;
        }
        int one = jobs[i][2] + rec(jobs, j);
        int two = rec(jobs, i + 1);
        
        return Math.max(one, two);
    }
}