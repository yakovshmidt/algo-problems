package kz.home.ys.algo.medium.productOfArrayExceptSelf;

class ProductOfArrayExceptSelfNeetCode {
    
    // time - O(N)
    // space - O(1)
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        calculatePrefixes(nums, answer);
        calculatePostfixes(nums, answer);
        
        return answer;
    }
    
    private void calculatePrefixes(int[] nums, int[] answer) {
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }
    }
    
    private void calculatePostfixes(int[] nums, int[] answer) {
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = postfix * answer[i];
            postfix = postfix * nums[i];
        }
    }
}