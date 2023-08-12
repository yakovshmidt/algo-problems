package kz.home.ys.algo.medium.topKFrequentElements;

import java.util.*;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        /* 
        
        Approach:
        1) count all nums - O(N)
        2) put all elements into the priority queue

        time - O(N) + O(N*Log(K)) + O(K*Log(K)) -> O(N*Log(K))
        space - O(N) + O(K)

        */

        Map<Integer, Integer> numsToCounts = new HashMap<>();
        for (int num : nums) {
            numsToCounts.put(num, numsToCounts.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((arr1, arr2) -> arr1[1] - arr2[1]);
        for (var entry : numsToCounts.entrySet()) {
            minHeap.add(new int[] {entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) minHeap.poll();
        }

        int[] kElements = new int[k];
        int idx = k - 1;
        while (idx >= 0) {
            kElements[idx--] = Objects.requireNonNull(minHeap.poll())[0];
        }

        return kElements;
    }
}