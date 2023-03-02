package kz.home.ys.algo.medium.courseScheduleII;

import java.util.*;

class CourseScheduleII {

    // time - O(V + E)
    // space - O(V + E)
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        /* 
        
        Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]

        0 -> 
        1 -> 0
        2 -> 0
        3 -> 1,2

        0 -> 1,2
        1 -> 3
        2 -> 3
        3 -> 

        Map<Integer, Integer> courseToInDegreeMap = ...
        0 -> 0
        1 -> 1
        2 -> 1
        3 -> 2

        */

        int[] indegree = new int[numCourses];
        Map<Integer, Set<Integer>> relationships = new HashMap<>();

        for (int i = 0; i < numCourses; i++) {
            relationships.put(i, new HashSet<>());
        }

        for (int[] prerequisite : prerequisites) {
            int target = prerequisite[0];
            int source = prerequisite[1];
            
            indegree[target] = indegree[target] + 1;
            relationships.get(source).add(target);
        }

        int[] topologicalSort = new int[numCourses];
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) stack.push(i);
        }

        while (!stack.isEmpty()) {
            int course = stack.pop();
            topologicalSort[idx++] = course;

            Set<Integer> courses = relationships.get(course);
            for (int c : courses) {
                indegree[c] -= 1;
                if (indegree[c] == 0) stack.push(c);
            }
        }

        return (idx == numCourses) ? topologicalSort : new int[0];
    }
}