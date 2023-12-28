package kz.home.ys.algo.medium.longestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit;

import java.util.PriorityQueue;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        int l = 0, r = 0;
        int res = 0;
        for (r = 0; r < nums.length; r++) {
            minHeap.add(new int[]{nums[r], r});
            maxHeap.add(new int[]{nums[r], r});

            while (!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek()[0] - minHeap.peek()[0] > limit) {
                l = Math.min(maxHeap.peek()[1], minHeap.peek()[1]) + 1;
                while (!minHeap.isEmpty() && minHeap.peek()[1] < l) minHeap.poll();
                while (!maxHeap.isEmpty() && maxHeap.peek()[1] < l) maxHeap.poll();
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
