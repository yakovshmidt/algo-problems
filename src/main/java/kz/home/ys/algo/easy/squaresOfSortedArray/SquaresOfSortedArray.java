package kz.home.ys.algo.easy.squaresOfSortedArray;

class SquaresOfSortedArray {

    // time - O(N)
    // space - O(N)
    public int[] sortedSquares(int[] nums) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int currIdx = nums.length - 1;
        int[] result = new int[nums.length];
        while (leftIdx <= rightIdx) {
            int squaredLeft = nums[leftIdx] * nums[leftIdx];
            int squaredRight = nums[rightIdx] * nums[rightIdx];
            
            if (squaredLeft >= squaredRight) {
                result[currIdx] = squaredLeft;
                leftIdx++;
            } else {
                result[currIdx] = squaredRight;
                rightIdx--;
            }
            currIdx--;
        }
        return result;
    }
}