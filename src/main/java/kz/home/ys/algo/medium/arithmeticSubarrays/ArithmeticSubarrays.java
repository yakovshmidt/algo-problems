package kz.home.ys.algo.medium.arithmeticSubarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>(l.length);
        for (int i = 0; i < l.length; i++) result.add(true);
        int resultIdx = 0;
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < l.length; i++) {
            int leftIdx = l[i];
            int rightIdx = r[i];
            for (int j = leftIdx; j <= rightIdx; j++) {
                minHeap.offer(nums[j]);
            }

            int prev = minHeap.poll();  // 4
            Integer diff = null; 
            while (!minHeap.isEmpty()) {
                int curr = minHeap.poll();  // 5
                if (diff == null) diff = curr - prev;  // 1
                if (diff != (curr - prev)) {
                    result.set(resultIdx, false);
                    minHeap.clear();
                }
                prev = curr;
            }
            resultIdx++;
        }
        return result;
    }
}