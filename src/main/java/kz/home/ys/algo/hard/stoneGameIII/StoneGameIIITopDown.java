package kz.home.ys.algo.hard.stoneGameIII;

class StoneGameIIITopDown {

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
        space: O(N)

        */

        this.stoneValue = stoneValue;
        this.memo = new int[stoneValue.length + 1];
        int result = dp(0, stoneValue.length);
        if (result == 0) {
            return "Tie";
        } else if (result > 0) {
            return "Alice";
        } else {
            return "Bob";
        }
    }

    private int dp(int idx, int n) {
        if (idx == n) return 0;
        if (memo[idx] != 0) return memo[idx];

        int result = stoneValue[idx] - dp(idx + 1, n);
        if (idx + 2 <= n) {
            result = Math.max(result, stoneValue[idx] + stoneValue[idx + 1] - dp(idx + 2, n));
        }
        if (idx + 3 <= n) {
            result = Math.max(result, stoneValue[idx] + stoneValue[idx + 1] + stoneValue[idx + 2] - dp(idx + 3, n));
        }

        return memo[idx] = result;
    }
}