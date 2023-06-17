package kz.home.ys.algo.easy.maximumValueAtAGivenIndexInABoundedArray;

public class MaximumValueAtAGivenIndexInABoundedArray {

    public int maxValue(int n, int index, int maxSum) {
        int sum = n;
        int l = index;
        int r = index;
        int res = 1;

        while (sum + (r - l + 1) <= maxSum) {
            sum += (r - l + 1);

            l = l == 0 ? 0 : l - 1;
            r = r == n - 1 ? r : r + 1;
            res++;

            if (l == 0 && r == n - 1) {
                int steps = 0;
                steps += (maxSum - sum) / n;
                sum += (steps * n);
                res += steps;
            }
        }

        return res;
    }
}
