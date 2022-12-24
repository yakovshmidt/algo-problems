package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.jumpGame;

class JumpGameBacktracking {

    // time - O(2^N) - where N is length of nums array
    // space - O(N)
    public boolean canJump(int[] nums) {
        return canJump(nums, 0);
    }

    private boolean canJump(int[] nums, int idx) {
        int N = nums.length - 1;
        if (idx == N) return true;

        int furtherJump = Math.min(idx + nums[idx], N);
        for (int nextIdx = idx + 1; nextIdx <= furtherJump; nextIdx++) {
            if (canJump(nums, nextIdx)) {
                return true;
            }
        }
        return false;
    }
}