package kz.home.ys.algo.medium.jumpGame;

class JumpGameLeetCode {

    // time - O(N)
    // space - O(1)
    public boolean canJump(int[] nums) {
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currMax < i) return false;
            currMax = Math.max(currMax, i + nums[i]);
        }
        return true;
    }
}