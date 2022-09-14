package kz.home.ys.algo.easy.nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;

class NextGreaterElementIBruteForce {

    // time - O(N1*N2)
    // space - O(N2)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numsToIndices = new HashMap<>(nums2.length);
        for (int i = 0; i < nums2.length; i++) {
            numsToIndices.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num1 = nums1[i];
            int num2Idx = numsToIndices.get(num1);
            int nextGreaterElement = -1;
            for (int j = num2Idx + 1; j < nums2.length; j++) {
                int num2 = nums2[j];
                
                if (num2 > num1) {
                    nextGreaterElement = num2;
                    break;
                }
            }
            result[i] = nextGreaterElement;
        }

        return result;
    }
}