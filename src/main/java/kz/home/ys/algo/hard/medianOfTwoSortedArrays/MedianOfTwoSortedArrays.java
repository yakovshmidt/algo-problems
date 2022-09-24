package kz.home.ys.algo.hard.medianOfTwoSortedArrays;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianOfTwoSortedArrays {
    
    // time - O(N*log(N) + M*log(M))
    // space - O(M + N)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // time - O(N * log(N))
        for (int num : nums1) {
            putNumToHeap(num, maxHeap, minHeap);
        }
        // time - O(M * log(M))
        for (int num : nums2) {
            putNumToHeap(num, maxHeap, minHeap);
        }

        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else if (maxHeap.size() < minHeap.size()) {
            return minHeap.peek();
        } else {
            return maxHeap.peek();
        }
    }
    
    private void putNumToHeap(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        if (maxHeap.isEmpty() || num < maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }
    }
}