package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.jumpGame;

import java.util.Arrays;

class JumpGameGreedy {

    // time - O(N)
    // space - O(1)
    public boolean canJump(int[] nums) {
        int length = nums.length - 1; // 4
        for (int i = length - 1; i >=0; i--) {
            if (i + nums[i] >= length) {
                length = i;
            }
        }
        return length == 0;
    }
}