package kz.home.ys.algo.hard.minimumDifficultyOfAJobSchedule;

class MinimumDifficultyOfAJobSchedule {

    private int[][] memo;
    private int[] jobDifficulty;

    public int minDifficulty(int[] jobDifficulty, int d) {
        /*
        
        Approach:
        1) if d > jD.length -> -1
        2) if d = jD.length -> max value
        3) if d < jD.length -> 
            6,5,4,3,2,1
            
            6, 5,4,3,2,1
            6,5, 4,3,2,1
            6,5,4, 3,2,1
            6,5,4,3, 2,1
            6,5,4,3, 2,1
            6,5,4,3,2, 1

        time - O(N^2 * D)
        space - O(N * D)


        */

        this.jobDifficulty = jobDifficulty;
        this.memo = new int[jobDifficulty.length][d + 1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                memo[i][j] = -1;
            }
        }

        if (d > jobDifficulty.length) {
            return -1;
        }

        return minDiff(0, d);
    }

    private int minDiff(int idx, int daysRemaining) {
        if (memo[idx][daysRemaining] != -1) return memo[idx][daysRemaining];

        if (daysRemaining == 1) {
            int result = 0;
            for (int i = idx; i < jobDifficulty.length; i++) {
                result = Math.max(result, jobDifficulty[i]);
            }
            return result;
        }

        int result = Integer.MAX_VALUE;
        int dailyMaxJobDiff = 0;
        for (int i = idx; i < jobDifficulty.length - daysRemaining + 1; i++) {
            dailyMaxJobDiff = Math.max(dailyMaxJobDiff, jobDifficulty[i]);
            result = Math.min(result, dailyMaxJobDiff + minDiff(i + 1, daysRemaining - 1));
        }

        return memo[idx][daysRemaining] = result;
    }
}