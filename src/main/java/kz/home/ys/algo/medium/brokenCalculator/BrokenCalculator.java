package kz.home.ys.algo.medium.brokenCalculator;

class BrokenCalculator {

    // time - O(log(target))
    // space - O(1)
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        while (target > startValue) {
            ans++;
            if (target % 2 == 1) {
                target++;
            } else {
                target /= 2;
            }
        }
        return ans + startValue - target;
    }
}