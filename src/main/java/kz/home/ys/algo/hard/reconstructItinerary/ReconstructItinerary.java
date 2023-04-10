package kz.home.ys.algo.hard.reconstructItinerary;

import java.util.*;

public class ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        tickets.sort(Comparator.comparing(o -> o.get(1)));

        Map<String, LinkedList<String>> directions = new HashMap<>();
        for (List<String> direction : tickets) {
            directions.putIfAbsent(direction.get(0), new LinkedList<>());
            directions.putIfAbsent(direction.get(1), new LinkedList<>());
            directions.get(direction.get(0)).add(direction.get(1));
        }

        List<String> path = new ArrayList<>();
        dfs(path, directions, "JFK");
        return path;
    }

    private void dfs(List<String> path, Map<String, LinkedList<String>> directions, String source) {
        path.add(source);

        LinkedList<String> targets = directions.get(source);

        for (int i = 0; i < targets.size(); i++) {
            dfs(path, directions, targets.removeFirst());
        }
    }
}