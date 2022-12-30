package kz.home.ys.algo.medium.randomPickWithWeight;

class RandomPickWithWeight {

    private int totalSum = 0;
    private final int[] prefixSum;

    // time - O(N)
    // space - O(N)
    public RandomPickWithWeight(int[] w) {
        prefixSum = new int[w.length];
        prefixSum[0] = w[0];

        int currSum = w[0];
        for (int i = 1; i < w.length; i++) {
            prefixSum[i] = currSum + w[i];
            currSum = prefixSum[i];
        }

        totalSum = currSum;
    }

    // time - O(N)
    // space - O(1)
    public int pickIndex() {
        double target = Math.random() * totalSum;
        int i = 0;
        for (; i < prefixSum.length; i++) {
            if (target < prefixSum[i]) {
                return i;
            }
        }

        return i - 1;
    }
}