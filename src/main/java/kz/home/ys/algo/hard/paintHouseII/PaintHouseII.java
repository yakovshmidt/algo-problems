package kz.home.ys.algo.hard.paintHouseII;

import java.util.Arrays;

class PaintHouseII {

    public int minCostII(int[][] costs) {
        /*
        
        Constraints:
        1 <= n <= 100
        2 <= k <= 20

        int[][] memo = new int[n][k]; 

        1 -> 9,4
        5 -> 2,4
        3 -> 2,9

        time - O(N*K^2)
        space - O(K)

        */

        int n = costs.length;
        int k = costs[0].length;
        int[] prevMemo = new int[k];
        int[] currMemo = new int[k];
        System.arraycopy(costs[0], 0, currMemo, 0, currMemo.length); // copy 1st row into currMemo

        for (int row = 1; row < n; row++) {
            System.arraycopy(currMemo, 0, prevMemo, 0, prevMemo.length); // copy currMemo into prevMemo

            for (int col = 0; col < k; col++) {
                int cost = costs[row][col];
                int currCost = Integer.MAX_VALUE; 
                for (int memoIdx = 0; memoIdx < k; memoIdx++) {
                    if (memoIdx == col) continue;
                    currCost = Math.min(currCost, cost + prevMemo[memoIdx]);
                }
                currMemo[col] = currCost;
            }

        }

        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            minCost = Math.min(minCost, currMemo[i]);
        }
        return minCost;
    }
}