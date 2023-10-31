package kz.home.ys.algo.medium.theLatestTimeToCatchABus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class TheLatestTimeToCatchABus {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        /* 
        
        Constrainst:
        * buses and passengers are not sorted -> elements are unique
        * 1 <= buses.length <= 10^5
        * 1 <= passengers.length <= 10^5
        * 1 <= capacity <= 10^5 
        
        Approach:
        Input: buses = [10,20], passengers = [2,17,18,19], capacity = 2

        departure 10 -> 1 2 3  10    17,18,19
                               10.          20
        */

        Arrays.sort(buses);
        Arrays.sort(passengers);

        int latestDepartureTime = 0;
        int passengerIdx = 0;
        // Input: buses = [10,20], passengers = [2,17,18,19], capacity = 2
        Set<Integer> set = new HashSet<>();
        for (int departureTime : buses) {
            int occupiedSpaces = 0;
            while (passengerIdx < passengers.length && occupiedSpaces < capacity && passengers[passengerIdx] <= departureTime) {
                if (!set.contains(passengers[passengerIdx] - 1)) { // 17
                    latestDepartureTime = passengers[passengerIdx] - 1;  //1,16
                }
                set.add(passengers[passengerIdx]); // 2,17,18
                occupiedSpaces++;  // 2
                passengerIdx++; // 2
            }

            if (occupiedSpaces < capacity && !set.contains(departureTime)) {
                latestDepartureTime = departureTime;  // 10
            }
        }

        return latestDepartureTime;
    }
}