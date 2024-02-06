package kz.home.ys.algo.medium.divideArrayIntoArraysWithMaxDifference;

import java.util.Arrays;

class DivideArrayIntoArraysWithMaxDifference {

    // Time - O(N*Log(N))
    // Space - O(N)
    public int[][] divideArray(int[] nums, int k) {
        if (nums.length % 3 != 0) return new int[0][0];
        
        Arrays.sort(nums);

        int tripletCount = nums.length / 3;

        int[][] result = new int[tripletCount][3];
        int tripletIdx = 0;
        int elemIdx = 0;
        for (int num : nums) {
            if (elemIdx == 3) {
                elemIdx = 0;
                tripletIdx++;
            }

            if (elemIdx == 0) {
                result[tripletIdx][elemIdx++] = num;
            } else {
                int prevNum = result[tripletIdx][0];
                if (num - prevNum <= k) {
                    result[tripletIdx][elemIdx++] = num;
                } else {
                    return new int[0][0];
                }
            }
        }
        return result;
    }
}