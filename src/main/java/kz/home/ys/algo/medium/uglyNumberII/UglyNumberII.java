package kz.home.ys.algo.medium.uglyNumberII;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] nums = new int[1690];

        PriorityQueue<Long> heap = new PriorityQueue<>();
        heap.offer(1L);
        Set<Long> visited = new HashSet<>();
        visited.add(1L);

        int[] primeFactors = new int[] {2, 3, 5};

        for (int i = 0; i < 1690; i++) {
            long currUgly = heap.poll();
            nums[i] = (int) currUgly;
            for (int prime : primeFactors) {
                long newUgly = prime * currUgly;
                if (!visited.contains(newUgly)) {
                    heap.offer(newUgly);
                    visited.add(newUgly);
                }
            }
        }

        return nums[n - 1];
    }
}