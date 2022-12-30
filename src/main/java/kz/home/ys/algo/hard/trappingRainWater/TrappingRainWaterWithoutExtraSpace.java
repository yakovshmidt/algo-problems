package kz.home.ys.algo.hard.trappingRainWater;

class TrappingRainWaterWithoutExtraSpace {

    // time - O(N)
    // space - O(1)
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxLeft = height[l];
        int maxRight = height[r];
        int result = 0;
        while (l < r) {
            if (maxLeft < maxRight) {
                l++;
                maxLeft = Math.max(maxLeft, height[l]);
                result += maxLeft - height[l];
            } else {
                r--;
                maxRight = Math.max(maxRight, height[r]);
                result += maxRight - height[r];
            }
        }
        return result;
    }
}