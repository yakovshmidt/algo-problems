package kz.home.ys.algo.medium.maximumSubsequenceScore;

import java.util.Arrays;
import java.util.PriorityQueue;

class MaximumSubsequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
       /*
       
       Input: nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3

       nums2 -> 1,2,3,4
       nums1 -> 3,1,3,2

       time - O(N*Log(N))
       space - O(N)

       */ 

        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] {nums1[i], nums2[i]};
        }
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);

        PriorityQueue<Integer> topKHeap = new PriorityQueue<>(k);
        long topKSum = 0;
        for (int i = 0; i < k; i++) {
            topKSum += pairs[i][0];
            topKHeap.add(pairs[i][0]);
        }

        long answer = topKSum * pairs[k - 1][1];

        for (int i = k; i < n; i++) {
            topKSum += pairs[i][0] - topKHeap.poll();
            topKHeap.add(pairs[i][0]);

            answer = Math.max(answer, topKSum * pairs[i][1]);
        }

        return answer;
    }
}
























