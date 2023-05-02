package kz.home.ys.algo.medium.validTriangleNumber;

import java.util.Arrays;

class ValidTriangleNumber {
    
    // time - O(N^2*log(N))
    // space - O(N)
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int numberOfTriangles = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0) continue;

            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1; j++) {
                k = binarySearch(nums, k, nums.length - 1, nums[i] + nums[j]);
                numberOfTriangles += k - j - 1;
            }
        }

        return numberOfTriangles;
    }

    private int binarySearch(int[] nums, int l, int r, int x) {
        while (r >= l && r < nums.length) {
            int m = l + (r - l) / 2;
            if (nums[m] >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}