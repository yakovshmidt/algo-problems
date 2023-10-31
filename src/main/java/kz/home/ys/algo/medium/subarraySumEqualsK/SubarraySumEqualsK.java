package kz.home.ys.algo.medium.subarraySumEqualsK;

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        /*
        
        Constraints:
        1 <= nums.length <= 2 * 10^4
        -1000 <= nums[i] <= 1000
        -10^7 < k < 10^7

        Approach:
        1) iterate over array using 2 for loops and calculate cintiguous subarray sum

        Time: O(N^2)
        
        Space: O(1)

        */
        
        int ans = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (k == sum) {
                    ans++;
                }
            }
        }
        return ans;
    }
}