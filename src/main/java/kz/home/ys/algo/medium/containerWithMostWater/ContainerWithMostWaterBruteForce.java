package kz.home.ys.algo.medium.containerWithMostWater;

public class ContainerWithMostWaterBruteForce {

    // time - O(N^2)
    // space - O(1)
    public int maxArea(int[] height) {
        int maxAmountOfWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                maxAmountOfWater = Math.max((j - i) * Math.min(height[i], height[j]), maxAmountOfWater);
            }
        }
        return maxAmountOfWater;
    }
}
