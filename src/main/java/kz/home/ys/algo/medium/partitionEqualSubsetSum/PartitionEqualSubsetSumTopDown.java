package kz.home.ys.algo.medium.partitionEqualSubsetSum;

class PartitionEqualSubsetSumTopDown {

    private Boolean[][] memo;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        if (sum % 2 != 0) return false;
        int halfSum = sum / 2;
        
        this.memo = new Boolean[halfSum + 1][nums.length + 1];
        return canPartition(nums, 0, halfSum);
    }

    private boolean canPartition(int[] nums, int idx, int sum) {
        if (sum == 0) return true;
        if (idx == nums.length || sum < 0) return false;
        if (memo[sum][idx] != null) return memo[sum][idx]; 
        
        int num = nums[idx];
        return memo[sum][idx] = canPartition(nums, idx + 1, sum - num) || canPartition(nums, idx + 1, sum);
    }
}