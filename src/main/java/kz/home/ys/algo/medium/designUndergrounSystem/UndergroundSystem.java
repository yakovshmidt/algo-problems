package kz.home.ys.algo.medium.designUndergrounSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class UndergroundSystem {

    /*

    Constraints:
    1 <= id, t <= 10^6
    1 <= stationName, startStation, endStation lengths <= 10

    Approach:
    1) create checkIn map<StationNameCheckIn, Map<UserId, StartTime>>
    2) create totalTime map<StationNameCheckIn, Map<StationNameCheckOut, TotalTime>>
    3) create numberOfRides map<StationNameCheckIn, Map<StationNameCheckOut, NumberOfRides>>

    Time: O(1) - number of calls

    Space: O(P + S^2) - P are passengers and S are number of stations

    */

    private final Map<Integer, Pair<String, Integer>> userIdToCheckInToTime = new HashMap<>();
    private final Map<String, Map<String, Integer>> checkInToCheckOutToTotalTime = new HashMap<>();
    private final Map<String, Map<String, Integer>> checkInToCheckOutToNumberOfRides = new HashMap<>();

    public UndergroundSystem() {

    }

    // time - O(1) - number of rides
    public void checkIn(int id, String stationName, int t) {
        userIdToCheckInToTime.put(id, new Pair<>(stationName, t));
    }

    // time - O(1) - number of rides
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> checkInToTime = userIdToCheckInToTime.get(id);
        String checkInStationName = checkInToTime.getKey();
        int checkInTime = checkInToTime.getValue();

        checkInToCheckOutToTotalTime.putIfAbsent(checkInStationName, new HashMap<>());
        checkInToCheckOutToNumberOfRides.putIfAbsent(checkInStationName, new HashMap<>());

        Map<String, Integer> checkOutToTatalTime = checkInToCheckOutToTotalTime.get(checkInStationName);
        checkOutToTatalTime.put(stationName, checkOutToTatalTime.getOrDefault(stationName, 0) + (t - checkInTime));

        Map<String, Integer> checkOutToNumberOfRides = checkInToCheckOutToNumberOfRides.get(checkInToTime.getKey());
        checkOutToNumberOfRides.put(stationName, checkOutToNumberOfRides.getOrDefault(stationName, 0) + 1);
    }

    // time - O(1)
    public double getAverageTime(String startStation, String endStation) {
        Integer totalTime = checkInToCheckOutToTotalTime.getOrDefault(startStation, new HashMap<>()).get(endStation);
        if (totalTime == null) return -1.0;
        int numberOfRides = checkInToCheckOutToNumberOfRides.get(startStation).get(endStation);
        return (double) totalTime / (double) numberOfRides;
    }

    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */