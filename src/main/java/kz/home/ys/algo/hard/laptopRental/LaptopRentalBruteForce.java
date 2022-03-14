package kz.home.ys.algo.hard.laptopRental;

import java.util.*;

class LaptopRentalBruteForce {

    // time - O(N^2)
    // space - O(N)
    public int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        if (times == null || times.size() == 0) return 0;

        times.sort(Comparator.comparingInt(a -> a.get(0)));

        int requiredLaptops = 0;

        boolean[] visited = new boolean[times.size()];
        Arrays.fill(visited, false);
        for (int i = 0; i < times.size(); i++) {
            if (visited[i]) continue;
            visited[i] = true;

            ArrayList<Integer> currIntervals = times.get(i);
            for (int j = i + 1; j < times.size(); j++) {
                if (visited[j]) continue;
                ArrayList<Integer> nextIntervals = times.get(j);
                if (currIntervals.get(1) <= nextIntervals.get(0)) {
                    currIntervals = nextIntervals;
                    visited[j] = true;
                }
            }
            requiredLaptops++;
        }

        return requiredLaptops;
    }
}

