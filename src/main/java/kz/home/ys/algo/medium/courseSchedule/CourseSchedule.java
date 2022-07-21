package kz.home.ys.algo.medium.courseSchedule;

import java.util.*;

class CourseSchedule {

    // time - O(N + V)
    // space - O(N + V) + O(N)
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 0) return true;

        Map<Integer, List<Integer>> crsToPrereqs = fillCrsToPrereqs(prerequisites);
        Set<Integer> visited = new HashSet<>(numCourses);

        for (int i = 0; i < numCourses; i++) {
            if (!canFinish(i, crsToPrereqs, visited)) {
                return false;
            }
        }

        return true;
    }

    private boolean canFinish(int crs, Map<Integer, List<Integer>> crsToPrereqs, Set<Integer> visited) {
        if (visited.contains(crs)) return false;
        visited.add(crs);

        List<Integer> prereqs = crsToPrereqs.get(crs);
        if (prereqs == null || prereqs.isEmpty()) return true;

        for (Integer prereq : prereqs) {
            boolean canFinish = canFinish(prereq, crsToPrereqs, visited);
            if (!canFinish) return false;
        }
        visited.remove(crs);
        prereqs.clear();
        return true;
    }

    private Map<Integer, List<Integer>> fillCrsToPrereqs(int[][] prerequisites) {
        Map<Integer, List<Integer>> crsToPrereqs = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int crs = prerequisite[0];
            int prereq = prerequisite[1];

            if (crsToPrereqs.containsKey(crs)) {
                crsToPrereqs.get(crs).add(prereq);
            } else {
                List<Integer> prereqs = new ArrayList<>();
                prereqs.add(prereq);
                crsToPrereqs.put(crs, prereqs);
            }
        }
        return crsToPrereqs;
    }
}