package kz.home.ys.algo.medium.minimumCostForTickets;

import java.util.HashSet;
import java.util.Set;

public class MinimumCostForTickets {

    private int[] costs;

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        Integer[] memo = new Integer[366];
        Set<Integer> dayset = new HashSet<>();
        for (int day : days) {
            dayset.add(day);
        }

        return dp(1, memo, dayset);
    }

    private int dp(int dayNumber, Integer[] memo, Set<Integer> dayset) {
        if (dayNumber > 365) return 0;
        if (memo[dayNumber] != null) return memo[dayNumber];

        int ans;
        if (dayset.contains(dayNumber)) {
            ans = Math.min(
                    dp(dayNumber + 1, memo, dayset) + costs[0],
                    Math.min(
                            dp(dayNumber + 7, memo, dayset) + costs[1],
                            dp(dayNumber + 30, memo, dayset) + costs[2]
                    )
            );
        } else {
            ans = dp(dayNumber + 1, memo, dayset);
        }

        return memo[dayNumber] = ans;
    }
}
