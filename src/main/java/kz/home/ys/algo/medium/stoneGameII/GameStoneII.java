package kz.home.ys.algo.medium.stoneGameII;

class GameStoneII {

    private int[] piles;
    private int[][][] memo;

    public int stoneGameII(int[] piles) {
        /*
        
        Approach: DP
        1) M=1, 1<=X<=2M -> 1<=X<=2 -> M=Max(M,X)

        time: O(N^3)
        space: - O(N^2)

        */
        this.piles = piles;
        this.memo = new int[2][piles.length + 1][piles.length + 1];

        return dp(0, 0, 1);
    }

    private int dp(int playerIdx, int idx, int m) {
        if (idx == piles.length) return 0;
        if (memo[playerIdx][idx][m] != 0) return memo[playerIdx][idx][m];

        int res = playerIdx == 1 ? 1000000 : -1;
        int sum = 0;
        for (int x = 1; x <= Math.min(2 * m, piles.length - idx); x++) {
            sum += piles[idx + x - 1];
            if (playerIdx == 0) {
                res = Math.max(res, sum + dp(1, idx + x, Math.max(m, x)));
            } else {
                res = Math.min(res, dp(0, idx + x, Math.max(m, x)));
            }
        }
        return memo[playerIdx][idx][m] = res;
    }
}