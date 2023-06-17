package kz.home.ys.algo.medium.timeNeededToInformAllEmployees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TimeNeededToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        /*
        
        Constraints:
        -----

        Approach:
        1) Create tree -> map<parentIdx, childIdx>
        2) traverse using DFS

        Time: O(N) + O(N)

        Space: O(N) + O(N)
        
        */

        Map<Integer, Set<Integer>> parentIdxToChildIdxMap = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            int managerIdx = manager[i];

            if (managerIdx == -1) continue;

            parentIdxToChildIdxMap.putIfAbsent(managerIdx, new HashSet<>());
            parentIdxToChildIdxMap.get(managerIdx).add(i);
        }

        return dfs(headID, parentIdxToChildIdxMap, informTime);
    }

    private int dfs(int employeeIdx, Map<Integer, Set<Integer>> parentIdxToChildIdxMap, int[] informTime) {
        int time = informTime[employeeIdx];

        Set<Integer> childrenIndices = parentIdxToChildIdxMap.get(employeeIdx);

        if (childrenIndices == null) return time;

        int maxTime = Integer.MIN_VALUE;
        for (int childIdx : childrenIndices) {
            maxTime = Math.max(maxTime, dfs(childIdx, parentIdxToChildIdxMap, informTime));
        }
        
        return time + maxTime;
    }
}