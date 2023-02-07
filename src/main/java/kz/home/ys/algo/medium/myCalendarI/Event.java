package kz.home.ys.algo.medium.myCalendarI;

import java.util.Objects;

public class Event {
    public int start;
    public int end;

    public Event(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return start == event.start && end == event.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}