package kz.home.ys.algo.medium.myCalendarI;

import kz.home.ys.algo.medium.myCalendarI.Event;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class MyCalendarIUsingTreeSet {

    private final TreeSet<Event> treeSet;

    public MyCalendarIUsingTreeSet() {
        treeSet = new TreeSet<>(Comparator.comparingInt(p -> p.start));
    }

    // time - O(Log(N))
    // space - O(N)
    public boolean book(int start, int end) {
        Event newEvent = new Event(start, end);
        Event lower = treeSet.floor(newEvent);
        Event higher = treeSet.higher(newEvent);

        if (lower != null && start >= lower.start && start < lower.end) {
            return false;
        }

        if (higher != null && end >= higher.start && end < higher.end) {
            return false;
        }

        treeSet.add(newEvent);

        return true;
    }
}