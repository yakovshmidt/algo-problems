package kz.home.ys.algo.medium.totalCostToHireKWorkers;

import java.util.Comparator;
import java.util.PriorityQueue;

class TotalCostToHireKWorkers {

    // time - O((k+m)⋅log(m))
    // space - O(m)
    public long totalCost(int[] costs, int k, int candidates) {
        long totalCost = 0;
        PriorityQueue<Integer> leftMinHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o));

        int leftIdx = 0;
        int rightIdx = costs.length - 1;
        while (leftIdx <= rightIdx && candidates > 0) {
            leftMinHeap.add(costs[leftIdx++]);
            if (leftIdx < rightIdx) rightMinHeap.add(costs[rightIdx--]);

            candidates--;
        }

        while (k > 0) {
            if (leftMinHeap.isEmpty() && rightMinHeap.isEmpty()) {
                break;
            } else if (rightMinHeap.isEmpty()) {
                totalCost += leftMinHeap.poll();
                if (leftIdx <= rightIdx) rightMinHeap.add(costs[rightIdx--]);
            } else if (leftMinHeap.isEmpty()) {
                totalCost += rightMinHeap.poll();
                if (leftIdx <= rightIdx) leftMinHeap.add(costs[leftIdx++]);
            } else if (leftMinHeap.peek() > rightMinHeap.peek()) {
                totalCost += rightMinHeap.poll();
                if (leftIdx <= rightIdx) rightMinHeap.add(costs[rightIdx--]);
            } else {
                totalCost += leftMinHeap.poll();
                if (leftIdx <= rightIdx) leftMinHeap.add(costs[leftIdx++]);
            }
            k--;
        }

        return totalCost;
    }
}