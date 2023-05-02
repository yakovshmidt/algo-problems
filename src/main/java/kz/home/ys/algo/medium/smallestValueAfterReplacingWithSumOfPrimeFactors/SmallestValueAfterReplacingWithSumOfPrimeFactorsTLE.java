package kz.home.ys.algo.medium.smallestValueAfterReplacingWithSumOfPrimeFactors;

class SmallestValueAfterReplacingWithSumOfPrimeFactorsTLE {
    public int smallestValue(int n) {
        /* 
        
        Constraints:
        2 <= n <= 10^5

        DP

        15 -> 15 / 2 -> 7.5
           -> 15 / 3 -> 5 CAN USE IT
           -> 15 / 4 -> 4.6
           -> 15 / 5 -> 3 CAN USE IT BUT IT IS THE SAME AS 15 / 3

        15 / 3 and 15 / 
        
        8 -> 8 / 2 = 4 -> 4 / 2 = 2
          -> 8 / 3 = 2.2
          -> 8 / 4 = 2 -> 4 + 2
        
        15 -> 3 + 5 = 8
        8 -> 2 + 2 + 2 = 6
        4 -> 2 + 2 = 4

        time - O(n)
        space - O(n)

        */

        if (n <= 5) return n;

        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }

        for (int i = 6; i <= n; i++) {
            /*
            
            i = 6 
            [2,6]

            */
            double j = 2.0;
            int min = Integer.MAX_VALUE;
            while (j < i) {
                double k = (double) i / j;
                if (k % 1 == 0) {
                    min = Math.min(min, dp[(int)k] + dp[(int)j]);
                }
                j++;
            }

            dp[i] = Math.min(min, dp[i]);
        }

        int i = n;
        while (dp[i] != i) {
            i = dp[i];
        }

        return i;
    }
}