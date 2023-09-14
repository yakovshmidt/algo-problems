package kz.home.ys.algo.medium.maximumXOROfTwoNumbersInAnArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumXOROfTwoNumbersInAnArrayWithSet {

    public int findMaximumXOR(int[] nums) {
        int maxNum = nums[0];
        for (int num : nums) maxNum = Math.max(num, maxNum);
        int l = Integer.toBinaryString(maxNum).length();

        int maxXor = 0, currXor = 0;
        Set<Integer> prefixes = new HashSet<>();
        for (int i = l - 1; i >= 0; i--) {
            maxXor <<= 1;
            currXor = maxXor | 1;
            prefixes.clear();

            for (int num : nums) prefixes.add(num >> i);

            for (int p : prefixes) {
                if (prefixes.contains(currXor ^ p)) {
                    maxXor = Math.max(currXor, maxXor);
                    break;
                }
            }
        }
        return maxXor;
    }
}