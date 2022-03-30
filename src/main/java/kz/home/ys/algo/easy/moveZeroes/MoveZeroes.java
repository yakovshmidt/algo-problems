package kz.home.ys.algo.easy.moveZeroes;

class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int idxToInsert = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nums[idxToInsert++] = nums[i];
            }
        }
        for (int i = nums.length - 1; i >= nums.length - zeroCount; i--) {
            nums[i] = 0;
        }
    }
}