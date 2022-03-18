package kz.home.ys.algo.hard.laptopRental;

import java.util.*;

class LaptopRentalIterator {

    // time - O(Nlog(N))
    // space - O(N)
    public int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        List<Integer> startTimes = new ArrayList<>(times.size());
        List<Integer> endTimes = new ArrayList<>(times.size());

        for (ArrayList<Integer> time : times) {
            startTimes.add(time.get(0));
            endTimes.add(time.get(1));
        }

        Collections.sort(startTimes);
        Collections.sort(endTimes);

        int startIterator = 0;
        int endIterator = 0;
        int usedLaptops = 0;
        while (startIterator < times.size()) {
            if (startTimes.get(startIterator) >= endTimes.get(endIterator)) {
                usedLaptops--;
                endIterator++;
            }

            usedLaptops++;
            startIterator++;
        }

        return usedLaptops;
    }
}

