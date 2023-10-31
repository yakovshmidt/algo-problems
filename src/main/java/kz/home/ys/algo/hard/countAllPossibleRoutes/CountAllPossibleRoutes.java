package kz.home.ys.algo.hard.countAllPossibleRoutes;

import java.util.Arrays;

class CountAllPossibleRoutes {

    int[][] memo;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        this.memo = new int[locations.length][fuel + 1];
        for (int i = 0; i < locations.length; i++) {
            Arrays.fill(this.memo[i], -1);
        }

        return dp(locations, start, finish, fuel);
    }

    private int dp(int[] locations, int currCity, int finish, int remainingFuel) {
        if (remainingFuel < 0) return 0;
        if (memo[currCity][remainingFuel] != -1) return memo[currCity][remainingFuel];

        int ans = currCity == finish ? 1 : 0;
        for (int nextCity = 0; nextCity < locations.length; nextCity++) {
            if (nextCity != currCity) {
                ans = (ans + dp(locations, nextCity, finish, remainingFuel - Math.abs(locations[currCity] - locations[nextCity]))) % 1_000_000_007;
            }
        }

        return memo[currCity][remainingFuel] = ans;
    }
}