package kz.home.ys.algo.hard.makeArrayStrictlyIncreasing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MakeArrayStrictlyIncreasingBottomUp {

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(-1, 0);

        for (int i = 0; i < arr1.length; i++) {
            Map<Integer, Integer> newDp = new HashMap<>();
            for (int prev : dp.keySet()) {
                if (arr1[i] > prev) {
                    newDp.put(arr1[i], Math.min(newDp.getOrDefault(arr1[i], Integer.MAX_VALUE), dp.get(prev)));
                }
                int idx = bisectRight(arr2, prev);
                if (idx < arr2.length) {
                    newDp.put(arr2[idx], Math.min(newDp.getOrDefault(arr2[idx], Integer.MAX_VALUE), dp.get(prev) + 1));
                }
            }
            dp = newDp;
        }

        int answer = Integer.MAX_VALUE;
        for (int count : dp.values()) {
            answer = Math.min(count, answer);
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }

    private int bisectRight(int[] arr, int value) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}