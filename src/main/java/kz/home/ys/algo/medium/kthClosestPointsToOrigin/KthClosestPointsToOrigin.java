package kz.home.ys.algo.medium.kthClosestPointsToOrigin;

import java.util.PriorityQueue;

class KthClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((o1, o2) -> euclideanDistance(o2) - euclideanDistance(o1));
        for (int[] point : points) {
            minHeap.offer(point);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        int idx = 0;
        while (!minHeap.isEmpty()) {
            result[idx++] = minHeap.poll();
        }

        return result;
    }

    private int euclideanDistance(int[] arr) {
        return (arr[0] * arr[0]) + (arr[1] * arr[1]);
    }
}