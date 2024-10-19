package kz.home.ys.algo.medium.largestDivisibleSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

    // time - O(N^2)
    // space - O(N)
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        Arrays.sort(nums);

        int maxLIS = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLIS = Math.max(maxLIS, dp[i]);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        int currLIS = maxLIS;
        for (int i = dp.length - 1; i >= 0; i--) {
            if (currLIS == 0) break;
            if (dp[i] == currLIS) {
                if (ans.isEmpty()) {
                    ans.add(nums[i]);
                    currLIS--;
                } else if (ans.get(ans.size() - 1) % nums[i] == 0) {
                    ans.add(nums[i]);
                    currLIS--;
                }
            }
        }

        return ans;
    }
}
