package kz.home.ys.algo.hard.busRoutes;

import java.util.*;

class BusRoutes {
    
    private final List<List<Integer>> routesList = new ArrayList<>();
   
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) return 0;

        Set<Integer> visited = new HashSet<>();
        for (int[] ints : routes) {
            Arrays.sort(ints);
            routesList.add(new ArrayList<>());
        }
        createGraph(routes);
        List<Integer> startingRoutes = getStartingRoutes(routes, source);
        LinkedList<Integer> deque = new LinkedList<>(startingRoutes);
        int level = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size-- > 0) {
                int route = deque.removeFirst();
                if (isStopExist(routes[route], target)) return level;

                List<Integer> neighbours = routesList.get(route);
                for (int neighbour : neighbours) {
                    if (visited.contains(neighbour)) continue;
                    visited.add(neighbour);
                    deque.addLast(neighbour);
                }
            }
            level++;
        }
        return -1;
    }

    private List<Integer> getStartingRoutes(int[][] routes, int source) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            if (isStopExist(routes[i], source)) {
                result.add(i);
            }
        }
        return result;
    }

    private void createGraph(int[][] routes) {
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes.length; j++) {
                if (intersects(routes[i], routes[j])) {
                    routesList.get(i).add(j);
                    routesList.get(j).add(i);
                }
            }
        }
    }

    private boolean intersects(int[] route1, int[] route2) {
        int i = 0, j = 0;
        while (i < route1.length && j < route2.length) {
            if (route1[i] == route2[j]) {
                return true;
            }

            if (route1[i] < route2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return false;
    }

    private boolean isStopExist(int[] route, int target) {
        for (int j : route) {
            if (target == j) return true;
        }
        return false;
    }
}