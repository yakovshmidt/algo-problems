package kz.home.ys.algo.middle.containerWithMostWater;

public class ContainerWithMostWaterTwoPointers {

    // time - O(N)
    // space - O(1)
    public int maxArea(int[] height) {
        int leftIdx = 0;
        int rightIdx = height.length - 1;
        int maxAmountOfWater = 0;

        while (leftIdx < rightIdx) {
            int left = height[leftIdx];
            int right = height[rightIdx];
            maxAmountOfWater = Math.max(maxAmountOfWater, (rightIdx - leftIdx) * Math.min(left, right));
            if (left < right) {
                leftIdx++;
            } else {
                rightIdx--;
            }
        }
        return maxAmountOfWater;
    }
}
