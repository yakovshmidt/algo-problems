package kz.home.ys.algo.medium.topKFrequentElements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class TopKFrequentElementsQuickSelect {

    private int[] unique;
    private Map<Integer, Integer> counts;

    // time - O(N)
    // space - O(N)
    public int[] topKFrequent(int[] nums, int k) {
        counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int n = counts.size();
        unique = new int[n];
        int idx = 0;
        for (int num : counts.keySet()) {
            unique[idx++] = num;
        }

        quickSelect(0, counts.size() - 1, n - k);

        return Arrays.copyOfRange(unique, n - k, n);
    }

    private void quickSelect(int left, int right, int kSmallest) {
        if (left == right) return;

        int pivotIndex = left + new Random().nextInt(right - left);
        pivotIndex = partition(left, right, pivotIndex);

        if (kSmallest == pivotIndex) return;
        else if (kSmallest < pivotIndex) {
            quickSelect(left, pivotIndex - 1, kSmallest);
        } else {
            quickSelect(pivotIndex + 1, right, kSmallest);
        }
    }

    private int partition(int left, int right, int pivotIndex) {
        int pivotFrequency = counts.get(unique[pivotIndex]);
        swap(pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i <= right; i++) {
            if (counts.get(unique[i]) < pivotFrequency) {
                swap(storeIndex, i);
                storeIndex++;
            }
        }

        swap(storeIndex, right);
        
        return storeIndex;
    }

    private void swap(int left, int right) {
        int temp = unique[left];
        unique[left] = unique[right];
        unique[right] = temp;
    }
}