package kz.home.ys.algo.medium.smallestValueAfterReplacingWithSumOfPrimeFactors;

class SmallestValueAfterReplacingWithSumOfPrimeFactorsLeetCode {

    // time - O(N*log(N))
    // space - O(N)
    public int smallestValue(int n) {
        int sum = factorial(n, 2);
        if (sum == n) return n;
        return smallestValue(sum);
    }

    private int factorial(int n, int a) {
        if (n == 1) return 0;
        if (n % a == 0) return a + factorial(n / a, a);
        else return factorial(n, a + 1);
    }
}