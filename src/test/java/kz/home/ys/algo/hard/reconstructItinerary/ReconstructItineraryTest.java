package kz.home.ys.algo.hard.reconstructItinerary;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ReconstructItineraryTest extends TestCase {

    public void testFindItinerary() {
        List<String> expected = List.of("JFK", "NRT", "JFK", "KUL");

        List<String> actual = new ReconstructItinerary().findItinerary(
                new ArrayList<>() {{
                    add(new ArrayList<>() {{
                        add("JFK");
                        add("KUL");
                    }});
                    add(new ArrayList<>() {{
                        add("JFK");
                        add("NRT");
                    }});
                    add(new ArrayList<>() {{
                        add("NRT");
                        add("JFK");
                    }});
                }});

        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}