package kz.home.ys.algo.medium.cheapestFlightsWithinKStops;

import java.util.Arrays;

class CheapestFlightsWithinKStopsBellmanFordAlgo {

    // time - O(FLIGHTS * K)
    // space - O(N)
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;

        for (int i = 0; i < k + 1; i++) {
            int[] tempPrices = Arrays.copyOf(prices, prices.length);

            for (int[] flight : flights) {
                if (prices[flight[0]] == Integer.MAX_VALUE) continue;
                if (prices[flight[0]] + flight[2] < tempPrices[flight[1]])
                    tempPrices[flight[1]] = prices[flight[0]] + flight[2];
            }

            prices = tempPrices;
        }

        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}