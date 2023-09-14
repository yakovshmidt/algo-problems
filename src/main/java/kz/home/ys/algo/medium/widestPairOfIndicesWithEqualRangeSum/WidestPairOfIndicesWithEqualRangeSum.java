package kz.home.ys.algo.medium.widestPairOfIndicesWithEqualRangeSum;

import java.util.HashMap;
import java.util.Map;

public class WidestPairOfIndicesWithEqualRangeSum {

    public int widestPairOfIndices(int[] nums1, int[] nums2) {
        int ans = 0, prefix = 0;
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);
        for (int i = 0; i < nums1.length; i++) {
            prefix += nums1[i] - nums2[i];
            if (seen.containsKey(prefix)) ans = Math.max(ans, i - seen.get(prefix));
            else seen.put(prefix, i);
        }

        return ans;
    }
}
