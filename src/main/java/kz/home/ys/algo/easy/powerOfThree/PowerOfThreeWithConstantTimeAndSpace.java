package kz.home.ys.algo.easy.powerOfThree;

class PowerOfThreeWithConstantTimeAndSpace {

    private static final int MAX_VALUE_POWER_OF_THREE = 1162261467;

    // time - O(1)
    // space - O(1)
    public boolean isPowerOfThree(int n) {
        return n > 0 && MAX_VALUE_POWER_OF_THREE % n == 0;
    }
}