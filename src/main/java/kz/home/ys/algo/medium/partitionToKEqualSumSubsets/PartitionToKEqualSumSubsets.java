package kz.home.ys.algo.medium.partitionToKEqualSumSubsets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class PartitionToKEqualSumSubsets {

    private final Map<String, Boolean> memo = new HashMap<>();

    // time - O(N*2^N)
    // space - O(2^N)
    public boolean canPartitionKSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        reverse(nums);

        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % k != 0) return false;

        int targetSum = sum / k;

        char[] visited = new char[nums.length];
        Arrays.fill(visited, '0');

        return backtrack(nums, visited, 0, 0, targetSum, k);
    }

    private boolean backtrack(int[] nums, char[] visited, int count, int currSum, int targetSum, int k) {
        if (count == k - 1) return true;

        if (currSum > targetSum) return false;

        String mask = new String(visited);
        if (memo.containsKey(mask)) return memo.get(mask);

        if (currSum == targetSum) return backtrack(nums, visited, count + 1, 0, targetSum, k);

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == '1') continue;
            visited[i] = '1';

            if (backtrack(nums, visited, count, currSum + nums[i], targetSum, k)) return true;

            visited[i] = '0';
        }

        memo.put(mask, false);
        return false;
    }

    private void reverse(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}