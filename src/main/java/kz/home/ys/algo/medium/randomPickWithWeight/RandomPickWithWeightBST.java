package kz.home.ys.algo.medium.randomPickWithWeight;

class RandomPickWithWeightBST {

    private int totalSum = 0;
    private final int[] prefixSum;

    // time - O(N)
    // space - O(N)
    public RandomPickWithWeightBST(int[] w) {
        prefixSum = new int[w.length];
        prefixSum[0] = w[0];

        int currSum = w[0];
        for (int i = 1; i < w.length; i++) {
            prefixSum[i] = currSum + w[i];
            currSum = prefixSum[i];
        }

        totalSum = currSum;
    }

    // time - O(log(N))
    // space - O(1)
    public int pickIndex() {
        double target = Math.random() * totalSum;

        int l = 0;
        int r = prefixSum.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (target > prefixSum[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return l;
    }
}