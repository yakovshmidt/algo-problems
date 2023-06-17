package kz.home.ys.algo.easy.largestNumberAtLeastTwiceOfOthers;

class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int maxNumIdx = -1;
        int maxNum = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNumIdx = i;
                maxNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (maxNumIdx == i) continue;
            if (nums[i] * 2 > maxNum) {
                return -1;
            }
        }

        return maxNumIdx;
    }
}