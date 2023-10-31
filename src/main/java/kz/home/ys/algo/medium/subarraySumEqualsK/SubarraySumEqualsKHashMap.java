package kz.home.ys.algo.medium.subarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

class SubarraySumEqualsKHashMap {
    public int subarraySum(int[] nums, int k) {
        /*

        Time: O(N)

        Space: O(N)

        */

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int ans = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}