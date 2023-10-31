package kz.home.ys.algo.medium.binarySubarraysWithSum;

class BinarySubarraysWithSumUsingSlidingWindow {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l = 0, r = 0, count = 0, sum = 0, temp = 0;
        while (r < nums.length) {
            sum += nums[r];
            if (nums[r] == 1) temp = 0;
            if (sum > goal) {
                sum -= nums[l];
                l++;
            }
            while (sum == goal && l <= r) {
                System.out.println("l -> " + l + ", r -> " + r);
                temp++;
                sum -= nums[l];
                l++;
            }
            r++;
            count += temp;
        }
        return count;
    }
}