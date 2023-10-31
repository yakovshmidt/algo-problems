package kz.home.ys.algo.medium.solvingQuestionsWithBrainpower;

class SolvingQuestionsWithBrainpowerRecursive {

    // time - O(N)
    // space - O(N)
    public long mostPoints(int[][] questions) {
        long[] memo = new long[questions.length];
        return dp(questions, 0, memo);
    }

    private long dp(int[][] questions, int idx, long[] memo) {
        if (idx >= questions.length) return 0;
        if (memo[idx] != 0) return memo[idx];

        return memo[idx] = Math.max(
                dp(questions, idx + 1, memo),
                dp(questions, idx + 1 + questions[idx][1], memo) + questions[idx][0]
        );
    }
}