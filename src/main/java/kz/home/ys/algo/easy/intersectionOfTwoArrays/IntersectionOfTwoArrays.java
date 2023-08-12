package kz.home.ys.algo.easy.intersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> resultedSet = new HashSet<>();

        int nums1Idx = 0;
        int nums2Idx = 0;
        while (nums1Idx < nums1.length && nums2Idx < nums2.length) {
            int num1 = nums1[nums1Idx];
            int num2 = nums2[nums2Idx];
            if (num1 == num2) {
                resultedSet.add(num1);
                nums1Idx++;
                nums2Idx++;
            } else if (num1 < num2) {
                nums1Idx++;
            } else {
                nums2Idx++;
            }
        }

        int[] result = new int[resultedSet.size()];
        int idx = 0;
        for (int num : resultedSet) {
            result[idx++] = num;
        }

        return result;
    }
}