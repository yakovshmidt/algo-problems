package kz.home.ys.algo.easy.intersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class IntersectionOfTwoArraysIIUsingHashMap {
    public int[] intersect(int[] nums1, int[] nums2) {
        /* 
        
        1. Using HashMap -> 
            time - O(nums1 + nums2)
            space - O(MIN(nums1.length, nums2.length))

        */

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> numsToCounts = new HashMap<>();

        int[] minNums = (nums1.length < nums2.length) ? nums1 : nums2;
        int[] maxNums = (nums1.length < nums2.length) ? nums2 : nums1;

        for (int minNum : minNums) {
            numsToCounts.put(minNum, numsToCounts.getOrDefault(minNum, 0) + 1);
        }

        for (int maxNum : maxNums) {
            if (numsToCounts.containsKey(maxNum)) {
                result.add(maxNum);
                numsToCounts.put(maxNum, numsToCounts.get(maxNum) - 1);
                if (numsToCounts.get(maxNum) == 0) {
                    numsToCounts.remove(maxNum);
                }
            }
        }

        int[] resultAsArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultAsArray[i] = result.get(i);
        }

        return resultAsArray;
    }
}