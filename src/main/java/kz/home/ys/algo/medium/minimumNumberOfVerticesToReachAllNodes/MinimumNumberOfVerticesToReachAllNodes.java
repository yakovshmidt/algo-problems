package kz.home.ys.algo.medium.minimumNumberOfVerticesToReachAllNodes;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        /*

        Constraints:
        * 2 <= n <= 10^5
        * 1 <= edges.length <= min(10^5, n * (n - 1) / 2)
        * edges[i].length == 2
        * 0 <= fromi, toi < n
        * All pairs (fromi, toi) are distinct.

        int[] inDegree = new int[n];
        boolean[] visited = new boolean[n];

        time - O(V + E)
        space - O(V)

        */

        boolean[] existsInDegree = new boolean[n];
        for (List<Integer> edge : edges) {
            int to = edge.get(1);
            existsInDegree[to] = true;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < existsInDegree.length; i++) {
            if (!existsInDegree[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
