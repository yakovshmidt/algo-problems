package kz.home.ys.algo.easy.maxConsecutiveOnes;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currConsecutiveOnesNumber = 0;
        int maxConsecutiveOnesNumber = 0;
        int idx = 0;
        while (idx < nums.length) {
            while (idx < nums.length && nums[idx++] == 1) {
                currConsecutiveOnesNumber++;
            }
            maxConsecutiveOnesNumber = Math.max(maxConsecutiveOnesNumber, currConsecutiveOnesNumber);
            currConsecutiveOnesNumber = 0;
        }
        return maxConsecutiveOnesNumber;
    }
}