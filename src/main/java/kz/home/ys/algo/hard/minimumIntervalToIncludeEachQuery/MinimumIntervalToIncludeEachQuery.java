package kz.home.ys.algo.hard.minimumIntervalToIncludeEachQuery;

import java.util.*;

class MinimumIntervalToIncludeEachQuery {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int[][] queriesToIndices = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesToIndices[i] = new int[] {queries[i], i};
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(queriesToIndices, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (a[1] - a[0])));

        int[] result = new int[queries.length];

        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            int queryVal = queriesToIndices[i][0];
            int queryIdx = queriesToIndices[i][1];

            while (j < intervals.length && intervals[j][0] <= queryVal) {
                minHeap.add(intervals[j]);
                j++;
            }

            while (!minHeap.isEmpty() && minHeap.peek()[1] < queryVal) {
                minHeap.remove();
            }

            result[queryIdx] = minHeap.isEmpty() ? -1 : (minHeap.peek()[1] - minHeap.peek()[0] + 1);
        }

        return result;
    }
}