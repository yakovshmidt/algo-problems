package kz.home.ys.algo.easy.intersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntersectionOfTwoArraysIIUsingSorting {

    public int[] intersect(int[] nums1, int[] nums2) {
        /* 
       
        2. Sort two arrays and will iterate over arrays
            time - O(N*log(N) + M*log(M)) + O(N) + O(M)
            space - O(1) if sorting algo uses the same arrays
        
        */

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < nums1.length && idx2 < nums2.length) {
            int num1 = nums1[idx1];
            int num2 = nums2[idx2];
            if (num1 == num2) {
                result.add(num1);
                idx1++;
                idx2++;
            } else if (num1 < num2) {
                idx1++;
            } else {
                idx2++;
            }
        }

        int[] resultAsArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultAsArray[i] = result.get(i);
        }

        return resultAsArray;
    }
}