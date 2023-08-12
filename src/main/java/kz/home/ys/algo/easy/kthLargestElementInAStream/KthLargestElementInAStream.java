package kz.home.ys.algo.easy.kthLargestElementInAStream;

import java.util.Comparator;
import java.util.PriorityQueue;

class KthLargestElementInAStream {

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    // time - O(N*Log(N))
    // space - O(N)
    public KthLargestElementInAStream(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>(Comparator.comparingInt(i -> i));
        this.k = k;
        for (int num : nums) {
            this.minHeap.add(num);
        }
        while (this.minHeap.size() > k) {
            this.minHeap.poll();
        }
    }

    // time - O(M*Log(K))
    // space - O(K)
    public int add(int val) {
        this.minHeap.add(val);
        while (this.minHeap.size() > k) {
            this.minHeap.poll();
        }
        return this.minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */