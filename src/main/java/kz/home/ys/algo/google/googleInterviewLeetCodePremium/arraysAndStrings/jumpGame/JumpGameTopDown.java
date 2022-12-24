package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.jumpGame;

import java.util.Arrays;

class JumpGameTopDown {

    // time - O(N^2)
    // space - O(N)
    public boolean canJump(int[] nums) {
        Index[] statuses = new Index[nums.length];
        Arrays.fill(statuses, Index.UNKNOWN);
        statuses[nums.length - 1] = Index.GOOD;

        for (int i = nums.length - 2; i >= 0; i--) {
            int currJump = nums[i];
            while (currJump > 0) {
                int nextJump = (i + currJump >= nums.length) ? nums.length - 1 : i + currJump;
                if (statuses[nextJump].equals(Index.GOOD)) {
                    statuses[i] = Index.GOOD;
                    break;
                } else {
                    statuses[i] = Index.BAD;
                }

                currJump--;
            }
            if (statuses[i].equals(Index.UNKNOWN)) {
                statuses[i] = Index.BAD;
            }
        }

        return statuses[0].equals(Index.GOOD);
    }
    
    enum Index {
        GOOD, BAD, UNKNOWN;
    }
}