package kz.home.ys.algo.medium.bitwiseAndOfNumbersRange;

class BitwiseAndOfNumbersRangeWithBrianKernighanAlgorithm {
    public int rangeBitwiseAnd(int m, int n) {
        while (m < n) {
            n = n & (n - 1);
        }

        return m & n;
    }
}