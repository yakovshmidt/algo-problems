package kz.home.ys.algo.medium.maximumSumOfAlmostUniqueSubarray;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumSumOfAlmostUniqueSubarray {

    public long maxSum(List<Integer> nums, int m, int k) {
        if (nums.size() < k) return 0;

        long maxSum = Integer.MIN_VALUE;;
        Map<Integer, Integer> numsToCounts = new HashMap<>();

        int numOfDuplicates = 0;
        long currSum = 0;
        for (int i = 0; i < k; i++) {
            numsToCounts.put(nums.get(i), numsToCounts.getOrDefault(nums.get(i), 0) + 1);
            if (numsToCounts.get(nums.get(i)) > 1) numOfDuplicates++;
            currSum += nums.get(i);
        }
        if ((k - numOfDuplicates) >= m) {
            maxSum = Math.max(maxSum, currSum);
        }

        for (int i = k; i < nums.size(); i++) {
            int nextNum = nums.get(i);
            int prevNum = nums.get(i - k);

            numsToCounts.put(prevNum, numsToCounts.get(prevNum) - 1);
            if (numsToCounts.get(prevNum) >= 1) numOfDuplicates--;
            currSum -= prevNum;

            numsToCounts.put(nextNum, numsToCounts.getOrDefault(nextNum, 0) + 1);
            if (numsToCounts.get(nextNum) > 1) numOfDuplicates++;
            currSum += nextNum;
            if ((k - numOfDuplicates) >= m) {
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}
