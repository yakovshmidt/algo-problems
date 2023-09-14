package kz.home.ys.algo.medium.courseScheduleIV;

import java.util.*;

class CourseScheduleIV {

    // time - O(P) + O(V + E)
    // space - O(V + E) * O(N)
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int[] inDegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            graph.putIfAbsent(prerequisite[0], new HashSet<>());
            graph.putIfAbsent(prerequisite[1], new HashSet<>());
            graph.get(prerequisite[0]).add(prerequisite[1]);

            inDegree[prerequisite[1]]++;
        }

        Map<Integer, Set<Integer>> prerequisitesMap = new HashMap<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) dfs(i, graph, prerequisitesMap);
        }

        List<Boolean> answer = new ArrayList<>();
        for (int[] query : queries) {
            if (prerequisitesMap.containsKey(query[0])) {
                answer.add(prerequisitesMap.get(query[0]).contains(query[1]));
            } else {
                answer.add(false);
            }
        }

        return answer;
    }

    private Set<Integer> dfs(int node, Map<Integer, Set<Integer>> graph, Map<Integer, Set<Integer>> prerequisites) {
        if (prerequisites.get(node) != null) {
            Set<Integer> result = new HashSet<>();
            result.add(node);
            result.addAll(prerequisites.get(node));
            return result;
        }
        prerequisites.put(node, new HashSet<>());
        
        Set<Integer> neighbours = graph.getOrDefault(node, new HashSet<>());
        for (int neighbour : neighbours) {
            prerequisites.get(node).addAll(dfs(neighbour, graph, prerequisites));
        }

        Set<Integer> result = new HashSet<>();
        result.add(node);
        result.addAll(prerequisites.get(node));
        return result;
    }
}