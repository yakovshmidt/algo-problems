package kz.home.ys.algo.medium.findKPairsWithSmallestSum;

import java.util.*;

class FindKPairsWithSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        /*
        
        Constraints:
        nums1.length
        nums2.length
        k
        nums1[i], nums2[i]

        Approach:
        Min heap

        Time: O(min(k * Log(k), m * n * log(m * n))

        Space: O(min(k, m * n)

        */

        int m = nums1.length;
        int n = nums2.length;

        List<List<Integer>> ans = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        minHeap.offer(new int[] {nums1[0] + nums2[0], 0, 0});

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int i = top[1];
            int j = top[2];

            ans.add(List.of(nums1[i], nums2[j]));

            if (i + 1 < m && !visited.contains((i + 1) + "," + j)) {
                minHeap.offer(new int[] {nums1[i + 1] + nums2[j], i + 1, j});
                visited.add((i + 1) + "," + j);
            }
            if (j + 1 < n && !visited.contains(i + "," + (j + 1))) {
                minHeap.offer(new int[] {nums1[i] + nums2[j + 1], i, j + 1});
                visited.add(i + "," + (j + 1));
            }
        }

        return ans;
    }
}