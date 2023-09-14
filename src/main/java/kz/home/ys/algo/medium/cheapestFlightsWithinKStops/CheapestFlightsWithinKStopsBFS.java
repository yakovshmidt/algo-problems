package kz.home.ys.algo.medium.cheapestFlightsWithinKStops;

import kz.home.ys.algo.helper.Pair;

import java.util.*;

class CheapestFlightsWithinKStopsBFS {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<Pair<Integer, Integer>>> adj = new HashMap<>();
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];

            adj.putIfAbsent(from, new ArrayList<>());
            adj.get(from).add(new Pair<>(price, to));
        }

        int[] minPrices = new int[n];
        Arrays.fill(minPrices, Integer.MAX_VALUE);

        Deque<int[]> queue = new ArrayDeque<>();
        queue.addLast(new int[]{0, src});
        int stops = 0;
        while (stops <= k && !queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                int[] priceToCityToStops = queue.removeFirst();
                int currPrice = priceToCityToStops[0];
                int currCity = priceToCityToStops[1];

                for (Pair<Integer, Integer> priceToDestination : adj.getOrDefault(currCity, new ArrayList<>())) {
                    int price = priceToDestination.getKey();
                    int to = priceToDestination.getValue();

                    if (minPrices[to] < price + currPrice) continue;
                    minPrices[to] = price + currPrice;

                    queue.addLast(new int[]{minPrices[to], to});
                }
                size--;
            }
            stops++;
        }

        return minPrices[dst] == Integer.MAX_VALUE ? -1 : minPrices[dst];
    }
}