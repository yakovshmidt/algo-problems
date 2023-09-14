package kz.home.ys.algo.hard.slidingWindowMedian;

import kz.home.ys.algo.helper.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class SlidingWindowMedianWithTwoHeaps {

    private final PriorityQueue<Pair<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());
    private final PriorityQueue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());

    // typealias Pair<Value, Index>
    public double[] medianSlidingWindow(int[] nums, int k) {
        List<Double> medians = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            addToHeap(i, nums[i], k);
        }
        medians.add(getMedian(k));

        for (int i = k; i < nums.length; i++) {
            addToHeap(i, nums[i], k);
            medians.add(getMedian(k));
        }

        double[] answer = new double[medians.size()];
        for (int i = 0; i < medians.size(); i++) {
            answer[i] = medians.get(i);
        }
        return answer;
    }

    private void addToHeap(int idx, int num, int k) {
        if (maxHeap.isEmpty() || maxHeap.peek().getKey() > num) {
            maxHeap.add(new Pair<>(num, idx));
        } else {
            minHeap.add(new Pair<>(num, idx));
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }

        while (!minHeap.isEmpty() && minHeap.peek().getValue() <= (idx - k)) {
            minHeap.poll();

            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.add(minHeap.poll());
            }
        }

        while (!maxHeap.isEmpty() && maxHeap.peek().getValue() <= (idx - k)) {
            maxHeap.poll();

            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.add(minHeap.poll());
            }
        }
    }

    private double getMedian(int k) {
        if (minHeap.isEmpty() && maxHeap.isEmpty()) return 0.0;
        if (k % 2 == 0) {
            return ((double) minHeap.peek().getKey() + (double) maxHeap.peek().getKey()) / 2;
        } else {
            if (minHeap.size() >= maxHeap.size()) {
                return (double) minHeap.peek().getKey();
            } else {
                return maxHeap.peek().getKey();
            }
        }
    }

    public static void main(String[] args) {
    }
}