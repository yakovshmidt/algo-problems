package kz.home.ys.algo.easy.nonConstructibleChange;

import java.util.Arrays;

public class NonConstructibleChange {

    // time - O(Nlog(N))
    // space - O(1)
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);

        int change = 0;
        for (int coin : coins) {
            if (coin > change + 1) {
                return change + 1;
            }
            change += coin;
        }

        return change;
    }
}
