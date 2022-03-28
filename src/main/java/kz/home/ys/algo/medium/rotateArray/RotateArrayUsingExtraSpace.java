package kz.home.ys.algo.medium.rotateArray;

class RotateArrayUsingExtraSpace {

    // time - O(N)
    // space - O(N)
    public void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int currIdx = getCurrIdx(i, k, nums.length);
            result[currIdx] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
    
    private int getCurrIdx(int prevIdx, int stepsNumber, int length) {
        int currIdx = stepsNumber + prevIdx;
        if (currIdx >= length) {
            currIdx = currIdx % length;
        }
        return currIdx;
    }
}