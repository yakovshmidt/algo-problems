package kz.home.ys.algo.easy.relativeSortArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> valuesToFrequencies = new HashMap<>();
        for (int arr2Val : arr2) {
            valuesToFrequencies.put(arr2Val, 0);
        }
        for (int arr1Val : arr1) {
            if (valuesToFrequencies.containsKey(arr1Val)) {
                valuesToFrequencies.put(arr1Val, valuesToFrequencies.get(arr1Val) + 1);
            }
        }

        int idx = 0;
        int[] result = new int[arr1.length];
        for (int arr2Val : arr2) {
            int frequency = valuesToFrequencies.get(arr2Val);
            while (frequency-- > 0) {
                result[idx++] = arr2Val;
            }
        }
        Arrays.sort(arr1);
        for (int arr1Val : arr1) {
            if (!valuesToFrequencies.containsKey(arr1Val)) {
                result[idx++] = arr1Val;
            }
        }

        return result;
    }
}