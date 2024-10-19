package kz.home.ys.algo.medium.twoKeysKeyboar;

import java.util.Arrays;

class TwoKeysKeyboard {

    private long[][][] memo;

    public int minSteps(int n) {
        /*
        
        Approach: DP?
        default => 'A'

        Example 1:
        n = 3
        lettersCount = 1
        copiedCount = 0
        steps = 0

        0. memo[lettersCount][steps]
        1. copy -> copiedCount = lettersCount = 1
        2.  copy -> if copiedCount == lettersCount -> it is not relevant to copy one more time
            paste -> lettersCount = 2
                3.  copy ->
                    paste
        
        */

        this.memo = new long[n + 1][n + 1][2]; // currLength, copyLength, action (copy, paste)

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(memo[i][j], - 1);
            }
        }
        long ans = dp(n, 1, 0, 0);
        return (int) ans;
    }

    private long dp(int n, int currLength, int copyLength, int flag) {
        if (currLength == n) return 0;
        if (currLength > n) return Integer.MAX_VALUE;
        if (memo[currLength][copyLength][flag] != -1) return memo[currLength][copyLength][flag];
        if (currLength == 1 && flag == 0) return memo[currLength][copyLength][flag]=1+dp(n,currLength,1,1);
        else {
            if (flag == 1) {  // paste
                return memo[currLength][copyLength][flag] = 1 + dp(n, currLength + copyLength, copyLength, 0);
            } else { // copy
                long y=dp(n,currLength+copyLength,copyLength,flag)+1; //paste 
                long z=dp(n,currLength,currLength,1)+1;        //copy
                return memo[currLength][copyLength][flag]=Math.min(y,z);
            }
        }
    }
}