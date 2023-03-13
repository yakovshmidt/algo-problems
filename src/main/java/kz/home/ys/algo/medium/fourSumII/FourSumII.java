package kz.home.ys.algo.medium.fourSumII;

import java.util.HashMap;
import java.util.Map;

class FourSumII {

    // time - O(N^2)
    // space - O(N^2)
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        /*
        
        * lengths of 4 arrays are the same
        * values inside arrays can be both positive and negative
        * -2^28 <= element <= 2^28
        * 1 <= n <= 200

        Approach 1:

        sort arrays

        for i
            for j 
                while with 2 pointers k and l

        time - O(N^3)
        space - O(1)

        Approach 2:

        for i
            for j
                for k
                    for l

        time - O(N^4)
        space - O(1)

        Approach 3:

        for i
            for j
                for k and l -> store prev elements to set

        time - O(N^3)
        space - O(N)
        
        */

        int n = nums1.length;
        Map<Integer, Integer> sum1ToCount = new HashMap<>();
        Map<Integer, Integer> sum2ToCount = new HashMap<>();

        for (int num1 : nums1) {
            for (int num2 : nums2) {
                int sum = num1 + num2;
                sum1ToCount.put(sum, sum1ToCount.getOrDefault(sum, 0) + 1);
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                int sum = nums3[k] + nums4[l];
                sum2ToCount.put(sum, sum2ToCount.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int s : sum1ToCount.keySet()) {
            count += sum1ToCount.get(s) * sum2ToCount.getOrDefault(-s, 0);
        }

        return count;
    }
}