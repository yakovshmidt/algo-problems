package kz.home.ys.algo.medium.arithmeticSlices;

class ArithmeticSlicesArithmeticSequenceFormula {

    // time - O(N)
    // space - O(1)
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int result = 0;
        for (int r = 2; r < nums.length; r++) {
            boolean isArithmeticSlice = nums[r] - nums[r - 1] == nums[r - 1] - nums[r - 2];
            if (isArithmeticSlice) {
                count++;
            } else {
                result = result + (count * (count + 1)) / 2;
                count = 0;
            }
        }

        return result + (count * (count + 1)) / 2;
    }
}