package kz.home.ys.algo.hard.containsDuplicateIII;

import java.util.TreeSet;

class ContainsDuplicateIII {

    // time - O(N*Log(min(N, K)))
    // space - O(min(N, K))
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Integer s = set.ceiling(nums[i]);
            if (s != null && (long) s <= nums[i] + valueDiff) return true;

            Integer f = set.floor(nums[i]);
            if (f != null && nums[i] <= (long) f + valueDiff) return true;

            set.add(nums[i]);
            if (set.size() > indexDiff) {
                set.remove(nums[i - indexDiff]);
            }
        }
        return false;
    }
}