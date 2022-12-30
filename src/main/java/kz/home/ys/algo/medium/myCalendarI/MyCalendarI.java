package kz.home.ys.algo.medium.myCalendarI;

import java.util.TreeMap;

class MyCalendarI {

    private final TreeMap<Integer, Integer> calendar;

    public MyCalendarI() {
        calendar = new TreeMap<>();
    }

    // time - O(N * log(N))
    // space - O(N)
    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start);
        Integer next = calendar.ceilingKey(start);

        if ((prev == null || calendar.get(prev) <= start) && (next == null || next >= end)) {
            calendar.put(start, end);
            return true;
        }

        return false;
    }
}