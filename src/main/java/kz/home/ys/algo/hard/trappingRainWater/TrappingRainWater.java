package kz.home.ys.algo.hard.trappingRainWater;

class TrappingRainWater {

    // time - O(N)
    // space - O(N)
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
        }

        int[] maxRight = new int[height.length];
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);
        }

        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int curr = Math.min(maxRight[i], maxLeft[i]) - height[i];
            result += Math.max(curr, 0);
        }

        return result;
    }
}