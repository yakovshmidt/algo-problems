package kz.home.ys.algo.medium.jumpGame;

// https://www.youtube.com/watch?v=Yan0cv2cLy8
class JumpGameNeetCode {

    // time - O(N)
    // space - O(1)
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }
}