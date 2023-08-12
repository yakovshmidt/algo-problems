package kz.home.ys.algo.medium.kthLargestElementInAnArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class KthLargestElementInAnArray {

    // time - O(N*log(K))
    // space - O(K)
    public int findKthLargest(int[] nums, int k) {
        List<Integer> numsAsList = new ArrayList<>();
        for (int num : nums) {
            numsAsList.add(num);
        }
        return quickSelect(numsAsList, k);
    }

    private int quickSelect(List<Integer> nums, int k) {
        int pivotIdx = new Random().nextInt(nums.size());
        int pivot = nums.get(pivotIdx);

        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
    
        for (int num : nums) {
            if (num > pivot) {
                left.add(num);
            } else if (num < pivot) {
                right.add(num);
            } else {
                mid.add(num);
            }
        }

        if (k <= left.size()) {
            return quickSelect(left, k);
        }

        if (left.size() + mid.size() < k) {
            return quickSelect(right, k - left.size() - mid.size());
        }

        return pivot;
    }
}