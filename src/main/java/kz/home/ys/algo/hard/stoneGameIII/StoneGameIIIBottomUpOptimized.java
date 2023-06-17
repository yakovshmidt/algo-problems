package kz.home.ys.algo.hard.stoneGameIII;

public class StoneGameIIIBottomUpOptimized {

    private int[] stoneValue;
    private int[] memo;

    public String stoneGameIII(int[] stoneValue) {
        /*

        Constraints:
        1 <= stoneValue.length <= 5 * 10^4
        -1000 <= stoneValue[i] <= 1000

        Approach:
        1) Alice takes 1, 2, or 3 stones
        2) Bob makes the same and so on

        time: O(N)
        space: O(1)

        */

        int n = stoneValue.length;
        int[] dp = new int[4];
        for (int i = n - 1; i >= 0; i--) {
            dp[i % 4] = stoneValue[i] - dp[(i + 1) % 4];
            if (i + 2 <= n) {
                dp[i % 4] = Math.max(dp[i % 4], stoneValue[i] + stoneValue[i + 1] - dp[(i + 2) % 4]);
            }
            if (i + 3 <= n) {
                dp[i % 4] = Math.max(dp[i % 4], stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[(i + 3) % 4]);
            }
        }

        if (dp[0] == 0) {
            return "Tie";
        } else if (dp[0] > 0) {
            return "Alice";
        } else {
            return "Bob";
        }
    }
}
