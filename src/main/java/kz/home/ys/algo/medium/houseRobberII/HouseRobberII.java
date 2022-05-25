package kz.home.ys.algo.medium.houseRobberII;

class HouseRobberII {

    // time - O(N) + O(N)
    // space - O(1)
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }
    
    private int rob(int[] nums, int idx, int end) {
        int rob1 = 0;
        int rob2 = 0;
        
        for (int i = idx; i <= end; i++) {
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        
        return rob2;
    }
}