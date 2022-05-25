package kz.home.ys.algo.medium.jumpGame;

class JumpGame {

    // time - O(N*M)
    // space - O(1)
    public boolean canJump(int[] nums) {
        int currIdx = 0;
        int endIdx = nums.length - 1;

        while (currIdx <= endIdx) {  // time - O(N) - where N is length of nums
            if (currIdx < 0 || currIdx >= endIdx) break;
            currIdx = getNextIdx(nums, currIdx, endIdx);
        }
        return currIdx != -1;
    }

    private int getNextIdx(int[] nums, int currIdx, int endIdx) {
        int numOfSteps = nums[currIdx];
        int maxIdx = -1;
        int max = -1;

        // O(M) - where M is max num of steps
        while (numOfSteps > 0) {
            int nextIdx = currIdx + numOfSteps;
            if (nextIdx >= endIdx) return endIdx;
            if (nums[nextIdx] + nextIdx > max) {
                max = nums[nextIdx] + nextIdx;
                maxIdx = nextIdx;
            }
            numOfSteps--;
        }

        return maxIdx;
    }
}