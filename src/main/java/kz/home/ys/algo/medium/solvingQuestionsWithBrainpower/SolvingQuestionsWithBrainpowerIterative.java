package kz.home.ys.algo.medium.solvingQuestionsWithBrainpower;

class SolvingQuestionsWithBrainpowerIterative {

    // time - O(N)
    // space - O(N)
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] memo = new long[n];
        memo[n - 1] = questions[n - 1][0];

        for (int i = n - 2; i >= 0; i--) {
            memo[i] = questions[i][0];
            int brainpower = questions[i][1];
            if (i + brainpower + 1 < questions.length) {
                memo[i] += memo[i + brainpower + 1];
            }

            memo[i] = Math.max(memo[i + 1], memo[i]);
        }
        return memo[0];
    }
}