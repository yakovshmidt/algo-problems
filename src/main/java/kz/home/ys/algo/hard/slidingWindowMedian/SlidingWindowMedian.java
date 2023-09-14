package kz.home.ys.algo.hard.slidingWindowMedian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SlidingWindowMedian {

    // time - O(N * K*log(K))
    // space - O(K) + O(N)
    public double[] medianSlidingWindow(int[] nums, int k) {
        int[] sorted = new int[k];

        List<Double> medians = new ArrayList<>();

        for (int i = 0; i <= nums.length - k; i++) {
            int idx = 0;
            for (int j = i; j < k + i; j++) {
                sorted[idx++] = nums[j];
            }
            Arrays.sort(sorted);
            if (sorted.length % 2 == 0) {
                int midOne = (sorted.length - 1) / 2;
                int midTwo = midOne + 1;

                medians.add(((double) sorted[midOne] + (double) sorted[midTwo]) / 2);
            } else {
                int mid = sorted.length / 2;
                medians.add((double) sorted[mid]);
            }
        }

        double[] answer = new double[medians.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = medians.get(i);
        }

        return answer;
    }
}