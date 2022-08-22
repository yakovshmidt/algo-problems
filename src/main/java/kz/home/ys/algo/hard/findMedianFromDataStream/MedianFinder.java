package kz.home.ys.algo.hard.findMedianFromDataStream;

import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {

    // small heap
    private final PriorityQueue<Integer> maxHeap;
    // large heap
    private final PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() > num) {
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

    public double findMedian() {
        if (maxHeap.isEmpty() && minHeap.isEmpty()) return 0.0;
        else if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        else if (maxHeap.size() < minHeap.size()) return minHeap.peek();
        else return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}