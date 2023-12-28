package kz.home.ys.algo.medium.findKClosestElements;

import java.util.ArrayList;
import java.util.List;

class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int nearestIdx = binarySearch(arr, x);

        int l = Math.max((nearestIdx - k), 0);
        int r = l + k;

        while (r < arr.length && Math.abs(arr[r] - x) < Math.abs(arr[l] - x)) {
            l++;
            r++;
        }

        List<Integer> result = new ArrayList<>();
        while (l < r) {
            result.add(arr[l++]);
        }

        return result;
    }

    private int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            } else if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}